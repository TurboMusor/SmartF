public class Androids implements Smartphones {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Android is calling " + phoneNumber);
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Android is sending an SMS to " + phoneNumber + ": " + message);
    }

    @Override
    public void internet(String website) {
        System.out.println("Android is browsing the internet on " + website);
    }
}
