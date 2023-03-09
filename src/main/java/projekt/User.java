package projekt;

import lombok.*;

@Builder
@With
@Data
public class User implements Comparable<User> {

    private String name;
    private String email;
    private String surname;


    @Override
    public int compareTo(User user) {
        return user.email.compareTo(email);
    }
}
