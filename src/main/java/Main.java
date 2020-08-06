import java.util.logging.*;

public class Main {
    private static final Logger logger = Logger.getLogger("");
    // private static final Logger logger = Logger.getLogger(Lesson_6.Main.class.getName());

    public static void main(String[] args) {


//        LogManager.getLogManager().readConfiguration(new FileInputStream("logging.properties"));
//
//        logger.setLevel(Level.ALL);
//
//        logger.getHandlers()[0].setLevel(Level.ALL);
//        logger.getHandlers()[0].setFormatter(new Formatter() {
//            @Override
//            public String format(LogRecord record) {
//                return record.getLevel() + "\t" + record.getMessage() + "\t" + record.getMillis() + "\n";
//            }
//        });
//
//        Handler handler = new FileHandler("mylog.log", true);
//        handler.setLevel(Level.ALL);
//        handler.setFormatter(new SimpleFormatter());
//        logger.addHandler(handler);
//
//
//        Handler h = new ConsoleHandler();
//        h.setFormatter(new SimpleFormatter());
//        logger.addHandler(h);
//
//
////        logger.getHandlers()[0].setFilter(new Filter() {
////            @Override
////            public boolean isLoggable(LogRecord record) {
////                return record.getMessage().startsWith("Java");
////            }
////        });
//
//        logger.log(Level.SEVERE, "Java");
//        logger.log(Level.INFO, "C#");
//        logger.log(Level.FINE, "Python");



        logger.setLevel(Level.ALL);

        logger.getHandlers()[0].setLevel(Level.ALL);
        logger.getHandlers()[0].setFormatter(new Formatter() {
            @Override
            public String format(LogRecord record) {
                return record.getLevel() + "\t" + record.getMessage() + "\t" + record.getMillis() + "\n";
            }
        });

//        logger.getHandlers()[0].setFilter(new Filter() {
//            @Override
//            public boolean isLoggable(LogRecord record) {
//                return record.getMessage().startsWith("C");
//            }
//        });


        


        logger.log(Level.SEVERE, "Java1");
        logger.log(Level.INFO, "C#");
        logger.log(Level.FINE, "Python");

        //OFF
        //SEVER
        //WAR
        //INFO
        //COMFIG
        //FINE
        //FINER - FINEST - ALL
    }
}
