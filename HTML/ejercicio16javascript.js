// Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios
// y los muestre por pantalla.
let v1 = [];
let v2 = [];
for (let index = 0; index < 5; index++) {
    v1[index] = Math.floor(Math.random()*(100));
    v2[index] = Math.floor(Math.random()*(100));
    
}
alert(`Vector 1----
${v1}
Vector 2 -------
${v2}`);
