package com.test.FizzBuzz;

public class hashObject {
    private Long id;
    private String name;

    public hashObject(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equels(Object obj) {
        hashObject other = (hashObject) obj;
        return id.equals(other.id) && name.equals(other.name);
    }
}
