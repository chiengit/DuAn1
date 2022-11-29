/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.Dien;
import DomainModels.DichVu;
import Repositories.IRepositoryDichVu;
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
public class RepositoryDichVuImpl implements IRepositoryDichVu {

    @Override
    public List<DichVu> getAllData() {
        List<DichVu> lists = new ArrayList<DichVu>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT dv FROM DichVu dv";
            TypedQuery<DichVu> query = session.createQuery(hql, DichVu.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public boolean save(DichVu dv) {
        boolean check = false;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction tran = session.beginTransaction();
            try {
                session.saveOrUpdate(dv);
                tran.commit();
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                tran.rollback();
            }
        }

        return check;
    }

    @Override
    public String delete(String ma) {
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction trans = session.getTransaction();
            trans.begin();
            try {
                String hql = "DELETE DichVu dv WHERE dv.ma = :ma";
                Query query = session.createQuery(hql);
                query.setParameter("ma", ma);
                int result = query.executeUpdate();
                if (result == 0) {
                    ma = "";
                }
                trans.commit();
            } catch (Exception e) {
                ma = "";
            }
        }
        return ma;
    }

    @Override
    public String findByMa(String ma) {
        String vt;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try {
                String statement = "select dv.ma from DichVu dv where dv.ma = :ma";
                TypedQuery<String> query = s.createQuery(statement, String.class);
                query.setParameter("ma", ma);
                vt = query.getSingleResult();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
                vt = "";
            }

            return vt;
        }
    }

}
