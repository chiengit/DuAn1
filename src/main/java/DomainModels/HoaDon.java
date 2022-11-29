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

/**
 *
 * @author admin
 */
@Entity
@Table(name = "hoa_don")
public class HoaDon implements Serializable {

    @Id
    @Column(name = "id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID id;

    @Column(name = "ma")
    private String ma;

    @ManyToOne
    @JoinColumn(name = "id_ct")
    private ChuTro chuTro;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_thanh_toan")
    private Date ngayThanhToan;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "tinh_trang")
    private int tinhTrang;

    @OneToMany(mappedBy = "hoaDon",
            cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ChiTietHoaDon> chiTietHoaDons;

    public HoaDon() {
    }

    public HoaDon(UUID id, String ma, ChuTro chuTro, Date ngayTao, Date ngayThanhToan, Date ngaySua, int tinhTrang, List<ChiTietHoaDon> chiTietHoaDons) {
        this.id = id;
        this.ma = ma;
        this.chuTro = chuTro;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngaySua = ngaySua;
        this.tinhTrang = tinhTrang;
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

    public ChuTro getChuTro() {
        return chuTro;
    }

    public void setChuTro(ChuTro chuTro) {
        this.chuTro = chuTro;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public Date getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(Date ngaySua) {
        this.ngaySua = ngaySua;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public List<ChiTietHoaDon> getChiTietHoaDons() {
        return chiTietHoaDons;
    }

    public void setChiTietHoaDons(List<ChiTietHoaDon> chiTietHoaDons) {
        this.chiTietHoaDons = chiTietHoaDons;
    }

    public String htTrangThai() {
        if (tinhTrang == 0) {
            return "Chưa thanh toán";
        } else {
            return "Đã thanh toán";
        }
    }
}
