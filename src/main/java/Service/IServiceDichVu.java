/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.DichVu;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IServiceDichVu {

    public List<DichVu> getAllData();

    public boolean save(DichVu dv);

    public String delete(String ma);

    public String findByMa(String ma);

}
