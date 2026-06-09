package homework.task26;

import java.util.Date;
import java.util.Objects;

//Պարենային մթերքը բնութագրվումա իրա տեսակով, արտադրման ու ժամկետի ամսաթվերով,
// դրա 1 կիլոգրամի զբաղեցրած ծավալով ու արտադրողի անունով։ Պարենային մթերքը իդենտիֆիկացվումա իրա ու արտադրողի անուններով։
public abstract class Grocery {
    private String typ;
    private Date date;
    private Date expireDate;
    private double V;
    private String producerName;

    public Grocery(String typ, Date date, Date expireDate, double v, String producerName) {
        this.typ = typ;
        this.date = date;
        this.expireDate = expireDate;
        V = v;
        this.producerName = producerName;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public double getV() {
        return V;
    }

    public void setV(double v) {
        V = v;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        return typ.equals(((Grocery) obj).typ) && producerName.equals(((Grocery) obj).producerName);
    }


}
