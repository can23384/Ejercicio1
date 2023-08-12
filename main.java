/*
Universidad del Valle de Guatemala
cc2008 - POO
Seccion 10
Ejercicio #1
Eliazar Canastuj
carnet: 23384
*/

import java.util.*;


public class main{

    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //Crear los objetos de cada localidad
        localidad localidad1 = new localidad("localidad1", 100, 20);
        localidad localidad5 = new localidad("localidad5", 500, 20);
        localidad localidad10 = new localidad("localidad10", 1000, 20);

        boolean hola = true;

        System.out.println("███████████████████████████████████████████████████████████████████████████████████");
        System.out.println("");
        System.out.println("  ██████  ▄▄▄       █    ██  ▄████▄  ▓█████    ▄▄▄█████▓ ▒█████   █    ██  ██▀███  ");
        System.out.println("▒██    ▒ ▒████▄     ██  ▓██▒▒██▀ ▀█  ▓█   ▀    ▓  ██▒ ▓▒▒██▒  ██▒ ██  ▓██▒▓██ ▒ ██▒");
        System.out.println("░ ▓██▄   ▒██  ▀█▄  ▓██  ▒██░▒▓█    ▄ ▒███      ▒ ▓██░ ▒░▒██░  ██▒▓██  ▒██░▓██ ░▄█ ▒");
        System.out.println("  ▒   ██▒░██▄▄▄▄██ ▓▓█  ░██░▒▓▓▄ ▄██▒▒▓█  ▄    ░ ▓██▓ ░ ▒██   ██░▓▓█  ░██░▒██▀▀█▄  ");
        System.out.println("▒██████▒▒ ▓█   ▓██▒▒▒█████▓ ▒ ▓███▀ ░░▒████▒     ▒██▒ ░ ░ ████▓▒░▒▒█████▓ ░██▓ ▒██▒");
        System.out.println("▒ ▒▓▒ ▒ ░ ▒▒   ▓▒█░░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░░░ ▒░ ░     ▒ ░░   ░ ▒░▒░▒░ ░▒▓▒ ▒ ▒ ░ ▒▓ ░▒▓░");
        System.out.println("░ ░▒  ░ ░  ▒   ▒▒ ░░░▒░ ░ ░   ░  ▒    ░ ░  ░       ░      ░ ▒ ▒░ ░░▒░ ░ ░   ░▒ ░ ▒░");
        System.out.println("░  ░  ░    ░   ▒    ░░░ ░ ░ ░           ░        ░      ░ ░ ░ ▒   ░░░ ░ ░   ░░   ░ ");
        System.out.println("      ░        ░  ░   ░     ░ ░         ░  ░                ░ ░     ░        ░     ");
        System.out.println("                            ░                                                      ");
        System.out.println("╔═╗┬  ┌─┐┌┬┐┬┌─┐  ╔═╗┌─┐┬─┐┬─┐┬┌─┐┌┐┌");
        System.out.println("║╣ │  ├─┤ ││││ │  ║  ├─┤├┬┘├┬┘││ ││││");
        System.out.println("╚═╝┴─┘┴ ┴─┴┘┴└─┘  ╚═╝┴ ┴┴└─┴└─┴└─┘┘└┘");
        System.out.println("");
        System.out.println("███████████████████████████████████████████████████████████████████████████████████");


