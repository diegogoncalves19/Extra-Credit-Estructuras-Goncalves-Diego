/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Diego Goncalves
 */
public class VerTiempo extends javax.swing.JFrame {
    
    private int watts;
    private int regalos;
    private int amistad;
    private int pokemonescogido;
    private long totaltime;
    private long currenttime;
    private long starttime;

    /**
     * Creates new form Tiempo
     */
    public VerTiempo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        VerTiempo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Volver.setBackground(new java.awt.Color(253, 202, 7));
        Volver.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Volver.setText("VOLVER");
        Volver.setBorder(null);
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 550, 80, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Tiempo transcurrido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 330, 80));

        VerTiempo.setBackground(new java.awt.Color(253, 202, 7));
        VerTiempo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VerTiempo.setText("VER TIEMPO");
        VerTiempo.setBorder(null);
        VerTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(VerTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/14.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        MenuPrincipal menu = new MenuPrincipal();
        menu.setWatts(getWatts());
        menu.setRegalos(getRegalos());
        menu.setAmistad(getAmistad());
        menu.setPokemonescogido(getPokemonescogido());
        menu.setStarttime(getStarttime());
        menu.setTotaltime(getTotaltime());
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void VerTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTiempoActionPerformed
        currenttime = totaltime + (System.currentTimeMillis() - starttime);
        currenttime = currenttime / 1000;
        jLabel2.setText("Tiempo transcurrido: " + currenttime + " segundos.");
    }//GEN-LAST:event_VerTiempoActionPerformed

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
            java.util.logging.Logger.getLogger(VerTiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerTiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerTiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerTiempo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerTiempo().setVisible(true);
            }
        });
    }
    
    /**
     * @return the watts
     */
    public int getWatts() {
        return watts;
    }

    /**
     * @param watts the watts to set
     */
    public void setWatts(int watts) {
        this.watts = watts;
    }
    
    /**
     * @return the regalos
     */
    public int getRegalos() {
        return regalos;
    }

    /**
     * @param regalos the regalos to set
     */
    public void setRegalos(int regalos) {
        this.regalos = regalos;
    }
    
    /**
     * @return the amistad
     */
    public int getAmistad() {
        return amistad;
    }

    /**
     * @param amistad the amistad to set
     */
    public void setAmistad(int amistad) {
        this.amistad = amistad;
    }
    
    /**
     * @return the pokemonescogido
     */
    public int getPokemonescogido() {
        return pokemonescogido;
    }

    /**
     * @param pokemonescogido the pokemonescogido to set
     */
    public void setPokemonescogido(int pokemonescogido) {
        this.pokemonescogido = pokemonescogido;
    }
    
    /**
     * @return the lasttime
     */
    public long getTotaltime() {
        return totaltime;
    }

    /**
     * @param totaltime the lasttime to set
     */
    public void setTotaltime(long totaltime) {
        this.totaltime = totaltime;
    }

    /**
     * @return the starttime
     */
    public long getStarttime() {
        return starttime;
    }

    /**
     * @param starttime the starttime to set
     */
    public void setStarttime(long starttime) {
        this.starttime = starttime;
    }    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VerTiempo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
