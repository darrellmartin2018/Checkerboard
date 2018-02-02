/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkerboard;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
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
        checkerboard.setBoard(anchorPane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    
}
