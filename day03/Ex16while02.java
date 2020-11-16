package day03;

import java.util.Scanner;

// while과 for문의 가장 큰 차이는
// while는 횟수제한이 없다는 것이다.
public class Ex16while02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("사용자가 5를 입력할때까지 끝나지 않는 프로그램");
        System.out.println("숫자: ");
        int number = scanner.nextInt();
        
        while(number !=5) {
            System.out.println("5가 아닙니다.");
            System.out.println("숫자:");
            number = scanner.nextInt();
        }
        
        
        
        
        
        System.out.println("프로그램을 종료합니다.");
        
        scanner.close();
        
    }

}
