package projekt;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        UserManagementService userManagementService = new UserManagementService();

        User user1 = new User("name1", "email1", "surname1");
        User user2 = new User("name2", "email2", "surname2");
        User user3 = new User("name3", "email3", "surname3");
        User user4 = new User("name4", "email4", "surname4");
        User user5 = new User("name5", "email5", "surname5");
        userManagementService.create(user1);
        userManagementService.create(user2);
        userManagementService.create(user3);
        userManagementService.create(user4);
        userManagementService.create(user5);

        printAll(userManagementService);
        userManagementService.update("email123", user1);
        userManagementService.update("email234", new User("name2", "email2", "surname2"));
        printAll(userManagementService);

        userManagementService.delete("email3");
        printAll(userManagementService);
    }

    private static void printAll(UserManagementService userManagementService) {
        List<User> all = userManagementService.findAll();
        System.out.println();
        for (User user : all) {
            System.out.println(user);
        }
    }

}
