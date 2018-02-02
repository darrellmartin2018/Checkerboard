/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author darrellmartin
 */
public class CheckerboardFXMLController implements Initializable, Startable {
    
    private final int numRows = 8;
    private final int numCols = 8;
    
    @FXML
    private AnchorPane anchorPane;
    
    private Stage stage;
    
    private Checkerboard1 checkerboard;

    @Override
    public void start(Stage stage) {
        this.stage = stage;
        this.checkerboard = new Checkerboard1(numRows, numCols, anchorPane.getWidth(), anchorPane.getHeight());
        this.checkerboard.setBoard(anchorPane);
        this.checkerboard.build();
        
        ChangeListener<Number> lambdaChangeListener = (ObservableValue<? extends Number> observable, Number oldValue, final Number newValue) -> {
            this.checkerboard.build();
        };
        
        this.stage.widthProperty().addListener(lambdaChangeListener);
        this.stage.heightProperty().addListener(lambdaChangeListener);
        
//        this.checkerboard.build();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
    @FXML
    public void handleChangeDefault(ActionEvent event){
        checkerboard.setLightColor(Color.RED);
        checkerboard.setDarkColor(Color.BLACK);
        checkerboard.build();
    }
    
    @FXML
    public void handleChangleBlue(ActionEvent event){
        checkerboard.setLightColor(Color.SKYBLUE);
        checkerboard.setDarkColor(Color.DARKBLUE);
        checkerboard.build();
    }
    
    @FXML
    public void handleSwitch16(ActionEvent event){
        checkerboard.setNumRows(16);
        checkerboard.setNumCols(16);
        checkerboard.build();
    }
    
    @FXML
    public void handleSwitch10(ActionEvent event){
        checkerboard.setNumRows(10);
        checkerboard.setNumCols(10);
        checkerboard.build();
    }
    
    @FXML
    public void handleSwitch8(ActionEvent event){
        checkerboard.setNumRows(8);
        checkerboard.setNumCols(8);
        checkerboard.build();
    }
    
    @FXML
    public void handleSwitch3(ActionEvent event){
        checkerboard.setNumRows(3);
        checkerboard.setNumCols(3);
        checkerboard.build();
    }
    
}
