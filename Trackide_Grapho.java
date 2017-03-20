package trackide_contro;

import java.awt.*;

import java.util.ArrayList;
import javax.swing.*;
import java.util.concurrent.*;
import static trackide_contro.Trackide_Contro.*;
import static trackide_contro.Trackide_Modo.*;
import static trackide_contro.Trackide_View.*;

/**
 *
 * @author Habuto G.Koudura
 */
enum V_TYPES {
    CAR, BIKE, TRUCK, BUS, LORRY
}

public class Trackide_Grapho extends javax.swing.JFrame {

    public String[][] vCLASSES = {{"Police", "Transport", "Civil"}, {"Delivery", "Police"}, {"Delivery", "Ambulance", "Service", "Police"}, {"Transport", "School", "Civil"}, {"Delivery", "Service"}};
    public String Name, VehicleID;

    public Trackide_Contro TC = new Trackide_Contro();

    Trackide_Modo TM = new Trackide_Modo();
    
    ArrayList<String> ppoint = new ArrayList(); 
    Trackide_View tv = new Trackide_View();
    NameID NM;
    AddressID AI;
    Path Pth = new Path();

    //NameID newBNM;
    public Trackide_Grapho() {
        setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/images/compass-icon.png")).getImage());
        setVisible(true);

        initComponents();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
        }

        NM = new NameID(Vehicle_TypeBox, Vehicle_ClassBox);
        VehicleClassDisplay(this.Vehicle_TypeBox);
       

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home_basePanel = new javax.swing.JPanel();
        Basepanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        Vehicle_TypeBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Vehicle_ClassBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        VehicleNameTxt = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        AddressBox = new javax.swing.JTextField();
        RegisterButton = new javax.swing.JButton();
        DispatchButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        gpsVehicleTxt = new javax.swing.JTextField();
        InfoBox = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GetLocationBtn = new javax.swing.JButton();
        ShowMapBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableStats = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        GetStatsBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        HelpDisplay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("    Trackide");
        setBackground(new java.awt.Color(51, 51, 255));
        setBounds(new java.awt.Rectangle(2, 2, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Bitwise", 0, 14)); // NOI18N
        setForeground(new java.awt.Color(255, 51, 51));
        setName("Home"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout Home_basePanelLayout = new javax.swing.GroupLayout(Home_basePanel);
        Home_basePanel.setLayout(Home_basePanelLayout);
        Home_basePanelLayout.setHorizontalGroup(
            Home_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Home_basePanelLayout.setVerticalGroup(
            Home_basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        Basepanel.setBackground(new java.awt.Color(35, 35, 35));
        Basepanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Basepanel.setPreferredSize(new java.awt.Dimension(905, 577));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Control Panel", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitwise", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(354, 447));
        jPanel3.setOpaque(false);

        jTabbedPane1.setBackground(new java.awt.Color(51, 51, 51));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 0));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N

        jPanel5.setBackground(new java.awt.Color(61, 58, 58));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Vehicle_TypeBox.setBackground(new java.awt.Color(51, 51, 51));
        Vehicle_TypeBox.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vehicle_TypeBox.setForeground(new java.awt.Color(0, 255, 255));
        Vehicle_TypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Bike", "Truck", "Bus", "Lorry" }));
        Vehicle_TypeBox.setToolTipText("Vehicle Types Collection");
        Vehicle_TypeBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Vehicle_TypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vehicle_TypeBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 51));
        jLabel2.setText("Set Vehicle Type");
        jLabel2.setToolTipText("Select Vehicle Type from options \n*Do not Ignore");

