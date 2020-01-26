module atlantaMovie {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.web;

    opens dev;
    opens dev.view;
    opens dev.controller;
}