CREATE USER MyProjectDB IDENTIFIED BY projectdb;
GRANT CONNECT TO MyProjectDB;
GRANT CONNECT SESSION TO MyProjectDB;
GRANT CREATE TABLE TO MyProjectDB;
GRANT UNLIMITED TABLESPACE TO MyProjectDB;



------------------------------------------------------------------------------- Таблици
CREATE TABLE Car (
    car_id INT PRIMARY KEY,
    car_model_id INT,
    car_color_id INT,
    year INT,
    mileage INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (car_model_id) REFERENCES Brand_Model(model_id),
    FOREIGN KEY (car_color_id) REFERENCES Car_Color(color_id)
);

CREATE TABLE Brand_Model (
    model_id INT PRIMARY KEY,
    model_title VARCHAR(10),
    brand_id INT,
    FOREIGN KEY (brand_id) REFERENCES Car_Brand(brand_id)
);

CREATE TABLE Car_Brand (
    brand_id INT PRIMARY KEY,
    brand_title VARCHAR(10)
);

CREATE TABLE Car_Color (
    color_id INT PRIMARY KEY,
    color_name VARCHAR(30)
);

CREATE TABLE Sales (
    purchase_id INT PRIMARY KEY,
    client_buyer_id INT,
    car_buyer_id INT,
    employee_seller_id INT,
    date_of_sale DATE,
    FOREIGN KEY (client_buyer_id) REFERENCES Client(client_id),
    FOREIGN KEY (car_buyer_id) REFERENCES Car(car_id),
    FOREIGN KEY (employee_seller_id) REFERENCES Employee(employee_id)
);

CREATE TABLE Client (
    client_id INT PRIMARY KEY,
    name VARCHAR2(30),
    address VARCHAR2(50),
    phone_number VARCHAR2(10)
);

CREATE TABLE Employee (
    employee_id INT PRIMARY KEY,
    employee_pos_id INT,
    name VARCHAR2(30),
    phone_number VARCHAR2(10),
    FOREIGN KEY (employee_pos_id) REFERENCES Position_Employee(pos_id)
);

CREATE TABLE Position_Employee (
    pos_id INT PRIMARY KEY,
    position_name VARCHAR2(20)
);



------------------------------------------------------------------------------- Въвеждане на данни
-- Car_Brand Table
INSERT INTO Car_Brand (brand_id, brand_title) VALUES
(1, 'Mazda');
INSERT INTO Car_Brand (brand_id, brand_title) VALUES
(2, 'Infinity');
INSERT INTO Car_Brand (brand_id, brand_title) VALUES
(3, 'BMW');
INSERT INTO Car_Brand (brand_id, brand_title) VALUES
(4, 'Mercedes');
INSERT INTO Car_Brand (brand_id, brand_title) VALUES
(5, 'Lambo');

-- Brand_Model Table
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(1, '323f BA', 1);
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(2, 'QX70', 2);
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(3, 'MX5', 1);
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(4, '630i', 3);
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(5, 'CLS 323', 4);
INSERT INTO Brand_Model (model_id, model_title, brand_id) VALUES
(6, 'Aventador', 5);

-- Car_Color Table
INSERT INTO Car_Color (color_id, color_name) VALUES
(1, 'Green');
INSERT INTO Car_Color (color_id, color_name) VALUES
(2, 'Black');
INSERT INTO Car_Color (color_id, color_name) VALUES
(3, 'Red');
INSERT INTO Car_Color (color_id, color_name) VALUES
(4, 'White');
INSERT INTO Car_Color (color_id, color_name) VALUES
(5, 'Silver');
INSERT INTO Car_Color (color_id, color_name) VALUES
(6, 'Orange');

-- Car Table
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(1, 1, 1, 1998, 141000, 2500.00);
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(2, 2, 2, 2007, 106000, 41000.00);
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(3, 3, 3, 2002, 162000, 3000.00);
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(4, 4, 4, 2007, 120000, 15000.00);
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(5, 5, 5, 2000, 110000, 12000.00);
INSERT INTO Car (car_id, car_model_id, car_color_id, year, mileage, price) VALUES
(6, 6, 6, 2001, 16000, 84000.00);

-- Employee Table
INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(1, 1, 'Иван Петров', '3590000011');
INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(2, 2, 'Мария Иванова', '3590000012');
INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(3, 3, 'Георги Георгиев', '3590000013');

-- Position_Employee Table
INSERT INTO Position_Employee (pos_id, position_name) VALUES
(1, 'Консултант');
INSERT INTO Position_Employee (pos_id, position_name) VALUES
(2, 'Мениджър');
INSERT INTO Position_Employee (pos_id, position_name) VALUES
(3, 'Техник');

-- Client Table
INSERT INTO Client (client_id, name, address, phone_number) VALUES
(1, 'Стефан Стефанов', 'ул. Осма 1, София', '3590000014');
INSERT INTO Client (client_id, name, address, phone_number) VALUES
(2, 'Анна Георгиева', 'ул. Девета 2, Пловдив', '3590000015');
INSERT INTO Client (client_id, name, address, phone_number) VALUES
(3, 'Николай Иванов', 'ул. Десета 3, Варна', '3590000016');

-- Sales Table
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(4, 1, 4, 1, '2023-04-10');
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(5, 2, 5, 2, '2023-05-15');
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(6, 3, 1, 3, '2023-06-20');
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(7, 1, 2, 1, '2023-07-25');
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(8, 2, 3, 2, '2023-08-30');
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(9, 2, 3, 2, '2023-11-30');



---------------------------------------------------------------------------------------------------------- Корекция на данни
-- Car_Brand
UPDATE Car_Brand SET brand_title = 'Toyota' WHERE brand_id = 1;
DELETE FROM Car_Brand WHERE brand_id = 2;

