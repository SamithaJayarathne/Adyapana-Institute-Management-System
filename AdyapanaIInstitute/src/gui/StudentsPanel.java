package gui;

import com.formdev.flatlaf.FlatClientProperties;
import java.awt.Color;
import java.awt.Font;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.MySQL;

public class StudentsPanel extends javax.swing.JPanel {

    private static String selectedStuID = "";

    public StudentsPanel() {
        initComponents();
        tableCenter();
        loadStudents();
        loadRoundComponents();
    }
    
    private void loadRoundComponents() {

        jTextField1.putClientProperty("JComponent.roundRect", true);
        jTextField1.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField2.putClientProperty("JComponent.roundRect", true);
        jTextField2.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField3.putClientProperty("JComponent.roundRect", true);
        jTextField3.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        jTextField4.putClientProperty("JComponent.roundRect", true);
        jTextField4.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField5.putClientProperty("JComponent.roundRect", true);
        jTextField5.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField6.putClientProperty("JComponent.roundRect", true);
        jTextField6.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField7.putClientProperty("JComponent.roundRect", true);
        jTextField7.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        jTextField8.putClientProperty("JComponent.roundRect", true);
        jTextField8.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        

        jButton1.putClientProperty("JButton.buttonType", "roundRect");
        jButton2.putClientProperty("JButton.buttonType", "roundRect");
        jButton3.putClientProperty("JButton.buttonType", "roundRect");
        jButton4.putClientProperty("JButton.buttonType", "roundRect");
        jButton5.putClientProperty("JButton.buttonType", "roundRect");
        

    }

    private void reset() {

        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");

        selectedStuID = "";

        jTable1.clearSelection();

        jDateChooser1.setDate(null);
        
        loadStudents();

    }

