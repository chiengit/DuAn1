/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietDichVu;
import DomainModels.Dien;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public interface IRepositoryQldv {

    public List<ChiTietDichVu> getAll();
    
    public boolean save(ChiTietDichVu c);
  
    public String delete(String ma);

    public List<String> getCbbPhong();

    public List<String> getCbbDien();

    public List<String> getCbbNuoc();

    public List<String> getCbbDv();

    public UUID findByIdPhong(String ma);

    public UUID findByIdDien(String ma);

    public UUID findByIdNuoc(String ma);

    public UUID findByIdDv(String ma);

    public String findByMa(String ma);
}
