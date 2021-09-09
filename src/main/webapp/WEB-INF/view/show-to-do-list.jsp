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
                
                <c:url var="changeButton" value="/changeCase">
                    <c:param name="caseId" value="${element.id}"/>
                </c:url>
                <c:url var="deleteButton" value="/deleteCase">
                    <c:param name="caseId" value="${element.id}"/>
                </c:url>
                                
            <tr>
                <td>
                    &#10148;
                    ${element.text}
                    
                </td>
                <td>
                    <input type="button" value="Change"
                           onclick="window.location.href='${changeButton}'"/>
                    <input type="button" value="Delete"
                           onclick="window.location.href='${deleteButton}'"/>
                </td>
            </tr>
            
            </c:forEach>
            
            
        </table>
        
        <br>
        <input type="button" value="Add new case"
               onclick="window.location.href='addNewCase'"/>
        
    </body>
</html>
