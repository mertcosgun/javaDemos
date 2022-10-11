package dataAccess;

import entities.Course;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MysqlCourseDao implements CourseDao {
    List<Course> courses = new CopyOnWriteArrayList<Course>();

    public MysqlCourseDao() {
        this.courses.add(new Course(1, "(2022) Yazılım geliştirici Yetiştirme Kampı JAVA", 1, 1, "java_camp_22.png", 95.99));
        this.courses.add(new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 1, 1, "senior_dev_camp.png", 25));
        this.courses.add(new Course(3, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 1, 1, "java_react_camp.png", 85.89));
    }

    @Override
    public void add(Course course) {
        courses.add(course);
    }

    @Override
    public Course getById(int id) {
        int searchId = id < 0 || courses.size() < id ? 0 : id;
        return courses.get(searchId);
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }
}
