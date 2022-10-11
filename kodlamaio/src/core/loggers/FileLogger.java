package core.loggers;

public class FileLogger implements BaseLogger{
    @Override
    public void log(String message) {
        System.out.println(message + " -> dosyaya loglandı.");
    }
}
