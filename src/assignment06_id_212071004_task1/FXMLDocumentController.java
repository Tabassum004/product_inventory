/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package assignment06_id_212071004_task1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 *
 * @author Hp
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<Employee> tableview;
    @FXML
    private TableColumn<Employee, Integer> id;
    @FXML
    private TableColumn<Employee, String> fname;
    @FXML
    private TableColumn<Employee, String> lname;

    @FXML
    private TableColumn<Employee, String> phone;
    @FXML
    private TableColumn<Employee, String> city;
    @FXML
    private TextField id1;
    @FXML
    private Button addbutton;
    @FXML
    private Button pagebutton;
    @FXML
    private TextField Firstname;
    @FXML
    private TextField Lastname;
    @FXML
    private TextField Phonenumber;
    @FXML
    private TextField City;

    public ObservableList<Employee> list = FXCollections.observableArrayList(
            new Employee(1, "Tabassum", "Mithela", "01712345678", "Dhaka"),
            new Employee(2, "Nabila", "Borsha", "01345678920", "kustia"),
            new Employee(3, "Manha", "Islam", "01412378905", "Dhaka")
    );
   
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        id.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("id"));
        fname.setCellValueFactory(new PropertyValueFactory<Employee, String>("firstName"));
        lname.setCellValueFactory(new PropertyValueFactory<Employee, String>("lastName"));
        phone.setCellValueFactory(new PropertyValueFactory<Employee, String>("phone"));
        city.setCellValueFactory(new PropertyValueFactory<Employee, String>("city"));

        // Set the data to the table view
        tableview.setItems(list);
    }

    @FXML
    private void addbutton(ActionEvent event) {
        int employeeID = Integer.parseInt(id1.getText());
        String fname = Firstname.getText();
        String lname = Lastname.getText();
        String phone = Phonenumber.getText();
        String employeeCity = City.getText();

        Employee newEmployee = new Employee(employeeID, fname, lname, phone, employeeCity);

        list.add(newEmployee);
        tableview.setItems(list);

        id1.clear();
        Firstname.clear();
        Lastname.clear();
        Phonenumber.clear();
        City.clear();
        System.out.println("Button.");
    }
    
    @FXML
    private void pagebutton(ActionEvent event) throws IOException {
        Stage primaryStage =new Stage();
                Parent root = FXMLLoader.load(getClass().getResource("dash.fxml"));
                Scene scene = new Scene(root);
                primaryStage.setScene(scene);
                primaryStage.show();
        System.out.println("Button2.");
    }

}