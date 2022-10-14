package com.example.a6_componenterecyclerview;

public class Datos
{
    private int imagenId;
    private String nombre;

    public Datos() {}

    public Datos(int imagenId, String nombre)
    {
        this.imagenId = imagenId;
        this.nombre = nombre;
    }
    public  int getImagenId()
    {
        return imagenId;
    }

    public String getNombre()
    {
        return nombre;
    }

}


