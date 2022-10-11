package business;

import core.loggers.BaseLogger;
import core.validators.Validator;
import dataAccess.CategoryDao;
import entities.Category;

import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private BaseLogger[] loggers;

    public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        if (categoryDao.getAll().size() > 0) {
            for (Category dbCategory : categoryDao.getAll()) {
                if (!Validator.isUnique(dbCategory.getName(), category.getName())) {
                    categoryDao.add(category);
                    System.out.println(category.getName() + " Kategori eklendi.");
                    for (BaseLogger logger : loggers) {
                        logger.log(category.getName() + " kategori eklendi");
                    }
                    return;
                } else {
                    System.out.println(category.getName() + " zaten mevcut.");
                }

            }
        }

    }

    public Category getCategoryById(int id) {
        return categoryDao.getById(id);
    }

    public List<Category> getCategories() {
        return categoryDao.getAll();
    }
}
