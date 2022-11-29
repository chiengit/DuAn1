/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import DomainModels.Nuoc;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRepositoryKhachHang {

    public List<KhachHang> getAllData();

    public boolean save(KhachHang kh);

    public String delete(String ma);

    public String findByMa(String ma);
}
