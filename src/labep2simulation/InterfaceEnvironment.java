/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labep2simulation;

/**
 *
 * @author Olivier
 */
public class InterfaceEnvironment extends javax.swing.JFrame {
    public Environment world;
    /**
     * Creates new form InterfazCliente
     */
    public InterfaceEnvironment() {
        initComponents();
        btnSkipDay.setEnabled(false);
        btnSkip10Days.setEnabled(false);
        btnShowDetails.setEnabled(false);
        btnInvasionZombie.setEnabled(false);
        btnGlobalCooling.setEnabled(false);
        btnGlobalWarming.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblGame = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnShowDetails = new javax.swing.JButton();
        btnSkip10Days = new javax.swing.JButton();
        btnSkipDay = new javax.swing.JButton();
        btnGlobalWarming = new javax.swing.JButton();
        btnGlobalCooling = new javax.swing.JButton();
        btnInvasionZombie = new javax.swing.JButton();
        lblDay = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        lblGame.setFont(new java.awt.Font("Viner Hand ITC", 1, 24)); // NOI18N
        lblGame.setForeground(new java.awt.Color(255, 0, 0));
        lblGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGame.setText("INVASIÓN");

        btnStart.setText("Creación");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnShowDetails.setText("Mostrar Detalles");
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
            }
        });

        btnSkip10Days.setText("Saltar 10 días");
        btnSkip10Days.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkip10DaysActionPerformed(evt);
            }
        });

        btnSkipDay.setText("Saltar un día");
        btnSkipDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkipDayActionPerformed(evt);
            }
        });

        btnGlobalWarming.setText("Calentamiento Global ");
        btnGlobalWarming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlobalWarmingActionPerformed(evt);
            }
        });

        btnGlobalCooling.setText("Enfriamiento Global");
        btnGlobalCooling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlobalCoolingActionPerformed(evt);
            }
        });

        btnInvasionZombie.setText("Invasión de Zombies");
        btnInvasionZombie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvasionZombieActionPerformed(evt);
            }
        });

        lblDay.setBackground(new java.awt.Color(153, 153, 153));
        lblDay.setForeground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGlobalWarming)
                        .addGap(18, 18, 18)
                        .addComponent(btnGlobalCooling))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnStart)
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSkipDay, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInvasionZombie)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDay)
                            .addComponent(btnExit))))
                .addGap(27, 27, 27))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnShowDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSkip10Days)
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGame)
                    .addComponent(lblDay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit)
                            .addComponent(btnStart))
                        .addGap(0, 81, Short.MAX_VALUE))
                    .addComponent(btnSkipDay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnShowDetails)
                    .addComponent(btnSkip10Days))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGlobalWarming)
                    .addComponent(btnGlobalCooling)
                    .addComponent(btnInvasionZombie))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSkipDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkipDayActionPerformed
        // TODO add your handling code here:
        skipDay();
        updateDateTxtField();
    }//GEN-LAST:event_btnSkipDayActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        world = new Environment();
        world.resetGame();
        updateDateTxtField();
        btnSkipDay.setEnabled(true);
        btnSkip10Days.setEnabled(true);
        btnShowDetails.setEnabled(true);
        btnInvasionZombie.setEnabled(true);
        btnGlobalCooling.setEnabled(true);
        btnGlobalWarming.setEnabled(true);
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        DetailsWindow dw = new DetailsWindow(world);
        dw.setVisible(true);
    }//GEN-LAST:event_btnShowDetailsActionPerformed

    private void btnSkip10DaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkip10DaysActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < 10; i++)
            skipDay();  
        updateDateTxtField();
    }//GEN-LAST:event_btnSkip10DaysActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGlobalWarmingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlobalWarmingActionPerformed
        // TODO add your handling code here:
        world.changeTemperature(10);
        
    }//GEN-LAST:event_btnGlobalWarmingActionPerformed

    private void btnGlobalCoolingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlobalCoolingActionPerformed
        // TODO add your handling code here:
        world.changeTemperature(-10);
    }//GEN-LAST:event_btnGlobalCoolingActionPerformed

    private void btnInvasionZombieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvasionZombieActionPerformed
        // TODO add your handling code here:
        world.setZombieChanceToCatchHuman(0.3333);
    }//GEN-LAST:event_btnInvasionZombieActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEnvironment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEnvironment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGlobalCooling;
    private javax.swing.JButton btnGlobalWarming;
    private javax.swing.JButton btnInvasionZombie;
    private javax.swing.JButton btnShowDetails;
    private javax.swing.JButton btnSkip10Days;
    private javax.swing.JButton btnSkipDay;
    private javax.swing.JButton btnStart;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblGame;
    // End of variables declaration//GEN-END:variables
    
    
    /* EXTRA METHODS USED FOR WHEN BUTTONS ARE CLICKED */
    
    public void skipDay()
    {   /*  Important!! The order you put the methods decides what happens, change climate first can have effect on reproduction.
            Making zombies after reproduction can cause babies to become immidiately zombies. It depends a little bit on
            what the client (=teacher) expect us to do.. Start making copies of the previous days and passing these as 
            parameters is not really my favorite option tbh                     
        */
        world.addDay();
        world.dayOfHumans();
        world.dayOfVampires();
        world.dayOfZombie();
        world.changeClimate();
        
        //All characters with flag dying == true will die
        world.charactersDying();
        
    }
    public void updateDateTxtField()
    {
        lblDay.setText("Día: " + world.getDay());
    }
}
