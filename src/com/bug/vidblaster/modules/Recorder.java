/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bug.vidblaster.modules;

import com.bug.vidblaster.api.Vidblaster;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Recorder {
    public void record(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("recorder "+plNum, "record", "true");
    }   
    public void stop(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("recorder "+plNum, "stop", "true");
    }   
    public String getTime(Vidblaster hvb, int plNum) throws IOException, InterruptedException{
        return hvb.apiread("recorder "+plNum, "time");
    }   
}
