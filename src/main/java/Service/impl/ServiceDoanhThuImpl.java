/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.impl;

import Repositories.IRepositoryDoanhThu;
import Repositories.impl.RepositoryDoanhThuImpl;
import Service.IServiceDoanhThu;

/**
 *
 * @author admin
 */
public class ServiceDoanhThuImpl implements IServiceDoanhThu {

    private IRepositoryDoanhThu dtR = new RepositoryDoanhThuImpl();

    @Override
    public Double doanhThu(int ngayTao) {
        return dtR.doanhThu(ngayTao);
    }

}
