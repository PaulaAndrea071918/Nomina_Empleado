<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nominas</title>
</head>
<body>
<h1><%= "Nomina de empleados" %>
</h1>
<form action="HelloServlet" method="get">
    <label for="nombres"> Ingrese sus nombres: </label><br>
    <input type="text" name="nombres" id="nombres" required><br>
    <label for="apellidos"> Ingrese sus apellidos: </label><br>
    <input type="text" name="apellidos" id="apellidos" required><br>
    <label for="Cedula"> Ingrese su cedula: </label><br>
    <input type="text" name="Cedula" id="Cedula" required><br>
    <label for="diastrabajados"> Dias trabajados: </label><br>
    <input type="text" name="diastrabajados" id="diastrabajados" required><br>
    <label for="sueldo"> Ingrese su sueldo: </label><br>
    <input type="text" name="sueldo" id="sueldo" required><br>
    <input type="submit" name="calcular" id="calcular" value="Calcular"><br>

</form>
<br/>

</body>
</html>
