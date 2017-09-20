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
public class Switcher {
    public void autoExecute(Vidblaster hvb, String SwitchLine, File file) throws IOException{
        hvb.apiwrite(SwitchLine, "auto", "true");
    }   
    public Boolean ready(Vidblaster hvb, String SwitchLine) throws IOException, InterruptedException{
        if(hvb.apiread(SwitchLine, "ready").equals("true")){
            return true;
        }else{
            return false;
        }
    }   
    public void select(Vidblaster hvb, String SwitchLine, String sources) throws IOException{
        hvb.apiwrite(SwitchLine, "select", sources);
    }
    public String[] selected(Vidblaster hvb, String SwitchLine, File file) throws IOException, InterruptedException{
        return hvb.apiread(SwitchLine, "selected").split(",");
    }
    public void take(Vidblaster hvb, String SwitchLine) throws IOException{
        hvb.apiwrite(SwitchLine, "take", "true");
    }
    public void setTime(Vidblaster hvb, String SwitchLine, long milliseconds) throws IOException{
        hvb.apiwrite(SwitchLine, "time", String.valueOf(milliseconds));
    }
    public long getTime(Vidblaster hvb, String SwitchLine) throws IOException, InterruptedException{
        return Long.parseLong(hvb.apiread(SwitchLine, "time"));
    }
}
