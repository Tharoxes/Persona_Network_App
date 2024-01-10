CREATE DATABASE  IF NOT EXISTS `user_profiles`;
USE `user_profiles`;

--
-- Table structure for table `student`
--

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `BIOGRAPHY`;

CREATE TABLE `BIOGRAPHY` (
  `biography_uuid` binary(16) DEFAULT (UUID_TO_BIN(uuid())),
  `job`varchar(45) DEFAULT NULL,
  `goal` varchar(45) DEFAULT NULL,
  PRIMARY KEY(`biography_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `USERS`;

CREATE TABLE `USERS` (
  `user_uuid` binary(16) DEFAULT (UUID_TO_BIN(uuid())),
  `first_name`varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
    PRIMARY KEY(`user_uuid`),
  `biography_uuid` binary(16) DEFAULT (UUID_TO_BIN(uuid())),
  CONSTRAINT `FK_DETAIL_idx` FOREIGN KEY (`biography_uuid`) 
  REFERENCES `BIOGRAPHY` (`biography_uuid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1



