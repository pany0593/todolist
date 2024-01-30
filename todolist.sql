CREATE DATABASE todolist
CHARACTER SET utf8mb4 ;
USE `todolist`;
CREATE TABLE `todolist`.`user` ( 
	`userId` INT(10) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(20),
    `email` VARCHAR(50),
	`pwd` VARBINARY(50), PRIMARY KEY (`userId`) 
) ENGINE=INNODB CHARSET=utf8mb4;
CREATE TABLE `todolist`.`tasks` ( 
	`taskId` INT(10) NOT NULL AUTO_INCREMENT, 
	`userId` INT(10), `title` VARCHAR(50), 
	`description` VARCHAR(100), 
	`startTime` VARCHAR(50), 
	`endTime` VARCHAR(50), 
	`isCompleted` INT DEFAULT 0,
	PRIMARY KEY (`taskId`) 
 ) ENGINE=INNODB CHARSET=utf8mb4; 