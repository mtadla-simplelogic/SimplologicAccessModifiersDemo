package other;

import simplelogic.User;

public class Guest extends User {
    public void printInfo(){
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(publicName);
        System.out.println(defaultName);
    }
}
