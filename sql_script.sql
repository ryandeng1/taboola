-- Create tables
create table Product(name varchar(100) PRIMARY KEY, category varchar(100) NOT NULL);
create table PriceHistory(name varchar(100) NOT NULL, price integer NOT NULL, start_date DATE NOT NULL, end_date DATE,
            FOREIGN KEY (name) REFERENCES Product(name));

-- Get current price of all items
select product.name, history.price as current_price from Product as product, PriceHistory as history where product.name = history.name AND history.end_date IS NOT NULL;