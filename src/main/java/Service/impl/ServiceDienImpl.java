/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.Dien;
import Repositories.IRepositoryDien;
import Repositories.impl.RepositoryDienImpl;
import Service.IServiceDien;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceDienImpl implements IServiceDien {

    private IRepositoryDien dR = new RepositoryDienImpl();

    @Override
    public List<Dien> getAllData() {
        return dR.getAllData();
    }

    @Override
    public boolean save(Dien dien) {
        return dR.save(dien);
    }

    @Override
    public String delete(String ma) {
        return dR.delete(ma);
    }

    @Override
    public String findByMa(String ma) {
        return dR.findByMa(ma);
    }

}
