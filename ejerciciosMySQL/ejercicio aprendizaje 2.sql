USE tienda;
-- punto 1 Lista el nombre de todos los productos que hay en la tabla producto.
SELECT nombre FROM producto; 
-- punto 2 Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio FROM producto;
-- punto 3 Lista todas las columnas de la tabla producto.
SELECT * FROM producto;
-- punto 4 Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT nombre, ROUND(precio) FROM producto; 
-- punto 5 Lista el código de los fabricantes que tienen productos en la tabla producto.
SELECT producto.nombre, codigo_fabricante FROM fabricante RIGHT JOIN producto ON producto.codigo_fabricante = fabricante.codigo;
-- punto 6 Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT DISTINCT codigo_fabricante, fabricante.nombre FROM fabricante RIGHT JOIN producto ON fabricante.codigo = producto.codigo_fabricante ;
-- punto 7 Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT nombre FROM fabricante ORDER BY nombre;
-- punto 8 Lista los nombres de los productos ordenados en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT nombre, precio FROM producto ORDER BY nombre;
SELECT nombre, precio FROM producto ORDER BY precio DESC;
-- punto 9 Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT * FROM fabricante LIMIT 5;
-- punto 10 Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1;
-- punto 11 Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio FROM producto ORDER BY precio DESC LIMIT 1;
-- punto 12 Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT nombre, precio FROM producto WHERE precio <= 120;
-- punto 13 Lista todos los productos que tengan un precio entre $60 y $200. Utilizando el operador BETWEEN.
SELECT * FROM producto WHERE precio BETWEEN 60 AND 200;
-- punto 14 Lista todos los productos donde el código de fabricante sea 1, 3 o 5. Utilizando el operador IN.
SELECT * FROM producto WHERE codigo_fabricante IN (1,3,5);
-- punto 15 Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
SELECT nombre FROM producto WHERE nombre LIKE '%portatil%';
-- CONSULTAS MULTITABLA
-- punto 1 Devuelve una lista con el código del producto, nombre del producto, código del fabricante 
-- y nombre del fabricante, de todos los productos de la base de datos.
SELECT producto.codigo , producto.nombre, fabricante.codigo, fabricante.nombre FROM producto INNER JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo;
-- punto 2 Devuelve una lista con el nombre del producto, precio y nombre de fabricante de todos
-- los productos de la base de datos. Ordene el resultado por el nombre del fabricante, por
-- orden alfabético.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto LEFT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo ORDER BY fabricante.nombre;
-- punto 3 Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM fabricante INNER JOIN producto ON producto.codigo_fabricante = fabricante.codigo ORDER BY producto.precio LIMIT 1;
-- punto 4 Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT producto.nombre, fabricante.nombre FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre LIKE 'LENOVO';
-- punto 5 Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre Like 'CRUCIAL' AND precio > 200;
-- punto 6 Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
SELECT producto.nombre, fabricante.nombre FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE fabricante.nombre IN ('Asus', 'Hewlett-Packard');
-- punto 7 Devuelve un listado con el nombre de producto, precio y nombre de fabricante, de todos
-- los productos que tengan un precio mayor o igual a $180. Ordene el resultado en primer
-- lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden
-- ascendente)
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE producto.precio >= 180 ORDER BY producto.precio DESC; 
-- en segundo lugar por el nombre (en orden ascendente)
SELECT producto.nombre, producto.precio, fabricante.nombre FROM producto RIGHT JOIN fabricante ON producto.codigo_fabricante = fabricante.codigo WHERE producto.precio >= 180 ORDER BY producto.nombre;
-- Consultas Multitabla
-- Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
-- punto 1 Devuelve un listado de todos los fabricantes que existen en la base de datos, junto con los
-- productos que tiene cada uno de ellos. El listado deberá mostrar también aquellos
-- fabricantes que no tienen productos asociados.
SELECT * FROM fabricante LEFT JOIN producto ON producto.codigo_fabricante = fabricante.codigo;
-- punto 2 Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún
-- producto asociado.
SELECT * FROM fabricante LEFT JOIN producto ON producto.codigo_fabricante = fabricante.codigo WHERE producto.nombre IS NULL;
-- Subconsultas (En la cláusula WHERE)
-- Con operadores básicos de comparación
-- punto 1 Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante	WHERE nombre = 'LENOVO');

-- punto 2 Devuelve todos los datos de los productos que tienen el mismo precio que el producto
-- más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT * FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo" ));
select producto.*,fabricante.nombre from producto, fabricante where producto.codigo_fabricante = fabricante.codigo and fabricante.nombre='Lenovo';
-- punto 3 Lista el nombre del producto más caro del fabricante Lenovo.
SELECT nombre, precio FROM producto WHERE precio = (SELECT MAX(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Lenovo" ));
-- punto 4 Lista todos los productos del fabricante Asus que tienen un precio superior al precio
-- medio de todos sus productos.
SELECT * FROM producto WHERE precio > (SELECT AVG(precio) FROM producto WHERE codigo_fabricante = (SELECT codigo FROM fabricante WHERE nombre = "Asus" ));
-- Subconsultas con IN y NOT IN
-- punto 1 Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
SELECT * FROM fabricante WHERE fabricante.codigo IN (SELECT producto.codigo_fabricante FROM producto );
-- punto 2 Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
SELECT * FROM fabricante WHERE fabricante.codigo NOT IN (SELECT producto.codigo_fabricante FROM producto );
-- Subconsultas (En la cláusula HAVING)
-- punto 1 Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.
SELECT fabricante.nombre FROM fabricante WHERE fabricante.codigo IN (SELECT producto.codigo_fabricante FROM producto GROUP BY codigo_fabricante HAVING count(*) = (SELECT fabricante.codigo FROM fabricante WHERE nombre LIKE 'LENOVO'));