    private void loadStudents() {

        try {

            String query = "SELECT * FROM `students` WHERE `status`='1'";

            if (!jTextField8.getText().isEmpty()) {

                query += "AND `id` LIKE '" + jTextField8.getText() + "%'";

            }

            ResultSet rs = MySQL.executeSearch(query);

            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            while (rs.next()) {

                Vector<String> vector = new Vector<>();
                vector.add(rs.getString("id"));
                vector.add(rs.getString("fname"));
                vector.add(rs.getString("lname"));
                vector.add(rs.getString("email"));
                vector.add(rs.getString("dob"));
                vector.add(rs.getString("mobile1"));
                vector.add(rs.getString("mobile2"));
                vector.add(rs.getString("line1"));
                vector.add(rs.getString("line2"));

                dtm.addRow(vector);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void tableCenter() {

        // Custom renderer to center-align cells
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

        // Assuming 'table' is your JTable object
        JTableHeader header = jTable1.getTableHeader();

// Set custom font for the header
        header.setFont(new Font("Poppins Medium", Font.PLAIN, 12)); // Change the font style and size

// Set custom colors for the header
        header.setBackground(new Color(91, 42, 112)); // Light purple background
        header.setForeground(Color.WHITE);             // Black text

        // Apply the renderer to all columns in jTable1
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("First Name : ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 46, 100, 35));

        jTextField1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 46, 225, 35));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Last Name : ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 93, 100, 35));

        jTextField2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 93, 225, 35));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Email :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 140, 100, 35));

        jTextField3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 140, 225, 35));

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Date of Birth :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 187, 100, 35));

        jDateChooser1.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 187, 225, 35));

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Mobile Number 1 :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 46, 128, 35));

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("Mobile Number 2 :");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 93, -1, 35));

        jLabel7.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel7.setText("Address Line 1 :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 140, 128, 35));

        jLabel8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel8.setText("Address Line 2 :");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 187, 128, 38));

        jTextField4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 46, 225, 35));

        jTextField5.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 93, 225, 35));

        jTextField6.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 140, 225, 35));

        jTextField7.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 187, 225, 38));

        jButton1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 46, 275, 35));

        jButton2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 93, 275, 35));

        jButton3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton3.setText("Register For New Class");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 140, 275, 35));

        jButton4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(945, 187, 133, 38));

        jButton5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 187, 130, 38));

        jTable1.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "DOB", "Contact Number 1", "Contact Number 2", "Ad. Line 1", "Ad. Line 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel9.setText("Search Students By ID");

        jTextField8.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1))
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String fname = jTextField1.getText();
        String lname = jTextField2.getText();
        String email = jTextField3.getText();
        String mob1 = jTextField4.getText();
        String mob2 = jTextField5.getText();
        String line1 = jTextField6.getText();
        String line2 = jTextField7.getText();
        Date dob = jDateChooser1.getDate();

        Random random = new Random();

        int randomid = 10_000_000 + random.nextInt(90_000_000);
        String stuID = String.valueOf(randomid);

        if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter first name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter last name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Email", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
                + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (dob == null) {
            JOptionPane.showMessageDialog(this, "Please enter the date of birth", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (mob1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a mobile number 1", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!mob1.matches("^(\\+94|0)7[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{3}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (mob2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a mobile number 2", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!mob2.matches("^(\\+94|0)7[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{3}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (line1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a address line 1", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (line2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a address line 2", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {

            try {
                Date date = new Date();
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

                try {

                    ResultSet rs = MySQL.executeSearch("SELECT * FROM `students` WHERE `id`='" + selectedStuID + "'");

                    if (rs.next()) {

                        JOptionPane.showMessageDialog(this, "Student already registered with this ID", "", JOptionPane.WARNING_MESSAGE);

                    } else {

                        MySQL.executeIUD("INSERT INTO `students` VALUES ('" + stuID + "', '" + fname + "', '" + lname + "', '" + format.format(dob) + "', "
                                + "'" + email + "', '" + mob1 + "', '" + mob2 + "', '" + line1 + "', '" + line2 + "', '1')");

                        JOptionPane.showMessageDialog(this, "Your Student Id is : " + stuID, "Successfully Registered", JOptionPane.INFORMATION_MESSAGE);
                        loadStudents();

                        int response = JOptionPane.showConfirmDialog(this, "Do you want to register for a new class ?", "Confirmation", JOptionPane.YES_NO_OPTION);

                        if (response == JOptionPane.YES_OPTION) {

                        } else {

                            reset();

                        }

                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        int row = jTable1.getSelectedRow();

        selectedStuID = String.valueOf(jTable1.getValueAt(row, 0));
        String fname = String.valueOf(jTable1.getValueAt(row, 1));
        String lname = String.valueOf(jTable1.getValueAt(row, 2));
        String email = String.valueOf(jTable1.getValueAt(row, 3));
        String dob = String.valueOf(jTable1.getValueAt(row, 4));
        String mob1 = String.valueOf(jTable1.getValueAt(row, 5));
        String mob2 = String.valueOf(jTable1.getValueAt(row, 6));
        String line1 = String.valueOf(jTable1.getValueAt(row, 7));
        String line2 = String.valueOf(jTable1.getValueAt(row, 8));

        if (evt.getClickCount() == 1) {

            jTextField1.setText(fname);
            jTextField2.setText(lname);
            jTextField3.setText(email);
            jTextField4.setText(mob1);
            jTextField5.setText(mob2);
            jTextField6.setText(line1);
            jTextField7.setText(line2);

            try {

                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                java.util.Date parsedDate;
                parsedDate = format.parse(dob);
                jDateChooser1.setDate(parsedDate);

            } catch (ParseException ex) {
                Logger.getLogger(StudentsPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String fname = jTextField1.getText();
        String lname = jTextField2.getText();
        String email = jTextField3.getText();
        String mob1 = jTextField4.getText();
        String mob2 = jTextField5.getText();
        String line1 = jTextField6.getText();
        String line2 = jTextField7.getText();
        Date dob = jDateChooser1.getDate();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        if (fname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter first name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (lname.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter last name", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter Email", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@"
                + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {
            JOptionPane.showMessageDialog(this, "Invalid Email", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (dob == null) {
            JOptionPane.showMessageDialog(this, "Please enter the date of birth", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (mob1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a mobile number 1", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!mob1.matches("^(\\+94|0)7[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{3}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (mob2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a mobile number 2", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (!mob2.matches("^(\\+94|0)7[0-9]{2}[- ]?[0-9]{3}[- ]?[0-9]{3}$")) {
            JOptionPane.showMessageDialog(this, "Please enter valid mobile number", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (line1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a address line 1", "Warning", JOptionPane.ERROR_MESSAGE);
        } else if (line2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a address line 2", "Warning", JOptionPane.ERROR_MESSAGE);
        } else {

            try {

                ResultSet resultSet = MySQL.executeSearch("SELECT * FROM `students` WHERE `id`='" + selectedStuID + "' OR `mobile1`='" + mob1 + "'");

                boolean canUpdate = false;

                if (resultSet.next()) {

                    if (!resultSet.getString("fname").equals(fname) & !resultSet.getString("lname").equals(lname)) {
                        JOptionPane.showMessageDialog(this, "First Name & Last Name cannot be updated at once", "", JOptionPane.WARNING_MESSAGE);
                    } else {
                        canUpdate = true;
                    }

                } else {
                    canUpdate = true;

                }
                if (canUpdate) {

                    MySQL.executeIUD("UPDATE `students` SET `fname`='" + fname + "', `lname`='" + lname + "', `email`='" + email + "', "
                            + "`dob`='" + format.format(dob) + "', `mobile1`='" + mob1 + "', `mobile2`='" + mob2 + "', "
                            + "`line1`='" + line1 + "', `line2`='" + line2 + "' WHERE `id`='" + selectedStuID + "'");

                    JOptionPane.showMessageDialog(this, "Updated Successfully", "", JOptionPane.INFORMATION_MESSAGE);

                    int response = JOptionPane.showConfirmDialog(this, "Do you want to register for a new class ?", "Confirmation", JOptionPane.YES_NO_OPTION);

                    if (response == JOptionPane.YES_OPTION) {

                    } else {
                        selectedStuID = "";
                        loadStudents();
                        reset();

                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        reset();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String fname = jTextField1.getText();

        if (fname.isEmpty()) {

            JOptionPane.showMessageDialog(this, "Please select a student", "", JOptionPane.INFORMATION_MESSAGE);

        } else {

            try {

                int response = JOptionPane.showConfirmDialog(this, "Do you want to delete the student : " + selectedStuID + " ?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {

                    MySQL.executeIUD("UPDATE `students` SET `status`='2' WHERE `id`='" + selectedStuID + "'");

                    JOptionPane.showMessageDialog(this, "Deleted", "", JOptionPane.INFORMATION_MESSAGE);

                    selectedStuID = "";
                    loadStudents();
                    reset();

                } else {

                }

            } catch (Exception ex) {
                Logger.getLogger(StudentsPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased
        loadStudents();
    }//GEN-LAST:event_jTextField8KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       String fullName = jTextField1.getText() + " " + jTextField2.getText();

        if (jTable1.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(this, "please select a teacher first", "Warning", JOptionPane.WARNING_MESSAGE);

        } else {

            StudentClassRegistration dlg = new StudentClassRegistration(new Home(), true, this, selectedStuID, fullName);
            dlg.setVisible(true);

        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
