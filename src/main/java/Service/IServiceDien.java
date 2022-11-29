/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.Dien;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IServiceDien {

    public List<Dien> getAllData();

    public boolean save(Dien dien);

    public String delete(String ma);

    public String findByMa(String ma);
}
