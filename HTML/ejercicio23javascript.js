// Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo
//     amarillo, por ejemplo)
let parrafo = document.getElementsByTagName("p");
for (const palabra of parrafo) {
     palabra.innerHTML = palabra.innerText.split(" ").map((palabraLarga) => palabraLarga.length > 8 ? `<span class = "yb"> ${palabraLarga}</span>`:palabraLarga).join(" ");
}
var css = document.createElement("style");
css.innerHTML = ".yb {background-color:yellow;}";
document.getElementsByTagName("head")[0].appendChild(css);
