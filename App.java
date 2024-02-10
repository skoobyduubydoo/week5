

public class App {
                                        ///////////////////////////////////Asterisk log input prompt//////////////////////////////////////////
    public static void main(String[] args) 
{

    AsteriskLogger asteriskLogger = new AsteriskLogger();
        asteriskLogger.Log();
        asteriskLogger.Error();

    System.out.print("\n");

    SpacedLogger spacedLogger = new SpacedLogger();
        spacedLogger.Log();
        spacedLogger.Error();

    }
}
