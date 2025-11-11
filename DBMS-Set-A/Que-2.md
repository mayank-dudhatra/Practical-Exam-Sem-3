#  Question 2

### Write SQL queries for the following operations on the `MenuItem` table:

1. Insert three menu items in one query  
2. Update the price of any one item  
3. Delete one item using `item_id`  
4. Find the average price of all items  
5. Find the sum of all prices  

---

##  SQL Queries

```sql

INSERT INTO MenuItem (item_id, item_name, price, category)
VALUES 
(1, 'Pasta', 180, 'Italian'),
(2, 'Sandwich', 90, 'Snacks'),
(3, 'Mojito', 150, 'Beverage');


UPDATE MenuItem 
SET price = 200 
WHERE item_id = 1;


DELETE FROM MenuItem 
WHERE item_id = 2;


SELECT AVG(price) AS AveragePrice 
FROM MenuItem;


SELECT SUM(price) AS TotalPrice 
FROM MenuItem;
