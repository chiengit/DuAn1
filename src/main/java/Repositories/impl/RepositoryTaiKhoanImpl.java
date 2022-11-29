/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.Dien;
import DomainModels.TaiKhoan;
import Repositories.IRepositoryTaiKhoan;
import Utilities.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author admin
 */
public class RepositoryTaiKhoanImpl implements IRepositoryTaiKhoan {

    @Override
    public String findByTk(String ma, String matKhau) {
        String tk;
//        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
//            String statement = "select ma from TaiKhoan where ma = :ma";
//            TypedQuery<String> query = session.createQuery(statement, String.class);
//            query.setParameter("ma", ma);
//            tk = query.getSingleResult();
//            
//        }
//        return tk;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try {
                String statement = "select ma from TaiKhoan where ma = :ma and matKhau = :matKhau";
                TypedQuery<String> query = s.createQuery(statement, String.class);
                query.setParameter("ma", ma);
                query.setParameter("matKhau", matKhau);
                tk = query.getSingleResult();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
                tk = "";
            }

            return tk;
        }
    }

    @Override
    public String findByVt(String ma, String matKhau) {
        String vt;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try {
                String statement = "select vaiTro from TaiKhoan where ma = :ma and matKhau = :matKhau";
                TypedQuery<String> query = s.createQuery(statement, String.class);
                query.setParameter("ma", ma);
                query.setParameter("matKhau", matKhau);
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
