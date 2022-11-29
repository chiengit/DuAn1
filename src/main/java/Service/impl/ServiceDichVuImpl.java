/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.DichVu;
import Repositories.IRepositoryDichVu;
import Repositories.impl.RepositoryDichVuImpl;
import Service.IServiceDichVu;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceDichVuImpl implements IServiceDichVu {

    private IRepositoryDichVu dvR = new RepositoryDichVuImpl();

    @Override
    public List<DichVu> getAllData() {
        return dvR.getAllData();
    }

    @Override
    public boolean save(DichVu dv) {
        return dvR.save(dv);
    }

    @Override
    public String delete(String ma) {
        return dvR.delete(ma);
    }

    @Override
    public String findByMa(String ma) {
        return dvR.findByMa(ma);
    }

}
