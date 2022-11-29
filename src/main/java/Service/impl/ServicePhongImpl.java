/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.Phong;
import Repositories.IRepositoryPhong;
import Repositories.impl.RepositoryPhongImpl;
import Service.IServicePhong;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServicePhongImpl implements IServicePhong {

    private IRepositoryPhong iRepositoryPhong = new RepositoryPhongImpl();

    @Override
    public List<Phong> getAllData() {
        return iRepositoryPhong.getAllData();
    }

    @Override
    public boolean save(Phong phong) {
        return iRepositoryPhong.save(phong);
    }

    @Override
    public String delete(String ma) {
        return iRepositoryPhong.delete(ma);
    }

    public String findByIdPhong(String ma) {
        return iRepositoryPhong.findByIdPhong(ma);
    }

}
