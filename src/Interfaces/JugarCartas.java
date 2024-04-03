/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Goncalves
 */
public class JugarCartas extends javax.swing.JFrame {
    
    private int watts;
    private int regalos;
    private int amistad;
    private int pokemonescogido;
    private long totaltime;
    private long starttime;

    /**
     * Creates new form JugarMinijuegos
     */
    public JugarCartas() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

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

        jTextArea1.setBackground(new java.awt.Color(170, 209, 250));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\tBienvenido al juego de cartas! \n\nInstrucciones:\n\nEl pokémon va a escoger una carta que va desde el 1 hasta el 13 y\nte la va a mostrar. Después el pokémon va a escoger una segunda\ncarta y tendrás que adivinar si es mayor o menor que la primera. Si\naciertas, te ganas el doble de watts que apostaste. También podras\nperderlos todos pero a su vez obtener unos puntos de amistad con \ntu pokémon.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 560, 250));
        getContentPane().add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Ingresa los watts que quiere apostar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jButton1.setBackground(new java.awt.Color(253, 202, 7));
        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setText("JUGAR");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 550, 70, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/10.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 600));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int wattsapostados = (int) jSpinner1.getValue();
        
        EscogerCarta(wattsapostados, getPokemonescogido(), getWatts(), getAmistad());
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
            java.util.logging.Logger.getLogger(JugarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JugarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JugarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JugarCartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JugarCartas().setVisible(true);
            }
        });
    }
    
    public void EscogerCarta(int wattsapostados, int pokemonescogido, int watts, int amistad){
        if (pokemonescogido == 3) {
            JOptionPane.showMessageDialog(null, "No tiene este pokemon todavía.");
        }
        else if (wattsapostados > watts) {
            JOptionPane.showMessageDialog(null, "No tienes los suficientes watts para apostar.");
        }
        else{
            Random random = new Random();
            
            int num1 = random.nextInt(13)+1;
            
            JOptionPane.showMessageDialog(null, "El primer número que escogio el pokémon fue " + num1);
            
            int num2 = random.nextInt(13)+1;
            
            String respuesta = JOptionPane.showInputDialog("Escoge si el siguiente número va a ser mayor o menor: ");
            
            if ("menor".equals(respuesta)) {
                               
                if (num2 < num1) {
                    JOptionPane.showMessageDialog(null, "El número es " + num2 + ". Acertaste!");
                    watts += (wattsapostados * 2);
                    setWatts(watts);
                }else{
                    JOptionPane.showMessageDialog(null, "El número es " + num2 + ". Fallaste!");
                    watts -= wattsapostados;
                    amistad += wattsapostados;
                    setWatts(watts);
                    setAmistad(amistad);
                }
            }
            else if ("mayor".equals(respuesta)) {
                
                if (num2 > num1) {
                    JOptionPane.showMessageDialog(null, "El número es " + num2 + ". Acertaste!");
                    watts += (wattsapostados * 2);
                    setWatts(watts);
                }else{
                    JOptionPane.showMessageDialog(null, "El número es " + num2 + ". Fallaste!");
                    watts -= wattsapostados;
                    amistad += wattsapostados;
                    setWatts(watts);
                    setAmistad(amistad);
                }
            }
        }
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
    private javax.swing.JButton Volver;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
