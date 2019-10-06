CREATE DATABASE local_manager;
CREATE USER 'test'@'localhost' IDENTIFIED BY 'examp';
GRANT ALL PRIVILEGES ON *.* TO 'test'@'localhost';
CREATE USER 'test'@'%' IDENTIFIED BY 'examp';
GRANT ALL PRIVILEGES ON *.* TO 'test'@'%';
FLUSH PRIVILEGES;