/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.HopDong;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author admin
 */
public interface IRepositoryHopDong {

    public List<HopDong> getAllData();

    public boolean add(HopDong hd);

    public String delete(String ma);

    public List<String> getCbbCt();

    public List<String> getCbbKh();

    public List<String> getCbbPh();

    public UUID findByIdCt(String ma);

    public UUID findByIdKh(String ma);

    public UUID findByIdPh(String ma);
    
    public String findByMa(String ma);
}
