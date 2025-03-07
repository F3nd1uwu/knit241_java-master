package org.knit.labs2.lab1.Task3;

public class Task2_3 {
    public static void execute() {
        Transport businessCar = TransportFactory.createTransport("business");
        System.out.println(businessCar.getSpecification());

        Transport familyCar = TransportFactory.createTransport("family");
        System.out.println(familyCar.getSpecification());

        Transport motorbike = TransportFactory.createTransport("delivery");
        System.out.println(motorbike.getSpecification());
    }
}
