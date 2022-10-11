package dataAccess;

import entities.Instructor;

import java.util.List;

public interface InstructorDao {
    void add(Instructor instructor);
    Instructor getById(int id);
    List<Instructor> getAllInstructors();
}
