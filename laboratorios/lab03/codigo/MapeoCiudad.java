package Laboratorio3;

import java.util.*;
import java.io.*;


public class MapeoCiudad{

    private static ArrayList<Datos> mapeo = new ArrayList<>();
    private static ArrayList<Arcos> mapeo2 = new ArrayList<>();
    public static void readData(String nombreArchivo) throws FileNotFoundException{
        String nombrearchivo;
        if(nombreArchivo.endsWith(".txt")){ //Se utiliza endsWith para que el pograma pueda trabajar con medellin_colombia-grande.txt, Vertice.txt y Arcos.txt
            nombrearchivo=nombreArchivo;
        } else{
            nombrearchivo= nombreArchivo + ".txt";
        }
        Scanner leer = new Scanner( new File(nombrearchivo));
        double cont = 0;
        while(leer.hasNextLine()){
            String line = leer.nextLine();
            Scanner scan = new Scanner(line);
            String a = scan.next(); 
            long id = Long.parseLong(a);
            a = scan.next();
            long id2 = Long.parseLong(a);
            a = scan.next();
            double distance = Double.parseDouble(a);
            a = scan.next();
            double x = Double.parseDouble(a);
            a = scan.next();
            double y = Double.parseDouble(a);
            if(scan.hasNext()){
                a = scan.next();
                while(scan.hasNext()){
                    a = a +" "+ scan.next();
                }
            }else{
                a = null;
            }
            Datos cord = new Datos(id, x, y, a);
            mapeo.add(cord);
            cont++;

            Arcos dist = new Arcos(id, id2, distance, a);
            mapeo2.add(dist);
            cont++;
        }
        leer.close();
        System.out.println("Se identificaron " + cont + " ubicaciones exitosamente");
    }
}
