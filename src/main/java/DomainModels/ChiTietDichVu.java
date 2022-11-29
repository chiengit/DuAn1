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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "chi_tiet_dich_vu")
public class ChiTietDichVu implements Serializable {

    @Id
    @Column(name = "id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @ManyToOne
    @JoinColumn(name = "id_ph")
    private Phong phong;

    @ManyToOne
    @JoinColumn(name = "id_dien")
    private Dien dien;

    @ManyToOne
    @JoinColumn(name = "id_nuoc")
    private Nuoc nuoc;

    @ManyToOne
    @JoinColumn(name = "id_dv")
    private DichVu dichVu;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private int trangThai;

    @OneToMany(mappedBy = "ctdv",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;

    public ChiTietDichVu() {
    }

    public ChiTietDichVu(UUID id, String ma, Phong phong, Dien dien, Nuoc nuoc, DichVu dichVu, Date ngayTao, Date ngaySua, int trangThai, List<ChiTietHoaDon> chiTietHoaDons) {
        this.id = id;
        this.ma = ma;
        this.phong = phong;
        this.dien = dien;
        this.nuoc = nuoc;
        this.dichVu = dichVu;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
        this.chiTietHoaDons = chiTietHoaDons;
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

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public Dien getDien() {
        return dien;
    }

    public void setDien(Dien dien) {
        this.dien = dien;
    }

    public Nuoc getNuoc() {
        return nuoc;
    }

    public void setNuoc(Nuoc nuoc) {
        this.nuoc = nuoc;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
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

    public List<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(List<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    

    public String htTrangThai() {
        if (trangThai == 0) {
            return "Không";
        } else {
            return "Có";
        }
    }

}
