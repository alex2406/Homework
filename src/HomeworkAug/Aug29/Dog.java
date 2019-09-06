package HomeworkAug.Aug29;

public class Dog {

    public static final String GENUS = "Canine";
    private String name = "unknown";
    private int age;
    private String breed;
    private String genre;

    {
        System.out.println(name + "A smol dog appeared");
    }

    public Dog() {
        this("Vasea", 25, "Street", "boi");
    }

    {
        System.out.println("Is getting there");
    }

    public Dog(String name) {
        this(name, 2, "Maine Coon", "boi");
    }

    {
        System.out.println("Is getting there");
    }

    public Dog(String name, int age, String breed) {
        this(name, age, breed, "girl");
    }

    {
        System.out.println("Is getting there");
    }

    public void run() {
        System.out.println(name + "is running");
    }

    public void bark() {
        System.out.println(name + "is barking");
    }

    public void howl() {
        System.out.println(name + "is howling");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name=name;}

    public int getAge() {
        return age;
    }
    public void setAge(int age) {this.age=age;}

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {this.breed=breed;}

    public Dog(String name, int age, String breed, String genre) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.genre = genre;
    }

}
