class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {

        Person pTemp = new Person();
        pTemp.name = p2.name;
        pTemp.age = p2.age;

        p2.name = p1.name;
        p2.age = p1.age;

        p1.name = pTemp.name;
        p1.age = pTemp.age;


    }
}