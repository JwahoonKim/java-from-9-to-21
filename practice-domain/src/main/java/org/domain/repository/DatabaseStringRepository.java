package org.domain.repository;

public class DatabaseStringRepository implements StringRepository {

    @Override
    public void save(String newString) {
        System.out.println("Saving to database: " + newString);
    }

}
