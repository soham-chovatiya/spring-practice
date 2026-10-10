package in.dependencyInjection.notification;

public class FakeEmailServices implements NotificationServices{

    @Override

    public void sendNotification(){

        System.out.println("Dummy Email sent");

    }
}
