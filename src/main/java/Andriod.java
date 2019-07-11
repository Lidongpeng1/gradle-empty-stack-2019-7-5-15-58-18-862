public class Andriod extends Mobile {
    public Andriod(String name, String color, String brand) {
        super(name, color, brand);
    }

    public void makeCall(String message) {
        if (message.length() >= 15) {
            System.out.println("<andriod> Message cannot be sent");
        } else {
            System.out.println("<andriod>message:" + message);
        }
    }
}