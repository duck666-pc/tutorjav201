package repository;

import model.SanPham;
import org.hibernate.Session;
import util.HibernateConfig;

import java.util.List;

public class SanPhamRepository {
    public Session session = null;

    public SanPhamRepository() {
        session = HibernateConfig.getFACTORY().openSession();
    }

    public List<SanPham> getAll() {
        return session.createQuery("SELECT * FROM SanPham sp").list();
    }

    public SanPham getById(Integer id) {
        return session.find(SanPham.class, id);
    }

    public void addSanPham(SanPham sanPham){
        try {
            session.getTransaction().begin();
            session.save(sanPham);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void updateSanPham(SanPham sanPham){
        try {
            session.getTransaction().begin();
            session.update(sanPham);
            session.getTransaction().commit();
        } catch (Exception e){
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteSanPham(Integer id) {
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
