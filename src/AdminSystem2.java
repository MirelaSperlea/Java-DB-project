
package licitatiitelefoane;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import licitatiitelefoane.DBConnection;
import java.util.Vector;




public class AdminSystem2 extends javax.swing.JFrame {

   Connection con = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    PreparedStatement pst5 = null;
    PreparedStatement pst6 = null;
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    ResultSet rs3 = null;
    
    public AdminSystem2() {
        initComponents();
        con = DBConnection.ConnectionDB();
        Fillcombo1();
        Fillcombo2();
        Fillcombo3();
        Tmarca();
        modelT();
        AnT();
        
    }
 private void Fillcombo1(){ 
        
    try{
        String sql1="select * from Marci";
        pst1=con.prepareStatement(sql1);
        rs1=pst1.executeQuery();
        while(rs1.next()){
        String marca = rs1.getString("Marca");
        combo1.addItem(marca);
        }
        
    }
    
    catch(Exception e)
       { JOptionPane.showMessageDialog(null,e);
       
       }
    }
  private void Fillcombo2(){ 
        
    try{
        String sql2="select Distinct Model from Telefoane order by Model DESC";
        pst2=con.prepareStatement(sql2);
        rs2=pst2.executeQuery();
        while(rs2.next()){
        String model = rs2.getString("Model");
        combo2.addItem(model);
        }
        
    }
    
    catch(Exception e)
       { JOptionPane.showMessageDialog(null,e);
       
       }
    }
  
   private void Fillcombo3(){ 
        
    try{
        String sql3="select distinct An_fabricatie from Telefoane order by An_fabricatie DESC ";
        pst3=con.prepareStatement(sql3);
        rs3=pst3.executeQuery();
        while(rs3.next()){
            String an=rs3.getString("An_fabricatie");
           
         combo3.addItem(an);
        }
        
    }
    
    catch(Exception e)
       { JOptionPane.showMessageDialog(null,e);
       
       }
    }
 
 
 private void Tmarca()
    { 
      int CC;
      try{
         String m;
           m = (String)combo1.getSelectedItem();
           String sql3 = "SELECT A.Nume, A.Prenume, A.Nr_Telefon, B.Vanzator "
                         + "FROM Utilizatori A, Telefoane B "
                         + "WHERE A.Mail=B.Vanzator AND B.Marca=?";
          
        pst4=con.prepareStatement(sql3);
        pst4.setString(1, m);
        ResultSet R = pst4.executeQuery();
          ResultSetMetaData RSMD = R.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) Tmarca.getModel();
          DFT.setRowCount(0);
          
          while(R.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                v2.add(R.getString("Nume"));
                v2.add(R.getString("Prenume"));
                v2.add(R.getString("Nr_Telefon"));
                v2.add(R.getString("Vanzator"));
           
                
            }
            DFT.addRow(v2);
          }
          
        
      } 
      
      
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    }
 
  private void modelT()
    { 
      int CC;
      try{
         String m;
           m = (String)combo2.getSelectedItem();
           String sql3 = "SELECT A.Nume, A.Prenume, A.Nr_Telefon, B.Vanzator "
                         + "FROM Utilizatori A, Telefoane B "
                         + "WHERE A.Mail=B.Vanzator AND B.Model=?";
          
        pst5=con.prepareStatement(sql3);
        pst5.setString(1, m);
        ResultSet T = pst5.executeQuery();
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) modelT.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                v2.add(T.getString("Nume"));
                v2.add(T.getString("Prenume"));
                v2.add(T.getString("Nr_Telefon"));
                v2.add(T.getString("Vanzator"));
           
                
            }
            DFT.addRow(v2);
          }
          
        
      } 
      
      
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    }
  
   private void AnT()
    { 
      int CC;
      try{
         String m;
           m = (String)combo3.getSelectedItem();
           String sql3 = "SELECT A.Nume, A.Prenume, A.Nr_Telefon, B.Vanzator "
                   + "FROM Utilizatori A, Telefoane B "
                   + "WHERE A.Mail=B.Vanzator AND B.An_fabricatie=?";
          
        pst6=con.prepareStatement(sql3);
        pst6.setString(1, m);
        ResultSet T = pst6.executeQuery();
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) AnT.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                v2.add(T.getString("Nume"));
                v2.add(T.getString("Prenume"));
                v2.add(T.getString("Nr_Telefon"));
                v2.add(T.getString("Vanzator"));
           
                
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

        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        combo1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        combo3 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        combo2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tmarca = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelT = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        AnT = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel6.setText("jLabel6");

        jLabel12.setText("jLabel12");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Utilizatorii din sistem care au inregistrat telefoane");

        jLabel4.setText("Marca:");

        combo1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel7.setText("An fabricatie:");

        combo3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel13.setText("Model:");

        combo2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                combo2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        Tmarca.setForeground(new java.awt.Color(153, 0, 255));
        Tmarca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nume", "Prenume", "Nr_Telefon", "Vanzator"
            }
        ));
        Tmarca.setGridColor(new java.awt.Color(153, 153, 255));
        jScrollPane1.setViewportView(Tmarca);

        clear.setBackground(new java.awt.Color(204, 0, 255));
        clear.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        clear.setText("Clear!");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        modelT.setForeground(new java.awt.Color(153, 0, 255));
        modelT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nume", "Prenume", "Nr_Telefon", "Vanzator"
            }
        ));
        modelT.setGridColor(new java.awt.Color(153, 51, 255));
        jScrollPane2.setViewportView(modelT);

        AnT.setForeground(new java.awt.Color(153, 0, 255));
        AnT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nume", "Prenume", "Nr_Telefon", "Vanzator"
            }
        ));
        AnT.setGridColor(new java.awt.Color(153, 0, 255));
        jScrollPane3.setViewportView(AnT);

        jButton1.setBackground(new java.awt.Color(204, 0, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Licitatii!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("Next!");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67))))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(combo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(combo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(combo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void combo1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo1PopupMenuWillBecomeInvisible
         
      Tmarca();
        
          
      
    }//GEN-LAST:event_combo1PopupMenuWillBecomeInvisible

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Tmarca.setModel(new DefaultTableModel(null,new String[]{"Nume", "Prenume", "Nr_Telefon", "Vanzator"}));
        modelT.setModel(new DefaultTableModel(null,new String[]{"Nume", "Prenume", "Nr_Telefon", "Vanzator"}));
        AnT.setModel(new DefaultTableModel(null,new String[]{"Nume", "Prenume", "Nr_Telefon", "Vanzator"}));
                  
    }//GEN-LAST:event_clearActionPerformed

    private void combo2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo2PopupMenuWillBecomeInvisible
        modelT();
    }//GEN-LAST:event_combo2PopupMenuWillBecomeInvisible

    private void combo3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_combo3PopupMenuWillBecomeInvisible
        AnT();
    }//GEN-LAST:event_combo3PopupMenuWillBecomeInvisible

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLici().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSystem3().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSystem2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AnT;
    private javax.swing.JTable Tmarca;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> combo1;
    private javax.swing.JComboBox<String> combo2;
    private javax.swing.JComboBox<String> combo3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable modelT;
    // End of variables declaration//GEN-END:variables

}
