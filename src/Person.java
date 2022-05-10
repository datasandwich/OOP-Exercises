public class Person {
    String name;
    int age;
    double height;
    double weight;

    public Person(String name, int age, double height, double weight) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
