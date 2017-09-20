/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bug.vidblaster.modules;

import com.bug.vidblaster.api.Vidblaster;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author admin
 * Player Pins
 */

public class Player {
    
    public void play(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("player "+plNum, "play", "true");
    }
   
    public void pause(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("player "+plNum, "pause", "true");
    }
   
    public void stop(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("player "+plNum, "stop", "true");
    }    
    
    public void setFile(Vidblaster hvb, int plNum, File file) throws IOException{
        hvb.apiwrite("player "+plNum, "file", file.getAbsolutePath());
    }   
    
    public String getFile(Vidblaster hvb, int plNum) throws IOException, InterruptedException{
        return hvb.apiread("player "+plNum, "file");
    }   
    
    public String playing(Vidblaster hvb, int plNum) throws IOException, InterruptedException{
        return hvb.apiread("player "+plNum, "playing");
    }   

    public void setPosition(Vidblaster hvb, int plNum, long pos) throws IOException{
        String sPos;
        if(pos<=100) {
            sPos=String.valueOf(pos)+"%";
        } else {
            sPos=String.valueOf(pos)+"ms";  
        }
        hvb.apiwrite("player "+plNum, "position", sPos);
    }   
    
    
}
