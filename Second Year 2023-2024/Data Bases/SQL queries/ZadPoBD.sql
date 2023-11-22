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