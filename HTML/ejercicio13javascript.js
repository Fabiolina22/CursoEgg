function Persona(nombre, edad, sexo, peso, altura) {
    this.Nombre = nombre;
    this.Edad = edad;
    this.Sexo = sexo;
    this.Peso = peso;
    this.Altura = altura;
}
let p1 = new Persona();
p1.Nombre = prompt("Ingrese su nombre");
p1.Edad = parseInt(prompt("Ingresa tu edad"));
p1.Sexo = prompt(`Ingresa tu sexo
H = Hombre
M = Mujer
O = Otro`);
p1.Peso = parseInt(prompt("Ingresa tu peso"));
p1.Altura = parseInt(prompt("Ingresa tu altura en centimetros"));
Object.keys(p1).forEach(function(prop) {
    document.write(prop + ": " + p1[prop] + "<br>"); 
});

// for(let propiedad in p1) {
//     document.write(propiedad + ": " + p1[propiedad] + "<br>");
// };