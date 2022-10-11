package core.loggers;

public class DatabaseLogger implements BaseLogger {
    @Override
    public void log(String message) {
        System.out.println(message + " -> veritabanına loglandı.");
    }
}
