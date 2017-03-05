<%-- 
    Document   : updateProduct
    Created on : Mar 4, 2017, 7:32:05 AM
    Author     : dicka
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.css" rel="stylesheet">
        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet">
        <title>${titleUpdate}</title>
    </head>
    <body>
        <div class="container">
            <div class="container-fluid">
                <div class="col-lg-8 col-lg-offset-2">
                    <div class="page-header">
                        <h3>Update Product Spring Mvc</h3>
                    </div>
                    <form action="productUpdate.html" method="POST" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">idproduct :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="idproduct" 
                                       value="${pro.idproduct}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">nama :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="nama" value="${pro.nama}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">categori :</label>
                            <div class="col-lg-5">
                                <select class="form-control" name="idcategoris">
                                    <option value="">Pilih Salah Satu</option>
                                    <c:forEach items="${listCategoris}" var="cat">
                                        <option value="${cat.idcategoris}">${cat.nama}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">price :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="price" value="${pro.price}">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">qty :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="qty" value="${pro.qty}">
                            </div>
                        </div>
                        <div class="col-lg-4 col-lg-offset-4">
                            <button type="submit" class="btn btn-primary">
                                <span class="glyphicon glyphicon-save"></span>
                                Update
                            </button>
                            <a href="${pageContext.request.contextPath}/product.html" class="btn btn-danger">
                                <span class="glyphicon glyphicon-circle-arrow-right"></span>
                                Back
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
