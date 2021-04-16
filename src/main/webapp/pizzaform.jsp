<%--
  Created by IntelliJ IDEA.
  User: audibrattin
  Date: 4/16/21
  Time: 9:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <title>Pizza Order Form</title>
</head>
<body>
<form action="/pizza-order" method="post">
  <label for="crust">Crust Type:</label>
  <select name="crust" id="crust">
    <option value="stuffed">Cheesy Crust</option>
    <option value="thin">Thin Crust</option>
    <option value="thin">Stuff It</option>
  </select>

  <label for="pepperoni">Pepperoni</label>
  <input type="checkbox" name="topping" id="pepperoni" value="pepperoni">
  <label for="sausage">Sausage</label>
  <input type="checkbox" name="topping" id="sausage" value="sausage">
  <label for="peppers">Xtreme Cheese-y</label>
  <input type="checkbox" name="topping" id="peppers" value="peppers">

  <label for="address">Delivery Address:</label>
  <input type="text" name="address" id="address">

  <button type="submit">Order up!</button>
</form>
</body>
</html>
