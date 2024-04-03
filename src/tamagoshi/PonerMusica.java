/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tamagoshi;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author Diego Goncalves
 */
public class PonerMusica {
    
    public void TocarMusica(String filepath) throws UnsupportedAudioFileException, IOException, LineUnavailableException{
        File musicpath = new File(filepath);
        
        if (musicpath.exists()) {
            
            AudioInputStream audioinput = AudioSystem.getAudioInputStream(musicpath);
            Clip clip = AudioSystem.getClip();
            clip.open(audioinput);
            clip.start();
        }
        else{
            System.out.println("No se encuentra el archivo.");
        }
    }
}
