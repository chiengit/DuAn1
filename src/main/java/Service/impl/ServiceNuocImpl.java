/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.Nuoc;
import Repositories.IRepositoryNuoc;
import Repositories.impl.RepositoryNuocImpl;
import Service.IServiceNuoc;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceNuocImpl implements IServiceNuoc {

    private IRepositoryNuoc dR = new RepositoryNuocImpl();

    @Override
    public List<Nuoc> getAllData() {
        return dR.getAllData();
    }

    @Override
    public boolean save(Nuoc nuoc) {
        try {
            return dR.save(nuoc);
        } catch (Exception e) {
        }
        return false;
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
