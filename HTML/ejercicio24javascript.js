let diametro = parseInt(document.getElementById("diametro"));
function CalcularRadioxD(diametro) {
    let radio = diametro / 2;
    alert(`El radio de la circunferencia es ${radio}`);
}
document.getElementById("botondia").onclick = CalcularRadioxD;