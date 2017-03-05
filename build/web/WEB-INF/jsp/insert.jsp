<%-- 
    Document   : insert
    Created on : Mar 1, 2017, 12:56:44 AM
    Author     : dicka
--%>



<%@page import="com.dicka.dao.CategoriDAOimpl"%>
<%@page import="com.dicka.service.CategoriServiceImpl"%>
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
                        <h3>Insert Spring MVC & AutoWired</h3>
                    </div>
                    <form action="proses.html" method="POST" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">idcategori :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="idcategoris" 
                                       value="">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-lg-3 control-label">categori :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="nama">
                            </div>
                        </div>
                        <div class="col-lg-4 col-lg-offset-2">
                            <button type="submit" class="btn btn-primary">
                                <span class="glyphicon glyphicon-save"></span>
                                save
                            </button>
                            <a href="${pageContext.request.contextPath}/categoris.html" class="btn btn-default">
                                <span class="glyphicon glyphicon-circle-arrow-right"></span>
                                cancel
                            </a>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
