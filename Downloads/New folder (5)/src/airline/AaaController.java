/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import javax.swing.ButtonGroup;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class AaaController implements Initializable {

    @FXML
    private TextField TD;

    @FXML
    private RadioButton bookforfamily;

    @FXML
    private RadioButton bookforyou;

    @FXML
    private AnchorPane paneltotal;

    @FXML
    private TextField TD1;

    @FXML
    private TextField TD2;

    @FXML
    private TextField TD3;

    @FXML
    private TextField TD4;

    @FXML
    private TextField TD5;
    ButtonGroup mna=new ButtonGroup();
 
  @FXML
         ToggleGroup toggleGroup = new ToggleGroup();
  
//bookforyou.setToggleGroup(toggleGroup);
  @FXML
    void radioaction(ActionEvent event) {
// mna.add(bookforyou);
   //  bookforfamily.selectedProperty()
   bookforfamily.setToggleGroup(toggleGroup);
    
    bookforyou.setToggleGroup(toggleGroup);
  
  if(event.getSource()==bookforfamily){
    paneltotal.setVisible(true);
  }
if(event.getSource()==bookforyou){
  paneltotal.setVisible(false);
}
    }
    
  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  
  
}
