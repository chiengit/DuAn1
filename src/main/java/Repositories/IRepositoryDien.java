/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.Dien;
import DomainModels.Nuoc;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IRepositoryDien {

    public List<Dien> getAllData();

    public boolean save(Dien dien);

    public String delete(String ma);

    public String findByMa(String ma);

}
