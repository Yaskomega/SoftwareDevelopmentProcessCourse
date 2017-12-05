package main.java;

import java.util.List;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.util.ArrayList;

public class GameController {
    private Game game;
    private Player player1;
    private Player player2;
    private List<Card> deck;

    @FXML
    Button btnStart;

    @FXML
    Button btnDrawPlayer1;

    @FXML
    Button btnDrawPlayer2;

    @FXML
    Button btnAddToKingdom;

    @FXML
    public void StartGame(ActionEvent event) throws Exception{
        try{
            game = new Game();
            game.Init();
            deck = game.getDeck();
            player1 = game.getPlayer1();
            player2 = game.getPlayer2();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void DrawCard(ActionEvent event) throws Exception{
        try{
            player1.Draw(deck);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void AddToKingdom(ActionEvent event) throws Exception{
        try{
            Card cardToAdd;
            cardToAdd = player1.ChooseCardFromHand();
            player1.AddCardToKingdom(cardToAdd);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
