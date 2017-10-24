package mainCode.view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.stage.Stage;
import mainCode.DataBase;
import mainCode.MainClass;
import mainCode.Settings;

public class MainController {
	
	private Stage dialogStage;		
	private MainClass mainClass;
	private Settings settings;
	private ObservableList<Settings> Data = FXCollections.observableArrayList();
	public String col;
	
	public MainController() {}
	
	@FXML
    private void initialize() {
	}
	
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
	
	public void setData(ObservableList<Settings> data) {
		Data = data;
	}
	
	public ObservableList<Settings> getData() {
		return Data;
	}

	public void setDialogStage(Stage dialogStage) {
      this.dialogStage = dialogStage;
    }
	
	public void setMainClass(MainClass mainClass) {
        this.mainClass = mainClass;
	}
	
	
	@FXML
	private void handleNewPerson() {
		mainClass.showPersonEditDialog();
	}
	
	@FXML
	private void handleAdout() {
		mainClass.showAboutDialog();
	}
	
	@FXML
	private void handleSettings() {
		mainClass.showSettingsDialog();
	}
	
	@FXML
	private void handleOtchet() {
		mainClass.showOtchetDialog();
	}
	
	@FXML
	private void handleCashView() {
		mainClass.showCashViewDialog();
	}
	
	@FXML
	private void handleNewTable() {
		//
		System.out.println(Data.get(0).getCheck());
	}
	
	@FXML
	private void close() {
		dialogStage.close();
	}
	
	
	
	
	
}
