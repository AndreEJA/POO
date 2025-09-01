package run;

public class Coche {

    //atributos marca, modelo y año
    String marca;
    String modelo;
    int year;

    //constructor

   public Coche(String marca, String modelo, int year) {
       this.marca = marca;
        this.modelo = modelo;
        this.year = year;
   }

    //metodo para mostrar los datos
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + year);
    }
}
