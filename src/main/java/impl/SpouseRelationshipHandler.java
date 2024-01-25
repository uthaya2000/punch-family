package impl;

import interfaces.RelationshipHandler;
import pojo.Person;

public class SpouseRelationshipHandler implements RelationshipHandler {
    @Override
    public void handleRelationship(Person person1, Person person2) {
        person1.addWives(person2);
    }

    @Override
    public void showRelationship(Person person) {
        System.out.println("Wives of person named " + person.getName() + " are: ");
        person.getWives().stream().map(Person::getName).forEach(System.out::println);
    }
}
