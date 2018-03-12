package part_10.exercise01;

public class TrafficLightDemo {

    public static void main(String[] args) {

        TrafficLightSimulator tl = new TrafficLightSimulator(TrafficLightColor.RED);

        for(int i=0; i < 6; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }

        tl.cancel();
    }
}


