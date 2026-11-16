# Weather Observation Station 8

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Query the list of *CITY* names from **STATION** that *do not start* with vowels. Your result cannot contain duplicates.

**Input Format**

The **STATION** table is described as follows:

<img src="https://s3.amazonaws.com/hr-challenge-images/9336/1449345840-5f0a551030-Station.jpg" title="Station.jpg" />

where *LAT\_N* is the northern latitude and *LONG\_W* is the western longitude. 

**Output Format**

## Solution

**Language:** SQL  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-16T05:51:42.724Z  

```sql
/*
Enter your query here.
*/

SELECT DISTINCT CITY
FROM STATION
WHERE LOWER(LEFT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u')
  AND LOWER(RIGHT(CITY, 1)) IN ('a', 'e', 'i', 'o', 'u');

-- SELECT DISTINCT CITY
-- FROM STATION
-- WHERE
-- CITY LIKE 'a%a'
-- or CITY LIKE 'a%e'
-- or CITY LIKE 'a%i'
-- or CITY LIKE 'a%o'
-- or CITY LIKE 'a%u'
-- or CITY LIKE 'e%a'
-- or CITY LIKE 'e%e'
-- or CITY LIKE 'e%i'
-- or CITY LIKE 'e%o'
-- or CITY LIKE 'e%u'
-- or CITY LIKE 'i%a'
-- or CITY LIKE 'i%e'
-- or CITY LIKE 'i%i'
-- or CITY LIKE 'i%o'
-- or CITY LIKE 'i%u'
-- or CITY LIKE 'o%a'
-- or CITY LIKE 'o%e'
-- or CITY LIKE 'o%i'
-- or CITY LIKE 'o%o'
-- or CITY LIKE 'o%u'
-- or CITY LIKE 'u%a'
-- or CITY LIKE 'u%e'
-- or CITY LIKE 'u%i'
-- or CITY LIKE 'u%o'
-- or CITY LIKE 'u%u';

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/weather-observation-station-9/problem)