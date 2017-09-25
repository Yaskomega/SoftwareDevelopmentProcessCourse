import org.apache.log4j.Logger;


public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Hello World !");
        LOGGER.error("Hello World !");
    }
}