/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.com.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import pendaftaran.com.dao.PendaftaranDao;
import pendaftaran.com.dao.PendaftaranImpl;

/**
 * Pembuatan session 
 * 
 * @author Andhika Arya Sena
 */
public class PendaftaranUtil {
    private static final SessionFactory SESSION_FACTORY;
    private static final PendaftaranDao Pendaftaran_DAO;
    
    static {
        try {
            SESSION_FACTORY = new Configuration().configure().buildSessionFactory();
            Pendaftaran_DAO = new PendaftaranImpl(SESSION_FACTORY);
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory Creation Failed:" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
    
    public static PendaftaranDao getPendaftaranDao(){
        return Pendaftaran_DAO;
    }
    
}
