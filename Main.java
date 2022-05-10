package creational.builder;

public class Main {
    public static void main(String[] args) {

        Person father = new PersonBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setAge(31)
                .setAddress("Moscow")
                .build();
        Person son = father.newChildBuilder()
                .setName("Petr")
                .build();
        System.out.println("father - \n" + father
                + " \nSon - \n" + son);

        try {
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        try {
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

    }
}
