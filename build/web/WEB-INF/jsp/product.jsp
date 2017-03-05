<%-- 
    Document   : product
    Created on : Mar 3, 2017, 4:17:00 AM
    Author     : dicka
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${title}</title>
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/dataTables.bootstrap.css" rel="stylesheet">
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>List Product</h3>
                    </div>
                    <a href="${pageContext.request.contextPath}/productInsert.html" class="btn btn-primary">
                        <span class="glyphicon glyphicon-plus-sign"></span>
                        Tambah Data
                    </a>
                    <div class="page-header">
                        <table class="table table-bordered table-striped" id="myTabel">
                            <thead>
                                <tr>
                                    <th>idproduct</th>
                                    <th>name</th>
                                    <th>categori</th>
                                    <th>price</th>
                                    <th>qty</th>
                                    <th>opsi</th>
                                </tr>
                            <tbody>
                            <c:forEach items="${list}" var="prod">
                                <tr>
                                    <td>${prod.idproduct}</td>
                                    <td>${prod.nama}</td>
                                    <td>${prod.categories}</td>
                                    <td>${prod.price}</td>
                                    <td>${prod.qty}</td>
                                    <td>
                                        <a href="productUpdate.html?id=${prod.idproduct}" class="btn btn-primary">
                                            <span class="glyphicon glyphicon-pencil"></span>
                                            update
                                        </a>
                                        <a href="deleteProduct.html?id=${prod.idproduct}" onclick="return confirm('sure?')"
                                           class="btn btn-danger">
                                            <span class="glyphicon glyphicon-trash"></span>
                                            delete
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>
                            </thead>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
