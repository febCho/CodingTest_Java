-- 코드를 입력하세요
SELECT u.USER_ID, u.NICKNAME, b.TOTAL_SALES
FROM USED_GOODS_USER u
JOIN (SELECT WRITER_ID, SUM(PRICE) as TOTAL_SALES
      FROM USED_GOODS_BOARD 
      WHERE STATUS = 'DONE' 
      GROUP BY WRITER_ID) b
ON u.USER_ID = b.WRITER_ID      
WHERE b.TOTAL_SALES >= 700000 
ORDER BY b.TOTAL_SALES;