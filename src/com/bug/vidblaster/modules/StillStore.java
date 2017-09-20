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
 */
public class StillStore {
    public final String pin_VideoDevice="videosource";
    public void setVideoDivice(Vidblaster hvb, int doNum, String videodivice) throws IOException{
        hvb.apiwrite("still store "+doNum, this.pin_VideoDevice, videodivice);
    }
    public void grab(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("still store "+plNum, "grab", "true");
    }    
    public void setFile(Vidblaster hvb, int plNum, File file) throws IOException{
        hvb.apiwrite("still store "+plNum, "file", file.getAbsolutePath());
    }   
    public String getFile(Vidblaster hvb, int plNum) throws IOException, InterruptedException{
        return hvb.apiread("still store "+plNum, "file");
    }   
}
