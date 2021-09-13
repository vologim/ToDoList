<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <style>
        #trueDeal {
            background-color: #ff9e9e
        }
        #falseDeal {
            background-color: #8c9fff
        }
    </style>
    
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
                        <c:if test="${element.importance == 1}">
                            <div id="trueDeal">${element.text}</div>                           
                        </c:if>
                            
                        <c:if test="${element.importance == 0}">
                            <div id="falseDeal">${element.text}</div>                              
                        </c:if>
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
