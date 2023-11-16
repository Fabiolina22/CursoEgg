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

alert(Object.values(p1));
console.log(Object.values(p1));