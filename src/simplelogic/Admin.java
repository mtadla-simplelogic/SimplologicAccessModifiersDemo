package simplelogic;

public class Admin extends User{
    public void printInfo(){
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(publicName);
        System.out.println(defaultName);
    }
}
