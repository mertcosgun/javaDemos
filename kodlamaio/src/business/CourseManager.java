package business;

import core.loggers.BaseLogger;
import core.validators.Validator;
import dataAccess.CourseDao;
import entities.Course;

import java.util.List;


public class CourseManager {
    private CourseDao courseDao;
    private BaseLogger[] loggers;

    public CourseManager(CourseDao courseDao, BaseLogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {
        for (Course dbCourse : courseDao.getCourses()) {
            if (!Validator.isUnique(dbCourse.getName(), course.getName())) {
                if (course.getPrice() > 0) {
                    courseDao.add(course);
                    System.out.println(course.getName() + "kurs eklendi.");
                    for (BaseLogger logger : loggers) {
                        logger.log(course.getName() + " kurs başarıyla eklendi");
                    }
                    return;
                } else {
                    System.out.println("Kurs fiyatı 0'a eşit olamaz.");
                }
            } else {
                System.out.println(course.getName() + " zaten mevcut");
            }
        }
    }

    public Course getCourseById(int id) {
        return courseDao.getById(id);
    }

    public List<Course> getCourses() {
        return courseDao.getCourses();
    }
}
