package roger.steinbakk.com.handleliste;

public class Grocery {
    private String name;
    private boolean isAdded;

    public Grocery(String name) {
        this.name = name;
        this.isAdded = false; // dette trenger vi ikke fordi boolean automatisk er false
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
