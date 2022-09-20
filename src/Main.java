import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");

        }

        Bicycle bike = new Bicycle();
        Car car = new Car();

        System.out.println(bike.speed);
        bike.go();
        System.out.println(car.speed);
        car.stop();

        System.out.println(car.color);

        Friend friend1= new Friend();
        Friend friend2 = new Friend();

        System.out.println(Friend.numOfFriends);

        Student student1 = new Student(14, "Jack", true);
        Student student2 = new Student(15, "Michael", false);

        System.out.println(student1.name);
        System.out.println(student2.age);

        //Wrapper Classes: Boolean, Integer, Character
        //primitive data types: boolean, int, chars
        Boolean a = true;

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("Mike");
        arr.add("Chris");
        arr.add("Jack");

        System.out.println(arr.toString());

        for(int i= 0; i < 3; i++){
            System.out.print(i);
        }

        for(String i : arr){
            System.out.print(i);
        }


    }
}
