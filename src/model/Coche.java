package model;

public class Coche {

    private String marca;
    private String modelo;
    private String color;
    private Double velocidad;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, Double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }





    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
