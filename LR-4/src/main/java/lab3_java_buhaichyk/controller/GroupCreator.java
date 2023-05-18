package lab3_java_buhaichyk.controller;

import lab3_java_buhaichyk.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
