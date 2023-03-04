package org.example.clases;

public class Familia {

    public String nombrePapa;
    protected String nombreMama;
    private String nombreDelHijo;

    private Integer edadPapa;

    public Familia() {
    }

    public Familia(String nombrePapa, String nombreMama, String nombreDelHijo, Integer edadPapa) {
        this.nombrePapa = nombrePapa;
        this.nombreMama = nombreMama;
        this.nombreDelHijo = nombreDelHijo;
        this.edadPapa = edadPapa;
    }

    public String getNombrePapa() {
        return nombrePapa;
    }

    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    public String getNombreMama() {
        return nombreMama;
    }

    public void setNombreMama(String nombreMama) {
        this.nombreMama = nombreMama;
    }

    public String getNombreDelHijo() {
        return nombreDelHijo;
    }

    public void setNombreDelHijo(String nombreDelHijo) {
        this.nombreDelHijo = nombreDelHijo;
    }

    public Integer getEdadPapa() {
        return edadPapa;
    }

    public void setEdadPapa(Integer edadPapa) {
        if(edadPapa < 0 || edadPapa >20){
            System.out.println("Imposible, ponga otra.");
        }else{
            this.edadPapa = edadPapa;

        }
    }

    /*
    public String getNombrePapa() {
        return nombrePapa;
    }

    public String getNombreMama() {
        return nombreMama;
    }

    public String getNombreDelHijo() {
        return nombreDelHijo;
    }


    public void setNombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    public void setNombreMama(String nombreMama) {
        this.nombreMama = nombreMama;
    }

    public void setNombreDelHijo(String nombreDelHijo) {
        this.nombreDelHijo = nombreDelHijo;
    }
    */





}
