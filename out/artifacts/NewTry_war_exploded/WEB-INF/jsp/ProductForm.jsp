<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Add Product Form</title>
</head>

<body>

<div id="global">
<form action="product_save.action" method="post">
    <fieldset>
        <legend>add a product</legend>
        <label for="name">Product name:</label>
        <input type="text" id="name" name="name"value="" tabindex="1">
        <label for="description">Product description:</label>
        <input type="text" id="description" name="description"value="" tabindex="2">
        <label for="price">Product price:</label>
        <input type="text" id="price" name="price"value="" tabindex="3">
        <div id="buttons">
            <label for="submit"></label>
            <input  id="submit"  type="submit"  tabindex="4" value="Add product">
        </div>
    </fieldset>
</form>
</div>
</body>
</html>