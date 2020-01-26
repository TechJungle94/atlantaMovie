package dev;

import dev.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory = new ViewFactory(new Manager());
        viewFactory.showLoginWindow();
    }
}
