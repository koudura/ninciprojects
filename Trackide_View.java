package trackide_contro;

import java.awt.*;

import static trackide_contro.Trackide_Contro.*;
import static trackide_contro.Trackide_View.*;
import java.util.*;
import java.util.Map.Entry;

import javax.swing.*;

/**
 *
 * @author Habuto G.Koudura
 */
public class Trackide_View extends JFrame {

    ImageIcon imgcm = new ImageIcon(getClass().getResource("/images/MapCapture.png"));

    public int mouseX, mouseY;

    public static Trackide_Grapho tgph;

    public Trackide_View() {

        setContentPane(new MapBPanel());
        setTitle("  Trackide Map");
        setSize(imgcm.getIconWidth(), imgcm.getIconHeight());

        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLocationRelativeTo(tgph);

        setIconImage(new ImageIcon(getClass().getResource("/images/compass-icon.png")).getImage());
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }
        ImageIcon imgc = new ImageIcon(getClass().getResource("/images/trueCompass.png"));
        JLabel compass = new JLabel(imgc);
        compass.setLocation(30, 460);
        compass.setOpaque(false);
        compass.setSize(imgc.getIconWidth(), imgc.getIconHeight());
        add(compass);

        setVisible(true);
    }
}


  class MapBPanel extends JLabel {

       ImageIcon imgcm = new ImageIcon(getClass().getResource("/images/MapCapture.png"));

       
    MapBPanel() {
            System.out.println(imgcm.getIconWidth());
            System.out.println(imgcm.getIconHeight());
            setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

            setLayout(null);
            setIcon(imgcm);

            //  add(new showMouseLoc());
        }
    }

    class showMouseLoc extends JLabel {

        //  moving move = new moving();
        showMouseLoc(int x, int y) {

            setLocation(new Point(8, 8));
            setSize(100, 40);
            setOpaque(false);
            setText(" " + x + " X°" + " , " + y + " Y° ");
            //  addMouseMotionListener(move);
        }

    }

class Vehicle extends JLabel {

        ImageIcon[][] imagelist = {{new ImageIcon(getClass().getResource("/images/Marker_16px.png")), new ImageIcon(getClass().getResource("/images/ct.png")), new ImageIcon(getClass().getResource("/images/cc.png"))},
                                 {new ImageIcon(getClass().getResource("/images/kd.png")), new ImageIcon(getClass().getResource("/images/kp.png"))},
                                 {new ImageIcon(getClass().getResource("/images/td.png")), new ImageIcon(getClass().getResource("/images/ta.png")), new ImageIcon(getClass().getResource("/images/ts.png")), new ImageIcon(getClass().getResource("/images/tp.png"))},
                                 {new ImageIcon(getClass().getResource("/images/bt.png")), new ImageIcon(getClass().getResource("/images/bs.png")), new ImageIcon(getClass().getResource("/images/bc.png"))},
                                 {new ImageIcon(getClass().getResource("/images/ld.png")), new ImageIcon(getClass().getResource("/images/ls.png"))}};
       
        private final String name;

        Vehicle(String NameId) {

            name = NameId;
            setOpaque(false);
            setClass();

        }

        private void setClass() {
            for (int i = 0; i < VehicleTag.length; i++) {
                for (int j = 0; j < VehicleTag[i].length; j++) {
                    if (VehicleTag[i][j].equals(getTag())) {
                        setIcon(imagelist[i][j]);
                     
                        setSize(imagelist[i][j].getIconWidth(), imagelist[i][j].getIconHeight());
                    }
                }
            }

        }

        private String getTag() {
            return name.substring(0, 2).toLowerCase();

        }
    }
class Animate implements Runnable {

        final Vehicle vehicle;
        final Trackide_View tview;
        Map<String, ArrayList<Point>> loc = new HashMap();

        Animate(Vehicle veh, Map<String, ArrayList<Point>> locations, Trackide_View tv) {
            loc = locations;
            vehicle = veh;
            tview = tv;

        }

        public synchronized void bringToLife() {
            Set<Entry<String, ArrayList<Point>>> setMap = loc.entrySet();
            Iterator<Entry<String, ArrayList<Point>>> itMap = setMap.iterator();

            while (itMap.hasNext()) {
                Map.Entry<String, ArrayList<Point>> entry = (Map.Entry<String, ArrayList<Point>>) itMap.next();
                String key = entry.getKey();
                tview.add(vehicle);
                entry.getValue().stream().map((p) -> {
                    vehicle.setLocation(p);
                    return p;
                }).map((_item) -> {
                    //  tview.revalidate();
                    tview.repaint();
                    return _item;
                }).forEach((Point _item) -> {
                    try {
                        Thread.sleep(25);
                    } catch (InterruptedException e) {
                    }
                });

            }

        }

        @Override
        public void run() {
            while (true) {
                synchronized (tview) {
                    bringToLife();
                }
            }
        }

    }


