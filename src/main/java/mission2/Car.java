package mission2;

public class Car {
    public static int location = 0;


    static void movement(int moveForward){
        if(moveForward >= 4){
            location += moveForward;
            System.out.println( "차가 "+ moveForward + "만큼 움직였습니다.");
        } else { System.out.println("4 이상만 움직일 수 있습니다.");
        }
    }

    static void nowLocation(){
        System.out.println("차의 현재 위치는 " + location + "입니다.");
    }
}
