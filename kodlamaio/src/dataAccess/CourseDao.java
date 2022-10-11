package dataAccess;

import entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    Course getById(int id);
    List<Course> getCourses();

}
