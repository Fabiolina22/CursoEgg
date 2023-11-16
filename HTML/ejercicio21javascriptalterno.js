crearPersona();

function crearPersona() {
    let nombre = prompt("Ingrese su nombre");
    let edad = prompt("Ingrese su edad");
    let sexo = validarEntrada();
    let peso = parseFloat(prompt("Ingrese su peso"));
    let altura = parseFloat(prompt("Ingrese su altura"));

    const persona = {

        nombre: nombre,
        edad: edad,
        sexo: sexo,
        peso: peso,
        altura: altura,
    }

  

    console.log(Object.values(persona));
    alert('Propiedades de la persona: ' + Object.values(persona));

    //return persona
}

function validarEntrada(nombre) {
    let sexo;
    do {
        sexo = prompt("Ingrese su sexo hombre(H), mujer(M) u Otro (O)").toUpperCase();
        if (sexo !== 'H' && sexo !== 'M' && sexo !== 'O') {
            alert('Opción de sexo no válida. Ingrese nuevamente');
        }
    } while (sexo !== 'H' && sexo !== 'M' && sexo !== 'O');
    return sexo;
}