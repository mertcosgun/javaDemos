package dataAccess;

import entities.Category;

import java.util.List;

public interface CategoryDao {
    void add(Category category);
    Category getById(int id);
    List<Category> getAll();
}
