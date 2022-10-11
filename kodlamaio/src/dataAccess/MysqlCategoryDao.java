package dataAccess;

import entities.Category;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MysqlCategoryDao implements CategoryDao {
    List<Category> categories = new CopyOnWriteArrayList<Category>();

    public MysqlCategoryDao() {
        this.categories.add(new Category(1, "Programing"));
        this.categories.add(new Category(2, "Mobile App Development"));
        this.categories.add(new Category(3, "Graphic Design"));
        this.categories.add(new Category(4, "Embedded Development"));
    }

    @Override
    public void add(Category category) {
        categories.add(category);
    }

    @Override
    public Category getById(int id) {
        int searchId = id < 0 || categories.size() < id ? 0 : id;
        return categories.get(searchId);
    }

    @Override
    public List<Category> getAll() {
        return categories;
    }
}
