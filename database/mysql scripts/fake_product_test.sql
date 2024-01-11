CREATE DATABASE  IF NOT EXISTS `test`;
USE `test`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `fake_product`;

CREATE TABLE `fake_product` (
  `fake_product_uuid` binary(16) DEFAULT (UUID_TO_BIN(uuid())),
  `title`varchar(45) DEFAULT NULL,
  PRIMARY KEY(`fake_product_uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;



