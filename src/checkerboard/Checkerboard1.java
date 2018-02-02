/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

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
        this.lightColor = Color.RED;
        this.darkColor = Color.BLACK;
    }
    
    public Checkerboard1(int numRows, int numCols, double boardWidth, double boardHeight, Color lightColor, Color darkColor){
        this(numRows, numCols, boardWidth, boardHeight);
        this.lightColor = lightColor;
        this.darkColor = darkColor;
    }
    
    public int getNumRows(){
        return this.numRows;
    }
    
    public int getNumCols(){
        return this.numCols;
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
    
    public void clear() {
        if(anchorPane != null){
            anchorPane.getChildren().clear();
        }
    }
    
    public AnchorPane build(){
//        int row = 0;
//        int column = 0;
        Color color = darkColor;
        this.clear();
        for(int row=0;row<this.getNumRows();row++){
            for(int column=0;column<this.getNumCols();column++){
                Rectangle rectangle = new Rectangle(getRectangleWidth(), getRectangleHeight(), color = switchColors(color));
                this.anchorPane.getChildren().add(rectangle);
                rectangle.setTranslateX(getRectangleWidth()*row);
                rectangle.setTranslateY(getRectangleHeight()*column);
            }
            if(this.numRows % 2 == 0){
                color = switchColors(color);
            }
        }
        return anchorPane;
    }
    
    private Color switchColors(Color color){
        if(color == darkColor){
            return lightColor;
        }
        else{
            return darkColor;
        }
    }
    
}   
