
INSERT INTO TBL_BOARD VALUES(  nextval('BOARD'), '타이틀', '컨텐츠','작성자', now(), now())

SELECT *
FROM TBL_BOARD

-- Error Code: 1175. You are using safe update mode and you tried to update a table without a WHERE that uses a KEY column To disable safe mode, toggle the option in Preferences -> SQL Editor and reconnect.


