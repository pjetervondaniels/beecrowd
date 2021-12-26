SELECT cst.name, ord.id
FROM customers cst
LEFT JOIN orders ord ON ord.id_customers = cst.id
WHERE ord.orders_date BETWEEN '2016-01-01' AND '2016-06-30'
