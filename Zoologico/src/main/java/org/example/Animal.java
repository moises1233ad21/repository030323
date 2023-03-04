package org.example;

public class Animal {
    //ATRIBUTOS

    int primitivo;
    Integer claseContenedora;
    String tambienUnaClase;

    protected Integer edad;
    String nombre;
    private String especie;
    Double peso;
    Double colorPredominante;
    Boolean genero;
    Integer numeroPatas;
    String dieta;
    String clasificacion; //domestico o salvaje




    //METODOS ESPECIALES

    public Animal() {
    }

    public Animal(Integer edad, String nombre, String especie, Double peso, Double colorPredominante, Boolean genero, Integer numeroPatas, String dieta, String clasificacion) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
        this.peso = peso;
        this.colorPredominante = colorPredominante;
        this.genero = genero;
        this.numeroPatas = numeroPatas;
        this.dieta = dieta;
        this.clasificacion = clasificacion;
    }
    //METODOS ORDINARIOS.


}
