/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories.impl;

import Repositories.IRepositoryDoanhThu;
import Utilities.HibernateUtils;
import javax.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author admin
 */
public class RepositoryDoanhThuImpl implements IRepositoryDoanhThu {

    @Override
    public Double doanhThu(int ngayTao) {
        Double tong;
        try ( Session s = HibernateUtils.getFACTORY().openSession()) {
            Transaction t = s.beginTransaction();
            try {
                String statement = "select sum(tongTien) from ChiTietHoaDon where trangThai = 1 and month(ngayTao) = :ngayTao";
                TypedQuery<Double> query = s.createQuery(statement, Double.class);
                query.setParameter("ngayTao", ngayTao);
                tong = query.getSingleResult();
                t.commit();
            } catch (Exception e) {
                e.printStackTrace();
                t.rollback();
                tong = null;
            }
            return tong;
        }

    }
}
