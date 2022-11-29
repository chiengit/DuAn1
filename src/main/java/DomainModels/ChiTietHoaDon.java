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
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

/**
 *
 * @author admin
 */
@Entity
@Table(name = "chi_tiet_hoa_don")
@IdClass(ChiTietHoaDonId.class)
public class ChiTietHoaDon implements Serializable {

    @Id
    @Column(name = "id_ctdv")
    private UUID idCtdv;

    @Id
    @Column(name = "id_hd")
    private UUID idHd;

    @ManyToOne
    @MapsId("idCtdv")
    @JoinColumn(name = "id_ctdv", referencedColumnName = "id")
    private ChiTietDichVu ctdv;

    @ManyToOne
    @MapsId("idHd")
    @JoinColumn(name = "id_hd", referencedColumnName = "id")
    private HoaDon hoaDon;

    @Column(name = "tong_tien")
    private double tongTien;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private int trangThai;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(UUID idCtdv, UUID idHd, ChiTietDichVu ctdv, HoaDon hoaDon, double tongTien, Date ngayTao, Date ngaySua, int trangThai) {
        this.idCtdv = idCtdv;
        this.idHd = idHd;
        this.ctdv = ctdv;
        this.hoaDon = hoaDon;
        this.tongTien = tongTien;
        this.ngayTao = ngayTao;
        this.ngaySua = ngaySua;
        this.trangThai = trangThai;
    }

    public UUID getIdCtdv() {
        return idCtdv;
    }

    public void setIdCtdv(UUID idCtdv) {
        this.idCtdv = idCtdv;
    }

    public UUID getIdHd() {
        return idHd;
    }

    public void setIdHd(UUID idHd) {
        this.idHd = idHd;
    }

    public ChiTietDichVu getCtdv() {
        return ctdv;
    }

    public void setCtdv(ChiTietDichVu ctdv) {
        this.ctdv = ctdv;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
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
    
    
    public String htTrangThai() {
        if (trangThai == 0) {
            return "Chưa thanh toán";
        } else {
            return "Đã thanh toán";
        }
    }

}
