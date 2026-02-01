package buoi3.Controller;

import buoi3.Repository.DonHangRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "donHangController", value = {
        "/don-hang/hien-thi",
        "/don-hang/view-update",
        "/don-hang/xoa",
        "/don-hang/them",
        "/don-hang/sua",
})
public class DonHangController extends HttpServlet {
    DonHangRepository donHangRepository = new DonHangRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")){
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("ListDonHang", donHangRepository.getAll());
        req.getRequestDispatcher("/buoi3/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
