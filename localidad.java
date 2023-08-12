/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/


public class localidad{
    private String nombre;
    private int precio;
    private int espacio;


    public localidad(String nombre, int precio, int espacio){
        this.nombre = nombre;
        this.precio = precio;
        this.espacio = espacio;
    }


    public String getNombre(){
        return this.nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public int getEspacio(){
        return this.espacio;
    }



    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public void setPrecio(int precio){
        this.precio = precio; 
    }

    public void setEspacio(int espacio){
        this.espacio = espacio; 
    }
    

    public boolean validarEspacio(){
        if(this.espacio > 0){
        System.out.println("Hay espacios disbonibles en esta localidad.");
        return true;
        }

        else{
            System.out.println("Ya no hay espacios disponibles en esta localidad.");
            return false;
        }
    }


    public boolean validarBoletos(int num){
        if (this.espacio >= num){
            System.out.println("Hay espacios disbonibles para la cantidad de boletos que quiere comprar.");
            return true;
        }

        else{
            System.out.println("Se le vendera la mayor cantidad posible");
            return false;
        }
    }


    public boolean validarPrecio(int nume, int nume2){
        if (nume >= nume2){
            System.out.println("Compra con exito");
            return true;
        }

        else{
            System.out.println("No tiene suficiente dinero");
            return false;
        }
    }



    
}