<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/24
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr height=10>
            <th width="1%">编号</th>
            <th width="1%">姓名</th>
            <th width="1%">年龄</th>
            <th width="1%">地址</th>
        </tr>
        <c:forEach var="role" items="${role}">
            <tr height='40px'>
                <td align='center'>${role.id}</td>
                <td align='center'>${role.role}</td>
                <td align='center'>${role.roleIntroduce}</td>
                <td align='center'>${role.roleState}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
