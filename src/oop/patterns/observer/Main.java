package oop.patterns.observer;

public class Main {
    public static void main(String[] args) {
        Subject smiley = new Subject("Smiley");
        Subject delia = new Subject("Delia");

        Observer bogdan = new Observer("Bogdan");
        Observer dorina = new Observer("Dorina");
        Observer costel = new Observer("Costel de la Ploiesti");
        Observer adi = new Observer("Adi");
        Observer elena = new Observer("Elena");
        Observer hater = new Hater("Hater Donald");

        bogdan.follow(smiley);
        dorina.follow(smiley);
        costel.follow(delia);
        adi.follow(smiley);
        elena.follow(delia);
        hater.follow(delia);

        smiley.postUpdate("Piesa noua pe Radio Zu!");
        delia.postUpdate("Concert Delia la Sala Palatului!");

        elena.unFollow(delia);
        delia.postUpdate("Piesa noua");
    }
}
