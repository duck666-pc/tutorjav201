<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 01/02/2026
  Time: 9:22 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Bang don hang:
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Ten Khach Hang</th>
                <th>Ngay Mua</th>
                <th>Tong Tien</th>
                <th>Da Thanh Toan</th>
                <th>Ten San Pham</th>
                <th>Gia Ban</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${donHang}" var="dh">
                <tr>
                    <td>${dh.id}</td>
                    <td>${dh.tenKhachHang}</td>
                    <td>${dh.ngayMua}</td>
                    <td>${dh.tongTien}</td>
                    <td>${dh.sanPham.tenSanPham}</td>
                    <td>${dh.sanPham.giaBan}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
