public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        if (name != null) {
            this.name = name;
            return this;
        } else throw new IllegalArgumentException("Не указано имя");
    }

    public PersonBuilder setSurname(String surname) {
        if (surname != null) {
            this.surname = surname;
            return this;
        } else throw new IllegalArgumentException("Не указана фамилия");
    }

    public PersonBuilder setAge(int age) {
        if (age >= 0) {
            this.age = age;
            return this;
        } else throw new IllegalArgumentException("Возраст указан некорректно");
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null) throw new IllegalArgumentException("Не указано имя");
        else if (surname == null) throw new IllegalArgumentException("Не указана фамилия");
        else
            return new Person(name, surname, age, address);
    }
}
