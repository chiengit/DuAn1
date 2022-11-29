/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.HopDong;
import DomainModels.Phong;
import Repositories.IRepositoryHopDong;
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
public class RepositoryHopDongImpl implements IRepositoryHopDong {

    @Override
    public List<HopDong> getAllData() {
        List<HopDong> list = new ArrayList<>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT hd FROM HopDong hd";
            TypedQuery<HopDong> query = session.createQuery(hql, HopDong.class);
            list = query.getResultList();
        }
        return list;
    }

    @Override
    public boolean add(HopDong hd) {
        boolean check = false;

        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction tran = session.beginTransaction();
            try {
                session.saveOrUpdate(hd);
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
                String hql = "DELETE HopDong hd WHERE hd.ma = :ma";
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
    public List<String> getCbbCt() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT ct.ma FROM ChuTro ct";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbKh() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT kh.ma FROM KhachHang kh";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<String> getCbbPh() {
        List<String> lists = new ArrayList<String>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT p.ma FROM Phong p";
            TypedQuery<String> query = session.createQuery(hql, String.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public UUID findByIdCt(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select ct.id from ChuTro ct where ct.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public UUID findByIdKh(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select kh.id from KhachHang kh where kh.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public UUID findByIdPh(String ma) {
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
    public String findByMa(String ma) {
        String vt;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try { 
                String statement = "select hd.ma from HopDong hd where hd.ma = :ma";
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
