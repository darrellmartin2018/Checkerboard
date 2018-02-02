/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

/**
 *
 * @author darrellmartin
 */
public class Checkerboard1 {
    private AnchorPane anchorPane;
    private int numRows;
    private int numCols;
    private double boardWidth;
    private double boardHeight;
    private Color lightColor;
    private Color darkColor;
    
    public Checkerboard1(int numRows, int numCols, double boardWidth, double boardHeight){
        this.numRows = numRows;
        this.numCols = numCols;
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
    }
    
    public Checkerboard1(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        this(numRows, numCols, boardWidth, boardHeight);
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public int getNumRows(){
        return numRows;
    }
    
    public int getNumCols(){
        return numCols;
    } 
    
    public double getWidth(){
        return boardWidth;
    }
        
    public double getHeight(){
        return boardHeight;
    }
    
    public Color getLightColor(){
        return lightColor;
    }
    
    public Color getDarkColor(){
        return darkColor;
    }
    
    private double getRectangleWidth(){
        this.boardWidth = this.anchorPane.getWidth();
        return Math.ceil(this.boardWidth / this.numCols);
    }
    
    private double getRectangleHeight(){
        this.boardHeight = this.anchorPane.getHeight();
        return Math.ceil(this.boardHeight / this.numRows);
    }
    
    public void setBoard(AnchorPane anchorPane){
        this.anchorPane = anchorPane;
    }
    
    public void setNumRows(int numRows){
        this.numRows = numRows;
    }
    
    public void setNumCols(int numCols){
        this.numCols = numCols;
    }
    
    public void setBoardWidth(double boardWidth){
        this.boardWidth = boardWidth;
    }
    
    public void setBoardHeight(double boardHeight){
        this.boardHeight = boardHeight;
    }
    
    public void setLightColor(Color lightColor){
        this.lightColor = lightColor;
    }
    
    public void setDarkColor(Color darkColor){
        this.darkColor = darkColor;
    }
    
}   
