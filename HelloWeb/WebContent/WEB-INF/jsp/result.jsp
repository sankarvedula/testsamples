<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>

   <body>
      <h2>Submitted Student Information</h2>
      <table>
         <tr>
            <td>Name</td>
            <td><c:out value="${name}"/></td>
         </tr>
         <tr>
            <td>Age</td>
            <td><c:out value="${age}" /></td>
         </tr>
         <tr>
            <td>ID</td>
            <td><c:out value="${id}"/></td>
         </tr>
      </table>  
   </body>
   
</html>