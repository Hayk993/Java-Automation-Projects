package homework.homeworksByShushanik;

public class BankEx {
    public static void main(String[] args) {
        //1.	Բանկում ներդրված նախնական ավանդը 30000 դրամ է: Յուրաքանչյուր ամիս այն ավելանում է p (0<p<25) տոկոսով:
        // Հաշվել, թե քանի ամիս հետո ստացված գումարը կգերազանցի 100000 դրամը:
        // Արտածել ստացված ամիսների քանակը և ավանդի վերջնական գումարը
        double deposit = 30_000;//սկզբնակն գումար
        double i = 12;//ամսական տոկոսադրույք
        int monthCounter = 0;
        while (deposit < 100_000) {
            deposit = deposit + deposit * i / 100;
            monthCounter++;

        }
        System.out.println(monthCounter);
        System.out.println(deposit);

    }
}
