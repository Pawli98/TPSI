<%-- 
    Document   : personList
    Created on : 2020-04-07, 11:14:07
    Author     : gp41370
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Java Web - laboratorium 4</title>
    </head>
    
    <body>
            <h1> Tabelka Osób</h1>
           <table border=1>    
                <tr>
                    <td> <h3>Imie </h3></td> <td><h3> Nazwisko </h3></td> <td><h3> E-mail </h3></td>
                </tr>
                 <c:forEach items="${osoby}" var="osoba">
                <p>    
                    <tr>         
                        <td>${osoba.firstName}</td><td>${osoba.lastName}</td><td>${osoba.email }</td>
                    </tr>
                </p>
                </c:forEach>
            </table>
    </body>
</html>
