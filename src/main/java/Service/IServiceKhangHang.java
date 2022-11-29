/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.KhachHang;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IServiceKhangHang {

    public List<KhachHang> getAllData();

    public boolean save(KhachHang kh);

    public String delete(String ma);

    public String findByMa(String ma);
}
