/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

import oracle.jdbc.pool.OracleDataSource;


import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TableView.TableViewSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Callback;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Asus
 */
public class FXMLDocumentController implements Initializable {
      private static boolean isshowflight;
    private static boolean isuesrprofile;
    private static boolean ischangepassword;
    private static boolean islogout;
    private static Connection con;
    ObservableList<table2>traveler=FXCollections.observableArrayList();
    String yom;
    @FXML
    private RadioButton bookforfamily;

    @FXML
    private RadioButton bookforyou;
    
     @FXML
    private AnchorPane pane2;
     @FXML
    private ImageView showflight;
      @FXML
    private AnchorPane showflightpan;
          @FXML
    private Button text1;
    
              @FXML
    private AnchorPane userprofile;

    @FXML
    private ImageView userp1;

    @FXML
    private Button text2;
        @FXML
    private AnchorPane changepass;

    @FXML
    private ImageView userp11;

    @FXML
    private Button text3;
 @FXML
    private AnchorPane logout;

    @FXML
    private ImageView userp111;

    @FXML
    private Button text4;
    
    @FXML
    private AnchorPane pane1;

   @FXML
    private Button  bookbutton;
    Date date1;
      @FXML
    private AnchorPane pane21;

        @FXML
    private AnchorPane oo;

            @FXML
    private AnchorPane mainBlackPanel;

    @FXML
    private AnchorPane blackPanel;

    @FXML
    private AnchorPane booktour;

    @FXML
    private Button add;

    @FXML
    private Text passwordHText;

    @FXML
    private Text emailHText;

    @FXML
    private Button cancel;

    @FXML
    private TextField TD;

    @FXML
    private TextField GL;

    @FXML
    private Button TBOOK;
       @FXML
    private AnchorPane lll;
@FXML
    private TableView showCourseTable;

    @FXML
    private TableColumn<String,table2> name1113;

    @FXML
    private TableColumn<String,table2> planenumber;

    @FXML
    private TableColumn<String,table2> planetake;

    @FXML
    private TableColumn<String,table2> timearri;

    @FXML
    private TableColumn<String,table2> planedest;
String ho;
          String tom=null;

    @FXML
    private TextField T1;
   
  private String bd=null;
    @FXML
    private DatePicker teacherDOBFieldEdit;
    
       @FXML
    void BDT() {
     String oldDate,newDate[];String mon=" ";
    newDate=new String[3];
    oldDate=teacherDOBFieldEdit.getValue().toString();
    newDate=oldDate.split("-");
    if(newDate[1].equals("01"))mon="Jan";
    if(newDate[1].equals("02"))mon="Feb";
    if(newDate[1].equals("03"))mon="Mar";
    if(newDate[1].equals("04"))mon="Apr";
    if(newDate[1].equals("05"))mon="May";
    if(newDate[1].equals("06"))mon="Jun";
    if(newDate[1].equals("07"))mon="Jul";
    if(newDate[1].equals("08"))mon="Aug";
    if(newDate[1].equals("09"))mon="Sep";
    if(newDate[1].equals("10"))mon="Oct";
    if(newDate[1].equals("11"))mon="Nov";
    if(newDate[1].equals("12"))mon="Dec";
    int day=Integer.parseInt(newDate[2]);
    bd=day+"/"+mon+"/"+newDate[0];
   
    
    }
    void B( ) {
         String oldDate,newDate[];String mon=" ";
       newDate=new String[3];
     newDate= bd.split("/");
      if(newDate[1].equals("01"))mon="Jan";
    if(newDate[1].equals("02"))mon="Feb";
    if(newDate[1].equals("3"))mon="Mar";
    if(newDate[1].equals("04"))mon="Apr";
    if(newDate[1].equals("05"))mon="May";
    if(newDate[1].equals("06"))mon="Jun";
    if(newDate[1].equals("07"))mon="Jul";
    if(newDate[1].equals("08"))mon="Aug";
    if(newDate[1].equals("09"))mon="Sep";
    if(newDate[1].equals("10"))mon="Oct";
    if(newDate[1].equals("11"))mon="Nov";
    if(newDate[1].equals("12"))mon="Dec";
    int day=Integer.parseInt(newDate[2]);
          DatePicker jk;

    bd=newDate[2]+"-"+mon+"-"+newDate[0];
  
  
    }
  
