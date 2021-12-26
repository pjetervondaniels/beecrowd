SELECT REGEXP_REPLACE (ntr.cpf,  '(\d{3})(\d{3})(\d{3})(\d{2})',  '\1.\2.\3-\4')
FROM natural_person ntr