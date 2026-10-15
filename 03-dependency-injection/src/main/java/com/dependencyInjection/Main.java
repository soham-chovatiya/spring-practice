package in.dependencyInjection;


import in.dependencyInjection.notification.*;

public class Main {

    public static void main(String[] args) {

        /*

        NotificationServices notificationServices;

        new FakeEmailServices();

        OrderService orderService = new OrderService(notificationServices);

         */

        NotificationServices notificationServices = new FakeEmailServices();

        /*

        OrderService orderService = new OrderService(notificationServices);

        orderService.setNotification(notificationServices);

        orderService.PlaceOrder();

         */

    }
}

// A class should ask what it needs, nd not
// build everything itself

