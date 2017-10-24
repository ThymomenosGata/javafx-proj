package mainCode;

import java.io.File;
import java.io.IOException;
import java.util.prefs.Preferences;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Modality;
import javafx.stage.Stage;
import mainCode.view.ButtonAboutControll;
import mainCode.view.ButtonAddControll;
import mainCode.view.ButtonCashViewControll;
import mainCode.view.ButtonOtchetControll;
import mainCode.view.ButtonSettingsControll;
import mainCode.view.MainController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainClass extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;
	private Settings settings;
	
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Антикафе");
		
		initRootLayout();
		showPersonOverview();
	}
	
	 private ObservableList<Settings> Data = FXCollections.observableArrayList();
	
	public MainClass() {
		Data.add(new Settings(true,false,false,false));
	}
	
	public ObservableList<Settings> getData() {
        return Data;
    }
	
	public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();
            MainController controller = loader.getController();
            controller.setMainClass(this);
            controller.setDialogStage(primaryStage);
            controller.setSettings(settings);
            controller.setData(Data);
            // Отображаем сцену, содержащую корневой макет.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	public void showPersonOverview() {
        try {
            // Загружаем сведения об адресатах.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainClass.class.getResource("view/personView.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            MainController controller = loader.getController();
            controller.setMainClass(this);
            controller.setData(Data);

            // Помещаем сведения об адресатах в центр корневого макета.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	 public Stage getPrimaryStage() {
	        return primaryStage;
	 }
	 
	 
	 public boolean showPersonEditDialog() {
		    try {
		        // Загружаем fxml-файл и создаём новую сцену
		        // для всплывающего диалогового окна.
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(MainClass.class.getResource("view/addNewPeopls.fxml"));
		        AnchorPane page = (AnchorPane) loader.load();

		        // Создаём диалоговое окно Stage.
		        Stage dialogStage = new Stage();
		        dialogStage.setTitle("Добавление людей");
		        dialogStage.initModality(Modality.WINDOW_MODAL);
		        dialogStage.initOwner(primaryStage);
		        Scene scene = new Scene(page);
		        dialogStage.setScene(scene);

		        // Передаём dialogStage в контроллер.
		        ButtonAddControll controller = loader.getController();
		        controller.setDialogStage(dialogStage);

		        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
		        dialogStage.showAndWait();
		        return true;
		    } catch (IOException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
	 
	 
	 public boolean showAboutDialog() {
		    try {
		        // Загружаем fxml-файл и создаём новую сцену
		        // для всплывающего диалогового окна.
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(MainClass.class.getResource("view/aboutLayout.fxml"));
		        AnchorPane page = (AnchorPane) loader.load();

		        // Создаём диалоговое окно Stage.
		        Stage dialogStage = new Stage();
		        dialogStage.setTitle("О программе..");
		        dialogStage.initModality(Modality.WINDOW_MODAL);
		        dialogStage.initOwner(primaryStage);
		        Scene scene = new Scene(page);
		        dialogStage.setScene(scene);

		        // Передаём адресата в контроллер.
		        ButtonAboutControll controller = loader.getController();
		        controller.setDialogStage(dialogStage);

		        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
		        dialogStage.showAndWait();
		        return true;
		    } catch (IOException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
	 
	 public boolean showSettingsDialog() {
		    try {
		        // Загружаем fxml-файл и создаём новую сцену
		        // для всплывающего диалогового окна.
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(MainClass.class.getResource("view/settings.fxml"));
		        AnchorPane page = (AnchorPane) loader.load();

		        // Создаём диалоговое окно Stage.
		        Stage dialogStage = new Stage();
		        dialogStage.setTitle("Настройки");
		        dialogStage.initModality(Modality.WINDOW_MODAL);
		        dialogStage.initOwner(primaryStage);
		        Scene scene = new Scene(page);
		        dialogStage.setScene(scene);
		        
		        
		     // Передаём список настроек в контроллер.
		        ButtonSettingsControll controller = loader.getController();
		        controller.setDialogStage(dialogStage);
		        controller.setData(Data);
		        controller = new ButtonSettingsControll(Data);
		        
		        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
		        dialogStage.showAndWait();
		        return true;
		    } catch (IOException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
	 
	 public boolean showOtchetDialog() {
		    try {
		        // Загружаем fxml-файл и создаём новую сцену
		        // для всплывающего диалогового окна.
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(MainClass.class.getResource("view/otchet.fxml"));
		        AnchorPane page = (AnchorPane) loader.load();

		        // Создаём диалоговое окно Stage.
		        Stage dialogStage = new Stage();
		        dialogStage.setTitle("Отчёт");
		        dialogStage.initModality(Modality.WINDOW_MODAL);
		        dialogStage.initOwner(primaryStage);
		        Scene scene = new Scene(page);
		        dialogStage.setScene(scene);
		        
		     // Передаём адресата в контроллер.
		        ButtonOtchetControll controller = loader.getController();
		        controller.setDialogStage(dialogStage);

		        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
		        dialogStage.showAndWait();
		        return true;
		    } catch (IOException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
	 
	 public boolean showCashViewDialog() {
		    try {
		        // Загружаем fxml-файл и создаём новую сцену
		        // для всплывающего диалогового окна.
		        FXMLLoader loader = new FXMLLoader();
		        loader.setLocation(MainClass.class.getResource("view/cashView.fxml"));
		        AnchorPane page = (AnchorPane) loader.load();

		        // Создаём диалоговое окно Stage.
		        Stage dialogStage = new Stage();
		        dialogStage.setTitle("Прибыль");
		        dialogStage.initModality(Modality.WINDOW_MODAL);
		        dialogStage.initOwner(primaryStage);
		        Scene scene = new Scene(page);
		        dialogStage.setScene(scene);
		        
		     // Передаём адресата в контроллер.
		        ButtonCashViewControll controller = loader.getController();
		        controller.setDialogStage(dialogStage);

		        // Отображаем диалоговое окно и ждём, пока пользователь его не закроет
		        dialogStage.showAndWait();
		        return true;
		    } catch (IOException e) {
		        e.printStackTrace();
		        return false;
		    }
		}
	 
	/* public void loadPersonDataFromFile(File file) {
		    try {
		        JAXBContext context = JAXBContext
		                .newInstance(PersonListWrapper.class);
		        Unmarshaller um = context.createUnmarshaller();

		        // Чтение XML из файла и демаршализация.
		        PersonListWrapper wrapper = (PersonListWrapper) um.unmarshal(file);

		        Data.clear();
		        Data.addAll(wrapper.getPersons());
		        String s;
		        
		        // Сохраняем путь к файлу в реестре.
		        setPersonFilePath(file);

		    } catch (Exception e) { // catches ANY exception
		        Alert alert = new Alert(AlertType.ERROR);
		        alert.setTitle("Error");
		        alert.setHeaderText("Could not load data");
		        alert.setContentText("Could not load data from file:\n" + file.getPath());

		        alert.showAndWait();
		    }
		}*/
	 /*public void savePersonDataToFile(File file) {
		    try {
		        JAXBContext context = JAXBContext
		                .newInstance(PersonListWrapper.class);
		        Marshaller m = context.createMarshaller();
		        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		        // Обёртываем наши данные об адресатах.
		        PersonListWrapper wrapper = new PersonListWrapper();
		        wrapper.setPersons(Data);

		        // Маршаллируем и сохраняем XML в файл.
		        m.marshal(wrapper, file);

		        // Сохраняем путь к файлу в реестре.
		        setPersonFilePath(file);
		    } catch (Exception e) { // catches ANY exception
		        Alert alert = new Alert(AlertType.ERROR);
		        alert.setTitle("Error");
		        alert.setHeaderText("Could not save data");
		        alert.setContentText("Could not save data to file:\n" + file.getPath());

		        alert.showAndWait();
		    }
		}
	 
	 public File getPersonFilePath() {
		    Preferences prefs = Preferences.userNodeForPackage(MainClass.class);
		    String filePath = prefs.get("settings", null);
		    if (filePath != null) {
		        return new File(filePath);
		    } else {
		        return null;
		    }
		}
	 
	 public void setPersonFilePath(File file) {
		    Preferences prefs = Preferences.userNodeForPackage(MainClass.class);
		    if (file != null) {
		        prefs.put("settings", file.getPath());

		        // Обновление заглавия сцены.
		        primaryStage.setTitle("AddressApp - " + file.getName());
		    } else {
		        prefs.remove("settings");

		        // Обновление заглавия сцены.
		        primaryStage.setTitle("AddressApp");
		    }
		}*/
		 
	public static void main(String[] args) {
		launch(args);
	}
	
}
