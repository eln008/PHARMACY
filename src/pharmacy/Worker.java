package pharmacy;

public class Worker {
    private String name;
    private int age;
    private String email;

    public Worker (String name, int age, String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
        if (!getEmail().equals("@")){
            System.out.println("Вы неправильно ввели свой email!!");
        }
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