        @FXML
    private TextField ser;
            @FXML
     private ObservableList guestInfo= FXCollections.observableArrayList();
         @FXML
    void mouseclickedd(MouseEvent event) //
    {  
      /*if(event.getSource()==showCourseTable.getSelectionModel()&&(event.getSource()==pane2)){
        System.out.println("j");
      TableViewSelectionModel selectionModel = showCourseTable.getSelectionModel();

           selectionModel.setSelectionMode(SelectionMode.SINGLE);
           ObservableList selectedItems = selectionModel.getSelectedItems();
           ObservableList<Integer> selectedIndices = selectionModel.getSelectedIndices();
      System.out.println(selectedIndices);}*/
      if(event.getSource()==pane2)//search 
        //ser===>search by area
//sed===>search by date
    {
      
        //ssn, name travele,address,email,phone,password,date
         
           try {
         showCourseTable.getColumns().clear();
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       //   String url = "jdbc:oracle:thin:@192.168.1.212:1521:xe";
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##e","12");
          Statement stm = con.createStatement();
          String s1=ser.getText();
             System.out.println(s1);
          String insQury = "select *From add_toura where TOO='"+s1+"'";
          
          ResultSet rs = stm.executeQuery(insQury); 
     
           guestInfo = FXCollections.observableArrayList();
        

           for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                showCourseTable.getColumns().addAll(col); 
              
            }
           while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
              
                
                    row.add(rs.getString(i));
                }
                
                
               guestInfo.add(row);

            }

