/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Pembuatan isi table
 * 
 * @author Andhika Arya Sena
 */
@Entity
@Table(name="table_daftar")
public class PendaftaranApp implements Serializable{
    
    @Id
    @Column(name="No_UN", length = 7)
    private String UNNUM;
    
    
    @Column(name="Nama_Lengkap", length = 50)
    private String NAMA;
    
    
    @Column(name="Jenis_Kelamin", length = 10)
    private String GENDER;
    
    
    @Column(name="Tanggal_Lahir", length = 25)
    private String TTL;
    
    
    @Column(name="Asal_Sekolah", length = 50)
    private String ASALSKL;
    
    
    @Column(name="Agama", length = 15)
    private String AGM;

    /**
     * @return the UNNUM
     */
    public String getUNNUM() {
        return UNNUM;
    }

    /**
     * @param UNNUM the UNNUM to set
     */
    public void setUNNUM(String UNNUM) {
        this.UNNUM = UNNUM;
    }

    /**
     * @return the NAMA
     */
    public String getNAMA() {
        return NAMA;
    }

    /**
     * @param NAMA the NAMA to set
     */
    public void setNAMA(String NAMA) {
        this.NAMA = NAMA;
    }

    /**
     * @return the GENDER
     */
    public String getGENDER() {
        return GENDER;
    }

    /**
     * @param GENDER the GENDER to set
     */
    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    /**
     * @return the TTL
     */
    public String getTTL() {
        return TTL;
    }

    /**
     * @param TTL the TTL to set
     */
    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    /**
     * @return the ASALSKL
     */
    public String getASALSKL() {
        return ASALSKL;
    }

    /**
     * @param ASALSKL the ASALSKL to set
     */
    public void setASALSKL(String ASALSKL) {
        this.ASALSKL = ASALSKL;
    }

    /**
     * @return the AGM
     */
    public String getAGM() {
        return AGM;
    }

    /**
     * @param AGM the AGM to set
     */
    public void setAGM(String AGM) {
        this.AGM = AGM;
    }
}
