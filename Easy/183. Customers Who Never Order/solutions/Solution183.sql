SELECT c.name as Customers
FROM Customers c
WHERE c.id not in (
    SELECT o.customerId
    FROM orders o
);