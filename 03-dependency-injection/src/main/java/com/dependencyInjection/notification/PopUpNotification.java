package in.dependencyInjection.notification;

public class PopUpNotification implements NotificationServices{
    @Override
    public void sendNotification(){
        System.out.println("pop-up notification sent");
    }
}
