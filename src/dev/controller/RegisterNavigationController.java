package dev.controller;

import dev.Manager;
import dev.view.ViewFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class RegisterNavigationController extends BasicController{
    public RegisterNavigationController(Manager manager, ViewFactory viewFactory, String fxmlName) {
        super(manager, viewFactory, fxmlName);
    }
    @FXML
    private Button userOnlyRegister;

    @FXML
    private Button customerOnlyRegister;

    @FXML
    private Button managerOnlyRegister;

    @FXML
    private Button ManagerCustomerRegister;

    @FXML
    private Button backToLoginButton;

    @FXML
    void backToLoginButtonAction() {
    }
}
