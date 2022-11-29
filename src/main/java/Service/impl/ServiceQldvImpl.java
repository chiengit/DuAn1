/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.ChiTietDichVu;
import Repositories.IRepositoryQldv;
import Repositories.impl.RepositoryQldvImpl;
import Service.IServiceQldv;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public class ServiceQldvImpl implements IServiceQldv {

    private IRepositoryQldv qldvR = new RepositoryQldvImpl();

    @Override
    public List<ChiTietDichVu> getAll() {
        return qldvR.getAll();
    }

    @Override
    public List<String> getCbbPhong() {
        return qldvR.getCbbPhong();
    }

    @Override
    public List<String> getCbbDien() {
        return qldvR.getCbbDien();
    }

    @Override
    public List<String> getCbbNuoc() {
        return qldvR.getCbbNuoc();
    }

    @Override
    public List<String> getCbbDv() {
        return qldvR.getCbbDv();
    }

    @Override
    public UUID findByIdPhong(String ten) {
        return qldvR.findByIdPhong(ten);
    }

    @Override
    public UUID findByIdDien(String ten) {
        return qldvR.findByIdDien(ten);
    }

    @Override
    public UUID findByIdNuoc(String ten) {
        return qldvR.findByIdNuoc(ten);
    }

    @Override
    public UUID findByIdDv(String ten) {
        return qldvR.findByIdDv(ten);
    }

    @Override
    public String findByMa(String ma) {
        return qldvR.findByMa(ma);
    }

    @Override
    public boolean save(ChiTietDichVu c) {
        return qldvR.save(c);
    }

    @Override
    public String delete(String ma) {
        return qldvR.delete(ma);
    }

}
