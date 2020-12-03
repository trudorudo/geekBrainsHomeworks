package client;


import com.sun.tools.javac.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.lang.reflect.Parameter;
import java.net.Socket;

public class EchoClient extends Application {
    public static final List<String> USER_TEST_DATE = List.of("Boris", "Petya", "Masha");
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(EchoClient.class.getResource("view.fxml");

        Parent root = loader.load();
        
        primaryStage.setTitle("Messenger");
        primaryStage.setScene(new Scene(root, 600,400));
        primaryStage.show();

        Network network = new Network();
        if(!network.connect()){
            showErrorMessage("","Connection Error Occurred");
        }

        ViewController viewController = loader.getController();
        viewController.setNetwork(network);

        network.waitMessage(viewController);

        primaryStage.setOnCloseRequest(windowEvent->network.close());
    }

    public static void showErrorMessage(String message, String errorMessage){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Connection Errors");
        alert.setHeaderText(errorMessage);
        alert.setContentText(message);
        alert.showAndWait();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
