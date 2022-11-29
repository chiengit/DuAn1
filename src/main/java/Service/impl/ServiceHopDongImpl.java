/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.HopDong;
import Repositories.IRepositoryHopDong;
import Repositories.impl.RepositoryHopDongImpl;
import Service.IServiceHopDong;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class ServiceHopDongImpl implements IServiceHopDong {

    private IRepositoryHopDong hdR = new RepositoryHopDongImpl();

    @Override
    public List<HopDong> getAllData() {
        return hdR.getAllData();
    }

    @Override
    public boolean add(HopDong hd) {
        return hdR.add(hd);
    }

    @Override
    public String delete(String ma) {
        return hdR.delete(ma);
    }

    @Override
    public List<String> getCbbCt() {
        return hdR.getCbbCt();
    }

    @Override
    public List<String> getCbbKh() {
        return hdR.getCbbKh();
    }

    @Override
    public List<String> getCbbPh() {
        return hdR.getCbbPh();
    }

    @Override
    public UUID findByIdCt(String ma) {
        return hdR.findByIdCt(ma);
    }

    @Override
    public UUID findByIdKh(String ma) {
        return hdR.findByIdKh(ma);
    }

    @Override
    public UUID findByIdPh(String ma) {
        return hdR.findByIdPh(ma);
    }

    @Override
    public String findByMa(String ma) {
        return hdR.findByMa(ma);
    }

}
