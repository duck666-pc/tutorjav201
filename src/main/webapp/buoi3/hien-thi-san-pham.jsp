<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 02/02/2026
  Time: 11:41 CH
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
                <th>Ten San Pham</th>
                <th>Gia Ban</th>
                <th>So Luong Ton</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ListSanPham}" var="sp">
                <tr>
                    <td>${sp.id}</td>
                    <td>${sp.tenSanPham}</td>
                    <td>${sp.giaBan}</td>
                    <td>${sp.soLuongTon}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
