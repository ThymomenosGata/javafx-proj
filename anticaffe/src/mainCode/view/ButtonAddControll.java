package mainCode.view;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class ButtonAddControll {
	@FXML 
	private TextField colPeopls;
	@FXML
	private TextField numTable;
	
	private Stage dialogStage;
	private boolean okClicked = false;
	
	@FXML
    private void initialize() {
    }
	
	public void setDialogStage(Stage dialogStage) {
        this.dialogStage = dialogStage;
    }
	
	public boolean isOkClicked() {
        return okClicked;
    }
	
	@FXML
    private void handleOk() {
		
		//Надо добавить то куда добавляться все будет.
		okClicked = true;
        dialogStage.close();
	}
	
	//private boolean isInputValid() {
    //    String errorMessage = "";
    //    return false;
    //    //Почитать про обработчик строк (ввода)
    //}
}
