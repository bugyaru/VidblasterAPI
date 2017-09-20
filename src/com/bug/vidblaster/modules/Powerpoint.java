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
public class Powerpoint {   
    public void setFile(Vidblaster hvb, int plNum, File file) throws IOException{
        hvb.apiwrite("powerpoint "+plNum, "file", file.getAbsolutePath());
    }   
    public void next(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("powerpoint "+plNum, "next", "true");
    }   
    public void prev(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("powerpoint "+plNum, "prev", "true");
    }   
    public String getFile(Vidblaster hvb, int plNum) throws IOException, InterruptedException{
        return hvb.apiread("powerpoint "+plNum, "file");
    }   
}
