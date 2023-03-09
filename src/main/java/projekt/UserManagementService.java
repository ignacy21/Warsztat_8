package projekt;

import java.util.*;

public class UserManagementService {

    private final Map<String, User> databaseMap = new HashMap<>();
    public void create(User user) {
        if (!(databaseMap.containsKey(user.getEmail()))){
            databaseMap.put(user.getEmail(), user);
        } else {
         throw new RuntimeException(String.format("User with email: [%s] is already created", user.getEmail()));
        }
    }
    public Optional<User> findByEmail(String email) {
        if (databaseMap.containsKey(email)) {
            return Optional.of(databaseMap.get(email));
        }
        return Optional.empty();
    }
    public List<User> findByName(String name) {
        List<User> users = new ArrayList<>();
        for (User user : databaseMap.values()) {
            if (name.equals(user.getName())) {
                users.add(user);
            }
        }
        return users;
    }

    public List<User> findAll() {
        return new LinkedList<>(databaseMap.values());
    }

    public void update(String emailToChange, User userToUpdate) {
        if (databaseMap.containsKey(emailToChange)) {
            databaseMap.remove(emailToChange);
            databaseMap.put(userToUpdate.getEmail(), userToUpdate);
        } else {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", userToUpdate.getEmail()));
        }
    }

    public void delete(String email) {
        if (databaseMap.containsKey(email)) {
            databaseMap.remove(email);
        } else {
            throw new RuntimeException(String.format("User with email: [%s] doesn't exist", email));
        }
    }
}
