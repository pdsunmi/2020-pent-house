CREATE TABLE `interest` (
  `userId` varchar(45) NOT NULL,
  `sido` varchar(45) DEFAULT NULL,
  `gugun` varchar(45) DEFAULT NULL,
  `dong` varchar(45) DEFAULT NULL,
  `code` varchar(45) DEFAULT NULL,
  UNIQUE KEY `userId` (`userId`,`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci