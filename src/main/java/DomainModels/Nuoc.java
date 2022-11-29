/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "nuoc")
public class Nuoc implements Serializable {

    @Id
    @Column(name = "id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "so")
    private int so;

    @Column(name = "gia")
    private double gia;

    @Column(name = "thanh_tien")
    private double thanhTien;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private int trangThai;

    @OneToMany(mappedBy = "dien",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChiTietDichVu> chiTietDichVus;

    public Nuoc() {
    }

    public Nuoc(UUID id, String ma, String ten, int so, double gia, double thanhTien, Date ngayTao, Date ngaySua, int trangThai, List<ChiTietDichVu> chiTietDichVus) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.so = so;
        this.gia = gia;
        this.thanhTien = thanhTien;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
        this.chiTietDichVus = chiTietDichVus;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSo() {
        return so;
    }

    public void setSo(int so) {
        this.so = so;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public List<ChiTietDichVu> getChiTietDichVus() {
        return chiTietDichVus;
    }

    public void setChiTietDichVus(List<ChiTietDichVu> chiTietDichVus) {
        this.chiTietDichVus = chiTietDichVus;
    }

    public String htTrangThai() {
        if (trangThai == 0) {
            return "Không";
        } else {
            return "Có";
        }
    }
}
