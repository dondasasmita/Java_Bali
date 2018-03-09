package part_07;

class SubClass02 extends SubClass01 {

    double someNum;

    public SubClass02(String name) {
        super(name);
    }

    public void methodSub02_01(){
        System.out.println("Calling Method 1 in SubClass 2");
    }

    public void methodSub02_02(){
        System.out.println("Calling Method 2 in SubClass 2");
    }

    public void methodSub02_03(){
        System.out.println("Calling Method 3 in SubClass 2");
    }

}
