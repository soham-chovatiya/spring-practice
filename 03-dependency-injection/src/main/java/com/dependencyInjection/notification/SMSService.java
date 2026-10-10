package in.dependencyInjection.notification;

public class SMSService implements NotificationServices{

    @Override
    public void sendNotification(){
        System.out.println("Sms notification sent");
    }
}
