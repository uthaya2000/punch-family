package impl;

import interfaces.RelationshipHandler;
import pojo.Gender;
import pojo.Person;

public class FatherSonRelationshipHandler implements RelationshipHandler {
    @Override
    public void handleRelationship(Person person1, Person person2) {
        person2.setGender(Gender.MALE);
        person1.addChild(person2);
        person2.setFather(person1);
    }

    @Override
    public void showRelationship(Person person) {
        System.out.println("Sons of person named " + person.getName() + " are: ");
        person.getChildren().stream()
                .filter(child -> child.getGender() == Gender.valueOf("MALE"))
                .map(Person::getName).forEach(System.out::println);
    }
}
