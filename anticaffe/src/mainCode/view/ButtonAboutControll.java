package mainCode.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;


public class ButtonAboutControll {
		
		private Stage dialogStage;
		
		
		public void setDialogStage(Stage dialogStage) {
	        this.dialogStage = dialogStage;
	    }
		
		public ButtonAboutControll() {}
		
		@FXML
	    private void initialize() {
		}
		
		@FXML
		private void about() {
	        dialogStage.close();
		}
}
