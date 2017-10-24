package mainCode.view;

import java.io.File;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import mainCode.DataBase;
import mainCode.MainClass;
import mainCode.Settings;


public class ButtonSettingsControll {
	
		private Stage dialogStage;
		@FXML
		public CheckBox checkKal;
		@FXML
		public CheckBox checkStopCheck;
		@FXML
		public CheckBox checkTea;
		@FXML
		public CheckBox checkVIP;
		@FXML
		public TextField kalHard;
		@FXML
		public TextField kalNorm;
		@FXML
		public TextField kalLight;
		@FXML
		public TextField priceTea;
		@FXML
		public TextField priceUnd;
		@FXML
		public TextField peoplsUndo;
		@FXML
		public TextField priceTo;
		@FXML
		public TextField peoplsTo;
		@FXML
		public TextField priceStopCheck;
		
		private MainClass mainClass;
		private ObservableList<Settings> Data = FXCollections.observableArrayList();
		
		public void setMain(MainClass mainClass) {
			this.mainClass = mainClass;
		}
		public void setData(ObservableList<Settings> data) {
			Data = data;
		}
		
		Boolean CK = false;
		Boolean CT = false;
		Boolean CV = false;
		Boolean CC = false;
		
		public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }
		
		public ButtonSettingsControll() {
		}
		public ButtonSettingsControll(ObservableList<Settings> data) {
			Data = data;
			System.out.println(Data.get(0).getCheckK());
			CK = Data.get(0).getCheckK();
			CT = Data.get(0).getCheckT();
			CV = Data.get(0).getCheckV();
			CC = Data.get(0).getCheck();			
		}
		
		@FXML
	    private void initialize() {
			if(CK)
				checkKal.setSelected(CK);
			else {
				checkKal.setSelected(false);
				kalHard.setDisable(true);
				kalNorm.setDisable(true);
				kalLight.setDisable(true);
			}
			if(CT)
				checkTea.setSelected(true);
			else {
				checkTea.setSelected(false);
				priceTea.setDisable(true);
			}
			if(CV)
				checkVIP.setSelected(true);
			else {
				checkVIP.setSelected(false);
				priceUnd.setDisable(true);
				priceTo.setDisable(true);
				peoplsTo.setDisable(true);
				peoplsUndo.setDisable(true);
			}
			if(CC)
				checkStopCheck.setSelected(true);
			else {
				checkStopCheck.setSelected(false);
				priceStopCheck.setDisable(true);
			}
		}
		
		@FXML
		private void settings() {
			//File personFile = mainClass.getPersonFilePath();
	        //if (personFile != null) {
	        //    mainClass.savePersonDataToFile(personFile);
	        //} else {
	        //    settings();
	        //}
			//Data.setAll();
			System.out.println(Data.get(0).getCheckK());
			System.out.println("CK:"+CK);
	        dialogStage.close();
		}
		
		@FXML
		private void handlCheckBoxKal() {
	        if(checkKal.isSelected()) {
	        	kalHard.setDisable(false);
				kalNorm.setDisable(false);
				kalLight.setDisable(false);
	        }
	        else {
	        	kalHard.setDisable(true);
				kalNorm.setDisable(true);
				kalLight.setDisable(true);
	        }
	        	
		}
		
		@FXML
		private void handlCheckBoxTea() {
	        if(checkTea.isSelected()) {
	        	priceTea.setDisable(false);
	        }
	        else {
	        	priceTea.setDisable(true);
	        }
	        	
		}
		@FXML
		private void handlCheckBoxVIP() {
	        if(checkVIP.isSelected()) {
	        	priceUnd.setDisable(false);
				priceTo.setDisable(false);
				peoplsTo.setDisable(false);
				peoplsUndo.setDisable(false);
	        }
	        else {
	        	priceUnd.setDisable(true);
				priceTo.setDisable(true);
				peoplsTo.setDisable(true);
				peoplsUndo.setDisable(true);
	        }
	        	
		}
		
		@FXML
		private void handlCheckBoxStopChek() {
			//BD.setCheck(checkStopCheck.isSelected());
	        if(checkStopCheck.isSelected()) {
	        	priceStopCheck.setDisable(false);
	        }
	        else {
	        	priceStopCheck.setDisable(true);
	        }
	        	
		}
}
