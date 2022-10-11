package core.loggers;

public class EmailLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println(message + " -> emaile loglandı.");
    }
}
