package homework.task26;

import java.util.Date;

public class Meat extends Grocery {

    public Meat(Date date, Date expireDate, String producerName) {
        super("Meat", date, expireDate, 2, producerName);
    }
}
