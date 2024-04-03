/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Goncalves
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    private int watts = 0;
    private int regalos = 0;
    private int amistad;
    private int pokemonescogido = 1;
    private long totaltime;
    private long starttime;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        Tiempo = new javax.swing.JButton();
        VerWatts = new javax.swing.JButton();
        VerTienda = new javax.swing.JButton();
        VerPokemon = new javax.swing.JButton();
        JugarMinijuegos = new javax.swing.JButton();
        GuardarJuego = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Revisar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tiempo.setBackground(new java.awt.Color(253, 202, 7));
        Tiempo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Tiempo.setText("TIEMPO");
        Tiempo.setBorder(null);
        Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 191, -1, 30));

        VerWatts.setBackground(new java.awt.Color(253, 202, 7));
        VerWatts.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VerWatts.setText("WATTS");
        VerWatts.setBorder(null);
        VerWatts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerWattsActionPerformed(evt);
            }
        });
        getContentPane().add(VerWatts, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 191, 60, 30));

        VerTienda.setBackground(new java.awt.Color(253, 202, 7));
        VerTienda.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VerTienda.setText("TIENDA");
        VerTienda.setBorder(null);
        VerTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTiendaActionPerformed(evt);
            }
        });
        getContentPane().add(VerTienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 271, -1, 30));

        VerPokemon.setBackground(new java.awt.Color(253, 202, 7));
        VerPokemon.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        VerPokemon.setText("POKÉMON");
        VerPokemon.setBorder(null);
        VerPokemon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerPokemonActionPerformed(evt);
            }
        });
        getContentPane().add(VerPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, -1, 30));

        JugarMinijuegos.setBackground(new java.awt.Color(253, 202, 7));
        JugarMinijuegos.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        JugarMinijuegos.setText("JUGAR");
        JugarMinijuegos.setBorder(null);
        JugarMinijuegos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarMinijuegosActionPerformed(evt);
            }
        });
        getContentPane().add(JugarMinijuegos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, 30));

        GuardarJuego.setBackground(new java.awt.Color(253, 202, 7));
        GuardarJuego.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        GuardarJuego.setText("GUARDAR");
        GuardarJuego.setBorder(null);
        GuardarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(GuardarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, 30));

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sprites/triste.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 270, 240));

        Revisar.setBackground(new java.awt.Color(253, 202, 7));
        Revisar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Revisar.setText("REVISAR");
        Revisar.setBorder(null);
        Revisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RevisarActionPerformed(evt);
            }
        });
        getContentPane().add(Revisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 541, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoActionPerformed
        setWatts(getWatts() + 10);
        VerTiempo tiempo = new VerTiempo();
        tiempo.setWatts(getWatts());
        tiempo.setRegalos(getRegalos());
        tiempo.setAmistad(getAmistad());
        tiempo.setPokemonescogido(getPokemonescogido());
        tiempo.setTotaltime(getTotaltime());
        tiempo.setStarttime(getStarttime());
        tiempo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_TiempoActionPerformed

    private void JugarMinijuegosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarMinijuegosActionPerformed
        
        if (regalos < 2) {
            JOptionPane.showMessageDialog(null, "No tienes suficiente regalos para jugar. Necesitas al menos 2.");
        }
        else{
            JugarCartas jugar = new JugarCartas();
            jugar.setWatts(getWatts());
            jugar.setRegalos(getRegalos());
            jugar.setAmistad(getAmistad());
            jugar.setPokemonescogido(getPokemonescogido());
            jugar.setTotaltime(getTotaltime());
            jugar.setStarttime(getStarttime());
            jugar.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_JugarMinijuegosActionPerformed

    private void GuardarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarJuegoActionPerformed
        setWatts(getWatts() + 10);
        GuardarJuego guardar = new GuardarJuego();
        guardar.setWatts(getWatts());
        guardar.setRegalos(getRegalos());
        guardar.setAmistad(getAmistad());
        guardar.setPokemonescogido(getPokemonescogido());
        guardar.setTotaltime(getTotaltime());
        guardar.setStarttime(getStarttime());
        guardar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GuardarJuegoActionPerformed

    private void VerWattsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerWattsActionPerformed
        setWatts(getWatts() + 10);
        VerWatts vwatt = new VerWatts();
        vwatt.setWatts(getWatts());
        vwatt.setRegalos(getRegalos());
        vwatt.setAmistad(getAmistad());
        vwatt.setPokemonescogido(getPokemonescogido());
        vwatt.setStarttime(getStarttime());
        vwatt.setTotaltime(getTotaltime());
        vwatt.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerWattsActionPerformed

    private void VerTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTiendaActionPerformed
        setWatts(getWatts() + 10);
        VerTienda tienda = new VerTienda();
        tienda.setWatts(getWatts());
        tienda.setRegalos(getRegalos());
        tienda.setAmistad(getAmistad());
        tienda.setPokemonescogido(getPokemonescogido());
        tienda.setTotaltime(getTotaltime());
        tienda.setStarttime(getStarttime());
        tienda.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerTiendaActionPerformed

    private void VerPokemonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerPokemonActionPerformed
        setWatts(getWatts() + 10);
        VerPokemon pokemon = new VerPokemon();
        pokemon.setWatts(getWatts());
        pokemon.setRegalos(getRegalos());
        pokemon.setAmistad(getAmistad());
        pokemon.setPokemonescogido(getPokemonescogido());
        pokemon.setStarttime(getStarttime());
        pokemon.setTotaltime(getTotaltime());
        pokemon.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VerPokemonActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    private void RevisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RevisarActionPerformed
        
        if (amistad <= 2000) {
            ImageIcon imagen = new ImageIcon("src//sprites//triste.png");
            jLabel2.setIcon(imagen);
        }
        else if (amistad > 2000 && amistad <= 4000) {
            ImageIcon imagen = new ImageIcon("src//sprites//enojado.png");
            jLabel2.setIcon(imagen);
        }
        else if (amistad > 4000 && amistad <= 6000) {
            ImageIcon imagen = new ImageIcon("src//sprites//normal.png");
            jLabel2.setIcon(imagen);
        }
        else if (amistad > 6000 && amistad <= 8000) {
            ImageIcon imagen = new ImageIcon("src//sprites//feliz.png");
            jLabel2.setIcon(imagen);
        }
        else if (amistad > 8000) {
            ImageIcon imagen = new ImageIcon("src//sprites//inspirado.png");
            jLabel2.setIcon(imagen);
        }
        
    }//GEN-LAST:event_RevisarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
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
    private javax.swing.JButton GuardarJuego;
    private javax.swing.JButton JugarMinijuegos;
    private javax.swing.JButton Revisar;
    private javax.swing.JButton Tiempo;
    private javax.swing.JButton VerPokemon;
    private javax.swing.JButton VerTienda;
    private javax.swing.JButton VerWatts;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables



}