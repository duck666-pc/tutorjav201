<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 24/02/2026
  Time: 8:49 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <thead>
        <tr>
            <th>ID</th>
            <th>Ten Khach Hang</th>
            <th>Ngay Mua</th>
            <th>Tong Tien</th>
            <th>Da Thanh Toan</th>
            <th>Ten San Pham</th>
            <th>Gia San Pham</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${listDonHang}" var="dh">
            <tr>
                <td>${dh.id}</td>
                <td>${dh.tenKhachHang}</td>
                <td>${dh.ngayMua}</td>
                <td>${dh.tongTien}</td>
                <td>${dh.daThanhToan}</td>
                <td>${dh.sanPham.tenSanPham}</td>
                <td>${dh.sanPham.giaBan}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
