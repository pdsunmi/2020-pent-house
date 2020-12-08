CREATE TABLE `member` (
  `id` varchar(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(40) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `role` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


LOCK TABLES `member` WRITE;
insert into member values('admin','admin','admin','admin@naver.com','admin','010-0000-0000','관리자');
insert into member values('pdsunmi','양선미','123','pdsunmi@naver.com','','010-0000-0000','회원');
insert into member values('dahui','황다희','123','dahui@naver.com','','010-0000-0000','회원');
insert into member values('hongsg','홍승길','123','hongsg@naver.com','','010-0000-0000','회원');
insert into member values('boom02071','한예림','123','boom02071@naver.com','','010-0000-0000','회원');
insert into member values('jbyjy1008','유진영','123','jbyjy1008@naver.com','','010-0000-0000','회원');
insert into member values('skim817','김세민','123','skim817@naver.com','','010-0000-0000','회원');
UNLOCK TABLES;