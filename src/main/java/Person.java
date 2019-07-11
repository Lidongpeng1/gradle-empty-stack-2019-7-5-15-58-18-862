public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void callSomeMessage(Mobile mobile, String message){
        System.out.println("Dear:"+name);
        mobile.makeCall(message);
    }
}
