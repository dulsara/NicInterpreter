<%-- 
    Document   : results
    Created on : Sep 11, 2013, 5:17:34 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<%@page import="cse.mevan.sample.NicInterpreter"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nic Interpreter</h1>
        <% 
             String nicNum =  request.getParameter("nic");
             if(nicNum.length()==10){
             NicInterpreter nic = new NicInterpreter(nicNum);
             out.println("Year : "+nic.getYear()); 
             out.println(" Month : "+nic.getMonth());
             out.println(" Date : "+nic.getBday()); 
             out.println(" Gender : "+nic.getGender()); 
             out.println(" Is voter: "+nic.isVoter());
                         }
                         else{
                 out.println("Invalid NIC Number");
                         }
        %>
        
    </body>
</html>
