package Mashq4;

import java.io.IOException;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger=Logger.getLogger(Main.class.getName());

        MyCustomHandler myCustomHandler=new MyCustomHandler();
        myCustomHandler.setFormatter(new MyCustomFormatter());
        logger.addHandler(myCustomHandler);
        try {
            throw new RuntimeException();
        }catch (RuntimeException e){
            logger.log(Level.SEVERE,"xatolik-> "+e);
        }



    }
}