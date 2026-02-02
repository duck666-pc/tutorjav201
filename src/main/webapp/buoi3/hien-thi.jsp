<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách đơn hàng</title>
</head>
<body>
<h2>Bảng đơn hàng:</h2>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Tên Khách Hàng</th>
        <th>Ngày Mua</th>
        <th>Tổng Tiền</th>
        <th>Đã Thanh Toán</th>
        <th>Tên Sản Phẩm</th>
        <th>Giá Bán</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${ListDonHang}" var="dh">
        <tr>
            <td>${dh.id}</td>
            <td>${dh.tenKhachHang}</td>
            <td>${dh.ngayMua}</td>
            <td>${dh.tongTien}</td>
            <td>${dh.daThanhToan == true ? "Da thanh toan" : "Chua thanh toan"}</td>
            <td>${dh.sanPham != null ? dh.sanPham.tenSanPham : 'N/A'}</td>
            <td>${dh.sanPham != null ? dh.sanPham.giaBan : 'N/A'}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>