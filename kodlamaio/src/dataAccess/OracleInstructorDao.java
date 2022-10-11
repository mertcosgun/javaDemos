package dataAccess;

import entities.Instructor;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class OracleInstructorDao implements InstructorDao {
    List<Instructor> instructors = new CopyOnWriteArrayList<Instructor>();

    public OracleInstructorDao() {
        this.instructors.add(new Instructor(1, "Engin", "Demirog", "engin_demirog.png"));
        this.instructors.add(new Instructor(2, "Mert", "Coşgun", "mert_cosgun.jpg"));
    }

    @Override
    public void add(Instructor instructor) {
        instructors.add(instructor);
    }

    @Override
    public Instructor getById(int id) {
        int searchId = id < 0 || instructors.size() < id ? 0 : id;
        return instructors.get(searchId);
    }

    @Override
    public List<Instructor> getAllInstructors() {
        return instructors;
    }
}
