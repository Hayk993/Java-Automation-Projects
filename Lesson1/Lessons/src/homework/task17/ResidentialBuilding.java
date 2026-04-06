package homework.task17;

/*Նկարագրում եք բնակելի շինության հիերարխիա։ Կան երկու տեսակի շինություններ՝ առանձնատուն և բնակարան։ Էս երկուսի օբյեկտ կարող են լինել։ Իսկ բնակելի շինոթւան օբյեկտ պետքա անհնար լինի ստեղծել։
Ցանկացած բնակելի շինության համար (անկախ տեսակից) պարտադիրա ունենալ նախապես սենյակների քանակը և մակերեսը։ Կան նաև այլ բնորոշիչներ, որոնք օբյեկտը ստեղծելու համար պարտադիր չեն, բայց հետո օբյեկտին կարող եք կցել։ Դրանք էն առաստաղի բարձրությւն և պատշգամբի առկայությւուն։ Էս վերջին երկու բնորոշիչները կցելը պետքա լինի մեկանգամյա գործողություն։ Այսինքն եթե մի անգամ տվել եք արժեք, պետքա հնարավոր չլինի հետո փոխել էդ արժեքը։ Մակերեսը նույնպես անհնարա փոխել օբյեկտը սարքելուց հետո։ Իսկ այ սենյակների քանակը կարա ±1 լինի։ Այսինքն օբյեկտը ստեղծելուց հետո կա հնարավորություն 1 ով ավելացնել կամ 1 ով պակասեցնել սենյակների քանակը։
Սենյակների քանակը փոխելու գործողությունը կարելիա աշխատացնել բազմաթիվ անգամ։ Բայց կարևորա, որ ամենասկզբի նշված քանակից ամենաշատը 1 ով կարա տարբերվի։ Օրինակ՝ եթե սկզբում ասել էինք 3 սենյակ ունի, հետո դարձրել ենք 2, էլ 1 չենք կարա դարձնենք, բայց 3 նորից կարող ենք դարձնել։
Բնակարանը (չշփոթել բնակելի շինության հետ) ունի ևս մի պարտադիր ատրիբուտ օբյեկտը ստեղծելու համար. դա շենքի հարկնա։ Ստեղ պետքա նախապես ենթադրել, որ շենքը 5 հարկանիա։
Բոլոր բնակելի շինությունները լույսերը անջատել/միացնելու ֆունկցիոնալություն ունեն։
Իսկ առանձնատունը պետքա ունենա դարպասները բացել/փակելու ֆունկցիոնալութուն նաև։
Էս սաղ մանիպուլյացիաներից հետո օգտագործողի կլասսում պետքա ունենաք մի հատ ֆունկցիա, որը կստանա բոլոր ձեր ստեղծած բնակելի շինությունների ցանկը ու բոլորի լույսերը կանջատի։ Որ ավելորդ հոսանք չծախսվի ))
 */

public abstract class ResidentialBuilding {
    private int numOfRooms;
    private final int initialRooms;
    private final double area;
    private boolean isLightsOn;

    private double ceilingHeight;
    private boolean isCeilingHeight = false;
    private boolean balcony;
    private boolean isBalcony = false;
    int rooms;

    ResidentialBuilding(int numOfRooms, double area) {
        this.numOfRooms = numOfRooms;
        this.area = area;
        this.initialRooms = numOfRooms;
        rooms = numOfRooms;
    }

    //seter//final-ը որպեսզ subclass-ները չկարողանան Override անել
    public final void setCeilingHeight(double ceilingHeight) {
        if (!isCeilingHeight) {
            this.ceilingHeight = ceilingHeight;
            isCeilingHeight = true;
        }
    }

    public void setBalcony(boolean balcony) {
        if (!isBalcony) {
            this.balcony = balcony;
            isBalcony = false;
        }
    }

    public Double getArea() {
        return area;
    }


    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public void addOneRoom() {
        if (rooms - initialRooms == 0) {
            rooms += 1;
        } else {
            System.out.println("you can not add twice");
        }
        numOfRooms = rooms;
    }

    public void minusOneRoom() {
        if (rooms - initialRooms == 0 || rooms - initialRooms == 1) {
            rooms -= 1;
        } else {
            System.out.println("you can not minus twice");
        }
        numOfRooms = rooms;
    }

    public void switchLights() {
        isLightsOn = !isLightsOn;
        System.out.println("the lights is switched");
    }

    public boolean isLightsOn() {
        return isLightsOn;
    }

    public void turnOffLights() {
        if (isLightsOn) {
            isLightsOn = false;
        }
    }

}