-- Brand_Model
UPDATE Brand_Model SET model_title = 'Camry' WHERE model_id = 1;
DELETE FROM Brand_Model WHERE model_id = 2;

-- Car_Color
UPDATE Car_Color SET color_name = 'Purple' WHERE color_id = 1;
DELETE FROM Car_Color WHERE color_id = 2;

-- Car
UPDATE Car SET mileage = 155000 WHERE car_id = 1;
DELETE FROM Car WHERE car_id = 2;

-- Sales
UPDATE Sales SET date_of_sale = '2023-09-10' WHERE purchase_id = 1;
DELETE FROM Sales WHERE purchase_id = 3;

-- Client
UPDATE Client SET address = 'ул. Шеста 4, София' WHERE client_id = 1;
DELETE FROM Client WHERE client_id = 2;

-- Employee
UPDATE Employee SET phone_number = '3590000018' WHERE employee_id = 1;
DELETE FROM Employee WHERE employee_id = 3;

-- Position_Employee
UPDATE Position_Employee SET position_name = 'Support Specialist' WHERE pos_id = 1;
DELETE FROM Position_Employee WHERE pos_id = 2;



--------------------------------------------------------------------------------------------------------------- Справки
--2. Търсене на автомобили по марка, модел, цвят, година, километри, цена
SELECT
    Car_Brand.brand_title,
    Brand_Model.model_title AS brand_model,
    Car_Color.color_name AS color,
    Car.year,
    Car.mileage,
    Car.price
FROM
    Car
JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
WHERE
    Car_Brand.brand_title = 'Mazda'
    AND Brand_Model.model_title = '323f BA'
    AND Car_Color.color_name = 'Green'
    AND Car.year = 1998
    AND Car.mileage < 1000000
    AND Car.price BETWEEN 1000.00 AND 20000.00;

    

-- 3.  
-- продадени автомобили от служител, подредени по дата на продажба
SELECT
    Car_Brand.brand_title,
    Brand_Model.model_title AS brand_model,
    Car_Color.color_name AS color,
    Car.year,
    Car.mileage,
    Car.price,
    Sales.date_of_sale,
    Client.name AS buyer_name,
    Employee.name AS seller_name
FROM
    Sales
JOIN Car ON Sales.car_buyer_id = Car.car_id
JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
JOIN Client ON Sales.client_buyer_id = Client.client_id
JOIN Employee ON Sales.employee_seller_id = Employee.employee_id
ORDER BY
    Sales.date_of_sale DESC;

-- последните 5 продажби подредени по цена
SELECT
    brand_title,
    brand_model,
    color,
    year,
    mileage,
    price,
    date_of_sale,
    buyer_name,
    seller_name
FROM (
    SELECT
        Car_Brand.brand_title,
        Brand_Model.model_title AS brand_model,
        Car_Color.color_name AS color,
        Car.year,
        Car.mileage,
        Car.price,
        Sales.date_of_sale,
        Client.name AS buyer_name,
        Employee.name AS seller_name,
        ROW_NUMBER() OVER (ORDER BY Sales.date_of_sale DESC) AS row_num
    FROM
        Sales
    JOIN Car ON Sales.car_buyer_id = Car.car_id
    JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
    JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
    JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
    JOIN Client ON Sales.client_buyer_id = Client.client_id
    JOIN Employee ON Sales.employee_seller_id = Employee.employee_id
    ORDER BY
        Sales.date_of_sale DESC
)
WHERE
    row_num <= 5
ORDER BY
    price ASC;
    

-- закупени автомобили от клиент
SELECT
    Car_Brand.brand_title,
    Brand_Model.model_title AS brand_model,
    Car_Color.color_name AS color,
    Car.year,
    Car.mileage,
    Car.price,
    Sales.date_of_sale,
    Employee.name AS seller_name,
    Client.name AS buyer_name
FROM
    Sales
JOIN Car ON Sales.car_buyer_id = Car.car_id
JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
JOIN Employee ON Sales.employee_seller_id = Employee.employee_id
JOIN Client ON Sales.client_buyer_id = Client.client_id
WHERE
    Sales.client_buyer_id = (SELECT client_id FROM Client WHERE name = 'Стефан Стефанов')
ORDER BY
    Sales.date_of_sale DESC;


-- продажби за период
SELECT
    Car_Brand.brand_title,
    Brand_Model.model_title AS brand_model,
    Car_Color.color_name AS color,
    Car.year,
    Car.mileage,
    Car.price,
    Sales.date_of_sale,
    Client.name AS buyer_name,
    Employee.name AS seller_name
FROM
    Sales
JOIN Car ON Sales.car_buyer_id = Car.car_id
JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
JOIN Client ON Sales.client_buyer_id = Client.client_id
JOIN Employee ON Sales.employee_seller_id = Employee.employee_id
WHERE
    Sales.date_of_sale BETWEEN '2023-05-30' AND '2023-12-31'
ORDER BY
    Sales.date_of_sale DESC;
    
-- всеки служител - коли в брой
SELECT
    Employee.name AS employee,
    COUNT(Car.car_id) AS car_sold
FROM
    Sales
JOIN Car ON Sales.car_buyer_id = Car.car_id
JOIN Brand_Model ON Car.car_model_id = Brand_Model.model_id
JOIN Car_Color ON Car.car_color_id = Car_Color.color_id
JOIN Car_Brand ON Brand_Model.brand_id = Car_Brand.brand_id
JOIN Employee ON Sales.employee_seller_id = Employee.employee_id
JOIN Client ON Sales.client_buyer_id = Client.client_id
GROUP BY
    Employee.name
ORDER BY
    car_sold DESC;



