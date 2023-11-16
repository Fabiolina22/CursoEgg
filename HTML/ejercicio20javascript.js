// Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y
// muestre el siguiente array [6, 9, 12, 15, 18].
let matriz1 = [[3], [6], [9], [12], [15]];
console.log(matriz1)
let array = matriz1.flatMap(function name(x) {
    return x[0]+3;
})
console.log(array);
