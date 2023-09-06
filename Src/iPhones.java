public class iPhones implements Smartphones {
    @Override
    public void call(String phoneNumber) {
        System.out.println("iPhone is calling " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("iPhone is sending an SMS to " + phoneNumber + ": " + message);
    }

    @Override
    public void internet(String website) {
        System.out.println("iPhone is browsing the internet on " + website);
    }
}
