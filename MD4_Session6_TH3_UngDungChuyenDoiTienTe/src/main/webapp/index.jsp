<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Currency Converter</title>

</head>
<body>
<h1><%= "Currency Converter" %></h1>
<form action="convert" method="post">
    <h4>Rate</h4>
    <input type="text" name="rate" placeholder="RATE" value="22000">
    <h4>USD</h4>
    <input type="text" name="usd" placeholder="USD" value="0">
    <input type = "submit" id = "submit" value = "Converter"/>
</form>

</body>
</html>