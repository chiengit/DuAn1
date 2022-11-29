/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.ChiTietDichVu;
import Repositories.IRepositoryQldv;
import Utilities.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

/**
 *
 * @author admin
 */
public class RepositoryQldvImpl implements IRepositoryQldv {

    @Override
    public List<ChiTietDichVu> getAll() {
        List<ChiTietDichVu> lists = new ArrayList<ChiTietDichVu>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT ctdv FROM ChiTietDichVu ctdv";
            TypedQuery<ChiTietDichVu> query = session.createQuery(hql, ChiTietDichVu.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbPhong() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT p.ma FROM Phong p";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbDien() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT d.ma FROM Dien d";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbNuoc() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT n.ma FROM Nuoc n";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbDv() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT dv.ma FROM DichVu dv";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public UUID findByIdPhong(String ma) {
            UUID uuid;
            try ( Session session = HibernateUtils.getFACTORY().openSession()) {
                String statement = "select p.id from Phong p where p.ma = :ma";
                TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
                query.setParameter("ma", ma);
                uuid = query.getSingleResult();
            }
            return uuid;
    }

    @Override
    public UUID findByIdDien(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select d.id from Dien d where d.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public UUID findByIdNuoc(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select n.id from Nuoc n where n.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public UUID findByIdDv(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select dv.id from DichVu dv where dv.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public String findByMa(String ma) {
        String vt;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try {
                String statement = "select ctdv.ma from ChiTietDichVu ctdv where ctdv.ma = :ma";
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

    @Override
    public boolean save(ChiTietDichVu c) {
        boolean check = false;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction tran = session.beginTransaction();
            try {
                session.saveOrUpdate(c);
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
                String hql = "DELETE ChiTietDichVu c WHERE c.ma = :ma";
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

}