        jLabel3.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 51));
        jLabel3.setText("Set Vehicle Class");
        jLabel3.setToolTipText("Select Vehicle Type from options \n*Do not Ignore");

        Vehicle_ClassBox.setBackground(new java.awt.Color(51, 51, 51));
        Vehicle_ClassBox.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        Vehicle_ClassBox.setForeground(new java.awt.Color(0, 204, 204));
        Vehicle_ClassBox.setToolTipText("Vehicle Types Collection");
        Vehicle_ClassBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Set Vehicle Name");
        jLabel4.setToolTipText("Select Vehicle Type from options \n*Do not Ignore");

        VehicleNameTxt.setBackground(new java.awt.Color(51, 51, 51));
        VehicleNameTxt.setFont(new java.awt.Font("Consolas", 1, 16)); // NOI18N
        VehicleNameTxt.setForeground(new java.awt.Color(0, 204, 204));
        VehicleNameTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VehicleNameTxt.setToolTipText("Only the First 8(Eight) Characters shall be used as Name of Vehicle");
        VehicleNameTxt.setAutoscrolls(false);
        VehicleNameTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        VehicleNameTxt.setCaretColor(new java.awt.Color(0, 204, 204));
        VehicleNameTxt.setDragEnabled(true);
        VehicleNameTxt.setOpaque(false);
        VehicleNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                VehicleNameTxtKeyTyped(evt);
            }
        });

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Vehicle Spawn Location  ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 1, 12), new java.awt.Color(0, 255, 0))); // NOI18N
        jPanel9.setForeground(new java.awt.Color(0, 204, 0));
        jPanel9.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("Address to Dispatch Vehicle");
        jLabel5.setToolTipText("Select Vehicle Type from options \n*Do not Ignore");

        AddressBox.setBackground(new java.awt.Color(51, 51, 51));
        AddressBox.setColumns(3);
        AddressBox.setFont(new java.awt.Font("Consolas", 3, 16)); // NOI18N
        AddressBox.setForeground(new java.awt.Color(0, 255, 0));
        AddressBox.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        AddressBox.setToolTipText("X position of Vehicle");
        AddressBox.setAutoscrolls(false);
        AddressBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        AddressBox.setCaretColor(new java.awt.Color(0, 153, 0));
        AddressBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddressBox.setDragEnabled(true);
        AddressBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddressBoxFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AddressBoxFocusLost(evt);
            }
        });
        AddressBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressBoxKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(AddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddressBox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        RegisterButton.setBackground(new java.awt.Color(51, 51, 51));
        RegisterButton.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(51, 255, 51));
        RegisterButton.setMnemonic('R');
        RegisterButton.setText("Register ");
        RegisterButton.setToolTipText("");
        RegisterButton.setBorder(GetLocationBtn.getBorder());
        RegisterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RegisterButton.setFocusPainted(false);
        RegisterButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/001-compass.png"))); // NOI18N
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        DispatchButton.setBackground(new java.awt.Color(51, 51, 51));
        DispatchButton.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        DispatchButton.setForeground(new java.awt.Color(255, 0, 51));
        DispatchButton.setMnemonic('D');
        DispatchButton.setText("Dispatch ");
        DispatchButton.setAutoscrolls(true);
        DispatchButton.setBorder(GetLocationBtn.getBorder());
        DispatchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DispatchButton.setFocusPainted(false);
        DispatchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DispatchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Vehicle_TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(33, 33, 33)
                                    .addComponent(Vehicle_ClassBox, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DispatchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(VehicleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(16, Short.MAX_VALUE)
                        .addComponent(Vehicle_TypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Vehicle_ClassBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VehicleNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DispatchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DISPATCH", jPanel5);

        jPanel6.setBackground(new java.awt.Color(54, 45, 45));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        gpsVehicleTxt.setBackground(new java.awt.Color(51, 51, 51));
        gpsVehicleTxt.setColumns(8);
        gpsVehicleTxt.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        gpsVehicleTxt.setForeground(new java.awt.Color(51, 204, 0));
        gpsVehicleTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        gpsVehicleTxt.setAutoscrolls(false);
        gpsVehicleTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        gpsVehicleTxt.setCaretColor(new java.awt.Color(51, 204, 0));
        gpsVehicleTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        gpsVehicleTxt.setOpaque(false);
        gpsVehicleTxt.setSelectedTextColor(new java.awt.Color(0, 102, 0));
        gpsVehicleTxt.setSelectionColor(new java.awt.Color(255, 153, 153));
        gpsVehicleTxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gpsVehicleTxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gpsVehicleTxtFocusLost(evt);
            }
        });
        gpsVehicleTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gpsVehicleTxtKeyTyped(evt);
            }
        });

        InfoBox.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        InfoBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Consolas", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Enter Vehicle keyTag and Name");

        GetLocationBtn.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        GetLocationBtn.setForeground(new java.awt.Color(102, 255, 102));
        GetLocationBtn.setText("Search");
        GetLocationBtn.setContentAreaFilled(false);
        GetLocationBtn.setFocusPainted(false);
        GetLocationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetLocationBtnActionPerformed(evt);
            }
        });

        ShowMapBtn.setFont(new java.awt.Font("Bitwise", 0, 13)); // NOI18N
        ShowMapBtn.setForeground(new java.awt.Color(102, 255, 102));
        ShowMapBtn.setText("Show on Map");
        ShowMapBtn.setContentAreaFilled(false);
        ShowMapBtn.setFocusPainted(false);
        ShowMapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowMapBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(InfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(GetLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ShowMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gpsVehicleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gpsVehicleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GetLocationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowMapBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InfoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("GPS", jPanel6);

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));

        TableStats.setAutoCreateRowSorter(true);
        TableStats.setBackground(new java.awt.Color(102, 102, 102));
        TableStats.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        TableStats.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        TableStats.setForeground(new java.awt.Color(51, 255, 0));
        TableStats.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "index", " Name", "X°", "Y°", "Class", "Type", "Online"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableStats.setToolTipText("Vehicle Statistics");
        TableStats.setColumnSelectionAllowed(true);
        TableStats.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TableStats.setGridColor(new java.awt.Color(51, 51, 51));
        TableStats.setInheritsPopupMenu(true);
        TableStats.setOpaque(false);
        TableStats.setRequestFocusEnabled(false);
        TableStats.setRowHeight(30);
        TableStats.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TableStats.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(TableStats);
        TableStats.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (TableStats.getColumnModel().getColumnCount() > 0) {
            TableStats.getColumnModel().getColumn(0).setResizable(false);
            TableStats.getColumnModel().getColumn(1).setResizable(false);
            TableStats.getColumnModel().getColumn(2).setResizable(false);
            TableStats.getColumnModel().getColumn(3).setResizable(false);
            TableStats.getColumnModel().getColumn(4).setResizable(false);
            TableStats.getColumnModel().getColumn(5).setResizable(false);
            TableStats.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        GetStatsBtn.setBackground(new java.awt.Color(51, 51, 51));
        GetStatsBtn.setFont(new java.awt.Font("Bitwise", 0, 12)); // NOI18N
        GetStatsBtn.setForeground(new java.awt.Color(51, 255, 0));
        GetStatsBtn.setText("Get Statistics");
        GetStatsBtn.setFocusPainted(false);
        GetStatsBtn.setOpaque(false);
        GetStatsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetStatsBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(255, 204, 153));
        DeleteBtn.setFont(new java.awt.Font("Bitwise", 0, 12)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 51, 51));
        DeleteBtn.setText("Delete Vehicle");
        DeleteBtn.setFocusPainted(false);
        DeleteBtn.setOpaque(false);
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GetStatsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(GetStatsBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteBtn)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("STATS", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Help", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitwise", 0, 12), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel1.setOpaque(false);

        HelpDisplay.setBackground(new java.awt.Color(51, 51, 51));
        HelpDisplay.setFont(new java.awt.Font("Consolas", 0, 10)); // NOI18N
        HelpDisplay.setForeground(new java.awt.Color(255, 255, 255));
        HelpDisplay.setText("    Help !! .....");
        HelpDisplay.setToolTipText("");
        HelpDisplay.setAutoscrolls(true);
        HelpDisplay.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HelpDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(HelpDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BasepanelLayout = new javax.swing.GroupLayout(Basepanel);
        Basepanel.setLayout(BasepanelLayout);
        BasepanelLayout.setHorizontalGroup(
            BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasepanelLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BasepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BasepanelLayout.setVerticalGroup(
            BasepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BasepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("  TrackIde");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        HelpDisplay.setForeground(Color.white);
        HelpDisplay.setText("   Help !! .....");

        Name = CheckVName(VehicleNameTxt.getText()) == false ? NM.setUserName(VehicleNameTxt.getText()) : "";
        VehicleID = NM.SetVehicleID(Name);

        if (VehicleID == null) {
            String wtf = "   Enter vehicle name....'NULL' is not acceptable !!";
            HelpDisplay.setForeground(Color.red);
            HelpDisplay.setText(wtf);
        } else // NameID newSNM = new NameID(VehicleID);
        {
            if (NM.conflictingVehicle(VehicleID) == true) {
                String ErrorAlert = "   VehicleId already exists in index " + (vehicleID_list.indexOf(VehicleID) + 1) + " in Database ";
                HelpDisplay.setForeground(Color.red);
                HelpDisplay.setText(ErrorAlert);
            } else {
                vehicleName_list.add(Name.toUpperCase());
                vehicleID_list.add(VehicleID);
            }
        }
        System.out.println(vCLASSES.length);


    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void Vehicle_TypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vehicle_TypeBoxActionPerformed
        Vehicle_ClassBox.removeAllItems();
        VehicleClassDisplay(Vehicle_TypeBox);
    }//GEN-LAST:event_Vehicle_TypeBoxActionPerformed

    private void DispatchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DispatchButtonActionPerformed
        HelpDisplay.setForeground(Color.white);
        HelpDisplay.setText("   Help !! .....");
        
        Name = CheckVName(VehicleNameTxt.getText()) == false ? NM.setUserName(VehicleNameTxt.getText()) : "";
        VehicleID = NM.SetVehicleID(Name);

        if (VehicleID == null) {
            String wtf = "   Enter vehicle name....'NULL' is not acceptable !!";
            HelpDisplay.setForeground(Color.red);
            HelpDisplay.setText(wtf);
        } else if (NM.conflictingVehicle(VehicleID) == true) {
            AI = new AddressID(AddressBox.getText(), VehicleID);
            HelpDisplay.setText(AI.ValidatePoint());
            
          
            Vehicle motor = new Vehicle(VehicleID);
            
            
            ExecutorService executor = Executors.newCachedThreadPool();
            executor.execute(new Animate(motor, VehicleData,tv));

            System.out.println(VehicleID + " is in database");

        } else {
            String ErrorAlert = "  Register Vehicle First, for it eXists not in Database";
            HelpDisplay.setForeground(Color.red);
            HelpDisplay.setText(ErrorAlert);
        }

    }//GEN-LAST:event_DispatchButtonActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed


    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void gpsVehicleTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gpsVehicleTxtKeyTyped

        if (gpsVehicleTxt.getText().length() >= 10) {
            evt.consume();
        } else if (!Character.isDigit(evt.getKeyChar())) {
            if (!Character.isLetter(evt.getKeyChar())) {
                evt.consume();
            }
        }


    }//GEN-LAST:event_gpsVehicleTxtKeyTyped

    private void VehicleNameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VehicleNameTxtKeyTyped
        HelpDisplay.setForeground(Color.white);
        HelpDisplay.setText("   Help !! .....");

        if (VehicleNameTxt.getText().length() >= 8) {
            evt.consume();
        } else if (!Character.isDigit(evt.getKeyChar())) {
            if (!Character.isLetter(evt.getKeyChar())) {

                evt.consume();
            }
        }

    }//GEN-LAST:event_VehicleNameTxtKeyTyped

    private void AddressBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressBoxKeyTyped

        if (AddressBox.getText().length() >= 2) {
            evt.consume();
        } else if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_AddressBoxKeyTyped

    private void ShowMapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowMapBtnActionPerformed
      


    }//GEN-LAST:event_ShowMapBtnActionPerformed

    private void GetStatsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetStatsBtnActionPerformed

    }//GEN-LAST:event_GetStatsBtnActionPerformed

    private void AddressBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressBoxFocusGained
        HelpDisplay.setText(" Only enter an Address no. from one(1)  to fifteen(15) ");
    }//GEN-LAST:event_AddressBoxFocusGained

    private void AddressBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressBoxFocusLost
        HelpDisplay.setText("  Help !! .....");
        HelpDisplay.setForeground(Color.white);
    }//GEN-LAST:event_AddressBoxFocusLost

    private void gpsVehicleTxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpsVehicleTxtFocusGained
        HelpDisplay.setText(" Vehicle Tag e.g cc$Name , where $Name = Vehicle Name .");
        HelpDisplay.setForeground(Color.orange);
    }//GEN-LAST:event_gpsVehicleTxtFocusGained

    private void gpsVehicleTxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gpsVehicleTxtFocusLost
        HelpDisplay.setText("  Help !! .....");
        HelpDisplay.setForeground(Color.white);
    }//GEN-LAST:event_gpsVehicleTxtFocusLost

    private void GetLocationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetLocationBtnActionPerformed
        GPS gps = new GPS(gpsVehicleTxt.getText());
        HelpDisplay.setText(gps.ValidateVehicleSeacrch());
    }//GEN-LAST:event_GetLocationBtnActionPerformed

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trackide_Grapho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Trackide_Grapho().setVisible(true);
        });
    }

    public Boolean CheckVName(String s) {
        return s.isEmpty();
    }

    public final void VehicleClassDisplay(JComboBox typeJB) {

        for (int i = 0; i < 5; i++) {
            if (typeJB.getSelectedIndex() == i) {
                for (String s : vCLASSES[i]) {
                    Vehicle_ClassBox.addItem(s);
                }
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressBox;
    private javax.swing.JPanel Basepanel;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DispatchButton;
    private javax.swing.JButton GetLocationBtn;
    private javax.swing.JButton GetStatsBtn;
    private javax.swing.JLabel HelpDisplay;
    private javax.swing.JPanel Home_basePanel;
    private javax.swing.JLabel InfoBox;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton ShowMapBtn;
    private javax.swing.JTable TableStats;
    private javax.swing.JTextField VehicleNameTxt;
    private javax.swing.JComboBox<String> Vehicle_ClassBox;
    private javax.swing.JComboBox<String> Vehicle_TypeBox;
    private javax.swing.JTextField gpsVehicleTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
