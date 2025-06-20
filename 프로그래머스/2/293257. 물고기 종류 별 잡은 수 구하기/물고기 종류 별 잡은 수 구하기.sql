-- 코드를 작성해주세요
SELECT 
    COUNT(*) AS FISH_COUNT,
    FNI.FISH_NAME
  FROM FISH_INFO FH
  JOIN FISH_NAME_INFO FNI
    ON FH.FISH_TYPE = FNI.FISH_TYPE
 GROUP BY FNI.FISH_NAME
 ORDER BY FISH_COUNT DESC