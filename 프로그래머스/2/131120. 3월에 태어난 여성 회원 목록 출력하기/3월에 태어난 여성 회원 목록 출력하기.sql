-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, TO_CHAR(DATE_OF_BIRTH, 'YYYY-mm-DD') as DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TLNO IS NOT NULL AND TO_CHAR(DATE_OF_BIRTH, 'mm') = '03' AND GENDER = 'W' 
ORDER BY MEMBER_ID;