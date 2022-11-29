/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.TaiKhoan;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRepositoryTaiKhoan {

    public String findByTk(String ma, String matKhau);

    public String findByVt(String ma, String matKhau);

}
