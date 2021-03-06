/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stk.helper;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import stk.entities.Sotk;
import stk.entities.Sotk;
import stk.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class SoTKHelper extends AbstractClassHelper {
    Session session = null;

    public SoTKHelper() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    @Override
    public int doCreate(Object entity) {
        openConnect(session);
        Sotk user = (Sotk) entity;
        session.save(user);
        try {
             session.save(user);
            return SUCCESS;

        } catch (Exception e) {
            System.out.println("error:" + e);
            return FAIL;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public int doUpdate(Object entity) {
        openConnect(session);
        Sotk user = (Sotk) entity;
        String hql = "update Sotk as kh set "
                 + "idkhachhang=:idkhachhang, "
                 + "loaitk=:loaitk, "
                 + "ngaymoso=:ngaymoso "
                 + "sotiengui=:sotiengui "
                 + "where "
                 + "id = :id ";
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery(hql);
            q.setInteger("id", user.getId());
            q.setInteger("idkhachhang", user.getIdKh());
            q.setInteger("loaitk", user.getLoaiTk());
            q.setDate("ngaymoso", user.getNgayMoSo());
            q.setInteger("sotiengui", user.getSoTienGui());
            q.executeUpdate();

            return SUCCESS;
            
        } catch (Exception e) {
            System.out.println("error:" + e);
            return FAIL;
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }
    }

    @Override
    public int doDelete(Object entity) {
        openConnect(session);
        Sotk user = (Sotk) entity;
        try {
            Query q = session.createQuery("delete Sotk as kh where kh.id=" + user.getId());
            q.executeUpdate();
            return SUCCESS;

        } catch (Exception e) {
            
            e.printStackTrace();
            return FAIL;

        }finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    @Override
    public <T extends Object> List<T>  doSeleteAll(Object condition) {
        openConnect(session);
        List<Sotk> userList = new ArrayList<Sotk>();
        try {
            Query q = session.createQuery("from Sotk as kh ");        
            userList = (List<Sotk>) q.list();
        } catch (Exception e) {
            userList = null;
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return(List<T>) userList;
        }
    }

    @Override
    public Object doSeleteById(int id) {
        openConnect(session);
        Sotk user = null;
        try {
            Query q = session.createQuery("from Sotk as kh where kh.id=" + id);
            user = (Sotk) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
            return user;
        }
    }

    @Override
    public void closeConnect(Session session) {
        if (session != null && session.isOpen()) {
                session.close();
        }    
    }

    @Override
    public void openConnect(Session session) {
        this.session = HibernateUtil.getSessionFactory().openSession();
              
    }
}
