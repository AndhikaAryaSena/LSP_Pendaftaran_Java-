package pendaftaran.com.dao;



import java.util.List;
import pendaftaran.com.model.PendaftaranApp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Implementasi interface Pendaftaran
 * 
 * @author Andhika Arya Sena
 */
public interface PendaftaranDao {
    public void save(PendaftaranApp pendaftaran);
    public void update(PendaftaranApp pendaftaran);
    public void delete(PendaftaranApp pendaftaran);
    public PendaftaranApp get(String NAMA);
    public List<PendaftaranApp> getList();
}
