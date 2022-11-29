/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import DomainModels.ChiTietDichVu;
import DomainModels.ChiTietHoaDon;
import DomainModels.Dien;
import DomainModels.HoaDon;
import Repositories.IRepositoryHoaDon;
import Utilities.HibernateUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

/**
 *
 * @author admin
 */
public class RepositoryHoaDonImpl implements IRepositoryHoaDon {

    @Override
    public List<HoaDon> listHoaDon() {
        List<HoaDon> lists = new ArrayList<HoaDon>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT hd FROM HoaDon hd";
            TypedQuery<HoaDon> query = session.createQuery(hql, HoaDon.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<ChiTietDichVu> listCtdv() {
        List<ChiTietDichVu> lists = new ArrayList<ChiTietDichVu>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT ctdv FROM ChiTietDichVu  ctdv";
            TypedQuery<ChiTietDichVu> query = session.createQuery(hql, ChiTietDichVu.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public List<ChiTietHoaDon> listCthd() {
        List<ChiTietHoaDon> lists = new ArrayList<ChiTietHoaDon>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT cthd FROM ChiTietHoaDon  cthd";
            TypedQuery<ChiTietHoaDon> query = session.createQuery(hql, ChiTietHoaDon.class);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public boolean addHd(HoaDon hd) {
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
    public int genMaHD() {
        String maHD = "";
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            NativeQuery query = session.createNativeQuery("SELECT MAX(CONVERT(INT, SUBSTRING(Ma, 3, 10) )) FROM hoa_don");
            if (query.getSingleResult() != null) {
                maHD = query.getSingleResult().toString();
            } else {
                maHD = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (maHD == null) {
            maHD = "0";
            int ma = Integer.valueOf(maHD);
            return ++ma;
        }
        int ma = Integer.valueOf(maHD);
        return ++ma;
    }

    @Override
    public UUID findByIdCt(String ten) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select ct.id from ChuTro ct where ct.ten = :ten";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ten", ten);
            uuid = query.getSingleResult();
        }
        return uuid;
    }

    @Override
    public List<ChiTietHoaDon> listCthd(String ma) {
        List<ChiTietHoaDon> lists = new ArrayList<ChiTietHoaDon>();
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String hql = "SELECT cthd FROM ChiTietHoaDon  cthd where cthd.hoaDon.ma = :ma";
            TypedQuery<ChiTietHoaDon> query = session.createQuery(hql, ChiTietHoaDon.class);
            query.setParameter("ma", ma);
            lists = query.getResultList();
        }
        return lists;
    }

    @Override
    public boolean addHdct(ChiTietHoaDon cthd) {
        boolean check = false;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            Transaction tran = session.beginTransaction();
            try {
                session.saveOrUpdate(cthd);
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
    public UUID findByIdHd(String ma) {
        UUID uuid;
        try ( Session session = HibernateUtils.getFACTORY().openSession()) {
            String statement = "select hd.id from HoaDon hd where hd.ma = :ma";
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
            String statement = "select ctdv.id from ChiTietDichVu ctdv where ctdv.ma = :ma";
            TypedQuery<UUID> query = session.createQuery(statement, UUID.class);
            query.setParameter("ma", ma);
            uuid = query.getSingleResult();
        }
        return uuid;
    }
}
