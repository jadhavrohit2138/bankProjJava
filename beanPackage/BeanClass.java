package beanPackage;

public class BeanClass {
    private int id;
    private String name;
    private int bal;
    private String pass;


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

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public BeanClass(int id, String name, int bal, String pass) {
        this.id = id;
        this.name = name;
        this.bal = bal;
        this.pass = pass;
    }

    public BeanClass() {
    }
    @Override
    public String toString() {
        return getName();
    }


}
