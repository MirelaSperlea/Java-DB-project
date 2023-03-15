
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




public class LiciSystem extends javax.swing.JFrame {
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

    public LiciSystem() {
        initComponents();
        con = DBConnection.ConnectionDB();
       // Fillcombo1();
        multeL();
       // Lici();
        maxL();
    }

    /*
    private void Fillcombo1(){ 
        
    try{
        String sql1="select * from Licitatii";
        pst1=con.prepareStatement(sql1);
        rs1=pst1.executeQuery();
        while(rs1.next()){
        String id = rs1.getString("Licitatie_ID");
        combo1.addItem(id);
        }
        
    }
    
    catch(Exception e)
       { JOptionPane.showMessageDialog(null,e);
       
       }
    }
    */
    private void multeL()
    { 
      int CC;
      try{
         
           String sql1 = "SELECT U.Utilizator_ID,U.Nume,U.Prenume,Count(L.Licitatie_ID) as NrLicitatii "
                   +      "FROM Utilizatori U, Licitatii L "
                   +      "WHERE U.Mail=L.Vanzator "
                   +      "GROUP BY U.Utilizator_ID "
                   +      "HAVING NrLicitatii>1";
          
        pst1=con.prepareStatement(sql1);
        ResultSet R = pst1.executeQuery();
          ResultSetMetaData RSMD = R.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) t1.getModel();
          DFT.setRowCount(0);
          
          while(R.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                v2.add(R.getString("Utilizator_ID"));
                v2.add(R.getString("Nume"));
                v2.add(R.getString("Prenume"));
                v2.add(R.getString("NrLicitatii"));
           
                
            }
            DFT.addRow(v2);
          }
      } 
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    }
/*
  private void Lici()
    { 
      int CC;
      try{ 
          String m;
           m = (String)combo1.getSelectedItem();
       
           String sql2 = "SELECT Utilizator_ID,Nume,Prenume,Nr_Telefon,Pret_Licitat"
                   +      "FROM Utilizatori,Utilizator_Licitatie "
                   +      "WHERE (Utilizatori.Mail=Utilizator_Licitatie.Licitator)"/// AND (L.Licitatie_ID=Utilizator_Licitatie.Licitatie_ID) "
                   +      "GROUP BY Utilizatori.Utilizator_ID"
                   +      "HAVING Utilizator_Licitatie.Licitatie_ID=?";
          
        pst2=con.prepareStatement(sql2);
        pst2.setString(1, m);
        ResultSet T = pst2.executeQuery();
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) t2.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                
                v2.add(T.getString("Utilizator_ID"));
                v2.add(T.getString("Nume"));
                v2.add(T.getString("Prenume"));
                v2.add(T.getString("Nr_Telefon"));
                v2.add(T.getString("Pret_Licitat"));
         
          
            }
            DFT.addRow(v2);
          }
          
        
      } 
      
      
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    }
  */
   private void maxL()
    { 
      int CC;
      try{
          
          String sql3 = "SELECT LF.Licitatie_ID,L.Vanzator,LF.Cumparator,U.Nume,U.Prenume,U.Nr_Telefon,LF.Pret_Final "
                  + "     FROM Utilizatori U,Licitatii L, Licitatii_Finalizate LF "
                  + "     WHERE U.Mail=LF.Cumparator AND L.Licitatie_ID=LF.Licitatie_ID";
          
        pst3=con.prepareStatement(sql3);
        ResultSet T = pst3.executeQuery();
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) t3.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
                
                v2.add(T.getString("Licitatie_ID"));
                v2.add(T.getString("Vanzator"));
                v2.add(T.getString("Cumparator"));
                v2.add(T.getString("Nume"));
                v2.add(T.getString("Prenume"));
                v2.add(T.getString("Nr_Telefon"));
                v2.add(T.getString("Pret_Final"));
                
           
                
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t3 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setText("Afiseaza informatii despre utilizatorii:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Care au licitat cu cel mai mare pret ");

        t3.setForeground(new java.awt.Color(153, 51, 255));
        t3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Licitatie_ID", "Vanzator", "Cumparator", "Nume", "Prenume", "Numar Telefon", "Pret Licitat"
            }
        ));
        t3.setGridColor(new java.awt.Color(153, 0, 255));
        jScrollPane2.setViewportView(t3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("Cu mai multe licitatii in sistem");

        t1.setForeground(new java.awt.Color(153, 0, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Utilizator_ID", "Nume", "Prenume", "Numar Licitatii"
            }
        ));
        t1.setGridColor(new java.awt.Color(153, 51, 255));
        jScrollPane3.setViewportView(t1);

        jButton1.setText("Back!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(481, 481, 481)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSys().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSystem4().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LiciSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable t1;
    private javax.swing.JTable t3;
    // End of variables declaration//GEN-END:variables
}
