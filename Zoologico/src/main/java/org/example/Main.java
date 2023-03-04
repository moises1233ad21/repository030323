package org.example;

import org.example.clases.Familia;

public class Main {
    public static void main(String[] args) {

        //En el main usamos las clases que nosotros programamos.
        Integer notaFinal = 5;

        //para usar una clase, debo crear un objeto de la clase
        //Un objeto en cualquier lenguaje es una variable especial

        Animal animal = new Animal();
    //si ya tengo un objeto, lo uso para acceder a los atributos y metodos de una clase.
        animal.nombre="caballo";
        animal.edad=10;

        Familia familia = new Familia();

        familia.setNombrePapa("Charly");
        familia.setNombreMama("Gaby");
        familia.setNombreDelHijo("pablito");
        familia.setEdadPapa(600);

        System.out.println("El papa tiene: " + familia.getEdadPapa());









    }
}