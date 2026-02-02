package buoi3.Controller;

import buoi3.Repository.SanPhamRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "sanPhamController", value = {
        "/san-pham/hien-thi-san-pham",
        "/san-pham/view-update",
        "/san-pham/xoa",
        "/san-pham/them",
        "/san-pham/sua",
})
public class SanPhamController extends HttpServlet {
    SanPhamRepository sanPhamRepository = new SanPhamRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("hien-thi-san-pham")) {
            req.setAttribute("ListSanPham", sanPhamRepository.getAll());
            req.getRequestDispatcher("/buoi3/hien-thi-san-pham.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
