package com.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singleList = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("single")) {
                singleList.add(person);
            }
        }

        return singleList;
    }
}
