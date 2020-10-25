import java.util.*;
import java.io.*;

public class Lector {
    LinkedList<Double> x = new LinkedList();
    LinkedList<Double> y = new LinkedList();
    LinkedList<Double> z = new LinkedList();
    LinkedList<Abejas> ab = new LinkedList();

    public Lector() {
        ab = new LinkedList<>();
        x = new LinkedList<>();
        y = new LinkedList<>();
        z = new LinkedList<>();
    }

    public void LecturaArchivo(String Archivo) throws FileNotFoundException {
        Scanner Dato1 = new Scanner(new File(Archivo));
        int contador = 0;
        while (Dato1.hasNextLine()) {
            String line = Dato1.nextLine();
            line = line.replace(",", " ");

            Scanner lineScan = new Scanner(line);
            if (contador > 0) {
                String aux = lineScan.next();
                double lat = Double.parseDouble(aux);
                x.addFirst(lat);
                aux = lineScan.next();
                double lon = Double.parseDouble(aux);
                y.addFirst(lon);
                aux = lineScan.next();
                double alt = Double.parseDouble(aux);
                z.addFirst(alt);
                Abejas d = new Abejas(lat, lon, alt);
                ab.addFirst(d);
            }
            contador++;
            lineScan.close();
        }
        Dato1.close();
        System.out.println("Fueron leídos: " + (contador-1) + " datos de manera correcta");
        getMinMax();
    }

    public void getMinMax() {
        double minlat = (double) Collections.min(x);
        double maxlat = (double) Collections.max(x);

        double minlon = (double) Collections.min(y);
        double maxlon = (double) Collections.max(y);

        double minalt = (double) Collections.min(z);
        double maxalt = (double) Collections.max(z);

        ArrayList<Double> mins = new ArrayList();
        mins.add(minlat);
        mins.add(minlon);
        mins.add(minalt);
        double midD = (minlat - maxlat) / 2;
        double midW = (maxlon - minlon) / 2;
        double midH = (maxalt - minalt) / 2;
        double diagonal = Math.sqrt(Math.pow((midD)*111325, 2) + Math.pow((midW)*111325, 2)+Math.pow((midH),2));
        //double diagonal = Math.sqrt(Math.pow(ph, 2) + Math.pow((midH), 2));
        if (diagonal > 100) {
            Octree octree = new Octree();
            System.out.println("nada");
            octree.octree(ab, mins, midD, midW, midH);
        } else {
            choque();
        }
    }

    public void choque() {
        System.out.println("Las abejas en las siguientes coordenadas estan en peligro de chocarse");
        for (int i = 0; i < ab.size(); ++i) {
            System.out.println(x.poll() + "," + y.poll() + "," + z.poll());
        }
    }

}
