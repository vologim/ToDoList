<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <h2>Add new case</h2>
        <br><br>
        
        <form:form action="saveCase" modelAttribute="newCase">
            
            <form:hidden path="id"/>
            
            Write case: <form:input path="text"/>
            <br><br>
            This important deal?
            yes<form:radiobutton path="importance" value="1"/>
            no<form:radiobutton path="importance" value="0"/>
            <br><br>
            <input type="submit" value="OK"/>
        </form:form>
        
    </body>
</html>
