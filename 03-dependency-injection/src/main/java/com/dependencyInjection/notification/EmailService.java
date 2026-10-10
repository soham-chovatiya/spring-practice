package in.dependencyInjection.notification;

public class EmailService implements NotificationServices{

    @Override
    public void sendNotification(){
        System.out.println("Email notification sent");
    }

}
