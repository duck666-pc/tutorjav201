package repository;

import model.DonHang;
import org.hibernate.Session;
import util.HibernateConfig;

import java.util.List;

public class DonHangRepository {
    private Session session = null;

    public DonHangRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<DonHang> getAll() {
        return session.createQuery("SELECT * from DonHang dh").list();
    }

    public DonHang getById(Integer id) {
        return session.find(DonHang.class, id);
    }

    public void addDonHang(DonHang donHang) {
        try {
            session.getTransaction().begin();
            session.save(donHang);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void updateDonHang(DonHang donHang) {
        try {
            session.getTransaction().begin();
            session.update(donHang);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteDonHang(Integer id) {
        try {
            session.getTransaction().begin();
            session.delete(this.getById(id));
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}
