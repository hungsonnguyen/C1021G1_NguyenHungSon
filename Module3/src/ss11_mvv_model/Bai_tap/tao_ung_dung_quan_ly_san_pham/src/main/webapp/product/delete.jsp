<%--
  Created by IntelliJ IDEA.
  User: MyPC
  Date: 15/02/2022
  Time: 1:37 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting Product</title>

</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/ProductServlet">Backto Productlist</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>Product information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td>
                    ${product.getId()}
                </td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>
                    ${product.getName()}
                </td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>
                    ${product.getPrice()}
                </td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>
                    ${product.getDesciption()}
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete product"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
