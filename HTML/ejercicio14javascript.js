// Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor,
// Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario
// y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
// numero de páginas. 
const libro = {
    ISBN: "",
    título: "",
    autor: "",
    numPaginas: 0, 
     Libro : function (ISBN , Titulo, Autor, numero_de_paginas ){
        this.ISBN = prompt("Ingrese el ISBN del libro");
        this.Titulo = prompt("Ingrese el titulo del libro");
        this.Autor = prompt("Ingrese el nombre del autor");
        this.numero_de_paginas = prompt("Ingrese el numero de paginas del libro");
    },
    

}
libro.Libro();