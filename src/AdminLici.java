
package licitatiitelefoane;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class AdminLici extends javax.swing.JFrame {

    
    Connection con = null;
  
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    
    ResultSet rs = null;
  
    public AdminLici() {
        initComponents();
        con = DBConnection.ConnectionDB();
        adminLici();
    }

    
     private void adminLici()
    { 
      int CC;
      try{
          String sql = "SELECT * FROM Licitatii";
          pst1 = con.prepareStatement(sql);
          rs = pst1.executeQuery();
          
          ResultSetMetaData RSMD = rs.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) adminL.getModel();
          DFT.setRowCount(0);
          
          while(rs.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
                v2.add(rs.getString("Licitatie_ID"));
                v2.add(rs.getString("Nume_Licitatie"));
                v2.add(rs.getString("Telefon_ID"));
                v2.add(rs.getString("Vanzator"));
                v2.add(rs.getString("Data"));
                v2.add(rs.getString("Durata"));
                v2.add(rs.getInt("Pret"));
                
            }
            DFT.addRow(v2);
          }
          
      } 
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        upbt = new javax.swing.JButton();
        delbt = new javax.swing.JButton();
        insertbt = new javax.swing.JButton();
        idL = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminL = new javax.swing.JTable();
        numeL = new javax.swing.JTextField();
        TelID = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        durata = new javax.swing.JTextField();
        pret = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Licitatie ID");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 51, 255));
        jLabel5.setText("Licitatiile din sistem");

        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Nume Licitatie:");

        jLabel6.setForeground(new java.awt.Color(153, 0, 255));
        jLabel6.setText("Telefon ID:");

        jLabel7.setForeground(new java.awt.Color(153, 0, 255));
        jLabel7.setText("Vanzator:");

        jLabel8.setForeground(new java.awt.Color(153, 0, 255));
        jLabel8.setText("Data:");

        jLabel9.setForeground(new java.awt.Color(153, 0, 255));
        jLabel9.setText("Pret:");

        jLabel10.setForeground(new java.awt.Color(153, 0, 255));
        jLabel10.setText("Durata:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Info System");

        upbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upbt.setForeground(new java.awt.Color(153, 0, 255));
        upbt.setText("UPDATE!");
        upbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbtActionPerformed(evt);
            }
        });

        delbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delbt.setForeground(new java.awt.Color(153, 0, 255));
        delbt.setText("DELETE!");
        delbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtActionPerformed(evt);
            }
        });

        insertbt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertbt.setForeground(new java.awt.Color(153, 0, 255));
        insertbt.setText("INSERT!");
        insertbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtActionPerformed(evt);
            }
        });

        idL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idLActionPerformed(evt);
            }
        });

        adminL.setBackground(new java.awt.Color(204, 204, 255));
        adminL.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adminL.setForeground(new java.awt.Color(153, 0, 255));
        adminL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Licitatie_ID", "Nume_Licitatie", "Telefon_ID", "Vanzator", "Data", "Durata", "Pret"
            }
        ));
        adminL.setGridColor(new java.awt.Color(204, 0, 255));
        adminL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminL);

        TelID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelIDActionPerformed(evt);
            }
        });

        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 255));
        jButton1.setText("NEXT!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(454, 454, 454)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(insertbt)
                        .addGap(18, 18, 18)
                        .addComponent(upbt)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delbt, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pret, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(durata, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numeL, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 803, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(numeL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(durata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pret, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertbt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbtActionPerformed

        try{
            String value1 = idL.getText();
            String value2 = numeL.getText();
            String value3 = TelID.getText();
            String value4 = mail.getText();
            String value5 = data.getText();
            String value6 = durata.getText();
            String value7 = pret.getText();

            String query = "update Licitatii SET "
                    + "Licitatie_ID = '"+value1+"', Nume_Licitatie='"+value2+"', Telefon_ID= '"+value3+"', Vanzator='"+value4+
                    "', Data='"+value5+"', Durata='"+value6+"', Pret='"+value7+"' where Licitatie_ID='"+value1+"' " ;

            pst3 = con.prepareStatement(query);
            pst3.execute();

            JOptionPane.showMessageDialog(null, "Modificarea a avut loc!");
            adminLici();
            idL.setText("");
            numeL.setText("");
            TelID.setText("");
            mail.setText("");
            data.setText("");
            durata.setText("");
            pret.setText("");

        }

        catch(Exception e){

            System.out.println("Modificarea nu a avut loc!" + e);

        }
    }//GEN-LAST:event_upbtActionPerformed

    private void delbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtActionPerformed

        try{

            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LicitatiiTelefoane_DB.db");
            int row =adminL.getSelectedRow();
            String value =(adminL.getModel().getValueAt(row,0).toString());

            String q3 = "DELETE FROM Licitatii where Licitatie_ID="+value;

            pst4 = con.prepareStatement(q3);
            pst4.execute();

            DefaultTableModel DFT = (DefaultTableModel) adminL.getModel();
            DFT.setRowCount(0);

            JOptionPane.showMessageDialog(null, "Stergerea a avut loc!");
            adminLici();
            idL.setText("");
            numeL.setText("");
            TelID.setText("");
            mail.setText("");
            data.setText("");
            durata.setText("");
            pret.setText("");

        }

        catch(Exception e){
            //System.out.println("Modificarea nu a avut loc!" + e);
            JOptionPane.showMessageDialog(null,e);
        }

    }//GEN-LAST:event_delbtActionPerformed

    private void insertbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtActionPerformed
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:LicitatiiTelefoane_DB.db");
            String q = "INSERT INTO Licitatii VALUES (?, ?, ?, ?, ?, ?, ?);";

            pst2 = con.prepareStatement(q);

            pst2.setString(1, idL.getText());
            pst2.setString(2, numeL.getText());
            pst2.setString(3, TelID.getText());
            pst2.setString(4, mail.getText());
            pst2.setString(5, data.getText());
            pst2.setString(6, durata.getText());
            pst2.setString(7, pret.getText());

            pst2.execute();
            System.out.println("O nou licitatie este adaugat!");
            JOptionPane.showMessageDialog(null, "Licitatia a fost adaugat!");
            
            adminLici();
            idL.setText("");
            numeL.setText("");
            TelID.setText("");
            mail.setText("");
            data.setText("");
            durata.setText("");
            pret.setText("");
        }

        catch(Exception e){
            System.out.println("Adaugarea nu a avut loc!" + e);
            
            
            

        }
    }//GEN-LAST:event_insertbtActionPerformed

    private void idLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idLActionPerformed
        
    }//GEN-LAST:event_idLActionPerformed

    private void adminLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLMouseClicked
        
        DefaultTableModel DFT = (DefaultTableModel) adminL.getModel();
        int selectedIntex = adminL.getSelectedRow();
        
        idL.setText(DFT.getValueAt(selectedIntex, 0).toString());
        numeL.setText(DFT.getValueAt(selectedIntex, 1).toString());
        TelID.setText(DFT.getValueAt(selectedIntex, 2).toString());
        mail.setText(DFT.getValueAt(selectedIntex, 3).toString());
        data.setText(DFT.getValueAt(selectedIntex, 4).toString());
        durata.setText(DFT.getValueAt(selectedIntex, 5).toString()); 
        pret.setText(DFT.getValueAt(selectedIntex, 6).toString());
    }//GEN-LAST:event_adminLMouseClicked

    private void TelIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelIDActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiciSystem().setVisible(true);
            }
        });
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLici().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TelID;
    private javax.swing.JTable adminL;
    private javax.swing.JTextField data;
    private javax.swing.JButton delbt;
    private javax.swing.JTextField durata;
    private javax.swing.JTextField idL;
    private javax.swing.JButton insertbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField numeL;
    private javax.swing.JTextField pret;
    private javax.swing.JButton upbt;
    // End of variables declaration//GEN-END:variables

   
}
