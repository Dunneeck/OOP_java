import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    Logger log;
    FileHandler fileHandler;

public Logger Loger(){
    log = Logger.getAnonymousLogger();
    try {
        String logFilePath = "home_works/HomeWork_7/Calculator/src/logFile.log";

        int fileMaxSize = 1024 * 1024;
        int fileCount = 10;

        fileHandler = new FileHandler(logFilePath, fileMaxSize, fileCount, true);
        fileHandler.setFormatter(new SimpleFormatter());

        log.addHandler(fileHandler);
    } catch (Exception e){
        e.printStackTrace();
    }
    return log;
}
    
}