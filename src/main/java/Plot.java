import java.time.LocalTime;

public class Plot {

    public static void main(String[] args) {

        Boy boy = new Boy("Фриц");
        Toy hussar = new Hussar();
        Nutcracker nutCracker = new Nutcracker();
        Time time = new Time();
        Colonel colonel = new Colonel();
        Saber saber = new Saber();
        Cupboard cupboard = new Cupboard("corner");


        boy.punishToy(hussar);

        boy.saySomething();

        time.setDay(Time.Days.TOMORROW);

        boy.fireColonel(colonel);

        saber.setDescription(new String[] {"beautiful", "sharp"});

//        colonel.setHome(Cupboard.Shelf);

        colonel.setSaber(false);



        boy.helpNutcracker(nutCracker);
    }

}

class Girl {
    String name;    //Мари
    boolean eyesIsOpen;
    String state;

    void saySomething(String message) {
        System.out.println(message);
    }

    void jumpOutOfBed() {

    }

}

class Boy {

    String name;    //Фриц

    public Boy(String name) {
        this.name = name;
    }

    void helpNutcracker(Nutcracker nutcracker) {
        nutcracker.saber = true;
    }

    void fireColonel(Colonel colonel) {
        colonel.setRetired(true);
        colonel.setPension(10000);
    }

    void saySomething() {
        System.out.println();
    }

    void punishToy(Toy toy) {
        System.out.println("");
    }
}


class Hussar extends Toy{

}

class Colonel extends Toy {
    private int age;                  //старый
    private int pension;
    private boolean retired;
    private boolean saber=true;
    private Cupboard home;

    public void setHome(Cupboard home) {
        this.home = home;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPension(int pension) {
        this.pension = pension;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public void setSaber(boolean saber) {
        this.saber = saber;
    }
}

class Nutcracker extends Toy{
    boolean saber;
    void saySomething(String message) {
        System.out.println(message);
    }
}

class Saber {
    private String [] description;

    public void setDescription(String[] description) {
        this.description = description;
    }
}

class Room {
    Cupboard cupboard;
    Door door;
}

class Cupboard {

    String sound;
    String location;

    public Cupboard(String location) {
        this.location = location;
    }



    class Shelf {
        int numberOfShelf;

        Colonel getColonel() {
            if(numberOfShelf == 3) {
                return new Colonel(); // сделать фабрик метод или синглетон
            }
            return null;
        }
    }
}

class Door {
    boolean isKnocking;
}

//class Stranger {
//    void saySomething(String message) {
//
//    }
//}

class Time {


    private boolean isNight;
    private boolean isDay;
    private LocalTime localTime;
    private Days day;

    enum Days{
        TOMORROW,
        TODAY,
        YESTERDAY
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void setNight(boolean night) {
        isNight = night;
    }

    public void setDay(boolean day) {
        isDay = day;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }
}

abstract class Toy {

}
