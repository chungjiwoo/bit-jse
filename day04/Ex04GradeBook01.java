package day04;

//사용자로부터 번호 이름 국어 영어 수학 점수를 입력받아서
//번호 ##번 이름 ###
//국어 : ###점 영어: ###점 수학:###점
//의 형식으로 출력하는 프로그램을 작성하시오
//단. 국영수 점수같은 경우에는
//사용자가 잘못된 점수를 입력하면
//올바른 점수가 들어올때까지 다시 입력을 받으시오
// 또한 처음 프로그램을 시작할때
// 사용자가 입력,출력,종료를 선택하여
// 사용자가 원하는 횟수 만큼 입력하고 출력할 수 있게 프로그램을 작성하시오
import java.util.Scanner;

public class Ex04GradeBook01 {
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = 0;
        String name = new String();
        // korean, english, math의 경우
        // 한번이라도 입력이 되면
        // 0~100 사이의 값이 들어가게 된다
        // 그렇다면 우리가 처음 선언과 초기화를 할때
        // 불가능한 점수로 초기화를 하고
        // 혹시라도 사용자가 아무런 데이터도 입력하지않고
        // 출력을 누를시에
        // 해당 점수가 올바른지 않은지 체크를 해서
        // 올바르지 않을 시에는
        // "아직 입력된 정보가 없습니다!"라고
        // 출력을 하게 해줄수 있다.
        int korean = -1;
        int english = 0;
        int math = 0;

        while (true) {

            System.out.println("1.입력 2.출력 3.종료");
            System.out.print("> ");

            int userChoice = scanner.nextInt();
            if (userChoice == 1) {
                // 입력하는 코드 구현

                System.out.print("번호: ");
                id = scanner.nextInt();

                System.out.print("이름: ");
                scanner.nextLine();
                name = scanner.nextLine();

                System.out.print("국어: ");
                korean = scanner.nextInt();
                while (korean < 0 || korean > 100) {
                    System.out.println("잘못된점수 형식입니다. ");
                    System.out.print("국어 ");
                    korean = scanner.nextInt();
                }

                System.out.print("영어: ");
                english = scanner.nextInt();
                while (english < 0 || english > 100) {
                    System.out.println("잘못된점수 형식입니다. ");
                    System.out.print("영어 ");
                    english = scanner.nextInt();
                }

                System.out.print("수학: ");
                math = scanner.nextInt();
                while (math < 0 || math > 100) {
                    System.out.print("잘못된 점수 형식입니다. ");
                    System.out.print("수학 ");
                    math = scanner.nextInt();
                }

            } else if (userChoice == 2) {
                // 출력하는 코드 구현

                // 만약 국어 점수가 -1이면
                // 아직 아무정보도 입력되지 않은 상태이므로
                // 경고메세지만 출력하고
                // 그외에는 정상적으로 정보 출력하도록 한다.
                if (korean == -1) {
                    // 아무 정보도 입력되지 않은 상태이므로
                    // 메시지만 출력
                    System.out.println("아직 아무런 정보도 입력되지 않았습니다");

                } else {
                    // 정보가 입력된 상태이브로 정보 출력하는 코드 실행
                    // 총점과 평균 계산
                    int sum = korean + english + math;
                    double average = sum / (double) SUBJECT_SIZE;
                    System.out.printf("번호: %2d 이름: %s\n", id, name);
                    System.out.printf("국어: %03d 영어: %03d 수학: %03d\n", korean, english, math);
                    System.out.printf("총점:%03d점 평균: %.2f점\n", sum, average);

                }

            } else if (userChoice == 3) {

                System.out.println("사용해주셔서 감사합니다");
                break;
            }

            else {
                System.out.println("잘못선택하셨습니다.");

            }
        }

        scanner.close();

    }

}
