WITH max_value as (
    SELECT MAX(lwy.customers_number) as total
    FROM lawyers lwy
), 
min_value as (
    SELECT MIN(lwy.customers_number) as total
    FROM lawyers lwy
), 
max_value_line as (
    SELECT lwy.name as name, lwy.customers_number as customers_number
    FROM max_value mxv
    LEFT JOIN lawyers lwy ON lwy.customers_number = mxv.total
),
min_value_line as (
    SELECT lwy.name as name, lwy.customers_number AS customers_number
    FROM min_value mxv 
    LEFT JOIN lawyers lwy ON lwy.customers_number = mxv.total
),
average_line as (
    SELECT 'Average' as name, ROUND(AVG(lwy.customers_number), 0) as customers_number
    FROM lawyers lwy
)
SELECT name, customers_number 
FROM max_value_line
UNION ALL
SELECT name, customers_number 
FROM min_value_line
UNION ALL
SELECT name, customers_number 
FROM average_line

