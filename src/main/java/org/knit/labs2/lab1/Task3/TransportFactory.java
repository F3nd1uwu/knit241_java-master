package org.knit.labs2.lab1.Task3;

public class TransportFactory {
    public static Transport createTransport(String type) {
        switch (type.toLowerCase()) {
            case "business":
                return new BusinessCar();
            case "family":
                return new FamilyVan();
            case "delivery":
                return new Motorbike();
            default:
                throw new IllegalArgumentException("Ошибка в виде транспорта: " + type);
        }
    }
}
