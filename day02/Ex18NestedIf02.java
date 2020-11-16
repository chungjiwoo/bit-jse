package day02;
//사용자로부터
// 번호,이름,국영수 점수를 입력받아서
// 번호:##번, 이름:###
// 국어:###점, 영어:###점, 수학:###점
//이 출력되는 프로그램을 작성하세요
// 단, 사용자가 잘못된 국영수 점수를 입력하면
// 그대로 " 잘못 입력하셨습니다. 종료하겠습니다."가 출력이 되고
// 모든 점수를 올바르게 입력할때만
// 위의 정보가 출력되게 프로그램을 작성해보세요

import java.util.Scanner;
public class Ex18NestedIf02 {
    static final int SUBJECT_SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("번호");
        int id = scanner.nextInt();
        
        System.out.println("이름");
        scanner.nextLine();
        String name = scanner.nextLine();
        
        System.out.println("국어: ");
        int korean = scanner.nextInt();
       
        if(korean >= 0 && korean <= 100) {
            System.out.println("영어");
            int english = scanner.nextInt();
            if(english >= 0 && english <= 100) {
                System.out.println("수학");
            int math = scanner.nextInt();
            if(math >= 0 && math <= 100) {
                int sum = korean + english + math;
                double average = sum / (double)SUBJECT_SIZE;
                System.out.printf("번호: %2d 이름: %s\n", id, name);
                System.out.printf("국어: %03d 영어: %03d 수학: %03d\n", korean, english, math);
                System.out.printf("총점:%03d점 평균: %.2f점\n",sum,average);
               
            }else {
                    System.out.println("잘못된 점수가 감지되어 종료합니다.");
                }
            
                
            }else {
                System.out.println("잘못된 점수가 감지되어 종료합니다.");
            }
            
        }else {
            System.out.println("잘못된 점수가 감지되어 종료합니다.");
        }
        
            
     
        
        
         
       
       
        
        
        
        scanner.close();    
    }

}
