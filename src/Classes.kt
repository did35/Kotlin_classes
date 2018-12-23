fun main(args: Array<String>) {
    open class Person(var firstName: String, var lastName: String) {
        var fullName = "$firstName $lastName"
    }

    class Adult(firstName: String, lastName: String, var age: String, var like: Boolean): Person(firstName, lastName)

    var persons = listOf(
        Adult("John", "Doe", "55", true),
        Adult("Janne", "Doe", "54", true),
        Adult("Kid_1", "Doe", "27", false),
        Adult("Kid_2", "Doe", "21", true),
        Adult("Kid_3", "Doe", "14", false)
    )

    for (person in persons) {
        if (person.age < "21") {
            println("I have ${person.fullName} who's ${person.age} years old, so ${person.firstName} can not drink alcohol!")
        } else if (!person.like) {
            println("I have ${person.fullName} who's ${person.age} years old, he has the age to drink alcohol but he doesn't like it.")
        }  else {
            println("I have ${person.fullName} who's ${person.age} years old, so ${person.firstName} can drink alcohol!.")
        }
    }
}