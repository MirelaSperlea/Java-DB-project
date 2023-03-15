/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package licitatiitelefoane;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class AdminSys extends javax.swing.JFrame {
    Connection con = null;
  
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    PreparedStatement pst3 = null;
    PreparedStatement pst4 = null;
    
    ResultSet rs = null;
    //ResultSet rss = null;
   
   
    public AdminSys() {
         initComponents();
         con = DBConnection.ConnectionDB();
         adminTTable();
    }
    
    private void adminTTable()
    { 
      int CC;
      try{
          String sql = "SELECT * FROM Utilizatori";
          pst1 = con.prepareStatement(sql);
          ResultSet T = pst1.executeQuery();
          
          ResultSetMetaData RSMD = T.getMetaData();
          CC = RSMD.getColumnCount();
          DefaultTableModel DFT = (DefaultTableModel) adminT.getModel();
          DFT.setRowCount(0);
          
          while(T.next()){
          
            Vector v2 = new Vector();
            
            for (int i=1; i<CC; i++) {
                v2.add(T.getString("Utilizator_ID"));
                v2.add(T.getString("Mail"));
                v2.add(T.getString("Parola"));
                v2.add(T.getString("Nume"));
                v2.add(T.getString("Prenume"));
                v2.add(T.getString("Data_Nasterii"));
                v2.add(T.getString("Nr_Telefon"));
                
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

        jLabel1 = new javax.swing.JLabel();
        upbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminT = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        par = new javax.swing.JTextField();
        nume = new javax.swing.JTextField();
        pre = new javax.swing.JTextField();
        nr = new javax.swing.JTextField();
        data = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        insertbtn = new javax.swing.JButton();
        idU = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 102, 255));
        jLabel1.setText("Info System");

        upbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        upbtn.setForeground(new java.awt.Color(153, 0, 255));
        upbtn.setText("UPDATE!");
        upbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upbtnActionPerformed(evt);
            }
        });

        delbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delbtn.setForeground(new java.awt.Color(153, 0, 255));
        delbtn.setText("DELETE!");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        adminT.setBackground(new java.awt.Color(204, 204, 255));
        adminT.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adminT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Utilizatori_ID", "Mail", "Parola", "Nume", "Prenume", "Data_Nasterii", "Nr_Telefon"
            }
        ));
        adminT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(adminT);

        jLabel4.setForeground(new java.awt.Color(153, 51, 255));
        jLabel4.setText("Mail:");

        jLabel6.setForeground(new java.awt.Color(153, 0, 255));
        jLabel6.setText("Parola:");

        jLabel7.setForeground(new java.awt.Color(153, 0, 255));
        jLabel7.setText("Nume:");

        jLabel8.setForeground(new java.awt.Color(153, 0, 255));
        jLabel8.setText("Prenume:");

        jLabel9.setForeground(new java.awt.Color(153, 0, 255));
        jLabel9.setText("Numar Telefon:");

        jLabel10.setForeground(new java.awt.Color(153, 0, 255));
        jLabel10.setText("Data Nasterii:");

        insertbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertbtn.setForeground(new java.awt.Color(153, 0, 255));
        insertbtn.setText("INSERT!");
        insertbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbtnActionPerformed(evt);
            }
        });

        idU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idUActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Utilizator_ID");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 51, 255));
        jButton1.setText("Next!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("Utilizatorii din sistem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(insertbtn)
                        .addGap(18, 18, 18)
                        .addComponent(upbtn)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(277, 277, 277))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(2, 2, 2)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(nr, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(par, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(idU, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(idU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(par, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void upbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upbtnActionPerformed
         
      try{
      
      String value1 = idU.getText();
      String value2 = mail.getText();
      String value3 = par.getText();
      String value4 = nume.getText();
      String value5 = pre.getText();
      String value6 = data.getText();
      String value7 = nr.getText();
     
      
      String query = "update Utilizatori SET Utilizator_ID = '"+value1+"', Mail='"+value2+"', Parola= '"+value3+"', Nume='"+value4
                      +"', Prenume='"+value5+"', Data_Nasterii='"+value6+"', Nr_Telefon='"+value7+"' where Utilizator_ID='"+value1+"'" ;
  
            pst3 = con.prepareStatement(query);
            pst3.execute();
            
            JOptionPane.showMessageDialog(null, "Modificarea a avut loc!");
            
             adminTTable();
             
             idU.setText("");
             mail.setText("");
             par.setText("");
             nume.setText("");
             pre.setText("");
             data.setText("");
             nr.setText("");
  
     }
     
     catch(Exception e){
         
       System.out.println("Modificarea nu a avut loc!" + e);
     
     }   
    }//GEN-LAST:event_upbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
       
          try{

           //Class.forName("org.sqlite.JDBC");
          //  Connection con = DriverManager.getConnection("jdbc:sqlite:LicitatiiTelefoane_DB.db");
            int row =adminT.getSelectedRow();
            String value =(adminT.getModel().getValueAt(row,0).toString());

            String q3 = "DELETE FROM Utilizatori where Utilizator_ID="+value;

            pst4 = con.prepareStatement(q3);
            pst4.execute();

            DefaultTableModel DFT = (DefaultTableModel) adminT.getModel();
            DFT.setRowCount(0);

            
            JOptionPane.showMessageDialog(null, "Stergerea a avut loc!");
            adminTTable();
            
            idU.setText("");
            mail.setText("");
            par.setText("");
            nume.setText("");
            pre.setText("");
            data.setText("");
            nr.setText("");
            
        }
        
        
        
      catch(Exception e){
       //System.out.println("Modificarea nu a avut loc!" + e);
       JOptionPane.showMessageDialog(null,e);
      }
        
        
        
    }//GEN-LAST:event_delbtnActionPerformed

    private void adminTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTMouseClicked
        
        DefaultTableModel DFT = (DefaultTableModel) adminT.getModel();
        int selectedIntex = adminT.getSelectedRow();
        
        idU.setText(DFT.getValueAt(selectedIntex, 0).toString());
        mail.setText(DFT.getValueAt(selectedIntex, 1).toString());
        par.setText(DFT.getValueAt(selectedIntex, 2).toString());
        nume.setText(DFT.getValueAt(selectedIntex, 3).toString());
        pre.setText(DFT.getValueAt(selectedIntex, 4).toString());
        data.setText(DFT.getValueAt(selectedIntex, 5).toString()); 
        nr.setText(DFT.getValueAt(selectedIntex, 6).toString());
             
             
        
        
    }//GEN-LAST:event_adminTMouseClicked

    private void insertbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbtnActionPerformed
           try{ 
              // Class.forName("org.sqlite.JDBC");
              // Connection con = DriverManager.getConnection("jdbc:sqlite:LicitatiiTelefoane_DB.db");
               String q = "INSERT INTO Utilizatori VALUES (?, ?, ?, ?, ?, ?, ?);";
     
              pst3 = con.prepareStatement(q);
    
              pst3.setString(2, mail.getText());
              pst3.setString(3, par.getText());
              pst3.setString(4, nume.getText());
              pst3.setString(5, pre.getText());
              pst3.setString(6, data.getText());
              pst3.setString(7, nr.getText());
     
     
             pst3.execute();
             System.out.println("O nou utilizator este adaugat!");
             JOptionPane.showMessageDialog(null, "Utilizatorul a fost adaugat!");
             adminTTable();
             idU.setText("");
             mail.setText("");
             par.setText("");
             nume.setText("");
             pre.setText("");
             data.setText("");
             nr.setText("");
     }
           
           
           catch(Exception e){
           System.out.println("Adaugarea nu a avut loc!" + e);
     
     }  
    }//GEN-LAST:event_insertbtnActionPerformed

    private void idUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSystem2().setVisible(true);
            }
              });
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminSys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminT;
    private javax.swing.JTextField data;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextField idU;
    private javax.swing.JButton insertbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nr;
    private javax.swing.JTextField nume;
    private javax.swing.JTextField par;
    private javax.swing.JTextField pre;
    private javax.swing.JButton upbtn;
    // End of variables declaration//GEN-END:variables

    
    }

