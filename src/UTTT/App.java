package UTTT;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 *
 * @author PC
 */
public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/UTTT/gui/view/MenuScene.fxml"));
        primaryStage.setTitle("Battery vs USB");
        primaryStage.setScene(new Scene(root, 900, 700));
        primaryStage.setTitle("Battery vs USB");
        primaryStage.show();
    }


    public static void main(String[] args) throws IOException {
        launch(args);
    }
}
