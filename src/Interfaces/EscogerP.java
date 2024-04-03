/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Windows Pro
 */
public class EscogerP extends javax.swing.JFrame {
    
    private int amistad;
    private int pokemonescogido;
    long starttime;

    /**
     * Creates new form EscogerP
     */
    public EscogerP() {
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

        Pikachu = new javax.swing.JButton();
        Pachirisu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Pikachu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Pikachu.setBackground(new java.awt.Color(253, 202, 7));
        Pikachu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Pikachu.setText("PIKACHU");
        Pikachu.setBorder(null);
        Pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PikachuActionPerformed(evt);
            }
        });
        getContentPane().add(Pikachu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, 20));

        Pachirisu.setBackground(new java.awt.Color(253, 202, 7));
        Pachirisu.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Pachirisu.setText("PACHIRISU");
        Pachirisu.setBorder(null);
        Pachirisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PachirisuActionPerformed(evt);
            }
        });
        getContentPane().add(Pachirisu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Escoge tu pokemon para empezar!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/15.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        Pikachu1.setBackground(new java.awt.Color(253, 202, 7));
        Pikachu1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Pikachu1.setText("PIKACHU");
        Pikachu1.setBorder(null);
        Pikachu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pikachu1ActionPerformed(evt);
            }
        });
        getContentPane().add(Pikachu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 90, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PikachuActionPerformed
        pokemonescogido = 1;
        MenuPrincipal menu = new MenuPrincipal();
        menu.setAmistad(getAmistad());
        menu.setStarttime(getStarttime());
        menu.setPokemonescogido(pokemonescogido);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PikachuActionPerformed

    private void PachirisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PachirisuActionPerformed
        pokemonescogido = 3;
        MenuPrincipal menu = new MenuPrincipal();
        menu.setAmistad(getAmistad());
        menu.setStarttime(getStarttime());
        menu.setPokemonescogido(pokemonescogido);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PachirisuActionPerformed

    private void Pikachu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pikachu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pikachu1ActionPerformed

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
            java.util.logging.Logger.getLogger(EscogerP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscogerP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscogerP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscogerP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscogerP().setVisible(true);
            }
        });
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pachirisu;
    private javax.swing.JButton Pikachu;
    private javax.swing.JButton Pikachu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
