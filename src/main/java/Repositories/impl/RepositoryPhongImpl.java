/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.Phong;
import Repositories.IRepositoryPhong;
import Utilities.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author admin
 */
public class RepositoryPhongImpl implements IRepositoryPhong{
    @Override
    public List<Phong> getAllData() {
        List<Phong> list = new ArrayList<>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT p FROM Phong p";
            TypedQuery<Phong> query = session.createQuery(hql, Phong.class);
            list = query.getResultList();
        }
        return list;

    }

    @Override
    public boolean save(Phong phong) {
        boolean check = false;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction transaction = session.beginTransaction();
            try {
                session.saveOrUpdate(phong);
                transaction.commit();
                check = true;
            } catch (Exception e) {
                e.printStackTrace();
                transaction.rollback();
            }
        }
        return check;
    }

    public String delete(String ma) {
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction transaction = session.getTransaction();
            transaction.begin();
            try {
                String hql = "DELETE Phong p WHERE p.ma = :ma";
                Query query = session.createQuery(hql);
                query.setParameter("ma", ma);
                int result = query.executeUpdate();
                if (result == 0) {
                    ma = "";
                }
                transaction.commit();
            } catch (Exception e) {
                ma = "";
            }
        }
        return ma;
    }

    @Override
    public String findByIdPhong(String ma) {
        String string;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = session.beginTransaction();
            try {
                String statement = "select p.ma from Phong p where p.ma = :ma";
                TypedQuery<String> query = session.createQuery(statement, String.class);
                query.setParameter("ma", ma);
                string = query.getSingleResult();
                t.commit();
            } catch (Exception e) {
                 e.printStackTrace();
                t.rollback();
                string = "";
            }
            return string;
        }
        
    }
}
