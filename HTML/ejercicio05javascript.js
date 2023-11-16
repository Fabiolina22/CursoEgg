let num1 = parseInt(prompt("Ingrese un numero"));
let num2 = parseInt(prompt("Ingrese otro numero"));
let res ;
do {
    res = prompt(` Escoja la operacion que desea hacer
s = suma
r = resta
m = multiplicacion
d = division  
e = Exit` ).toLowerCase();

    switch (res) {
        case "s":
            alert(`el resultado de la suma es ${num1 + num2}`);

            break;
        case "r":
            alert(`el resultado de la resta es ${num1 - num2}`);

            break;
        case "m":
            alert(`El resultado de la multiplicacion es ${num1 * num2}`);
            break;
        case "d":
            alert(`el resultado de la division es ${num1 / num2}`);
            break;
        case "e":
            alert("saliendo....");
            break;


        default:
            alert("ingrese una opcion valida");
            break;
    }
} while (res != "e");

