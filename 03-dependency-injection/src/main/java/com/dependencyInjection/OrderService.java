package in.dependencyInjection;

import in.dependencyInjection.notification.EmailService;
import in.dependencyInjection.notification.NotificationServices;

public class OrderService{


    private NotificationServices notificationServices;

    EmailService emailService = new EmailService();

    public void PlaceOrder(){

        System.out.println("Ordered Placed");

        emailService.sendNotification();

    }

    /*

    OrderService(NotificationServices notificationServices){
        this.notificationServices = notificationServices;
        System.out.println("Order Placed");
        notificationServices.sendNotification();
    }

     */

//    public void setNotification(NotificationServices notificationServices){
//
//        this.notificationServices = notificationServices;
//
//    }
//
//    public OrderService(NotificationServices notificationServices){
//
//        this.notificationServices = notificationServices;
//
//    }
//
//    public void PlaceOrder(){
//
//        System.out.println("Ordered Placed");
//
//        notificationServices.sendNotification();
//
//    }


}
