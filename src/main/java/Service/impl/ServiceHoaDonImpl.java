/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.ChiTietDichVu;
import DomainModels.ChiTietHoaDon;
import DomainModels.HoaDon;
import Repositories.IRepositoryDichVu;
import Repositories.IRepositoryHoaDon;
import Repositories.impl.RepositoryHoaDonImpl;
import Service.IServiceHoaDon;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class ServiceHoaDonImpl implements IServiceHoaDon {

    private IRepositoryHoaDon hdR = new RepositoryHoaDonImpl();

    @Override
    public List<HoaDon> listHoaDon() {
        return hdR.listHoaDon();
    }

    @Override
    public List<ChiTietDichVu> listCtdv() {
        return hdR.listCtdv();
    }

    @Override
    public List<ChiTietHoaDon> listCthd() {
        return hdR.listCthd();
    }

    @Override
    public boolean addHd(HoaDon hd) {
        return hdR.addHd(hd);
    }

    @Override
    public int genMaHD() {
        return hdR.genMaHD();
    }

    @Override
    public UUID findByIdCt(String ten) {
        return hdR.findByIdCt(ten);
    }

    @Override
    public List<ChiTietHoaDon> listCthd(String ma) {
        return hdR.listCthd(ma);
    }

    @Override
    public boolean addHdct(ChiTietHoaDon cthd) {
        return hdR.addHdct(cthd);
    }

    @Override
    public UUID findByIdHd(String ma) {
        return hdR.findByIdHd(ma);
    }

    @Override
    public UUID findByIdDv(String ma) {
        return hdR.findByIdDv(ma);
    }

}
