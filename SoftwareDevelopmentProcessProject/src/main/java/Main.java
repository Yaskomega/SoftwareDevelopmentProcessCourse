import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage)       //generate the main game window
    {
        try
        {
            URL url = getClass().getResource("Board.fxml");
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root, 1280, 760);
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
        launch(args);     //open the main game window
        Game game = new Game();
        game.Init();
        game.Launch();
    }
}