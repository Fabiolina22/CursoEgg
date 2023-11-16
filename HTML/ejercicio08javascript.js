let num;
let numA = 0;
let numB = 0;
let cont = 0;
let suma = 0;
do {
    num = parseInt(prompt("Ingresa un numero"));
    (cont === 0 )?(numA = num, numB = num):
    (num>numA)?numA=num:numA = numA;
    (num<numB && num!= 0)?numB=num:numB = numB;
     cont++;
     suma += num;

} while (num != 0);
alert(`El numero mayor ingresado es ${numA} 
El numero menor ingresado es ${numB}
el promedio de los numero ingresados es ${suma/(cont - 1)}`)