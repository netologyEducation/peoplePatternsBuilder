public class PersonBuilder {
    private String name;
    private String surname;
    private Integer age;
    private String currentCity;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        if (age <= 0) throw new IllegalStateException("Некорректный возраст");
        this.age = age;
        return this;
    }

    public Person build() {
        if (name == null || "".equals(name)) {
            throw new IllegalStateException("Пустое имя");
        }
        if (surname == null || "".equals(surname)) {
            throw new IllegalStateException("Пустая фамилия");
        }
        Person person = new Person(name, surname, age, currentCity);
        return person;
    }
}
