package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import repository.DonHangRepository;

import java.io.IOException;

@WebServlet(name = "donHangController", value = {
        "/don-hang/hien-thi",
        "/don-hang/them",
        "/don-hang/xoa"
})
public class DonHangController extends HttpServlet {
    DonHangRepository repository = new DonHangRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if(uri.contains("hien-thi")){
            hienThi(req, resp);
        }
    }

    private void hienThi(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listDonHang", repository.getAll());
        req.getRequestDispatcher("/donHang/hien-thi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
