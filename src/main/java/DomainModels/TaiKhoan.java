/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "tai_khoan")
public class TaiKhoan implements Serializable {

    @Id
    @Column(name = "id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "id_ct")
    private ChuTro chuTro;

    @ManyToOne
    @JoinColumn(name = "id_kh")
    private KhachHang khachHang;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten_tai_khoan")
    private String ten;

    @Column(name = "mat_khau")
    private String matKhau;

    @Column(name = "vai_tro")
    private String vaiTro;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private int trangThai;

    public TaiKhoan(UUID id, ChuTro chuTro, KhachHang khachHang, String ma, String ten, String matKhau, String vaiTro, Date ngayTao, Date ngaySua, int trangThai) {
        this.id = id;
        this.chuTro = chuTro;
        this.khachHang = khachHang;
        this.ma = ma;
        this.ten = ten;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public TaiKhoan() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ChuTro getChuTro() {
        return chuTro;
    }

    public void setChuTro(ChuTro chuTro) {
        this.chuTro = chuTro;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
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

}
