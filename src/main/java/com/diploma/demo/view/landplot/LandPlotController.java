package com.diploma.demo.view.landplot;


import com.diploma.demo.core.act.Contract;
import com.diploma.demo.core.landplot.LandPlot;
import com.diploma.demo.core.landplot.repository.LandPlotRepository;
import com.diploma.demo.core.restriction.Restriction;
import com.diploma.demo.core.stateregistration.StateRegistration;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

@Component
@FxmlView("land-plot.fxml")
public class LandPlotController implements Initializable {

    @Autowired
    private LandPlotRepository landPlotRepository;

    private LandPlot landPlot;
    private List<Restriction> restrictions;
    private List<Contract> contracts;
    private List<StateRegistration> stateRegistrations;

    @FXML private Label cadastralNumberLabel;
    @FXML private Label addressLabel;
    @FXML private Label surfaceLabel;
    @FXML private Label categoryLabel;
    @FXML private Label intendedUseLabel;
    @FXML private Label landPlotPurposeLabel;
    @FXML private Label currentMarksLabel;
    @FXML private Label notesLabel;

    @FXML private ListView<Restriction> restrictionListView;
    @FXML private ListView<Contract> contractListView;
    @FXML private ListView<StateRegistration> registrationListView;

    @PostConstruct
    public void init(){
        landPlot = landPlotRepository.findAll().get(0);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        cadastralNumberLabel.setText(landPlot.getCadastralNumber());
        addressLabel.setText(landPlot.getAddress().toString());
        surfaceLabel.setText(landPlot.getSurface().toString() + "га");
        categoryLabel.setText(landPlot.getCategory());
        intendedUseLabel.setText(landPlot.getIntendedUse());
        landPlotPurposeLabel.setText(landPlot.getLandPlotPurpose());
        currentMarksLabel.setText(landPlot.getCurrentMarks());
        notesLabel.setText(landPlot.getNotes());
    }
}
