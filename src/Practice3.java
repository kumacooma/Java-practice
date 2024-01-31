import java.util.Arrays;

public class Practice3 {
    public static void main(String[] args) {

        //1~10까지 for문으로 출력하기
        for (int i = 1; i <11 ; i++) {
            System.out.println(i);

        }
        for (int i = 10; i >0 ; i--) {
            System.out.println(i);
        }

        //배열로 뽑기
        for (int i = 89; i <99 ; i++) {
         int[] array = {i};
            System.out.println(Arrays.toString(array));
        }

        //50점 이상인 학생만 합격
        int[] marks = {90, 25, 67, 45, 80};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 50) {
                continue;
            }
            System.out.println(i + 1 + "번 학생, 축하합니다 합격입니다!");
        }

        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));

            }
        }

        //10번 찍어야 넘어가는 나무 구현
                int treeHit = 0;
                while (treeHit < 10) {
                    treeHit++;  // treeHit += 1 로도 표현 가능
                    System.out.println("나무를  " + treeHit + "번 찍었습니다.");
                    if (treeHit == 10) {
                        System.out.println("나무 넘어갑니다.");
                    }
                }

        int coffee = 10;
        int money = 300;

        while (money > 0) {
            System.out.println("돈을 받았으니 커피를 줍니다.");
            coffee--;
            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
            if (coffee == 0) {
                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
                break;
            }
        }
        int i= 1;
        while (i<11)  {

            if(i%2!=0)
            System.out.println(i);
            i++;
        }

        //10이하의 짝수를 do=while문을 이용해 출력
        int x=1;
        do {
            x++;
            if(x%2!=0){
                continue;
            }
            System.out.println(x);
        }
        while (x<=10);
        }
            }



