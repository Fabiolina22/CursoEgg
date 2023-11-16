const frase = "Guia de JavaScript";
const palabraLarga = palabraMasLarga(frase);
console.log(`La palabra más larga es: ${palabraLarga}`);

function palabraMasLarga(frase) {
    const palabras = frase.split(" ");
    let palabraMasLarga = "";

    for (let palabra of palabras) {
        if (palabra.length > palabraMasLarga.length) {
            palabraMasLarga = palabra;
        }
    }

    return palabraMasLarga;
}