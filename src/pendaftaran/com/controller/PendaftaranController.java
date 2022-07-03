/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.com.controller;

import java.util.List;
import javax.swing.JOptionPane;
import pendaftaran.com.config.PendaftaranUtil;
import pendaftaran.com.dao.PendaftaranDao;
import pendaftaran.com.model.PendaftaranApp;
import pendaftaran.com.model.PendaftaranTableModel;
import pendaftaran.com.view.PendaftaranUtama;

/**
 * Kontrol Perintah dari Implementasi 
 * 
 * @author Andhika Arya Sena
 */
public class PendaftaranController {
    private PendaftaranUtama pendaftaranUtama;
    private List<PendaftaranApp> listpendaftaran;
    private PendaftaranTableModel pendaftaranTableModel;
    private final PendaftaranDao pendaftaranDao = PendaftaranUtil.getPendaftaranDao();
    
    public PendaftaranController(PendaftaranUtama pendaftaranUtama){
        this.pendaftaranUtama = pendaftaranUtama;
    }
    
    public void clear(){ // Button clear
        this.pendaftaranUtama.getTxtUN().setText("");
        this.pendaftaranUtama.getTxtName().setText("");
        this.pendaftaranUtama.getTxtGender().setText("");
        this.pendaftaranUtama.getTxtDate().setText("");
        this.pendaftaranUtama.getTxtSchool().setText("");
        this.pendaftaranUtama.getTxtReligi().setText("");
        this.pendaftaranUtama.getTxtAUN().setText("");
        this.pendaftaranUtama.getTxtAName().setText("");
        this.pendaftaranUtama.getTxtAGender().setText("");
        this.pendaftaranUtama.getTxtADate().setText("");
        this.pendaftaranUtama.getTxtASchool().setText("");
        this.pendaftaranUtama.getTxtAReligi().setText("");
    }
    
    
    public void saveData(){ //Button Save
        PendaftaranApp pendaftaran = new PendaftaranApp();
        pendaftaran.setUNNUM(this.pendaftaranUtama.getTxtUN().getText());
        pendaftaran.setNAMA(this.pendaftaranUtama.getTxtName().getText());
        pendaftaran.setGENDER(this.pendaftaranUtama.getTxtGender().getText());
        pendaftaran.setTTL(this.pendaftaranUtama.getTxtDate().getText());
        pendaftaran.setASALSKL(this.pendaftaranUtama.getTxtSchool().getText());
        pendaftaran.setAGM(this.pendaftaranUtama.getTxtReligi().getText());
        
        try {
            pendaftaranDao.save(pendaftaran);
            JOptionPane.showMessageDialog(null, "Berhasil menyimpan Data", "Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan Data", "Error", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
    }
    
    public void updateData(){ //Button Update
        PendaftaranApp pendaftaran = new PendaftaranApp();
        pendaftaran.setUNNUM(this.pendaftaranUtama.getTxtAUN().getText());
        pendaftaran.setNAMA(this.pendaftaranUtama.getTxtAName().getText());
        pendaftaran.setGENDER(this.pendaftaranUtama.getTxtAGender().getText());
        pendaftaran.setTTL(this.pendaftaranUtama.getTxtADate().getText());
        pendaftaran.setASALSKL(this.pendaftaranUtama.getTxtASchool().getText());
        pendaftaran.setAGM(this.pendaftaranUtama.getTxtAReligi().getText());
        
        try {
            pendaftaranDao.update(pendaftaran);
            JOptionPane.showMessageDialog(null, "Berhasil mengubah Data", "Success", JOptionPane.INFORMATION_MESSAGE);
            clear();
            getAllData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengubah Data", "Error", JOptionPane.INFORMATION_MESSAGE);
            clear();
        }
    }
    
    public void deleteData(){ //Button Delete
        if(this.pendaftaranUtama.getTxtAUN().getText() == null) {
             JOptionPane.showMessageDialog(null, "Data belum dipilih", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else {
            PendaftaranApp pendaftaran = new PendaftaranApp();
            pendaftaran.setUNNUM(this.pendaftaranUtama.getTxtAUN().getText());
            
            int option = JOptionPane.showConfirmDialog(null,
                    "Yakin menghapus?",
                    "Warning", 
                    JOptionPane.YES_OPTION, 
                    JOptionPane.WARNING_MESSAGE);
            if (option == JOptionPane.YES_OPTION){
                try {
                    pendaftaranDao.delete(pendaftaran);
                    JOptionPane.showMessageDialog(null, "Berhasil menghapus Data", "Success", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                    getAllData();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Gagal menghapus Data", "Error", JOptionPane.INFORMATION_MESSAGE);
                    clear();
                }
            }
            
        }
    }
    
    public void getAllData(){ //Pengambilan data dan list dari database
        listpendaftaran = pendaftaranDao.getList();
        pendaftaranTableModel = new PendaftaranTableModel(listpendaftaran);
        this.pendaftaranUtama.getTblpdf().setModel(pendaftaranTableModel);
        
    }
    
    public void getData(){ //Pengambilan data untuk tabel dari database
        int rowIndex = this.pendaftaranUtama.getTblpdf().getSelectedRow();
        this.pendaftaranUtama.getTxtAUN().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 0)));
        this.pendaftaranUtama.getTxtAName().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 1)));
        this.pendaftaranUtama.getTxtAGender().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 2)));
        this.pendaftaranUtama.getTxtADate().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 3)));
        this.pendaftaranUtama.getTxtASchool().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 4)));
        this.pendaftaranUtama.getTxtAReligi().setText(String.valueOf(this.pendaftaranUtama.getTblpdf()
                .getValueAt(rowIndex, 5)));
    }
}
