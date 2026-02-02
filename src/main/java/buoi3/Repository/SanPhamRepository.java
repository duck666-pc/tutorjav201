package buoi3.Repository;

import buoi3.Model.SanPham;
import buoi3.Util.HibernateConfigBuoi3;
import org.hibernate.Session;

import java.util.List;

public class SanPhamRepository {
    private Session session = null;

    public SanPhamRepository() {
        session = HibernateConfigBuoi3.getFACTORY().openSession();  // Sửa lại đây
    }

    public List<SanPham> getAll() {
        return session.createQuery("SELECT sp FROM SanPham sp").getResultList();
    }

    public SanPham getById(Integer id){
        return session.find(SanPham.class, id);
    }

    public void addSanPham(SanPham sanPham) {
        try {
            session.getTransaction().begin();
            session.persist(sanPham);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void updateSanPham(SanPham sanPham) {
        try {
            session.getTransaction().begin();
            session.merge(sanPham);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void deleteSanPham(Integer id) {
        try {
            session.getTransaction().begin();
            SanPham sp = session.find(SanPham.class, id);
            if (sp != null) {
                session.remove(sp);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }
}