package ro.fasttrackit.course11.code.person;

public record Person(
        String firstName,
        String lastName,
        Integer age
) {

    private Person(PersonBuilder builder) {
        this(builder.firstName, builder.lastName, builder.age);
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private Integer age;

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
