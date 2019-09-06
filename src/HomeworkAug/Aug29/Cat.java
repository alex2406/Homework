package HomeworkAug.Aug29;

public class Cat {
    public static final String GENUS = "Feline";
    private String name = "unknown";
    private int age;
    private String breed;
    private String genre;

    {
        System.out.println(name + "A smol KAT appeared");
    }

    public Cat() {
        this("Vasea", 25, "Street", "boi");
    }

    public Cat(String name) {
        this(name, 2, "Maine Coon", "boi");
    }

    public Cat(String name, int age, String breed) {
        this(name, age, breed, "girl");
    }


    public void meow() {
        System.out.println(name + " is meowing");
    }

    public void run() {
        System.out.println(name + " is running");
    }

    public void purr() {
        System.out.println(name + " is purring");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Cat(String name, int age, String breed, String genre) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.genre = genre;
    }
}
