package business;

import core.loggers.BaseLogger;
import core.validators.Validator;
import dataAccess.InstructorDao;
import entities.Instructor;

import java.util.List;

public class InstructorManager {
    private BaseLogger[] loggers;
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao, BaseLogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        for (Instructor dbInstructor : instructorDao.getAllInstructors()) {
            if (!Validator.isUnique(dbInstructor.getFullName(), instructor.getFullName())) {
                instructorDao.add(instructor);
                for (BaseLogger logger : loggers) {
                    logger.log(instructor.getFullName() + " eğitmen başarıyla eklendi");
                }
                return;
            } else {
                System.out.println(instructor.getFullName() + " bu eğitmen zaten mevcut.");
            }
        }
    }


    public Instructor getById(int id) {
        return instructorDao.getById(id);
    }

    public List<Instructor> getAllInstructors() {
        return instructorDao.getAllInstructors();
    }


}
