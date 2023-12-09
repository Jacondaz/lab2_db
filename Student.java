public class Student {
    private int id;
    private String name;
    private String adress;
    private int age;

    public Student(int id, String name, String adress, int age) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAdress() {
        return this.adress;
    }
    public int getAge() {
        return this.age;
    }
}
