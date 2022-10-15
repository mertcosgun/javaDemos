import business.CourseManager;
import core.loggers.BaseLogger;
import core.loggers.DatabaseLogger;
import core.loggers.FileLogger;
import dataAccess.OracleCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        BaseLogger[] loggers = {new DatabaseLogger(), new FileLogger()};
        CourseManager courseManager = new CourseManager(new OracleCourseDao(), loggers);

        courseManager.add(new Course(4, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 10,1, 1, "javascript_camp.png", 95.99));
        courseManager.add(new Course(5, "Yazılım Geliştirici Yetiştirme Kampı (Python)", 59.95, 1, 1, "python_camp.png", 0.0));


    }
}