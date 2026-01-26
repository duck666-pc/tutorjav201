<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 25/01/2026
  Time: 11:12 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Sua sinh vien:
<form action="/sinh-vien/sua" method="post">
    ID: <input type="text" name="id" value="${sv.id}"> <br>
    Ten: <input type="text" name="ten" value="${sv.ten}"> <br>
    Tuoi: <input type="text" name="tuoi" value="${sv.tuoi}"> <br>
    Gioi tinh:
    <input type="radio" name="gioiTinh" value="true" ${sv.gioiTinh == true ? "checked":""}> Nam
    <input type="radio" name="gioiTinh" value="false" ${sv.gioiTinh == false ? "checked":""}> Nu
    <br>
    <button>Update</button>
</form>
<br>
</body>
</html>
