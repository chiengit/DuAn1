/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import DomainModels.ChiTietDichVu;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public interface IServiceQldv {

    public List<ChiTietDichVu> getAll();

    public boolean save(ChiTietDichVu c);

    public String delete(String ma);

    public List<String> getCbbPhong();

    public List<String> getCbbDien();

    public List<String> getCbbNuoc();

    public List<String> getCbbDv();

    public UUID findByIdPhong(String ten);

    public UUID findByIdDien(String ten);

    public UUID findByIdNuoc(String ten);

    public UUID findByIdDv(String ten);

    public String findByMa(String ma);

}
