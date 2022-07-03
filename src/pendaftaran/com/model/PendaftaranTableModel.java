/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.com.model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Model Table
 * 
 * @author Andhika Arya Sena
 */
public class PendaftaranTableModel extends AbstractTableModel {
    private List<PendaftaranApp> listpendaftaran = new ArrayList();
    private final String HEADER[] = {"No UN", "Nama Lengkap", "Jenis Kelamin", "Tanggal Lahir", "Asal Sekolah", "Agama"};
    
    public PendaftaranTableModel(List<PendaftaranApp> listpendaftaran){
        this.listpendaftaran = listpendaftaran;
    }

    @Override
    public int getRowCount() { //baris
       return listpendaftaran.size();
    }

    @Override
    public int getColumnCount() {
       return HEADER.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        PendaftaranApp pendaftaran = listpendaftaran.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                return pendaftaran.getUNNUM();
            case 1:
                return pendaftaran.getNAMA();
            case 2:
                return pendaftaran.getGENDER();
            case 3:
                return pendaftaran.getTTL();
            case 4:
                return pendaftaran.getASALSKL();
            case 5:
                return pendaftaran.getAGM();
            default:
                return null;
             
        }
    }
    
    @Override
    public String getColumnName(int index) { 
       return HEADER[index];
    }
}
