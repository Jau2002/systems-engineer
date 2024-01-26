package models;

public class Persona {
    private String name;
    private int age;

    public Persona() {
        name = "   ";
        age = 0;
    }

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" +
                "age: " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean esMayor(Persona person) {
        return this.age < person.getAge() ? true : false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
