/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.KhachHang;
import DomainModels.Nuoc;
import Repositories.IRepositoryKhachHang;
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
public class RepositoryKhachHangImpl implements IRepositoryKhachHang {

    @Override
    public List<KhachHang> getAllData() {
        List<KhachHang> lists = new ArrayList<KhachHang>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT kh FROM KhachHang kh";
            TypedQuery<KhachHang> query = session.createQuery(hql, KhachHang.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public boolean save(KhachHang kh) {
        boolean check = false;

        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction tran = session.beginTransaction();
            try {
                session.saveOrUpdate(kh);
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
                String hql = "DELETE KhachHang kh WHERE kh.ma = :ma";
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
                String statement = "select kh.ma from KhachHang kh where kh.ma = :ma";
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
