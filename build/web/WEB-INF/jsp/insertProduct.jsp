<%-- 
    Document   : insertProduct
    Created on : Mar 3, 2017, 5:03:34 PM
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
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>Insert Product</h3>
                    </div>
                    <form action="prosesInsert.html" method="POST" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">idproduct :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="idproduct" value="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">nama :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="nama">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">categories :</label>
                            <div class="col-lg-5">
                                <select class="form-control" name="idcategoris">
                                    <option value="">Pilih Salah Satu</option>
                                    <c:forEach items="${listCategories}" var="cat">
                                        <option value="${cat.idcategoris}">${cat.nama}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">price :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="price">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">qty :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="qty">
                            </div>
                        </div>
                        <div class="col-lg-4 col-lg-offset-4">
                            <button type="submit" class="btn btn-primary">
                                <span class="glyphicon glyphicon-save"></span>
                                Save
                            </button>
                            <a href="${pageContext.request.contextPath}/product.html" 
                               class="btn btn-default">
                                <span class="glyphicon glyphicon-circle-arrow-right"></span>
                                back
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
