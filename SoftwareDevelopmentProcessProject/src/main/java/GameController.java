import java.util.List;

import javafx.beans.binding.Bindings;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


import java.util.ArrayList;

public class GameController {

    private Game game;
    private Player player1;
    private Player player2;
    private List<Card> deck;
    private SimpleIntegerProperty deckSize = new SimpleIntegerProperty(this,"deckSize");
    private SimpleIntegerProperty player1handSize = new SimpleIntegerProperty(this,"player1HandSize");
    private SimpleIntegerProperty player2handSize = new SimpleIntegerProperty(this,"player2HandSize");
    private SimpleIntegerProperty player1KingdomSize = new SimpleIntegerProperty(this,"player1KingdomSize");
    private SimpleIntegerProperty player2KingdomSize = new SimpleIntegerProperty(this,"player2kingdomSize");


    @FXML
    Button btnStart;

    @FXML
    Button btnDrawPlayer1;

    @FXML
    Button btnDrawPlayer2;

    @FXML
    Button btnAddToKingdomPlayer1;

    @FXML
    Button btnAddToKingdomPlayer2;

    @FXML
    TextField txtDeckCounter;

    @FXML
    TextField txtPlayer1HandCounter;

    @FXML
    TextField txtPlayer2HandCounter;

    @FXML
    TextField txtPlayer1KingdomCounter;

    @FXML
    TextField txtPlayer2kingdomCounter;


    @FXML
    public void StartGame(ActionEvent event) throws Exception{
        try{
            game = new Game();
            game.Init();
            deck = game.getDeck();
            player1 = game.getPlayer1();
            player2 = game.getPlayer2();

            deckSize.set(deck.size());
            txtDeckCounter.textProperty().bind(Bindings.convert(deckSize));
            txtDeckCounter.setEditable(false);

            player1handSize.set(player1.getHand().size());
            txtPlayer1HandCounter.textProperty().bind(Bindings.convert(player1handSize));
            txtPlayer1HandCounter.setEditable(false);

            player2handSize.set(player2.getHand().size());
            txtPlayer2HandCounter.textProperty().bind(Bindings.convert(player2handSize));
            txtPlayer2HandCounter.setEditable(false);

            player1KingdomSize.setValue(0);
            txtPlayer1KingdomCounter.textProperty().bind(Bindings.convert(player1KingdomSize));
            txtPlayer1KingdomCounter.setEditable(false);

            player2KingdomSize.setValue(0);
            txtPlayer2kingdomCounter.textProperty().bind(Bindings.convert(player2KingdomSize));
            txtPlayer2kingdomCounter.setEditable(false);

            //Pop up yugioh
            /*Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("New game");
            alert.setHeaderText("It's time for D-D-D-D-UEL");
            alert.setContentText("A new game has started.");
            Image image = new Image(getClass().getResource("duel.jpg").toExternalForm());
            ImageView imageView = new ImageView(image);
            alert.setGraphic(imageView);
            alert.showAndWait();*/
            //End pop up yugioh
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Player1DrawCard(ActionEvent event) throws Exception{
        try{
            if (deckSize.getValue() >0) {
                player1.Draw(deck);
                deckSize.setValue(deckSize.getValue()-1);
                player1handSize.setValue(player1handSize.getValue()+1);
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void Player2DrawCard(ActionEvent event) throws Exception{
        try{
            if (deckSize.getValue() >0){
                player2.Draw(deck);
                deckSize.setValue(deckSize.getValue()-1);
                player2handSize.setValue(player2handSize.getValue()+1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Player1AddToKingdom(ActionEvent event) throws Exception{
        try{
            if(player1handSize.getValue() > 0) {
                Card cardToAdd;
                cardToAdd = player1.ChooseCardFromHand();
                player1.AddCardToKingdom(cardToAdd);
                player1handSize.setValue(player1handSize.getValue() - 1);
                player1KingdomSize.setValue(player1KingdomSize.getValue() + 1);
            }
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION, "Hand is empty !! Do you want to draw a Card ?", ButtonType.OK, ButtonType.CANCEL);
                alert.setTitle("Error");
                alert.setHeaderText("Player Error");
                alert.showAndWait();
                if(alert.getResult() == ButtonType.OK){
                    Player1DrawCard(event);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void Player2AddToKingdom(ActionEvent event) throws Exception{
        try{
            if(player2handSize.getValue() > 0) {
                Card cardToAdd;
                cardToAdd = player2.ChooseCardFromHand();
                player2.AddCardToKingdom(cardToAdd);
                player2handSize.setValue(player2handSize.getValue() - 1);
                player2KingdomSize.setValue(player2KingdomSize.getValue() + 1);
            }
            else{
                Alert alert = new Alert(AlertType.CONFIRMATION, "Hand is empty !! Do you want to draw a Card ?", ButtonType.OK, ButtonType.CANCEL);
                alert.setTitle("Error");
                alert.setHeaderText("Player Error");
                alert.showAndWait();
                if(alert.getResult() == ButtonType.OK){
                    Player2DrawCard(event);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
