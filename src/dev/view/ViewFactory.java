package dev.view;

import dev.Manager;
import dev.controller.BasicController;
import dev.controller.LoginWindowController;
import dev.controller.RegisterNavigationController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ViewFactory {
    private Manager manager;
    private ArrayList<Stage> activeStage;

    // since the activeStage list is always empty at the beginning
    public ViewFactory(Manager manager) {
        this.manager = manager;
        this.activeStage = new ArrayList<Stage>();
    }

    public void showLoginWindow() {
        System.out.println("show login window");
        BasicController controller = new LoginWindowController(manager, this, "LoginWindow.fxml");
        initStage(controller);
    }

    public void showRegisterNavigationWindow() {
        //System.out.println();
        BasicController controller = new RegisterNavigationController(manager, this, "RegisterNavigationWindow.fxml");
        initStage(controller);
    }

    public void initStage(BasicController controller) {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(controller.getFxmlName()));
        Parent parent;
        fxmlLoader.setController(controller);
        try {
            parent = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        activeStage.add(stage);
        stage.show();
    }

    public void closeStage(Stage stage) {
        this.activeStage.remove(stage);
        stage.close();
    }
}
