SELECT name
FROM Customers
WHERE id NOT IN (
    SELECT customer_id
    FROM Orders
);
