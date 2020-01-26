package dev.controller;

import dev.Manager;
import dev.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginWindowController extends BasicController {

    @FXML
    private Button LoginButton;

    @FXML
    private Button registerButton;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    void registerButtonAction() {
    }
    @FXML
    void LoginButtonAction() {
        this.viewFactory.showRegisterNavigationWindow();
        // get the current loginWindow stage
        Stage stage = (Stage)this.passwordField.getScene().getWindow();
        this.viewFactory.closeStage(stage);
    }

    public LoginWindowController(Manager manager, ViewFactory viewFactory, String fxmlName) {
        super(manager, viewFactory, fxmlName);
    }
}
