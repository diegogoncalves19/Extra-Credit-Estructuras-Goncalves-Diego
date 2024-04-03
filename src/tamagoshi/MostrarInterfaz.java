/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamagoshi;

import Interfaces.Inicio;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Diego Goncalves
 */
public class MostrarInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {        

        String filepath = "2-14 Friendly Shop.wav";
        PonerMusica musica = new PonerMusica();
        musica.TocarMusica(filepath);
        Inicio inicio = new Inicio();
        inicio.show(true);        
    }
}
