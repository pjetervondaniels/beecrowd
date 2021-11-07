SELECT cs.name, re.rentals_date
FROM rentals re
LEFT JOIN customers cs ON re.id_customers = cs.id
WHERE re.rentals_date BETWEEN '2016-09-01' AND '2016-09-30'