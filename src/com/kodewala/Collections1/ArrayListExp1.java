package com.kodewala.Collections1;

import java.util.ArrayList;

public class ArrayListExp1 {
    public static void main(String[] args) {
        // create a container which will hold something(objects)

        ArrayList<String> learners = new ArrayList<String>();

        // storing the data
        learners.add("Jasraj");
        learners.add("Prince");
        learners.add("Gautam");
        learners.add("Jasraj");
        learners.add("Aman");
        learners.add("Rohit");
        learners.add(null);
        learners.add("null");
        learners.add("Gautam");

        // read the data from container/ArrayList
        System.out.println(learners);

        learners.add("Sanjeev");
        System.out.println(learners);
    }
}
