package simplelogic;

public class User {
    private String privateName;
    protected String protectedName;
    public String publicName;
    String defaultName;

    public void printInfo(){
        System.out.println(privateName);
        System.out.println(protectedName);
        System.out.println(publicName);
        System.out.println(defaultName);
    }

}
