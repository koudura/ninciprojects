package trackide_contro;

import java.util.*;
import java.util.concurrent.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.logging.*;

/**
 *
 * @author Habuto G.Koudura
 */
public class Trackide_Modo {

    public static Map<String, ArrayList<Point>> VehicleData = new HashMap() {};
    public static Map<String, Point> vehicleLocation =new HashMap();

    public static final String[] PATHFILES = {"path_1.txt", "path_2.txt", "path_3.txt", "path_4.txt", "path_5.txt", "path_6.txt", "path_7.txt",
        "path_8.txt", "path_9.txt", "path_10.txt", "path_11.txt", "path_12.txt", "path_13.txt", "path_14.txt", "path_15.txt"};

    public static ArrayList<Point>[] pointedPaths = new ArrayList[PATHFILES.length];
    public static ArrayList<String>[] stringedPaths = new ArrayList[PATHFILES.length];

    Trackide_Modo() {

    }

    
    static class Path {
        
        
        

        Path() {
           constructPaths();
        }
        
        public void constructPaths(){ 
            createPaths();
            
            for(int x = 0; x < pointedPaths.length;x++){
                pointedPaths[x] = setPointedPath(x);
                
                  pointedPaths[x].stream().forEach((s) -> {
                System.out.println(s);
            });

            System.out.println();
            System.out.println("\n");
            
                
            }
           
        }
        
        public ArrayList<Point> setPointedPath(int i) {
          
            ArrayList<Point> bpoint = new ArrayList();
             stringedPaths[i].stream().forEach((path) -> {
                int comma = path.indexOf(",");
                String xs = path.substring(0, comma);
                String ys = path.substring(comma + 1, path.length());
                bpoint.add(ctP(xs, ys));
            });
             return bpoint;
        }

        public Point ctP(String _x, String _y) {
            return new Point(Integer.parseInt(_x), Integer.parseInt(_y));
        }

        public void createPaths() {

            for (int n = 0; n < PATHFILES.length; n++) {
                stringedPaths[n] = getPath(n);
            }

        }

        public ArrayList<String> getPath(int i) {
            ArrayList<String> sPoints = new ArrayList();

            try {
                FileInputStream fstream = new FileInputStream(PATHFILES[i]);
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
                String line;

                while ((line = br.readLine()) != null) {

                    sPoints.add(line);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Trackide_Grapho.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Trackide_Grapho.class.getName()).log(Level.SEVERE, null, ex);
            }
            return sPoints;
        }

    }
}
