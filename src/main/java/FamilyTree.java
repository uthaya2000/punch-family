import impl.FatherDaughterRelationshipHandler;
import impl.FatherSonRelationshipHandler;
import impl.SpouseRelationshipHandler;
import interfaces.RelationshipHandler;
import pojo.Gender;
import pojo.Person;

import java.text.MessageFormat;
import java.util.Map;

public class FamilyTree {
    private final Map<String, Person> connectionMap;
    private final Map<String, RelationshipHandler> relationshipHandlerMap;

    public FamilyTree(Map<String, Person> connectionMap, Map<String, RelationshipHandler> relationshipHandlerMap) {
        this.connectionMap = connectionMap;
        this.relationshipHandlerMap = relationshipHandlerMap;
    }

    public void addPerson(String name) {
        connectionMap.put(name, new Person(name));
        System.out.println(name + " Person Added");
    }

    public void addRelationship(String relation) {
        relation = relation.toLowerCase();
        switch (relation) {
            case "spouse":
            case "wife":
            case "wives":
                relationshipHandlerMap.put("spouse", new SpouseRelationshipHandler());
                relationshipHandlerMap.put("wife", new SpouseRelationshipHandler());
                relationshipHandlerMap.put("wives", new SpouseRelationshipHandler());
                break;
            case "son":
            case "sons":
                relationshipHandlerMap.put("son", new FatherSonRelationshipHandler());
                relationshipHandlerMap.put("sons", new FatherSonRelationshipHandler());
                break;
            case "daughter":
            case "daughters":
                relationshipHandlerMap.put("daughter", new FatherDaughterRelationshipHandler());
                relationshipHandlerMap.put("daughters", new FatherDaughterRelationshipHandler());
                break;
            default:
               break;
        }
        System.out.println(relation + " Relation Added");
    }

    public void connectPerson(String name1, String name2, String relation) {
        Person person1 = connectionMap.get(name1);
        Person person2 = connectionMap.get(name2);
        RelationshipHandler handler = relationshipHandlerMap.get(relation.toLowerCase());
        if (person1 != null && person2 != null) {
            if (handler != null) {
                handler.handleRelationship(person2, person1);
                System.out.println(MessageFormat.format("Added Successfully- {0} is {1} of {2}"
                        , name1, relation, name2));
            } else {
                System.out.println("Relation NOT FOUND");
            }
        } else {
            System.out.println("Names not Found");
        }
    }

    public int countSons(String name) {
        Person person = connectionMap.get(name);
        if (person != null) {
            return (int) person.getChildren().stream()
                    .filter(child -> child.getGender() == Gender.valueOf("MALE"))
                    .count();
        }
        return 0;
    }

    public int countDaughters(String name) {
        Person person = connectionMap.get(name);
        if (person != null) {
            return (int) person.getChildren().stream()
                    .filter(child -> child.getGender() == Gender.valueOf("FEMALE"))
                    .count();
        }
        return 0;
    }

    public int countWives(String name) {
        Person person = connectionMap.get(name);
        if (person != null) {
            return person.getWives().size();
        }
        return 0;
    }

    public void showFamMembers(String name, String relation) {
        Person person = connectionMap.get(name);
        RelationshipHandler handler = relationshipHandlerMap.get(relation.toLowerCase());
        if (person != null) {
            if (handler != null) {
                handler.showRelationship(person);
            } else if ("father".equals(relation)) {
                System.out.println("Father of " + name + " is " + person.getFather().getName());
            }else {
                System.out.println("Relation NOT FOUND");
            }
        } else {
            System.out.println("Person NOT Found");
        }
    }
}
