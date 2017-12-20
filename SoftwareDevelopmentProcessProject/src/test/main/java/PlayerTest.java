
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

public class PlayerTest {
    protected List<Card> mainJoueur;
    protected List<Card> kingdom;
    protected Player p1;
    protected Game game;
    @Before

    public void setUp() throws Exception {
        game = new Game();
        mainJoueur = new ArrayList<Card>();
        kingdom = new ArrayList<Card>();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInit() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        mainJoueur = p1.getHand();
        long taille = mainJoueur.size();
        assertEquals(5,taille);

    }
    @Test
    public void testDraw() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        p1.Draw(game.getDeck());
        mainJoueur = p1.getHand();
        long taille2 = mainJoueur.size();
        assertEquals(6, taille2);
    }
    @Test
    public void testChooseCardFromHand() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        Card carte = p1.ChooseCardFromHand();
        mainJoueur = p1.getHand();
        long taille = mainJoueur.size();
        assertEquals(4,taille);

    }
    @Test
    public void testAddCardToKingdom() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        Troll carteTroll = new Troll();
        p1.AddCardToKingdom(carteTroll);
        kingdom = p1.getKingdom();
        long taille = kingdom.size();
        assertEquals(1, taille);
    }
    @Test
    public void testAddCardToHand() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        Troll carteTroll = new Troll();
        p1.AddCardToHand(carteTroll);
        mainJoueur = p1.getHand();
        long taille = mainJoueur.size();
        assertEquals(6, taille);
    }
    @Test
    public void testChooseCardFromKingdom() throws Exception {
        game.Init();
        p1 = game.getPlayer1();
        Troll carteTroll = new Troll();
        p1.AddCardToKingdom(carteTroll);
        Card carte = p1.ChooseCardFromKingdom();
        kingdom = p1.getKingdom();
        long taille = kingdom.size();
        assertEquals(0, taille);
    }
    @Test
    public void testUseCard() throws Exception {
        game.Init();
        Gnome carteGnome = new Gnome();
        p1 = game.getPlayer1();
        p1.UseCard(game,carteGnome);
        mainJoueur = p1.getHand();
        long taille = mainJoueur.size();
        assertEquals(7,taille);

    }

}