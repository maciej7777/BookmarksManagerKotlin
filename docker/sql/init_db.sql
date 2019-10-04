CREATE DATABASE local_manager;
CREATE USER 'test'@'localhost' IDENTIFIED BY 'examp';
GRANT ALL PRIVILEGES ON *.* TO 'test'@'localhost';
FLUSH PRIVILEGES;