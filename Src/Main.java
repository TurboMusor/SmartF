public class Main {
    public static void main(String[] args) {
        Smartphones[] phones = new Smartphones[] { new Androids(), new iPhones() };

        for (Smartphones phone : phones) {
            System.out.println("Using " + phone.getClass().getSimpleName() + ":");
            phone.call("123-456-789");
            phone.sms("123-456-789", "Hello from " + phone.getClass().getSimpleName() + "!");
            phone.internet("www.example.com");

            if (phone instanceof Androids) {
                ((Androids) phone).runLinuxCommands();
            } else if (phone instanceof iPhones) {
                ((iPhones) phone).runIOSCommands();
            }
        }
    }
}

