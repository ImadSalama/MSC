/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author HP
 */
import java.util.ArrayList;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;

/**
 *
 * @author HI-TECH
 */
public class  table2{
    private SimpleStringProperty planenumber;
    private SimpleStringProperty Planetakeofftime;
    private SimpleStringProperty Arrivaltime;
    private SimpleStringProperty planedestination;
   
    public table2(){
        planenumber=new SimpleStringProperty();
        Planetakeofftime=new SimpleStringProperty();
        Arrivaltime =new SimpleStringProperty();
        planedestination=new SimpleStringProperty();
        
    }
    public void setS1(String planenumber){this.planenumber.set(planenumber);}
    public void setS2(String planenumber){this.planenumber.set(planenumber);}
    public void setS3(String Arrivaltime){this.Arrivaltime.set(Arrivaltime);}
     public void setS4(String planedestination){this.planedestination.set(planedestination);}
    
    public String  getS1(){return planenumber.get();}
    public String  getS2(){return planenumber.get();}
    public String  getS3(){return planenumber.get();}
     public String  getS4(){return planenumber.get();}
   

   
}
