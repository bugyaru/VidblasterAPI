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
 * Pin

file
Loads graphic file, value parameter is text string with name of the file.

off
Executes the off command, identical to pressing the Off button. Value parameter is ignored.

on
Executes the on command, identical to pressing the On button. Value parameter is ignored.

scoreteam1
Sets the score for team 1, value parameter is text string with score.

scoreteam1x
Sets the x coordinate of the score for team 1, value parameter is text string with coordinate.

scoreteam1y
Sets the y coordinate of the score for team 1, value parameter is text string with coordinate.

scoreteam2
Sets the score of team 2, value parameter is text string with score.

scoreteam2x
Sets the x coordinate of the score for team 2, value parameter is text string with coordinate.

scoreteam2y
Sets the y coordinate of the score for team 2, value parameter is text string with coordinate.

team1
Sets the name of team 1, value parameter is text string with name.

team1x
Sets the x coordinate of the name for team 1, value parameter is text string with coordinate.

team1y
Sets the y coordinate of the name for team 1, value parameter is text string with coordinate.

team2
Sets the name of team 2, value parameter is text string with name.

team2x
Sets the x coordinate of the name for team 2, value parameter is text string with coordinate.

team2y
Sets the y coordinate of the name for team 2, value parameter is text string with coordinate.

 */
public class Scoreboard {
    public void on(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "on", "true");
    }    
    public void off(Vidblaster hvb, int plNum) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "off", "true");
    }    
    public void setFile(Vidblaster hvb, int plNum, File file) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "file", file.getAbsolutePath());
    }   
    public void setScoreLeft(Vidblaster hvb, int plNum, int score) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1", String.valueOf(score));
    }   
    public void setScoreLeftX(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1x", String.valueOf(pixels));
    }   
    public void setScoreLeftY(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1y", String.valueOf(pixels));
    }   
    public void setScoreLeftXY(Vidblaster hvb, int plNum, int pX, int pY) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1x", String.valueOf(pX));
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1y", String.valueOf(pY));
    }   
    public void setScoreRight(Vidblaster hvb, int plNum, int score) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2", String.valueOf(score));
    }   
    public void setScoreRightX(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2x", String.valueOf(pixels));
    }   
    public void setScoreRightY(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2y", String.valueOf(pixels));
    }   
    public void setScoreRightXY(Vidblaster hvb, int plNum, int pX, int pY) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2x", String.valueOf(pX));
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2y", String.valueOf(pY));
    }   
    public void setNameLeft(Vidblaster hvb, int plNum, String name) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1", name);
    }   
    public void setNameLeftX(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1x", String.valueOf(pixels));
    }   
    public void setNameLeftY(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1y", String.valueOf(pixels));
    }   
    public void setNameLeftXY(Vidblaster hvb, int plNum, int pX, int pY) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1x", String.valueOf(pX));
        hvb.apiwrite("scoreboard "+plNum, "team1y", String.valueOf(pY));
    }   
    public void setNameRight(Vidblaster hvb, int plNum, String name) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team2", name);
    }   
    public void setNameRightX(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team2x", String.valueOf(pixels));
    }   
    public void setNameRightY(Vidblaster hvb, int plNum, int pixels) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team2y", String.valueOf(pixels));
    }   
    public void setNameRightXY(Vidblaster hvb, int plNum, int pX, int pY) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team2x", String.valueOf(pX));
        hvb.apiwrite("scoreboard "+plNum, "team2y", String.valueOf(pY));
    }   
    public void setNames(Vidblaster hvb, int plNum, String n1, String n2) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1", n1);
        hvb.apiwrite("scoreboard "+plNum, "team2", n2);
    }   
    public void setScores(Vidblaster hvb, int plNum, int s1, int s2) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1", String.valueOf(s1));
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2", String.valueOf(s2));
    }   
    public void setScoreboardData(Vidblaster hvb, int plNum, String n1, String n2, int s1, int s2) throws IOException{
        hvb.apiwrite("scoreboard "+plNum, "team1", n1);
        hvb.apiwrite("scoreboard "+plNum, "team2", n2);
        hvb.apiwrite("scoreboard "+plNum, "scoreteam1", String.valueOf(s1));
        hvb.apiwrite("scoreboard "+plNum, "scoreteam2", String.valueOf(s2));
    }   


}
