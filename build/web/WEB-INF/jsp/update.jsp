<%-- 
    Document   : update
    Created on : Mar 1, 2017, 2:42:29 AM
    Author     : dicka
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                        <h3>Update Spring Autowired</h3>
                    </div>
                    <form action="prosesUpdate.html" method="POST" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-lg-3 control-label">idcategori :</label>
                            <div class="col-lg-5">
                                <input type="text" class="form-control" name="idcategoris" value="${cat.idcategoris}">
                            </div>
                        </div>
                            <div class="form-group">
                                <label class="col-lg-3 control-label">categori :</label>
                                <div class="col-lg-5">
                                    <input type="text" class="form-control" name="nama" value="${cat.nama}">
                                </div>
                            </div>
                                <div class="col-lg-4 col-lg-offset-4">
                                    <button type="submit" class="btn btn-primary">
                                        <span class="glyphicon glyphicon-save"></span>
                                        update
                                    </button>
                                    <a class="btn btn-default" href="${pageContext.request.contextPath}/categoris.html">
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
