package com.diploma.demo.view;

import javafx.fxml.FXML;

import javafx.scene.control.Tab;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.stereotype.Component;

@Component
@FxmlView("main-view.fxml")
public class MainController {

    @FXML
    public Tab mainPageTab;

    @FXML
    public Tab mailPageTab;

    @FXML
    public Tab counterPageTab;
}
