-- Bu yorum satırıdır

/*
	* Bu da çoklu yorum satırıdır.
*/

SELECT ContactName AS "Adı", CompanyName AS "Şirket Adı", City AS "Şehir" FROM Customers

SELECT ContactName Adi, CompanyName SirketAdi, City Sehir FROM Customers

SELECT * FROM Customers WHERE City = 'Berlin';

Select * From Products Where CategoryID = 1 Or CategoryID = 3;

Select * From Products Where CategoryID = 1 And UnitPrice >= 10;

select * from Products order by CategoryID, ProductName;

select * from Products order by UnitPrice asc; -- asc => ascending

select * from Products where CategoryID = 1 order by UnitPrice desc; -- desc => descenging

Select Count(*) Adet From Products;

Select CategoryID, Count(*) From Products Group By CategoryID;

Select CategoryID, Count(*) From Products Group By CategoryID Having Count(*) < 10;

Select CategoryID, Count(*) From Products Where UnitPrice > 20
Group By CategoryID Having Count(*) < 10;

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
From Products Inner Join Categories
On Products.CategoryID = Categories.CategoryID

Select Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
From Products Inner Join Categories
On Products.CategoryID = Categories.CategoryID
Where Products.UnitPrice > 10 

Select * From Products p Inner Join OrderDetails od
On p.ProductID = od.ProductID
Inner Join Orders o 
On o.OrderID = od.OrderID

Select * From Customers c Left Join Orders o
On c.CustomerID = o.CustomerID
Where o.CustomerID Is Null
