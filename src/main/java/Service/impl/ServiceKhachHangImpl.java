/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import DomainModels.KhachHang;
import Repositories.IRepositoryKhachHang;
import Repositories.impl.RepositoryKhachHangImpl;
import Service.IServiceKhangHang;
import java.util.List;

/**
 *
 * @author admin
 */
public class ServiceKhachHangImpl implements IServiceKhangHang {

    private IRepositoryKhachHang khR = new RepositoryKhachHangImpl();

    @Override
    public List<KhachHang> getAllData() {
        return khR.getAllData();
    }

    @Override
    public boolean save(KhachHang kh) {
        return khR.save(kh);
    }

    @Override
    public String delete(String ma) {
        return khR.delete(ma);
    }

    @Override
    public String findByMa(String ma) {
        return khR.findByMa(ma);
    }

}