            //FINALLY ADDED TO TableView
          showCourseTable.setItems(guestInfo);
   
        }
        catch (Exception ex) {
          //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex.toString());
        }    
       
        
}
        
        if(event.getSource()==showflightpan){
    
    showflightpan.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text1.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
          isshowflight=true;     
          isuesrprofile=false;
          ischangepassword=false;
          islogout=false;
          pane1.setVisible(true);
          oo.setVisible(false);
          
}
        if(event.getSource()==userprofile){
    
    userprofile.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text2.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
      isshowflight=false;     
          isuesrprofile=true;
          ischangepassword=false;
          islogout=false;
      
                       
}
if(event.getSource()==changepass){
    
    changepass.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text3.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                  isshowflight=false;     
          isuesrprofile=false;
          ischangepassword=true;
          islogout=false;     
}
if(event.getSource()==logout){
    
    logout.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text4.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                              isshowflight=false;     
          isuesrprofile=false;
          ischangepassword=false;
          islogout=true;     
}



    }   
        
        
       
    
    @FXML
    void panneaction(MouseEvent event) {
if(event.getSource()==showflightpan&& !isshowflight){
    
    showflightpan.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text1.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==userprofile&& !isuesrprofile){
    
    userprofile.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text2.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==changepass && !ischangepassword){
    
    changepass.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text3.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==logout && !islogout){
    
    logout.setStyle("-fx-background-color:  #1C2833; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text4.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
      if(event.getSource()== pane2){
    

   pane2.setStyle("-fx-background-color: #3e6db0; -fx-background-radius: 50; -fx-border-radius: 50;"); 
        }
       if(event.getSource()== pane21){
    

   pane21.setStyle("-fx-background-color: #3e6db0; -fx-background-radius: 50; -fx-border-radius: 50;"); 
        }
      
     
}
        
        
    
    
     @FXML
    void panneexited(MouseEvent event) {
        if(event.getSource()==showflightpan && !isshowflight){
    
    showflightpan.setStyle("-fx-background-color: #b4d7Fe#3d6cb5 ; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text1.setStyle("-fx-background-color: transparent;-fx-text-fill:     #3d6cb2;");
                       
}
        if(event.getSource()==userprofile && !isuesrprofile){
    
    userprofile.setStyle("-fx-background-color:#b4d7Fe#3d6cb5 ; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text2.setStyle("-fx-background-color: transparent;-fx-text-fill:  #3d6cb2;");
                       
}
        if(event.getSource()==changepass && !ischangepassword){
    
    changepass.setStyle("-fx-background-color: #b4d7Fe#3d6cb5; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text3.setStyle("-fx-background-color: transparent;-fx-text-fill:#3d6cb2  ;");
                       
}
        if(event.getSource()==logout && !islogout){
    
    logout.setStyle("-fx-background-color:#b4d7Fe#3d6cb5 ; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text4.setStyle("-fx-background-color: transparent;-fx-text-fill: #3d6cb2;");
                       
}
if(event.getSource()== pane2){
    

   pane2.setStyle("-fx-background-color:transparent ; -fx-background-radius: 50; -fx-border-radius: 50;-fx-border-color:  #1c2833;"); 
        }
if(event.getSource()== pane21){
    

   pane21.setStyle("-fx-background-color:transparent ; -fx-background-radius: 50; -fx-border-radius: 50;-fx-border-color:  #1c2833;"); 
        }
      
    }
    
        @FXML
    void mousepressed(MouseEvent event) throws IOException {
if(event.getSource()==showflightpan&& !isshowflight){
    
    showflightpan.setStyle("-fx-background-color: #3d6cb2; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text1.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==userprofile&& !isuesrprofile){
    
    userprofile.setStyle("-fx-background-color: #3d6cb2; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text2.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==changepass && !ischangepassword){
    
    changepass.setStyle("-fx-background-color: #3d6cb2; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text3.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}
if(event.getSource()==logout && !islogout){
    
    logout.setStyle("-fx-background-color: #3d6cb2; -fx-border-color: #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5 #b4d7Fe#3d6cb5;");
                       
      text4.setStyle("-fx-background-color: transparent;-fx-text-fill:  #b4d7Fe#3d6cb5;");
                       
}

if(event.getSource()==pane21){
  Parent managerParent = FXMLLoader.load(getClass().getResource("aaa.fxml"));
            Scene managerScene = new Scene(managerParent);
            Stage managerStage = (Stage) ((Node)event.getSource()).getScene().getWindow();
            managerStage.setScene(managerScene);
            managerStage.show();
        }

  
  
  /*  mainBlackPanel.setVisible(true);
     lll.setVisible(true);*/
     
     
     
}
    

    
  @FXML
    private AnchorPane pane0;
  @FXML
    private TextField TD5;
    ButtonGroup mna=new ButtonGroup();
    ButtonGroup mna1=new ButtonGroup();
    ButtonGroup mna2=new ButtonGroup();
    ButtonGroup mna3=new ButtonGroup();
    @FXML
    private RadioButton vip;

    @FXML
    private RadioButton eco;

    @FXML
    private RadioButton with;

    @FXML
    private RadioButton without;

    @FXML
    private RadioButton one;

    @FXML
    private RadioButton two;
 @FXML
    private AnchorPane paneltotal;
  @FXML
         ToggleGroup toggleGroup = new ToggleGroup();
  @FXML
         ToggleGroup toggleGroup1 = new ToggleGroup();
  @FXML
         ToggleGroup toggleGroup2 = new ToggleGroup();
  @FXML
         ToggleGroup toggleGroup3 = new ToggleGroup();
   @FXML
         ToggleGroup t1 = new ToggleGroup();
    @FXML
         ToggleGroup t2 = new ToggleGroup();
     @FXML
         ToggleGroup t3 = new ToggleGroup();
      @FXML
         ToggleGroup t4= new ToggleGroup();
       @FXML
         ToggleGroup t5 = new ToggleGroup();
       @FXML
         ToggleGroup t6 = new ToggleGroup();
       @FXML
         ToggleGroup t7 = new ToggleGroup();
       @FXML
         ToggleGroup t8 = new ToggleGroup();
       @FXML
         ToggleGroup t9 = new ToggleGroup();
       @FXML
         ToggleGroup t10 = new ToggleGroup();
       @FXML
         ToggleGroup t11 = new ToggleGroup();
       @FXML
         ToggleGroup t12 = new ToggleGroup();
         @FXML
         ToggleGroup t13 = new ToggleGroup();
           @FXML
         ToggleGroup t14 = new ToggleGroup();
             @FXML
         ToggleGroup t15 = new ToggleGroup();
       
   @FXML
    private RadioButton vip1;

    @FXML
    private RadioButton eco1;

    @FXML
    private RadioButton with1;

    @FXML
    private RadioButton without1;

    @FXML
    private RadioButton one1;

    @FXML
    private RadioButton two1;

    @FXML
    private TextField T11;

    @FXML
    private RadioButton vip2;

    @FXML
    private RadioButton eco2;

    @FXML
    private RadioButton with2;

    @FXML
    private RadioButton without2;

    @FXML
    private RadioButton one2;

    @FXML
    private RadioButton two2;

    @FXML
    private TextField T111;

    @FXML
    private RadioButton vip3;

    @FXML
    private RadioButton eco3;

    @FXML
    private RadioButton with3;

    @FXML
    private RadioButton without3;

    @FXML
    private RadioButton one3;

    @FXML
    private RadioButton two3;

    @FXML
    private TextField T112;

    @FXML
    private RadioButton vip4;

    @FXML
    private RadioButton eco4;

    @FXML
    private RadioButton with4;

    @FXML
    private RadioButton without4;

    @FXML
    private RadioButton one4;

    @FXML
    private RadioButton two4;

    @FXML
    private TextField T113;

    @FXML
    private RadioButton vip5;

    @FXML
    private RadioButton eco5;

    @FXML
    private RadioButton with5;

    @FXML
    private RadioButton without5;

    @FXML
    private RadioButton one5;

    @FXML
    private RadioButton two5;
      @FXML
    void radioaction(ActionEvent event) {
// mna.add(bookforyou);
   //  bookforfamily.selectedProperty()
   bookforfamily.setToggleGroup(toggleGroup);
    
    bookforyou.setToggleGroup(toggleGroup);
    
     vip.setToggleGroup(toggleGroup1);
   eco.setToggleGroup(toggleGroup1);
   with.setToggleGroup(toggleGroup2);
   without.setToggleGroup(toggleGroup2);
   one.setToggleGroup(toggleGroup3);
   two.setToggleGroup(toggleGroup3);

  if(event.getSource()==bookforfamily){
    paneltotal.setVisible(true);
     vip1.setToggleGroup(t1);
   eco1.setToggleGroup(t1);
   with1.setToggleGroup(t2);
   without1.setToggleGroup(t2);
   one1.setToggleGroup(t3);
   two1.setToggleGroup(t3);
    vip2.setToggleGroup(t4);
   eco2.setToggleGroup(t4);
   with2.setToggleGroup(t5);
   without2.setToggleGroup(t5);
   one2.setToggleGroup(t6);
   two2.setToggleGroup(t6);
    vip3.setToggleGroup(t7);
   eco3.setToggleGroup(t7);
   with3.setToggleGroup(t8);
   without3.setToggleGroup(t8);
   one3.setToggleGroup(t9);
   two3.setToggleGroup(t9);
    vip4.setToggleGroup(t10);
   eco4.setToggleGroup(t10);
   with4.setToggleGroup(t11);
   without4.setToggleGroup(t11);
   one4.setToggleGroup(t12);
   two4.setToggleGroup(t12);
    vip5.setToggleGroup(t13);
   eco5.setToggleGroup(t13);
   with5.setToggleGroup(t14);
   without5.setToggleGroup(t14);
   one5.setToggleGroup(t15);
   two5.setToggleGroup(t15);
  }
if(event.getSource()==bookforyou){
  paneltotal.setVisible(false);
}
    }
      @FXML
    private Button a;

    

    @FXML
    void aa(ActionEvent event) {
if(event.getSource()==a){
  System.out.println(yom);
}
    }
     @FXML private javafx.scene.control.Button closeButton;
    @FXML private javafx.scene.control.Button cleButton;

    @FXML
private void closeButtonAction(){
    // get a handle to the stage
   pane0.setVisible(false);
   /*{T1.setText("");
te1.setText("");
te2.setText("");
te3.setText("");
te4.setText("");
te5.setText("");
     t15.getSelectedToggle().setSelected(false);
     t14.getSelectedToggle().setSelected(false);
     t13.getSelectedToggle().setSelected(false);
     t12.getSelectedToggle().setSelected(false);
     t11.getSelectedToggle().setSelected(false);
     t10.getSelectedToggle().setSelected(false);
     t9.getSelectedToggle().setSelected(false);
     t8.getSelectedToggle().setSelected(false);
     t7.getSelectedToggle().setSelected(false);
     t6.getSelectedToggle().setSelected(false);
     t5.getSelectedToggle().setSelected(false);
     t4.getSelectedToggle().setSelected(false);
     t3.getSelectedToggle().setSelected(false);
     t2.getSelectedToggle().setSelected(false);
     t1.getSelectedToggle().setSelected(false);
      
     toggleGroup.getSelectedToggle().setSelected(false);
    toggleGroup3.getSelectedToggle().setSelected(false);
     toggleGroup2.getSelectedToggle().setSelected(false);
      toggleGroup1.getSelectedToggle().setSelected(false);}*/
}

    @Override
    public void initialize(URL url, ResourceBundle rb) {
          try {
         showCourseTable.getColumns().clear();
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       //   String url = "jdbc:oracle:thin:@192.168.1.212:1521:xe";
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##e","12");
          Statement stm = con.createStatement();
       
          String insQury = "select *From add_toura  ";
          
          ResultSet rs = stm.executeQuery(insQury); 
     
           guestInfo = FXCollections.observableArrayList();
        

           for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                showCourseTable.getColumns().addAll(col); 
              
            }
           while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
              
                
                    row.add(rs.getString(i));
                }
                
                
               guestInfo.add(row);

            }

            //FINALLY ADDED TO TableView
          showCourseTable.setItems(guestInfo);
   
        }
        catch (Exception ex) {
          //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex.toString());
        }    
          
      showCourseTable.setOnMousePressed(new EventHandler<MouseEvent>(){
      @Override
      public void handle (MouseEvent event){
        
   
          pane0.setVisible(true);
          String []ie=showCourseTable.getSelectionModel().getSelectedItem().toString().split(",");
          ho=ie[0].substring(1,6);
          tom= ie[2].trim();
          String jj[]=ie[6].trim().split(" ");
          
          yom=  jj[0].trim(); 
      
       }
      });
        // TODO
         isshowflight=false;     
          isuesrprofile=false;
          ischangepassword=false;
          islogout=false;     
           try {
         showCourseTable.getColumns().clear();
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       //   String url = "jdbc:oracle:thin:@192.168.1.212:1521:xe";
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##e","12");
          Statement stm = con.createStatement();
          String insQury = "select *From add_toura order by airplane_number";
          ResultSet rs = stm.executeQuery(insQury); 
     
           guestInfo = FXCollections.observableArrayList();
        

           for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                showCourseTable.getColumns().addAll(col); 
              
            }
           while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
              
                
                    row.add(rs.getString(i));
                }
                
                
               guestInfo.add(row);

            }

            //FINALLY ADDED TO TableView
          showCourseTable.setItems(guestInfo);
   
        }
        catch (Exception ex) {
          //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex.toString());
        }   
    }    
   public  void showStudentCoursesPanel(){
         try {
         showCourseTable.getColumns().clear();
         DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
       //   String url = "jdbc:oracle:thin:@192.168.1.212:1521:xe";
          Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##e","12");
          Statement stm = con.createStatement();
          
          String insQury = "select *From add_toura ";
          
          ResultSet rs = stm.executeQuery(insQury); 
     
           guestInfo = FXCollections.observableArrayList();
        

           for(int i=0 ; i<rs.getMetaData().getColumnCount(); i++){
                //We are using non property style for making dynamic table
                final int j = i;                
                TableColumn col = new TableColumn(rs.getMetaData().getColumnName(i+1));
                col.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<ObservableList,String>,ObservableValue<String>>(){                    
                    public ObservableValue<String> call(TableColumn.CellDataFeatures<ObservableList, String> param) {                                                                                              
                        return new SimpleStringProperty(param.getValue().get(j).toString());                        
                    }                    
                });
               
                showCourseTable.getColumns().addAll(col); 
              
            }
           while(rs.next()){
                //Iterate Row
                ObservableList<String> row = FXCollections.observableArrayList();
                for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                    //Iterate Column
              
                
                    row.add(rs.getString(i));
                }
                
                
               guestInfo.add(row);

            }

            //FINALLY ADDED TO TableView
          showCourseTable.setItems(guestInfo);
   
        }
        catch (Exception ex) {
          //  Logger.getLogger(Sign_upController.class.getName()).log(Level.SEVERE, null, ex);
          JOptionPane.showMessageDialog(null, ex.toString());
        }    
           


    }
    @FXML
    private TextField te5;
     @FXML
    private TextField te4;
      @FXML
    private TextField te3;
       @FXML
    private TextField te2;
        @FXML
    private TextField te1;
    @FXML
    void ACTI(ActionEvent event) {
 String family,family1="no";
String go0,go1,go2,go3,go4,go5="one";
        String meal0,meal1,meal2,meal3,meal4,meal5="no";
                String tic0,tic1,tic2,tic3,tic4,tic5="economic";
  String airplane;
    if(event.getSource()==add){
     
     lll.setVisible(false);
    
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
           String s="Select * from aira order by airplane_number";
           ResultSet rs=st.executeQuery(s);
           int price;
           int y,u = 0;
           int q;
             while(rs.next()){
              
                if(rs.getString(1).equals(ho)){
                 System.out.println("3");
                
             ay=rs.getString(3);
             mk=rs.getString(2);
             
               y=Integer.parseInt(mk);
               u=Integer.parseInt(ay);
               q=u;
                 System.out.println("hell");
                       f=0;
     if(y==0) {    JOptionPane.showMessageDialog(null,"This Flight is full !!"); f=5; break;}
     else if(bookforyou.isSelected()==true&&T1.getText().isEmpty()==false){
      y-=1;
      if(vip.isSelected()){u+=500;}
      if(with.isSelected())u+=100;
      if(two.isSelected())u+=(q*2);
      ay.valueOf(u);
           oi="Update aira set number_of_seats='"+y+"', money='"+ay+"' where airplane_number= '"+ho+"'";  
  f=1;
 
    } 
     //int c=0;
     else if(bookforfamily.isSelected()==true&&T1.getText().isEmpty()==false){
       family="yes";
      int c=1;
      if(te1.getText().isEmpty()==false)c++;
            if(te2.getText().isEmpty()==false)c++;
      if(te3.getText().isEmpty()==false)c++;
      if(te4.getText().isEmpty()==false)c++;
            if(te5.getText().isEmpty()==false)c++;
           if(y<c) {JOptionPane.showMessageDialog(null,"There is not enough seats !!\n you are "+c+" person"+"and we have only "+y+" seat");
          break; }
           if(y>=c){
             y-=1;
      if(vip.isSelected()){u+=500;}
      if(with.isSelected())u+=100;
      if(two.isSelected())u+=(q*2);
           if(te1.getText().isEmpty()==false){
             
              y-=1;
           if(vip1.isSelected()){u+=400;
          // go="vip";
           }
           if(with1.isSelected()){u+=50;
          // meal="yes";
           }
           if(two1.isSelected()){u+=(q*2);
          // tic="two";
           }
           }
             if(te2.getText().isEmpty()==false){
                y-=1;
           if(vip2.isSelected())u+=400;
           if(with2.isSelected())u+=50;
           if(two2.isSelected())u+=(q*2);
           }
               if(te3.getText().isEmpty()==false){
                  y-=1;
           if(vip3.isSelected())u+=400;
           if(with3.isSelected())u+=50;
           if(two3.isSelected())u+=(q*2);
           }
                 if(te4.getText().isEmpty()==false){
                    y-=1;
           if(vip4.isSelected())u+=400;
           if(with4.isSelected())u+=50;
           if(two4.isSelected())u+=(q*2);
           }
                   if(te5.getText().isEmpty()==false){
                      y-=1;
           if(vip5.isSelected())u+=400;
           if(with5.isSelected())u+=50;
           if(two5.isSelected())u+=(q*2);
           }
                   ay.valueOf(u);
               oi="Update aira set number_of_seats='"+y+"', money='"+ay+"' where airplane_number= '"+ho+"'";  
  f=1;
           }
     }
     
                               

                }
               if(f==5)break;
           }
JOptionPane.showMessageDialog(null,"You'r total price is: "+u+" $");        
/*{
T1.setText("");
te1.setText("");
te2.setText("");
te3.setText("");
te4.setText("");
te5.setText("");
     t15.getSelectedToggle().setSelected(false);
     t14.getSelectedToggle().setSelected(false);
     t13.getSelectedToggle().setSelected(false);
     t12.getSelectedToggle().setSelected(false);
     t11.getSelectedToggle().setSelected(false);
     t10.getSelectedToggle().setSelected(false);
     t9.getSelectedToggle().setSelected(false);
     t8.getSelectedToggle().setSelected(false);
     t7.getSelectedToggle().setSelected(false);
     t6.getSelectedToggle().setSelected(false);
     t5.getSelectedToggle().setSelected(false);
     t4.getSelectedToggle().setSelected(false);
     t3.getSelectedToggle().setSelected(false);
     t2.getSelectedToggle().setSelected(false);
     t1.getSelectedToggle().setSelected(false);
      
     toggleGroup.getSelectedToggle().setSelected(false);
    toggleGroup3.getSelectedToggle().setSelected(false);
     toggleGroup2.getSelectedToggle().setSelected(false);
      toggleGroup1.getSelectedToggle().setSelected(false);

//n
}*/
if(f==1)st.executeUpdate(oi);
                   
           conn.close();
          //set " "
    } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getSQLState());
           Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
       }
   // mainBlackPanel.setVisible(false);//complite the code to stor the data in data base,chech if the plan id full
    
    /* try {
             OracleDataSource ods=new  OracleDataSource();
           ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
            ods.setUser("c##e");
           ods.setPassword("12");
            Connection conn =ods.getConnection();
            Statement st=conn.createStatement();
            String s="select * From book where Tour_id= '"+TD.getText()+"'";
            ResultSet rs=st.executeQuery(s);
                    String air="null";
                   int flag=0;
            while(rs.next()){
                if(rs.getString(1).equals(TD.getText())){
                   flag=1;
               air=rs.getString(2);
               }}
              String j= "select *From aira order by airplane_number";
               ResultSet   r=st.executeQuery(j);
                String num="null";
                int aia=0;
                 String oi="null";
                 while(r.next()){
                if(r.getString(1).equals(air)){                  
              num=r.getString(2);
                String y=r.getString(2); 
                int aya=Integer.parseInt(y);
                 if(aya==0){aia=0;
            break; }
         if(aya!=0){  int io =Integer.parseInt(y)-1;
             
             
               oi="Update aira set number_of_seats='"+io+"'where airplane_number= '"+air+"'";    
             aia=1;
                JOptionPane.showMessageDialog(null, "Done !!");}
             if(aia==0)break;
               }
                  }
    
                 if(flag==0)              JOptionPane.showMessageDialog(null, "Tour id incorrect");
                 else{
                if(aia==1)st.executeUpdate(oi);
                if(aia==0)     JOptionPane.showMessageDialog(null, "This plane is full");
                 }
           conn.close();
           TD.setText(" ");
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex.getSQLState());
           Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
       }*/
 
    
          
}
    }

}
