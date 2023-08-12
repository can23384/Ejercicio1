/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/


public class usuario{
    private String nombre;
    private String email;
    public int presupuesto;
    public int cant_boletos;

    public usuario(String nombre, String email, int presupuesto, int cant_boletos){
        this.nombre = nombre;
        this.email = email;
        this.presupuesto = presupuesto;
        this.cant_boletos = cant_boletos;
    }


    public String getNombre(){
        return this.nombre;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPresupuesto(){
        return this.presupuesto;
    }

    public int getCant_boletos(){
        return this.cant_boletos;
    }



    public void setNombre(String nombre){
        this.nombre = nombre; 
    }

    public void setEmail(String email){
        this.email = email; 
    }

    public void setPresupuesto(int presupuesto){
        this.presupuesto = presupuesto; 
    }

    public void setCant_boletos(int cant_boletos){
        this.cant_boletos = cant_boletos; 
    }

    
}


