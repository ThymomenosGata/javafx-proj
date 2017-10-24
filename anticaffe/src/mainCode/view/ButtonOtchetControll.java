package mainCode.view;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ButtonOtchetControll {
	
	private Stage dialogStage;
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public ButtonOtchetControll() {}
	
	@FXML
    private void initialize() {
	}
	
	@FXML
	private void handleOk() {
        dialogStage.close();
	}
}