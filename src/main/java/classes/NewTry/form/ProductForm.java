package classes.NewTry.form;

/**
 * Created by user on 2016/3/21.
 */
public class ProductForm {
    private String name;
    private String description;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float price;
}
