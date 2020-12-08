CREATE TABLE `sido_code` (
  `sidocode` varchar(10) NOT NULL,
  `sidoname` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`sidocode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `sidocode` WRITE;
/*!40000 ALTER TABLE `sidocode` DISABLE KEYS */;
INSERT INTO `sidocode` VALUES ('1100000000','서울특별시'),('2600000000','부산광역시'),('2700000000','대구광역시'),('2800000000','인천광역시'),('2900000000','광주광역시'),('3000000000','대전광역시'),('3100000000','울산광역시'),('3611000000','세종특별자치시'),('4100000000','경기도'),('4200000000','강원도'),('4300000000','충청북도'),('4400000000','충청남도'),('4500000000','전라북도'),('4600000000','전라남도'),('4700000000','경상북도'),('4800000000','경상남도'),('5000000000','제주특별자치도');
/*!40000 ALTER TABLE `sidocode` ENABLE KEYS */;
UNLOCK TABLES;