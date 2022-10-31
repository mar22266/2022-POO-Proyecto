import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException; 

public class principal {
    
    public static void main(String [] args){
        System.out.println("BIENVENIDO AL PROGRAMA DE EDUCACION BASICA");
        Scanner techword = new Scanner(System.in);
        String menuprin = "1. Crear usuario\n2. ingresar a la plataforma\n3. Salir\n";
        int opcionprin = 1;
        System.out.println(menuprin);
        System.out.println("Ingrese la opción que desea: ");
        opcionprin = techword.nextInt();
        teclado.nextLine();
        while (opcionprin<3 && opcionprin>=1){
            switch (opcionprin){
                /*nombre = " ";
            edad = 0;
            añoAcademico = " ";
            cursos = 0;
            centroEducativo = " ";
            DPI = 0;
            correo = "";
            contraseña = ""; */
                case 1: {
                    System.out.println("ingrese su nombre:");
                    String nombre = techword.nextLine();
                    System.out.println("Ingrese su edad:");
                    int edad = techword.nextInt();
                    techword.nextLine();
                    System.out.println("Ingrese su año academico:");
                    String añoAcademico = techword.nextLine();
                    System.out.println("Ingrese su centro educativo:");
                    String centroEducativo = techword.nextLine();
                    System.out.println("Ingrese su DPI:");
                    int DPI = techword.nextInt();
                    techword.nextLine();
                    System.out.print("Ingrese su correo electronico:");
                    String correo = techword.nextLine();
                    System.out.println("Ingrese lo que sera su contraseña:");
                    String contraseña = techword.nextLine();
                    System.out.println("Ahora puede ingresa al menu de inicio:");
                    break;
                }
                case 2: {
                    System.out.println("Ingrese su corre electronico");
                    String correo = techword.nextLine();
                    System.out.println("Ingrese su contraseña:");
                    String contraseña = techword.nextLine();
                    break;
                }
    
        geografia g = new geografia();
        mate m = new mate();
        Scanner teclado = new Scanner(System.in);
        String menu = "\n1. Lenguaje\n2. Matemáticas \n3. Geografía  \n4. Crear CSV \n5. Almacenar en CSV \n6. Leer CSV  \n7. Salir";
        int opcion = 1;
        int punteo = 0;
        System.out.println(menu);
        System.out.println("Ingrese una opción del menú: ");
        try{
        opcion = teclado.nextInt();
        teclado.nextLine();
        }
        catch (InputMismatchException e) {
            System.out.println("Error Ingrese uno de los numeros anteriores");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }
        
        while (opcion < 7 && opcion>=1 ){
            switch(opcion){
            
                
                //lengauje
                case 1: {
                    
                    
                }
            

                //MATE
                case 2: {
                    String menuMate = "1. Repasar \n2. Sumas \n3. Restas \n4. Regresar a menu principal";
                    int opcionMate = 1;
                    System.out.println(menuMate);
                    System.out.println("Ingrese la opción que desea: ");
                    opcionMate = teclado.nextInt();
                    teclado.nextLine();
                    
                    while (opcionMate < 4 && opcionMate>=1 ){
                        switch(opcionMate){

                            case 1:{
                                System.out.println("\n");
                                System.out.println("\nLas sumas y restas son las primeras operaciones matemáticas que aprendemos. ");
                                System.out.println("\nAntes de aprender a sumar y restar, vamos a explicar qué es una suma y qué es una resta:");
                                System.out.println("\nSumar: Sumar es juntar dos o más cosas en un grupo, para saber cuántas hay en total");
                                System.out.println("\nRestar: Restar es quitar una cierta cantidad a otra que ya teníamos");
                                System.out.println("\nEjemplo de suma: ");
                                System.out.println("\nSi tengo 2 manzanas verdes y 3 manzanas rojas, y quiero saber cuántas manzanas tengo"+ 
                                "en total, junto todas las manzanas en un solo cesto y las cuento: tengo 5 manzanas en total, por lo tanto 2 + 3  es igual a 5.");
                                System.out.println("\nEjemplo de resta: ");
                                System.out.println("\nSi tengo 5 manzanas en una cesta, y quito 2, dentro de la cesta me quedarán 3 manzanas,"+
                                 "es decir que 5 menos 2 es igual a 3.");

                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                //sd

                                break;
                            }
                            case 2:{
                                m.sumar();
                                m.restar();
                                int e = 0;
                                String res1 = "";
                                System.out.println("\nResuelva los siguientes ejercicios:");
                                System.out.println("\n");
                                for (int i = 0; i <5; i++){
                                    System.out.println("\n"+m.getEjercicios().get(i));
                                    res1 = teclado.nextLine();
                                    String resp = m.getRespuestas().get(i);
                                    if(res1.equals(resp)){
                                        System.out.println("Buen trabajo"); 
                                    }
                                    else{
                                        System.out.println("Respuesta incorrecta");
                                        e++;
                                        m.setErrores(e);
                                    }
                                }
                                System.out.println("Respuestas correctas: "+(5-e));
                                System.out.println("Respuestas incorrectas: "+(e));
                                System.out.println("\n");


                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }
                            case 3:{
                                int e = 0;
                                m.sumar();
                                m.restar();
                                String res2 = "";
                                System.out.println("\nResuelva los siguientes ejercicios:");
                                System.out.println("\n");
                                for (int i = 5; i <10; i++){
                                    System.out.println("\n"+m.getEjercicios().get(i));
                                    String resp2 = m.getRespuestas().get(i);
                                    res2 = teclado.nextLine();
                                    if(res2.equals(resp2)){
                                        System.out.println("Buen trabajo");
                                    }
                                    else{
                                        System.out.println("Respuesta incorrecta");
                                        e++;
                                        m.setErrores(e);
                                    }
                                }
                                System.out.println("Respuestas correctas: "+(5-e));
                                System.out.println("Respuestas incorrectas: "+(e));
                                System.out.println("\n");
                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }

                        }
                        
                    }
                    break;
                }

                //GEOGRAFIA
                case 3: {
                    String menuGeo = "1. Repasar \n2. Evaluar\n3. Regresar a menu principal";
                    int opcionGeo = 1;
                    System.out.println(menuGeo);
                    System.out.println("Ingrese una opción del menú: ");
                    opcionGeo = teclado.nextInt();
                    teclado.nextLine();
                    g.asignarValores();
                    g.repasar();
                    String [][] matrizR = g.getRepasa();
                    String[][] matriz = g.getEnsena();
                    while (opcionGeo < 3 && opcionGeo>=1 ){
                        switch(opcionGeo){
                            case 1:{
                        
                                for (int fila = 0; fila <8; fila++){
                                    for(int col = 0; col<2; col ++){
                                        System.out.print(matriz[fila][col]);
                                        
                                    }
                                }
                                System.out.println();
                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionGeo = teclado.nextInt();
                                teclado.nextLine();
                                break;
                                
                            }

                            case 2: {
                                System.out.println("Cual es la cabecera de El Progreso?\n");
                                String r1 = teclado.nextLine();

                                if(r1.equalsIgnoreCase(matrizR[1][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }

                                System.out.println("Cual es la cabecera de Peten?\n");
                                String r2 = teclado.nextLine();
                                if(r2.equalsIgnoreCase(matrizR[2][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Alta Verapaz?\n");
                                String r3 = teclado.nextLine();
                                if(r3.equalsIgnoreCase(matrizR[3][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Escuintla?\n");
                                String r4 = teclado.nextLine();
                                if(r4.equalsIgnoreCase(matrizR[4][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Santa Rosa?\n");
                                String r5 = teclado.nextLine();
                                if(r5.equalsIgnoreCase(matrizR[5][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Zacapa?\n");
                                String r6 = teclado.nextLine();
                                if(r6.equalsIgnoreCase(matrizR[6][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Guatemala?\n");
                                String r7 = teclado.nextLine();
                                if(r7.equalsIgnoreCase(matrizR[7][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA\n");
                                }
                                
                                if(punteo < 5){
                                    System.out.println("Necesita seguir repasando\n" + "Su promedio es de: "+ punteo*100/7 + "\n");
                                }
                                else{
                                    System.out.println("Su promedio es de: " + punteo*100/7 + "\n");

                                }
                                
                                
                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionGeo = teclado.nextInt();
                                teclado.nextLine();
                                break;
                                
                            }
                           
                        }

                    }
                }

                case 4:{ 
                    try {
                        File myObj = new File("Alumnos.csv");
                        if (myObj.createNewFile()) {
                          System.out.println("Archivo creado: " + myObj.getName());
                        } else {
                          System.out.println("Archivo ya es existente.");
                        }
                    } catch (IOException e) {
                        System.out.println("Ocurrió un error.");
                        e.printStackTrace();
                    }
                    break;
                }


                case 5:{
                    try {
                        FileWriter myWriter = new FileWriter("Alumnos.csv");
                        myWriter.write("Nombre,Edad,Grado Academico,Cursos,Centro Educativo,DPI,Promedio Mate,Promedio Lenguaje,Promedio Geografia\n");
                        myWriter.write("hola"+ ","+"adios"+ ","+punteo*100/7);
                        myWriter.close();
                    
                    }catch (IOException e) {
                        System.out.println("Ha ocurrido un error.");
                        e.printStackTrace();
                    }
                
                    break;
                }

                case 6:{
                    try {
                        File my = new File("Alumnos.csv");
                        Scanner myReader = new Scanner(my);
                        while (myReader.hasNextLine()) {
                          String data = myReader.nextLine();
                          System.out.println(data);
                        }
                        myReader.close();
                      } catch (FileNotFoundException e) {
                        System.out.println("Ha ocurrido un error.");
                        e.printStackTrace();
                      }
                    break;
                    
                }
            }
        
            System.out.println(menu);
            System.out.println("Ingrese la opción que desea: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

                
       
        }
        System.out.println("CERRANDO PROGRAMA HASTA LUEGO...");
    }

}
     } }