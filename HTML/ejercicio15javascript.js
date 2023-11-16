let C1 = {
    radio:0
};
radio = prompt("Ingrese el radio de la circunferencia");
let area;
let perimetro;
CalcularArea();
CalcularPerimetro();
Mostrar(area,perimetro);
function Circulo(radio) {
    this.radio = radio;    
}
function CalcularArea() {
    area = Math.PI * radio * radio;
    return area;
}
function CalcularPerimetro() {
    perimetro = 2 * Math.PI * radio;
    return perimetro;
}
function Mostrar() {
    alert(`el area de la circunferencia es ${area}
    el perimetro de la circunferencia es ${perimetro}`)
}


