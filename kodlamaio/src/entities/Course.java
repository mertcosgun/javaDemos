package entities;

public class Course {
    private int id;
    private String name;
    private double price;
    private int instructorId;
    private int categoryId;
    private String imagePath;
    private double percentageOfCompletion;

    public Course() {
    }

    public Course(int id, String name, double price, int instructorId, int  categoryId, String imagePath, double percentageOfCompletion) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.instructorId = instructorId;
        this.categoryId = categoryId;
        this.imagePath = imagePath;
        this.percentageOfCompletion = percentageOfCompletion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInstructor() {
        return instructorId;
    }

    public void setInstructor(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCategory() {
        return categoryId;
    }

    public void setCategory(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public double getPercentageOfCompletion() {
        return percentageOfCompletion;
    }

    public void setPercentageOfCompletion(double percentageOfCompletion) {
        this.percentageOfCompletion = percentageOfCompletion;
    }
}
