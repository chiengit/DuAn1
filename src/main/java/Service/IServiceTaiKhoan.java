/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

/**
 *
 * @author admin
 */
public interface IServiceTaiKhoan {

    public String findByTk(String ma, String matKhau);

    public String findByVt(String ma, String matKhau);
}
