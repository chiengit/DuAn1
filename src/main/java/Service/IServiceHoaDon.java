/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.ChiTietDichVu;
import DomainModels.ChiTietHoaDon;
import DomainModels.HoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public interface IServiceHoaDon {

    public List<HoaDon> listHoaDon();

    public List<ChiTietDichVu> listCtdv();

    public List<ChiTietHoaDon> listCthd();

    public List<ChiTietHoaDon> listCthd(String ma);

    public boolean addHd(HoaDon hd);

    public int genMaHD();

    public UUID findByIdCt(String ten);

    public boolean addHdct(ChiTietHoaDon cthd);

    public UUID findByIdHd(String ma);

    public UUID findByIdDv(String ma);

}
