<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title }</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
    </head>

    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>List Categori</h3>
                    </div>
                    <a href="${pageContext.request.contextPath}/insert.html" class="btn btn-primary">
                        <span class="glyphicon glyphicon-plus-sign"></span>
                        Tambah Data
                    </a>
                    <div class="page-header">
                        <table class="table table-bordered table-striped table-hover" id="myTabel">
                            <tr>
                                <th>idcategori</th>
                                <th>categori</th>
                                <th>opsi</th>
                            </tr>
                            <tbody>
                                <c:forEach items="${list}" var="cat">
                                    <tr>
                                        <td>${cat.idcategoris}</td>
                                        <td>${cat.nama}</td>
                                        <td>
                                            <a href="update.html?id=${cat.idcategoris}" class="btn btn-primary">
                                                <span class="glyphicon glyphicon-pencil"></span>
                                                update
                                            </a>
                                            <a href="delete.html?id=${cat.idcategoris}"
                                               onclick="return confirm('sure?')" class="btn btn-default">
                                                <span class="glyphicon glyphicon-trash"></span>
                                                delete
                                            </a>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
