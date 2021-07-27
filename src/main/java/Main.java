public class Main {
    public static void main(String[] args) {
        Person person = new PersonBuilder()
                .setName("Ivan")
                .setSurname("Ivanov")
                .setCurrentCity("Krasnodar")
                .setAge(19)
                .build();

        System.out.println(person);
        System.out.println(person.hasAge());
        System.out.println(person.getAge());
        person.happyBirthday();
        System.out.println(person.getAge());
        System.out.println(person.hasCity());
        Person personSon = person.newChildBuilder()
                .setName("Misha")
                .setAge(1)
                .build();

        System.out.println(personSon);
    }
}
