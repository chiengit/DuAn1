/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.Phong;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRepositoryPhong {

    public List<Phong> getAllData();

    public boolean save(Phong phong);

    public String delete(String ma);

    public String findByIdPhong(String ma);
}
