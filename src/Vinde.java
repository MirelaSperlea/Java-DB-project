
package licitatiitelefoane;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Vinde extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs = null;
 
    
   
    public Vinde() {
        initComponents();
         con = DBConnection.ConnectionDB();
         
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        vanzator = new javax.swing.JTextField();
        marcaT = new javax.swing.JTextField();
        modelT = new javax.swing.JTextField();
        stareT = new javax.swing.JTextField();
        anT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        denumire_m = new javax.swing.JLabel();
        model_t = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        an_t = new javax.swing.JLabel();
        adaugaT = new javax.swing.JButton();
        txtV = new javax.swing.JLabel();
        inregT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        durataL = new javax.swing.JTextField();
        numeL = new javax.swing.JTextField();
        pretL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        adaugaL = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idT = new javax.swing.JTextField();
        listaL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        data = new javax.swing.JTextField();
        homebt = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        vanzator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vanzatorActionPerformed(evt);
            }
        });

        modelT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelTActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(31, 67, 208));
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("Vanzator(mail):");

        denumire_m.setForeground(new java.awt.Color(0, 51, 204));
        denumire_m.setText(" Marca:");

        model_t.setForeground(new java.awt.Color(0, 51, 204));
        model_t.setText("Model:");

        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Stare:");

        an_t.setForeground(new java.awt.Color(0, 51, 204));
        an_t.setText("An Fabricatie:");

        adaugaT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adaugaT.setForeground(new java.awt.Color(102, 0, 255));
        adaugaT.setText("Adauga!");
        adaugaT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaugaTActionPerformed(evt);
            }
        });

        txtV.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtV.setForeground(new java.awt.Color(51, 0, 204));
        txtV.setText("Cumpleteaza datele despre telefonul pe care vrei sa il vinzi:");

        inregT.setForeground(new java.awt.Color(51, 51, 255));
        inregT.setText("Vezi lista cu telefoanele inregistrate!");
        inregT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inregTActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));

        pretL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pretLActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Pret Licitatie: ");

        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Durata Licitatie: ");

        jLabel7.setForeground(new java.awt.Color(153, 0, 153));
        jLabel7.setText("Nume Licitatie: ");

        adaugaL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adaugaL.setForeground(new java.awt.Color(204, 0, 255));
        adaugaL.setText("Adauga!");
        adaugaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adaugaLActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("Completeaza informatii legate de licitatie:");

        jLabel1.setForeground(new java.awt.Color(153, 0, 153));
        jLabel1.setText("ID Telefon:");

        listaL.setForeground(new java.awt.Color(204, 0, 255));
        listaL.setText("Vezi lista cu licitatiile inregistrate!");
        listaL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaLActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 0, 204));
        jLabel2.setText("Data:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(durataL, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numeL, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                .addComponent(data))
                            .addComponent(pretL, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaL)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(adaugaL, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(116, 116, 116))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(77, 77, 77)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(numeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(durataL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pretL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(adaugaL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(listaL)
                .addContainerGap())
        );

        homebt.setForeground(new java.awt.Color(255, 0, 255));
        homebt.setText("Home");
        homebt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(homebt))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtV))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(denumire_m, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(model_t)
                                            .addComponent(jLabel5)
                                            .addComponent(an_t)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(marcaT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vanzator, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modelT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(stareT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(anT, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(inregT))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(adaugaT)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtV)
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vanzator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marcaT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(denumire_m))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modelT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model_t))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stareT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(an_t))
                        .addGap(59, 59, 59)
                        .addComponent(adaugaT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(inregT))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(homebt)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adaugaTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaugaTActionPerformed
     try{
      String sql1 = "INSERT INTO Telefoane VALUES (?, ?, ?, ?, ?, ?);";
     
      pst1 = con.prepareStatement(sql1);
    
     pst1.setString(2, vanzator.getText());
     pst1.setString(3, marcaT.getText());
     pst1.setString(4, modelT.getText());
     pst1.setString(5, stareT.getText());
     pst1.setString(6, anT.getText());
     
     
     pst1.execute();
     System.out.println("O nou telefon este adaugat!");
     JOptionPane.showMessageDialog(null, "Telefonul a fost adaugat!");
     }
     
     catch(Exception e){
     System.out.println("Adaugarea nu a avut loc!" + e);
     
     }   

      
     
    }//GEN-LAST:event_adaugaTActionPerformed

    
    
    private void modelTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelTActionPerformed
        
    }//GEN-LAST:event_modelTActionPerformed

    private void pretLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pretLActionPerformed
        
    }//GEN-LAST:event_pretLActionPerformed

    private void vanzatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vanzatorActionPerformed
     
    }//GEN-LAST:event_vanzatorActionPerformed

    private void adaugaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adaugaLActionPerformed
      
      try{
        String sql2 = "INSERT INTO Licitatii VALUES (?, ?, ?, ?, ?, ?,?);";
     
        pst2 = con.prepareStatement(sql2);
        
        pst2.setString(2,numeL.getText());
        pst2.setString(3,idT.getText());
        pst2.setString(4, vanzator.getText());
        pst2.setString(5, data.getText());
        pst2.setString(6, durataL.getText());
        pst2.setString(7, pretL.getText());
     
   
     pst2.execute();
     
     System.out.println("O noua licitatir este adaugata!");
     JOptionPane.showMessageDialog(null, "Licitatia a fost adaugata!");
     }
     
     catch(Exception e){
     System.out.println("Adaugarea nu a avut loc!" + e);
     
     }            
    }//GEN-LAST:event_adaugaLActionPerformed

    private void homebtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meniu().setVisible(true);
             }
         });  
        
    }//GEN-LAST:event_homebtActionPerformed

    private void inregTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inregTActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaT().setVisible(true);
             }
         });
    
   
    }//GEN-LAST:event_inregTActionPerformed

    private void listaLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaLActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaL().setVisible(true);
             }
         });
    }//GEN-LAST:event_listaLActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vinde().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adaugaL;
    private javax.swing.JButton adaugaT;
    private javax.swing.JTextField anT;
    private javax.swing.JLabel an_t;
    private javax.swing.JTextField data;
    private javax.swing.JLabel denumire_m;
    private javax.swing.JTextField durataL;
    private javax.swing.JButton homebt;
    private javax.swing.JTextField idT;
    private javax.swing.JButton inregT;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JButton listaL;
    private javax.swing.JTextField marcaT;
    private javax.swing.JTextField modelT;
    private javax.swing.JLabel model_t;
    private javax.swing.JTextField numeL;
    private javax.swing.JTextField pretL;
    private javax.swing.JTextField stareT;
    private javax.swing.JLabel txtV;
    private javax.swing.JTextField vanzator;
    // End of variables declaration//GEN-END:variables
}
