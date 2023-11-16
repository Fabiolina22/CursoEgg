use nba;
-- punto 1 Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT jugadores.Nombre FROM jugadores ORDER BY Nombre;
-- punto 2 Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras,
-- ordenados por nombre alfabéticamente.
SELECT jugadores.Nombre, jugadores.Peso, jugadores.Posicion FROM jugadores WHERE Posicion LIKE 'C' AND Peso > 200;
-- punto 3 Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT equipos.Nombre FROM equipos ORDER BY Nombre;
-- punto 4 Mostrar el nombre de los equipos del este (East).
SELECT equipos.Nombre, equipos.Conferencia FROM equipos WHERE Conferencia LIKE 'EAST';
-- punto 5 Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT equipos.Nombre, equipos.Ciudad FROM equipos WHERE equipos.Ciudad LIKE 'C%' ORDER BY equipos.Nombre;
-- punto 6 Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT Nombre, Nombre_equipo FROM jugadores ORDER BY Nombre_equipo;
-- punto 7 Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT jugadores.Nombre, jugadores.Nombre_equipo FROM jugadores WHERE jugadores.Nombre_equipo LIKE 'RAPTORS' ORDER BY jugadores.Nombre;
-- punto 8 Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT Puntos_por_partido FROM estadisticas WHERE jugador =(SELECT jugadores.codigo FROM jugadores WHERE jugadores.Nombre LIKE 'Pau Gasol');
-- punto 9 Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT Puntos_por_partido FROM estadisticas  WHERE jugador =(SELECT jugadores.codigo FROM jugadores WHERE jugadores.Nombre LIKE 'Pau Gasol' AND  temporada LIKE '04/05');
-- punto 10 Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT jugadores.nombre ,(SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS 'Puntos Totales' FROM jugadores;
-- punto 11 Mostrar el número de jugadores de cada equipo.
SELECT nombre_equipo AS 'Equipo', COUNT(nombre_equipo) AS 'Cantidad de Jugadores' FROM jugadores GROUP BY nombre_equipo;
-- punto 12 Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT jugadores.nombre, (SELECT ROUND(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador = codigo) AS Total FROM jugadores ORDER BY Total DESC LIMIT 1;
-- punto 13 Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT Nombre, Conferencia, Division FROM equipos WHERE Nombre  = (SELECT jugadores.Nombre_equipo FROM jugadores ORDER BY jugadores.Altura DESC LIMIT 1);
-- punto 14 Mostrar la media de puntos en partidos de los equipos de la división Pacific.

-- punto 15 Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
select equipo_local as 'Local', equipo_visitante as 'Visitante', ABS((puntos_local-puntos_visitante)) as 
'Diferencia' from partidos where ABS(puntos_local-puntos_visitante) = (select max(ABS(puntos_local-puntos_visitante)) from partidos);
-- punto 17 Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.
SELECT partidos.equipo_local, puntos_local, partidos.puntos_visitante, partidos.equipo_visitante  FROM partidos; 
-- punto 18 Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
-- CREATE VIEW Ganador AS 
SELECT CASE WHEN (puntos_local> puntos_visitante) THEN equipo_local WHEN (puntos_local<puntos_visitante ) THEN equipo_visitante ELSE NULL END AS 'GANADOR' , codigo FROM partidos;
-- SOLUCION LAU
SELECT codigo AS 'Codigo', puntos_local AS 'Puntos Local', puntos_visitante AS 'Puntos Visitante', 
(SELECT CASE WHEN (puntos_local> puntos_visitante) THEN equipo_local WHEN (puntos_local< puntos_visitante) THEN equipo_visitante ELSE NULL END) AS 'Equipo Ganador'
FROM partidos;
-- solucion DIEGO
SELECT
        CASE
                WHEN (puntos_local > puntos_visitante) THEN equipo_local
                WHEN (puntos_local < puntos_visitante) THEN equipo_visitante
                ELSE "EMPATE"
        END AS Ganador, codigo, puntos_local, puntos_visitante, equipo_local, equipo_visitante
        FROM partidos;
-- integrador Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
-- Este resultado nos dará la posición del candado (1, 2, 3 o 4)
SELECT COUNT(*) AS 'Posicion candado A' FROM estadisticas WHERE Asistencias_por_partido = (SELECT MAX(Asistencias_por_partido) FROM estadisticas);
-- Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
-- centro o esté comprendida en otras posiciones.
SELECT SUM(Peso) AS 'CLAVE A' FROM jugadores WHERE Nombre_equipo IN (SELECT nombre FROM equipos WHERE Conferencia LIKE 'East');
SELECT SUM(Peso) AS 'CLAVE A' FROM jugadores WHERE Nombre_equipo IN (SELECT nombre FROM equipos WHERE Conferencia LIKE 'East') AND Posicion LIKE '%C%';
-- El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
-- siguiente/s consulta/s:
-- Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
-- jugadores que tiene el equipo Heat. 

SELECT COUNT(*) AS 'Posicion B' FROM estadisticas WHERE Asistencias_por_partido > (SELECT COUNT(*) FROM jugadores WHERE Nombre_equipo LIKE 'Heat');
-- Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
-- datos:
-- La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.
SELECT COUNT(*) AS 'Clave B'FROM partidos WHERE temporada LIKE '%99%';
-- La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
-- parte de equipos de la conferencia oeste.
-- Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
-- 195, y a eso le vamos a sumar 0.9945.
SELECT COUNT(*) FROM jugadores WHERE procedencia LIKE 'MICHIGAN' AND Division LIKE 'WEST';
SELECT Nombre FROM equipos WHERE Conferencia LIKE 'WEST';
SELECT FLOOR(COUNT(*) / (SELECT COUNT(*) FROM jugadores WHERE Peso >= 195)+0.9945 ) AS 'Posicion C' FROM jugadores WHERE Procedencia LIKE 'Michigan' AND Nombre_equipo IN (SELECT Nombre FROM equipos WHERE Conferencia LIKE 'WEST');
SELECT COUNT(*) FROM jugadores WHERE Peso >= 195;
-- Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
-- sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
-- tapones por partido. Además, este resultado debe ser, donde la división sea central.
SELECT Nombre FROM equipos WHERE Division LIKE 'Central';
SELECT e.* , j.* FROM estadisticas e INNER JOIN jugadores j ON j.codigo = e.jugador WHERE j.Nombre_equipo IN (SELECT Nombre FROM equipos WHERE Division LIKE 'Central');
SELECT FLOOR(COUNT(Asistencias_por_partido) +SUM(Tapones_por_partido)+ AVG(Puntos_por_partido)) FROM estadisticas;
-- RESPUESTA GUSTAVO
select floor(avg(puntos_por_partido)+count(Asistencias_por_partido)+sum(Tapones_por_partido))as Total from estadisticas join jugadores on estadisticas.jugador = jugadores.codigo join equipos on jugadores.Nombre_equipo= equipos.Nombre where equipos.Division=('Central');
-- Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
-- resultado debe ser redondeado. Nota: el resultado debe estar redondeado
SELECT FLOOR(Tapones_por_partido) FROM estadisticas WHERE temporada LIKE '%00/01%' AND jugador = (SELECT codigo FROM jugadores WHERE nombre LIKE 'Corey Maggette') ;
SELECT codigo FROM jugadores WHERE nombre LIKE 'Corey Maggette';
-- Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
-- de todos los jugadores de procedencia argentina.
SELECT FLOOR(SUM(Puntos_por_partido)) FROM estadisticas WHERE jugador IN (SELECT codigo FROM jugadores WHERE procedencia LIKE 'Argentina');
