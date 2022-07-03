/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendaftaran.com.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import pendaftaran.com.model.PendaftaranApp;

/**
 * Implementasi isi perintah untuk Interface
 * 
 * @author Andhika Arya Sena
 */
public class PendaftaranImpl implements PendaftaranDao{

    private final SessionFactory sessionFactory;// db access
    public PendaftaranImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }
    
    @Override
    public void save(PendaftaranApp pendaftaran) {
       Session session = sessionFactory.openSession();
       try{
           session.beginTransaction();
           session.save(pendaftaran);
           session.getTransaction().commit();
       } catch (Exception e) {
           System.err.print("Tidak dapat menyimpan data");
           session.getTransaction().rollback();
       } finally {
           session.close();
       }
    }

    @Override
    public void delete(PendaftaranApp pendaftaran) {
       Session session =  sessionFactory.openSession();
       try{
           session.beginTransaction();
           session.delete(pendaftaran);
           session.getTransaction().commit();
       } catch (Exception e) {
           System.err.print("Tidak dapat menghapus data");
           session.getTransaction().rollback();
       } finally {
           session.close();
       }
    }

    @Override
    public void update(PendaftaranApp pendaftaran) {
       Session session =  sessionFactory.openSession();
       try{
           session.beginTransaction();
           session.update(pendaftaran);
           session.getTransaction().commit();
       } catch (Exception e) {
           System.err.print("Tidak dapat mengubah data");
           session.getTransaction().rollback();
       } finally {
           session.close();
       }
    }

    @Override
    public PendaftaranApp get(String NAMA) {
         Session session =  sessionFactory.openSession();
         try{
           session.beginTransaction();
           PendaftaranApp pendaftaran = (PendaftaranApp)session.get(PendaftaranApp.class, NAMA);
           session.getTransaction().commit();
           return pendaftaran;
       } catch (Exception e) {
           System.err.print("Tidak dapat menampilkan daftar murid baru");
           session.getTransaction().rollback();
           return null;
       } finally {
           session.close();
       }
    }

    @Override
    public List<PendaftaranApp> getList() {
        Session session =  sessionFactory.openSession();
         try{
           session.beginTransaction();
           List<PendaftaranApp> listpendaftaran = session.createCriteria(PendaftaranApp.class).list();
           session.getTransaction().commit();
           return listpendaftaran;
       } catch (Exception e) {
           System.err.print("List pendaftaran tidak ada");
           session.getTransaction().rollback();
           return null;
       } finally {
           session.close();
       }
    }
}
