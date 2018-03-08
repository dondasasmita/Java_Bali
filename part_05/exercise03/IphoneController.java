package part_05.exercise03;

public class IphoneController {

    public static void main(String[] args) {

        Iphone firstIphone = new Iphone();

        firstIphone.Iphone(2014);
        firstIphone.createName(6);

        Iphone secondIphone = new Iphone();

        secondIphone.Iphone(2016);
        secondIphone.createName("SE");

        Iphone thirdIphone = new Iphone();
        thirdIphone.Iphone(2018);
        thirdIphone.createName('X');



    }


}
