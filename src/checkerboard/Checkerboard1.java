/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.paint.Color;

/**
 *
 * @author darrellmartin
 */
public class Checkerboard1 {
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
    
}
