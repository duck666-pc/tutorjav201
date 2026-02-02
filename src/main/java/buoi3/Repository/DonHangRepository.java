package buoi3.Repository;

import buoi3.Model.DonHang;
import buoi3.Util.HibernateConfigBuoi3;
import org.hibernate.Session;

import java.util.List;

public class DonHangRepository {
    private Session session = null;

    public DonHangRepository() {
        session = HibernateConfigBuoi3.getFACTORY().openSession();
    }

    public List<DonHang> getAll() {
        return session.createQuery("SELECT dh FROM DonHang dh").getResultList();
    }

    public DonHang getById(Integer id){
        return session.find(DonHang.class, id);
    }

    public void addDonHang(DonHang donHang) {
        try {
            session.getTransaction().begin();
            session.persist(donHang);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void updateDonHang(DonHang donHang) {
        try {
            session.getTransaction().begin();
            session.merge(donHang);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteDonHang(Integer id) {
        try {
            session.getTransaction().begin();
            DonHang dh = session.find(DonHang.class, id);
            if (dh != null) {
                session.remove(dh);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}