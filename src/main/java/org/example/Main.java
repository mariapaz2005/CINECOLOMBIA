package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);

        //Menu de opciones
        System.out.println("CINE COLOMBIA");
        System.out.println("************************");
        System.out.println("1. AGREGAR ");
        System.out.println("2. BUSCAR TODOS ");
        System.out.println("3. BUSCAR POR NOMBRE ");
        System.out.println("4. MODIFICAR ");
        System.out.println("0. SALIR");
        System.out.println("************************");



        int opcionElegida;
        ArrayList<HashMap<String, Object>> peliculas=new ArrayList<>();

        do {
            HashMap<String, Object> pelicula=new HashMap<>();

            System.out.println("Digita una opcion: ");

            opcionElegida=leerTeclado.nextInt();
            //LIMPIANDO EL BUFFER
            leerTeclado.nextLine();
            if (opcionElegida==1){
                System.out.println("Agregar ");
                System.out.print("Ingresa el nombre de la pelicula ");
                String nombrePelicula=leerTeclado.nextLine();
                System.out.println("Ingrese la Duracion de la pelicula");
                String duracionPelicula=leerTeclado.nextLine();
                System.out.println("Ingrese la Clasificacion de la pelicula");
                String clasificacionPelicula=leerTeclado.nextLine();
                System.out.println("Ingrese la sinopsis");
                String sinopsisPelicula=leerTeclado.nextLine();
                System.out.println("Ingresa la fecha de estreno");
                LocalDate fechaEstreno;
                int anio;
                int mes;
                int dia;

                System.out.println("Ingrese la fecha");
                System.out.println("Ingrese año");
                anio=leerTeclado.nextInt();
                System.out.println("Ingrese mes");
                mes=leerTeclado.nextInt();
                System.out.println("Ingrese dia");
                dia=leerTeclado.nextInt();
                fechaEstreno = LocalDate.of(anio,mes,dia);

                int idPelicula= new Random().nextInt(100);
                System.out.println("El id de la pelicula es:"+idPelicula);



                pelicula.put("idPelicula",idPelicula);
                pelicula.put("nombre",nombrePelicula);
                pelicula.put("duracion Pelicula",duracionPelicula);
                pelicula.put("clasificacion Pelicula",clasificacionPelicula);
                pelicula.put("sinopsis Pelicula",sinopsisPelicula);
                pelicula.put("fecha de estreno",fechaEstreno);

                peliculas.add(pelicula);

            }
            else if (opcionElegida==2){
                System.out.println("Mostrando todas las peliculas");
                for (HashMap<String,Object> peliculaCartelera:peliculas){
                    System.out.println(peliculaCartelera);
                }
            }
            else if (opcionElegida==3){
                System.out.println("Buscar pelicula");
                System.out.println("Digita el nombre de la pelicula que quieres buscar: ");
                String nombrePelicula=leerTeclado.nextLine();

                for(HashMap<String,Object> peliculaBusqueda:peliculas){
                    //Es el que digito el usuario
                    if(nombrePelicula.equals(peliculaBusqueda.get("nombre"))){
                        System.out.println("producto encontrados");
                        System.out.println(peliculaBusqueda);

                    }

                }
            }
            else if (opcionElegida==4){
                System.out.println("Modificar clasificacion pelicula");
                System.out.println("Digita el nombre de la pelicula que quieres modificar: ");
                String nombrePelicula=leerTeclado.nextLine();

                for(HashMap<String,Object> peliculaBusqueda:peliculas){
                    //Es el que digito el usuario
                    if(nombrePelicula.equals(peliculaBusqueda.get("nombre"))){
                        System.out.println("pelicula encontrada");
                        System.out.println(peliculaBusqueda);
                        System.out.println("Digita la nueva clasificacion: ");
                        String calisificacion=leerTeclado.nextLine();
                        peliculaBusqueda.put("clasificacion Pelicula",calisificacion);
                        System.out.println("pelicula actualizada");
                        System.out.println(peliculaBusqueda);
                    }

                }
            }
            else if (opcionElegida==0){
                System.out.println("saliendo");
            }
            else{
                System.out.println("Opcion invalida");
            }

        }while (opcionElegida!=0);
    }
}