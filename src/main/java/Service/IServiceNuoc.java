/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.Nuoc;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IServiceNuoc {

    public List<Nuoc> getAllData();

    public boolean save(Nuoc nuoc);

    public String delete(String ma);

    public String findByMa(String ma);

}
