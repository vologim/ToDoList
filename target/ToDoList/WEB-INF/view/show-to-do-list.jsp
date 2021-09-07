<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <body>
        <h2>To-do List</h2>
        <br><br>
        
        <table>
            
            <c:forEach var="element" items="${dealList}">
                
            <tr>
                <td>
                    &#10148;
                    ${element.text}
                </td>
            </tr>
            
            </c:forEach>
            
            
        </table>
        
        <br>
        <input type="button" value="Add new case"
               onclick="window.location.href='addNewCase'"/>
        
    </body>
</html>
