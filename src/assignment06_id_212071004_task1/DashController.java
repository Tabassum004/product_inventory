/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package assignment06_id_212071004_task1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Hp
 */
public class DashController implements Initializable {

    @FXML
    private TextField passWord;
    @FXML
    private Button btnlogin;
    @FXML
    private TextField username;

    @FXML
    private void btnlogin(ActionEvent event) throws IOException {
        Stage primaryStage =new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println("Button2.");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
 
       
    
}
