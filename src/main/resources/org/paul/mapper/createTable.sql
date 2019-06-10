CREATE TABLE `tbl_board` (
  `bno` int(11) NOT NULL,
  `title` varchar(45) NOT NULL,
  `content` varchar(45) NOT NULL,
  `writer` varchar(45) NOT NULL,
  `regdate` datetime DEFAULT NULL,
  `updatedate` datetime DEFAULT NULL,
  PRIMARY KEY (`bno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO TBL_BOARD VALUES( SELECT currval('BOARD'), '타이틀', '컨텐츠','작성자', now(), now())

SELECT *
FROM TBL_BOARD