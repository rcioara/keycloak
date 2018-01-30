<#import "/spring.ftl" as spring>
<html>
<h1>Manage Customers</h1>

<table>
    <tr>
        <td>Name</td>
        <td>Address</td>
        <td>Action</td>
    </tr>
<#list customers as customer>
    <tr>
        <td>${customer.name}</td>
        <td>${customer.address}</td>
        <td><button onclick="delete(${customer.id})">Delete</button></td>
    </tr>
</#list>
</table>

<br>
<a href="/logout">Logout</a>
</html>