DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `username`varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint NOT NULL,
  
    PRIMARY KEY(`username`)

) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `authorities`;

CREATE TABLE `authorities` (
  `username` VARCHAR(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  
  UNIQUE KEY `authorities_idx_1` (`username`, `authority`),

  CONSTRAINT `authorities_ibfk_1`
  FOREIGN KEY (`username`)
  REFERENCES `users` (`username`)
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;





