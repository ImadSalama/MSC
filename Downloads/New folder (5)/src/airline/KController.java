/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
 
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import oracle.jdbc.pool.OracleDataSource;

/**
 * FXML Controller class
 *
 * @author HP
 */
public class KController implements Initializable {
    @FXML
         ToggleGroup t14 = new ToggleGroup();
             @FXML
         ToggleGroup t15 = new ToggleGroup();
      @FXML
    private RadioButton ra;

    @FXML
    private RadioButton rb;

    @FXML
    void radioaction(ActionEvent event) {
  ra.setToggleGroup(t14);
    
   rb.setToggleGroup(t14);
    }
    
    @FXML
    private Button b;
 void ACTI(ActionEvent event) {
 String family,family1="no";
String go0,go1,go2,go3,go4,go5="one";
        String meal0,meal1,meal2,meal3,meal4,meal5="no";
                String tic0,tic1,tic2,tic3,tic4,tic5="economic";
  String airplane;
    if(event.getSource()==b){
     
     
      String   ay,mk = null;
       int f = 0;
       String oi = null;
      try {
        
                
           OracleDataSource ods=new  OracleDataSource();
           ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
           ods.setUser("c##e");
           ods.setPassword("12");
           Connection conn =ods.getConnection();
           Statement st=conn.createStatement();
           String s="           insert INTO bookinga VALUES('11113','jordan','2-nov-20','11111','vip','yes','one','no');\n" +
"";
           ResultSet rs=st.executeQuery(s);
           int price;
           int y,u = 0;
           int q;

              } catch (SQLException ex) {
     Logger.getLogger(KController.class.getName()).log(Level.SEVERE, null, ex);
   }}}
    @FXML
    void ba(ActionEvent event) throws ParseException {
   if(event.getSource()==b){
   //  t14.getSelectedToggle().setSelected(false);
  String sDate1="31/12/1998";  
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
    System.out.println(date1);  
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
