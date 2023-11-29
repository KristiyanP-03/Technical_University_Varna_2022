CREATE TABLE Car (
    car_id INT PRIMARY KEY,
    car_brand_id INT,
    car_color_id INT,
    year INT,
    mileage INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (car_brand_id) REFERENCES Car_Brand(brand_id),
    FOREIGN KEY (car_color_id) REFERENCES Car_Color(color_id)
);



CREATE TABLE Car_Brand (
    brand_id INT PRIMARY KEY,
    brand_title VARCHAR(10),
    brand_model_id INT,
    FOREIGN KEY (brand_model_id) REFERENCES Brand_Model(model_id)
);



CREATE TABLE Brand_Model (
    model_id INT PRIMARY KEY,
    model_title VARCHAR(10)
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






















-- Car_Brand Table
INSERT INTO Car_Brand (brand_id, brand_title, brand_model_id) VALUES
(1, 'Toyota', 1);

INSERT INTO Car_Brand (brand_id, brand_title, brand_model_id) VALUES
(2, 'Honda', 2);

INSERT INTO Car_Brand (brand_id, brand_title, brand_model_id) VALUES
(3, 'Ford', 3);



-- Brand_Model Table
INSERT INTO Brand_Model (model_id, model_title) VALUES
(1, 'Camry');

INSERT INTO Brand_Model (model_id, model_title) VALUES
(2, 'Civic');

INSERT INTO Brand_Model (model_id, model_title) VALUES
(3, 'Focus');





-- Car_Color Table
INSERT INTO Car_Color (color_id, color_name) VALUES
(1, 'Red');

INSERT INTO Car_Color (color_id, color_name) VALUES
(2, 'Blue');

INSERT INTO Car_Color (color_id, color_name) VALUES
(3, 'Silver');






-- Car Table
INSERT INTO Car (car_id, car_brand_id, car_color_id, year, mileage, price) VALUES
(1, 1, 1, 2020, 30000, 25000.00);

INSERT INTO Car (car_id, car_brand_id, car_color_id, year, mileage, price) VALUES
(2, 2, 2, 2019, 28000, 22000.50);

INSERT INTO Car (car_id, car_brand_id, car_color_id, year, mileage, price) VALUES
(3, 3, 3, 2021, 25000, 20000.75);






-- Position_Employee Table
INSERT INTO Position_Employee (pos_id, position_name) VALUES
(1, 'Sales Representative');

INSERT INTO Position_Employee (pos_id, position_name) VALUES
(2, 'Manager');

INSERT INTO Position_Employee (pos_id, position_name) VALUES
(3, 'Technician');






-- Employee Table
INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(1, 1, 'John Doe', '1234567890');

INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(2, 2, 'Jane Smith', '9876543210');

INSERT INTO Employee (employee_id, employee_pos_id, name, phone_number) VALUES
(3, 3, 'Bob Johnson', '5678901234');




-- Client Table
INSERT INTO Client (client_id, name, address, phone_number) VALUES
(1, 'Alice Williams', '123 Main St, Cityville', '5551112233');

INSERT INTO Client (client_id, name, address, phone_number) VALUES
(2, 'Charlie Brown', '456 Oak St, Townsville', '5552223344');

INSERT INTO Client (client_id, name, address, phone_number) VALUES
(3, 'Eva Davis', '789 Pine St, Villagetown', '5553334455');







-- Sales Table
INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(1, 1, 1, 1, '2023-01-15');

INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(2, 2, 2, 2, '2023-02-20');

INSERT INTO Sales (purchase_id, client_buyer_id, car_buyer_id, employee_seller_id, date_of_sale) VALUES
(3, 3, 3, 3, '2023-03-25');