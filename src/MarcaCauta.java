
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


public class MarcaCauta extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
 
   
  
 
    
    public MarcaCauta() {
         con = DBConnection.ConnectionDB();
         initComponents();
  
         Numar();
         Tabel2();
    }

    
     private void Numar()
    { 
      int CC;
      try{
           
           String sql1 = "SELECT COUNT(T.Telefon_ID) AS NumarLicitatii, M.Marca, M.Detalii"
                        + "FROM  Telefoane T, Marci M "
                        + "WHERE  M.Marca=T.Marca "
                        + "GROUP BY M.Marca"
                        + "HAVING NumarLicitatii;";
                   
        pst1=con.prepareStatement(sql1);
        ResultSet R = pst1.executeQuery();
          ResultSetMetaData RSMD = R.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) t1.getModel();
          DFT.setRowCount(0);
          
          while(R.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
                
                v2.add(R.getString("NumarLicitatii"));
                v2.add(R.getString("Marca"));
                v2.add(R.getString("Detalii"));
                
                
            }
            DFT.addRow(v2);
          }
          
        
      } 
      
      
      
     catch(Exception e){
     System.out.println("Tabel neafisat!" + e);
     
     } 
    }
    
    
   
     private void Tabel2()
    { 
      int CC;
      try{
           
           String sql2 ="SELECT U.Utilizator_ID, M.Marca, M.Detalii, L.Data AS Data"
                   + "FROM Utilizatori U, Telefoane T, Marci M , Licitatii L"
                   + "WHERE U.Mail=T.Vanzator AND T.Marca=M.Marca AND T.Telefon_ID=L.Telefon_ID AND Data>'11/10/2022'"
                   + "ORDER BY  U.Utilizator_ID;";
          
          pst2=con.prepareStatement(sql2);
          ResultSet R = pst2.executeQuery();
          ResultSetMetaData RSMD = R.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) tabel2.getModel();
          DFT.setRowCount(0);
          
          while(R.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
               
                v2.add(R.getString("Utilizator_ID"));  
                v2.add(R.getString("Marca"));
                v2.add(R.getString("Detalii"));
                v2.add(R.getString("Data"));
           
                
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

        jScrollPane5 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t1.setForeground(new java.awt.Color(204, 0, 255));
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NumarLicitatii", "Marca", "Detalii Marca"
            }
        ));
        t1.setGridColor(new java.awt.Color(204, 51, 255));
        jScrollPane5.setViewportView(t1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 255));
        jLabel7.setText("Numarul de licitatii dupa marca:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Detalii despre marcile de telefoane in ordine datei inregistrarii: ");

        tabel2.setForeground(new java.awt.Color(153, 0, 255));
        tabel2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Utilizator_ID", "Marca", "Detalii", "Data"
            }
        ));
        tabel2.setGridColor(new java.awt.Color(153, 0, 255));
        jScrollPane1.setViewportView(tabel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Marci de telefoane");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(jLabel1)))
                .addGap(147, 541, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaCauta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable t1;
    private javax.swing.JTable tabel2;
    // End of variables declaration//GEN-END:variables
}
