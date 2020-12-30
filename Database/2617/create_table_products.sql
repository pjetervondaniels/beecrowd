CREATE TABLE products(id int primary key, name varchar(255), amount numeric, price numeric)
ALTER TABLE dbo.products ADD id_providers INT NULL
ALTER TABLE dbo.products ADD CONSTRAINT id_providers FOREIGN KEY (id_providers) REFERENCES dbo.providers (id)


