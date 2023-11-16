let limite = parseInt(prompt("Ingresa un numero limite positivo"));
let suma = 0;

do {
    
    let num = parseInt(prompt("ingresa un numero")) ;
    suma += num; 

} while (suma <= limite);
alert("Has superado el limite que ingresaste");