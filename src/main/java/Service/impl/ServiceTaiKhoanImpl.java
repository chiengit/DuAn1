/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repositories.IRepositoryTaiKhoan;
import Repositories.impl.RepositoryTaiKhoanImpl;
import Service.IServiceTaiKhoan;

/**
 *
 * @author admin
 */
public class ServiceTaiKhoanImpl implements IServiceTaiKhoan {

    private IRepositoryTaiKhoan tkR = new RepositoryTaiKhoanImpl();

    @Override
    public String findByTk(String ma, String matKhau) {
        return tkR.findByTk(ma, matKhau);
    }

    @Override
    public String findByVt(String ma, String matKhau) {
        return tkR.findByVt(ma, matKhau);
    }

}
