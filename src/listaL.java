
package licitatiitelefoane;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;


public class listaL extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst6 = null;
   
    
    
     public listaL() {
       initComponents();
       con = DBConnection.ConnectionDB();
       table_L();
    }
    
    private void table_L()
    { 
      int CC;
      try{
          String sql = "SELECT * FROM Licitatii";
          pst6 = con.prepareStatement(sql);
          ResultSet T = pst6.executeQuery();
          
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) tabelL1.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
                v2.add(T.getString("Licitatie_ID"));
                v2.add(T.getString("Nume_Licitatie"));
                v2.add(T.getString("Telefon_ID"));
                v2.add(T.getString("Vanzator"));
                v2.add(T.getString("Data"));
                v2.add(T.getString("Durata"));
                v2.add(T.getString("Pret"));
                
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabelL1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabelL1.setBackground(new java.awt.Color(204, 204, 255));
        tabelL1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabelL1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Licitatie_ID", "Nume_Licitatie", "Telefon_ID", "Vanzator", "Data", "Durata", "Pret"
            }
        ));
        jScrollPane2.setViewportView(tabelL1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new listaL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelL1;
    // End of variables declaration//GEN-END:variables
}
