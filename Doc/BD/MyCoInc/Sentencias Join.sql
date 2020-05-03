/*
* CONSULTAS CON INNER JOINS (Preguntamos por información de las tuplas que se relacionan entre los 2 conjuntos)
*/

-- Obtener todos los empleados asignados a alguna oficina
select * 
from empleados e
inner join oficinas o on e.oficina=o.cod_oficina;

-- Obtener todos los empleados de la oficina OF_01
SELECT e.*
FROM Empleados e
INNER JOIN Oficinas o on e.oficina = o.cod_oficina
WHERE o.cod_oficina = 'OF_01';

-- Obtener la información de todos los empleados de la oficina OF_01 y que informan a alguien
SELECT e.*
FROM Empleados e
INNER JOIN Oficinas o ON e.oficina = o.cod_oficina
WHERE o.cod_oficina = 'OF_01'
    AND e.informa_a IS NOT NULL;

    
/*    
* CONSULTAS CON LEFT JOINS (Preguntamos por información de las tuplas de Empleados que no se relacionan con ninguna oficina)
*/

-- Obtener todos aquellos empleados que no pertenecen a ninguna oficina
SELECT *
FROM Empleados e
LEFT JOIN Oficinas o ON e.oficina = o.cod_oficina
WHERE o.cod_oficina IS NULL;

-- Obtener la información de los empleados que no pertenecen a ninguna oficina y pertenezcan al departamento 'logistic'
SELECT e.*
FROM Empleados e
LEFT JOIN Oficinas o ON e.oficina = o.cod_oficina
WHERE o.cod_oficina IS NULL
    AND e.departamento = 'logistic';
    
-- Obtener la información de todos los empleados que no pertenezcan a ninguna oficina, que no sean del departamento logístico y que sean jefes (mo informan a nadie)
SELECT e.*
FROM Empleados e
LEFT JOIN Oficinas o ON e.oficina = o.cod_oficina
WHERE o.cod_oficina IS NULL
    AND e.departamento <> 'logistic'
    AND e.informa_a IS NULL;
    
/*
* CONSULTAS CON RIGHT JOINS
*/

-- Obtener la información de las oficinas que no tienen ningún empleado
SELECT ofi.*
FROM Empleados emp
RIGHT JOIN Oficinas ofi ON emp.oficina = ofi.cod_oficina
WHERE emp.cod_empleado IS NULL;

-- Obtener la información de las oficnas que no tienen ningun empleado que pertenezcan a la ciudad de New York (NY)
SELECT ofi.*
FROM Empleados emp
RIGHT JOIN Oficinas ofi ON emp.oficina = ofi.cod_oficina
WHERE emp.cod_empleado IS NULL
    AND ofi.ciudad = 'NY';
    
/*    
* SELF JOIN. JOINS DE UNA TABLA CONSIGO MISMA
*/

-- Obtener la jerarquía completa de la organización 'My Company Inc'.
-- Es decir managers con sus empleados.
SELECT UPPER(e1.Nombre) 'Manager', UPPER(e2.Nombre) 'Employee'
FROM Empleados e1
INNER JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
ORDER BY 'Manager' ASC;

-- Obtener una parte de la organización. Obtener los nombres de los empleados que infoman a 'George Roy Hill'
SELECT e2.Nombre
FROM Empleados e1
INNER JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
WHERE UPPER(e1.Nombre) LIKE 'GEORGE%'
ORDER BY 'Manager' ASC;

-- Obtener una parte de la organización. Obtener el nombre y el teléfono del manager de Roman Polansky
SELECT e1.Nombre, e1.tlfno
FROM Empleados e1
INNER JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
WHERE UPPER(e2.Nombre) LIKE ('%POLANSKY'); 

-- Concepto de Subquery. Obtener todos los empleados que reportan a alguien y que estén localizados en la ciudad de Los Angeles
SELECT e2.*
FROM Empleados e1
INNER JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
WHERE e2.oficina IN (SELECT cod_oficina
                     FROM Oficinas
                     WHERE ciudad = 'LA');

-- Similar a la consulta anterior pero usando joins para ganar en eficiencia.
SELECT e2.*
FROM Empleados e1
INNER JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
INNER JOIN Oficinas o ON e2.oficina = o.cod_oficina
WHERE  o.ciudad = 'LA';

-- Obtener la información del lider de la organización (El empleado que no informa a nadie)
SELECT DISTINCT e1.*
FROM Empleados e1
LEFT JOIN Empleados e2 ON e1.cod_empleado = e2.informa_a
WHERE e1.informa_a IS NULL;



