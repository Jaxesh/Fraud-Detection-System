CREATE DATABASE fraud_detection;

USE fraud_detection;

CREATE TABLE transactions (
    id INT PRIMARY KEY AUTO_INCREMENT,
    amount DOUBLE,
    date VARCHAR(50),
    account_number VARCHAR(50)
);

INSERT INTO transactions (amount, date, account_number) VALUES (5000, '2024-07-01', 'ACC12345');
INSERT INTO transactions (amount, date, account_number) VALUES (15000, '2024-07-02', 'ACC67890');
INSERT INTO transactions (amount, date, account_number) VALUES (2000, '2024-07-03', 'ACC54321');
