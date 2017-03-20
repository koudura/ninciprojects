package trackide_contro;

import java.awt.*;
import java.util.concurrent.*;
import java.util.*;
import javax.swing.*;
import trackide_contro.Trackide_Contro.NameID;
import static trackide_contro.Trackide_Modo.*;

/**
 *
 * @author Habuto G.Koudura
 */
public class Trackide_Contro {

    static Trackide_Grapho TG = new Trackide_Grapho();
    public static String[][] VehicleTag = {{"cp", "ct", "cc"}, {"kd", "kp"}, {"td", "ta", "ts", "tp"}, {"bt", "bs", "bc"}, {"ld", "ls"}};
    public static ArrayList<String> vehicleID_list = new NameID();
    public static ArrayList<String> vehicleName_list = new ArrayList();

    public static void main(String[] args) {

    }

    static class NameID extends ArrayList<String> {

        private String id;
        private JComboBox type, classs;
        private ArrayList<String> temp_VLib;

        NameID() {

        }

        NameID(JComboBox _type, JComboBox _classs) {
            type = _type;
            classs = _classs;
        }

        public String setUserName(String txt) {
            return txt.toUpperCase();

        }

        public String SetVehicleID(String name) {
            String tag;
            String VehicleID = "";

            if ("".equals(name)) {

                return null;
            } else {
                for (int a = 0; a < V_TYPES.values().length; a++) {
                    if (type.getSelectedIndex() == a) {
                        for (int b = 0; b < TG.vCLASSES[a].length; b++) {
                            if (TG.vCLASSES[a][b].equals(classs.getSelectedItem().toString())) {
                                tag = VehicleTag[a][b];

                                VehicleID = BuildID(tag, name);
                            }
                        }
                    }
                }
                return VehicleID;
            }
        }

        public Boolean conflictingVehicle(String s) {

            return vehicleID_list.contains(s);

        }

        private String BuildID(String _tag, String _name) {
            return _tag + "." + _name;
        }

        public ArrayList<String> DeleteVehicleID(String ID) {
            ArrayList<String> freshList = new ArrayList();
            if (!vehicleID_list.remove(ID)) {
                System.out.println("Vehicle does not exist");
            } else {
                return freshList = vehicleID_list;
            }
            return freshList = vehicleID_list;
        }

    }

    static class AddressID {

        private final String id;
        String name;
        private Point position;
        Trackide_Modo TMD = new Trackide_Modo();
        private ArrayList<Point> temp_PLib;

        AddressID(String ad, String name) {
            id = ad;
        }

        public String ValidatePoint() {
            if (AddressisValid(id) == true) {

                int k = Integer.parseInt(id);
                if (k != 0) {
                    VehicleData.put(name, AssignAddress(k));
                    return "Successfull Registration !!";
                } else {
                    VehicleData.put(name, RandomizeAddress());
                    return "Successfull Registration !!";
                }
            }
            return "Invalid Address !, must be in range 1-15";
        }

        public ArrayList<Point> AssignAddress(int i) {
            return pointedPaths[i - 1];
        }

        public ArrayList<Point> RandomizeAddress() {
            Random rand = new Random();
            int index = rand.nextInt(15);
            return pointedPaths[index];

        }

        private Boolean AddressisValid(String x) {
            return !("".equals(x) || x == null || (Integer.parseInt(x) > 15));
        }

       

    }

}

class GPS {

    Boolean found;
    private final String str;
    Trackide_Contro Tcn = new Trackide_Contro();
    NameID nm = new NameID();

    GPS(String str) {
        this.str = str;

    }
    
    
//    public void getVehicleLoc(Arra){
//        
//    
//    }

    public String ValidateVehicleSeacrch() {
        String hold = str.substring(0, 2);
        System.out.println(hold);
        for (String[] set : Trackide_Contro.VehicleTag) {
            for (String tag : set) {
                if (hold.equals(tag)) {
                    if (nm.conflictingVehicle(getID()) == true) {
                        found = true;
                        return "Vehicle Found !!";
                    } else {
                        found = false;
                        return "  Register Vehicle First, for it eXists not in Database";
                    }
                } else {

                }
            }
        }
        found = false;
        return "Pls Enter a Valid search String!...";

    }

    private String getID() {
        if (str.substring(0, 2).length() == str.length()) {
            return null;
        }
         String cp =  (str.substring(0, 2)) + "." + (str.substring(2, str.length()).toUpperCase());
        System.out.println(cp);
        return cp;
    }
}

