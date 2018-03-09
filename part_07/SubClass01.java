package part_07;

class SubClass01 extends SuperClass {

    String nameFromSubClass01;

    public SubClass01(String name) {
        this.nameFromSubClass01 = name;
    }


    public void methodSub01_01() {
        System.out.println("Calling Method 1 in SubClass 1");
    }

    public void methodSub01_02() {
        System.out.println("Calling Method 2 in SubClass 1");
    }

    public void methodSub01_03(){
        System.out.println("Calling Method 3 in SubClass 1");
    }
}
