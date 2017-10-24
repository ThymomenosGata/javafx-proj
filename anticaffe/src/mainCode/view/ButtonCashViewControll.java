package mainCode.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ButtonCashViewControll {

private Stage dialogStage;
	
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public ButtonCashViewControll() {}
	
	@FXML
    private void initialize() {
	}
	
	@FXML
	private void handleOk() {
        dialogStage.close();
	}
}