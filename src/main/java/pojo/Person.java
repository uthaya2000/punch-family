package pojo;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Gender gender;
    private List<Person> children;
    private List<Person> wives;
    private Person father;

    public Person(String name) {
        this.name = name;
        wives = new ArrayList<>();
        children = new ArrayList<>();
    }

    public List<Person> getWives() {
        return wives;
    }

    public void setWives(List<Person> wives) {
        this.wives = wives;
    }

    public String getName() {
        return name;
    }

    public void addChild(Person child) {
        children.add(child);
    }

    public void addWives(Person wife) {
        wives.add(wife);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Person> getChildren() {
        return children;
    }

    public void setChildren(List<Person> children) {
        this.children = children;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }
}
