package other;

import simplelogic.User;

public class MainInOtherPackage {
    public static void main(String[] args) {
        User user = new User();

        System.out.println(user.privateName);
        System.out.println(user.protectedName);
        System.out.println(user.publicName);
        System.out.println(user.defaultName);
    }
}
