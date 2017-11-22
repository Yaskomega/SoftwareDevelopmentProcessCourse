package main.java;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage)       //generate the main game window
    {
        try
        {
            Parent root = FXMLLoader.load(getClass().getResource("/main/java/Board.fxml"));
            Scene scene = new Scene(root, 1280, 720);
            primaryStage.setTitle("Test App");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //launch(args);     //open the main game window
        Game game = new Game();
        game.Init();
        //game.Launch();
    }
}