        //el menu del programa
        while(hola){
            System.out.println("Ingrese su nombre: ");
            String name = teclado.nextLine();
            System.out.println("Ingrese su correo: "); 
            String correo = teclado.nextLine();
            System.out.println("Ingrese la cantidad de boletos a comprar: ");
            int boletos = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese su presupuesto máximo: ");
            int max_presupuesto = teclado.nextInt();
            teclado.nextLine();

            usuario usuario = new usuario(name, correo, max_presupuesto, boletos);


            int ticket = random.nextInt(15000) + 1;
            System.out.println("Su ticket es: " + ticket);

            int a = random.nextInt(15000) + 1;
            int b = random.nextInt(15000) + 1;


            //verificar si el ticket del usuario esta entre a t b
            if (ticket >= Math.min(a, b) && ticket <= Math.max(a, b)){
                System.out.println("Puede comprar boleto");

                // ver que localidad le toca al usuario
                int alazar = random.nextInt(3) + 1;

                switch(alazar) {

                //localidad 1
                case 1:
                    System.out.println("Su localidad es: " + localidad1.getNombre());
                    System.out.println("");
                    //ver si hay espacio disponible
                    if (localidad1.validarEspacio()){
                        System.out.println("");

                        //ver si los boletos que quiere conprar el usuario son suficentes para el espacio de la localidad
                        if(localidad1.validarBoletos(usuario.getCant_boletos())){
                            System.out.println("");

                            //validar si le alcanza comprar los boletos
                            if(localidad1.validarPrecio(usuario.getPresupuesto(), localidad1.getPrecio()*usuario.getCant_boletos())){
                                localidad1.setEspacio(localidad1.getEspacio() - usuario.getCant_boletos());
                            }

                        }

                        //comprar los boletos que alcancen en el espacio de la localidad
                        else{
                            int adios = (localidad1.getEspacio() - usuario.getCant_boletos()) * -1;

                            //validar si le alcanza comprar los boletos
                            if(localidad1.validarPrecio(usuario.getPresupuesto(), localidad1.getPrecio()*(usuario.getCant_boletos() - adios))){
                                localidad1.setEspacio(localidad1.getEspacio() - (usuario.getCant_boletos() - adios));
                            }
                        }
                    }
                    System.out.println("");
                    break;

                //localidad 5
                case 2:
                    System.out.println("Su localidad es: " + localidad5.getNombre());
                    //ver si hay espacio disponible
                    if (localidad5.validarEspacio()){
                        System.out.println("");

                        //ver si los boletos que quiere conprar el usuario son suficentes para el espacio de la localidad
                        if(localidad5.validarBoletos(usuario.getCant_boletos())){
                            System.out.println("");

                            //validar si le alcanza comprar los boletos
                            if(localidad5.validarPrecio(usuario.getPresupuesto(), localidad5.getPrecio()*usuario.getCant_boletos())){
                                localidad5.setEspacio(localidad5.getEspacio() - usuario.getCant_boletos());
                            }

                        }

                        //comprar los boletos que alcancen en el espacio de la localidad
                        else{
                            int adios = (localidad5.getEspacio() - usuario.getCant_boletos()) * -1;

                            //validar si le alcanza comprar los boletos
                            if(localidad5.validarPrecio(usuario.getPresupuesto(), localidad5.getPrecio()*(usuario.getCant_boletos() - adios))){
                                localidad5.setEspacio(localidad5.getEspacio() - (usuario.getCant_boletos() - adios));
                            }
                        }
                    }
                    System.out.println("");
                    break;

                //localidad 10
                case 3:
                    System.out.println("Su localidad es: " + localidad10.getNombre());
                    //ver si hay espacio disponible
                    if (localidad10.validarEspacio()){
                        System.out.println("");

                        //ver si los boletos que quiere conprar el usuario son suficentes para el espacio de la localidad
                        if(localidad10.validarBoletos(usuario.getCant_boletos())){
                            System.out.println("");

                            //validar si le alcanza comprar los boletos
                            if(localidad10.validarPrecio(usuario.getPresupuesto(), localidad10.getPrecio()*usuario.getCant_boletos())){
                                localidad10.setEspacio(localidad10.getEspacio() - usuario.getCant_boletos());
                                System.out.println(localidad10.getEspacio());
                            }

                        }

                        //comprar los boletos que alcancen en el espacio de la localidad
                        else{
                            int adios = (localidad10.getEspacio() - usuario.getCant_boletos()) * -1;
                            
                            //validar si le alcanza comprar los boletos
                            if(localidad10.validarPrecio(usuario.getPresupuesto(), localidad10.getPrecio()*(usuario.getCant_boletos() - adios))){
                                localidad10.setEspacio(localidad10.getEspacio() - (usuario.getCant_boletos() - adios));
                                System.out.println(localidad10.getEspacio());
                            }
                        }
                    }
                    System.out.println("");
                    break;


                }
                

            } 
            else{
                System.out.println("NO puede comprar boleto");
                System.out.println("");
            }    

        }

    }

}