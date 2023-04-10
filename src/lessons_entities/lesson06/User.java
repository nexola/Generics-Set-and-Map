package lessons_entities.lesson06;

import java.time.Instant;

public class User implements Comparable<User> {
    private String name;
    private Instant instant;

    public User(String name, Instant instant) {
        this.name = name;
        this.instant = instant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    @Override
    public int compareTo(User o) {
        return name.toUpperCase().compareTo(o.getName().toUpperCase());
    }
}
