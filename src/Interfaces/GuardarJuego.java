/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Goncalves
 */
public class GuardarJuego extends javax.swing.JFrame {
    
    private long endtime;
    private long runendtime = System.currentTimeMillis();
    private long totaltime;
    private int watts;
    private int regalos;
    private int amistad;
    private int pokemonescogido;
    private long starttime;
    private String regalosstring;

    /**
     * Creates new form GuardarJuego
     */
    public GuardarJuego() {
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jButton1.setBackground(new java.awt.Color(253, 202, 7));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 550, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 530, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

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
        menu.setRegalosstring(getRegalosstring());
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        endtime = totaltime + (runendtime - starttime);
        
        jTextArea1.setText(Integer.toString(watts) + "\n" + Integer.toString(regalos) + "\n" + Integer.toString(amistad) + "\n" + Integer.toString(pokemonescogido) + "\n" + String.valueOf(endtime) + "\n" + regalosstring);
        
        try {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("src//archivotxt//datos.txt"))) {
                writer.write(jTextArea1.getText());
                JOptionPane.showMessageDialog(null, "Datos guardados con éxito.");
            }
        } catch (IOException ex) {
            Logger.getLogger(GuardarJuego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GuardarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuardarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuardarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuardarJuego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuardarJuego().setVisible(true);
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
     * @return the endtime
     */
    public long getEndtime() {
        return endtime;
    }

    /**
     * @param endtime the endtime to set
     */
    public void setEndtime(long endtime) {
        this.endtime = endtime;
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

    /**
     * @return the regalosstring
     */
    public String getRegalosstring() {
        return regalosstring;
    }

    /**
     * @param regalosstring the regalosstring to set
     */
    public void setRegalosstring(String regalosstring) {
        this.regalosstring = regalosstring;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}
