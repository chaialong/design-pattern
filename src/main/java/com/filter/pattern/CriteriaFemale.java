package com.filter.pattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femaleList = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("female")) {
                femaleList.add(person);
            }
        }

        return femaleList;
    }
}
