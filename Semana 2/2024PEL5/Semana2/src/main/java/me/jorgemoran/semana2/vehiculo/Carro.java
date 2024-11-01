package me.jorgemoran.semana2.vehiculo;

public class Carro extends Vehiculo {
    String color;
    String marca;

    public Carro(String marca, String color) {
        super(150);
        this.setMarca(marca);
        this.setColor(color);
        
    }
    
    public Carro(String marca, String color, int velocidadMaxima){
        super(velocidadMaxima);
        this.setMarca(marca);
        this.setColor(color);
    }

    public Carro() {
        super(180);
        setMarca("Toyota");
        setColor("Negro");
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        // String representacionDelCarro="Marca="+marca+", Color=" + color + ", Velocidad Maxima=" + velocidadMaxima + "";
        String representacionDelCarro=marca + " "  + color +  " " + velocidadMaxima;
        return representacionDelCarro;
    }
    public static void main(String args[]){
        Carro c = new Carro("Nissan","gris");
        System.out.println(c.marca);
    }
}
