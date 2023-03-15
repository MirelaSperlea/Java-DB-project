
package licitatiitelefoane;


public class Meniu extends javax.swing.JFrame {

    
    public Meniu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NumeApp = new javax.swing.JLabel();
        cumpara = new javax.swing.JButton();
        vinde = new javax.swing.JButton();
        btLog = new javax.swing.JButton();
        btRegi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        cautabt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 255));

        NumeApp.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        NumeApp.setForeground(new java.awt.Color(204, 153, 255));
        NumeApp.setText("MobileAuction");

        cumpara.setText("Liciteaza!");
        cumpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cumparaActionPerformed(evt);
            }
        });

        vinde.setText("Vinde!");
        vinde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vindeActionPerformed(evt);
            }
        });

        btLog.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btLog.setText("Log in!");
        btLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogActionPerformed(evt);
            }
        });

        btRegi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btRegi.setText("Sign up!");
        btRegi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegiActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("     Site-ul MobileAuction se adreseaza atat persoanelor care isi doresc sa vand un telefon, \ncat si celor care vor sa cumpere un telefon mobil.\n\n      Pe site se regasesc peste sase marci de tefefoane mobile, cu cele mai noi tehnologivi, dar si \nprimele modele aparute, astfel si colectionarii sunt invitati sa acceseze pagina noastra.\n");
        jScrollPane1.setViewportView(jTextArea1);

        cautabt.setText("Cauta!");
        cautabt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cautabtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btLog, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btRegi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(NumeApp)
                        .addGap(370, 370, 370))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cumpara, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vinde, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cautabt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btLog)
                            .addComponent(btRegi)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(NumeApp)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(vinde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cumpara, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cautabt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogActionPerformed
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
      
    }//GEN-LAST:event_btLogActionPerformed

    private void btRegiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegiActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
        
        
    }//GEN-LAST:event_btRegiActionPerformed

    private void vindeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vindeActionPerformed
                                             
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vinde().setVisible(true);
             }
         });
    }//GEN-LAST:event_vindeActionPerformed

    private void cautabtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cautabtActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MarcaCauta().setVisible(true);
             }
         });
    }//GEN-LAST:event_cautabtActionPerformed

    private void cumparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cumparaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cumparaa().setVisible(true);
            }
        });
    }//GEN-LAST:event_cumparaActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Meniu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NumeApp;
    private javax.swing.JButton btLog;
    private javax.swing.JButton btRegi;
    private javax.swing.JButton cautabt;
    private javax.swing.JButton cumpara;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton vinde;
    // End of variables declaration//GEN-END:variables
}
