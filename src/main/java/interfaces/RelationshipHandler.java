package interfaces;

import pojo.Person;

public interface RelationshipHandler {
    void handleRelationship(Person person1, Person person2);
    void showRelationship(Person person);
}
