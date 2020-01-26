package dev.controller;

import dev.Manager;
import dev.view.ViewFactory;

public class BasicController {
    protected Manager manager;
    protected ViewFactory viewFactory;
    protected String fxmlName;

    public BasicController(Manager manager, ViewFactory viewFactory, String fxmlName) {
        this.manager = manager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public Manager getManager() {
        return manager;
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
