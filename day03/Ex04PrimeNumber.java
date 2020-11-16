package day03;
// 1부터 100까지의 소수를 구하는 프로그램
// 1. 소수란 무엇인가?
//    1과 자기자신만이 약수인 숫자
//    = 약수의 갯수가 2개인 숫자
// 2. 약수란 무엇인가?
//    A를 B로 나누었을때 나누어 떨어지면
//    B는 A의 약수이다.
//    = A를 B로 나누었을때, 나머지가 0이면
//      B는 A의 약수이다.
// 3. 어떤 숫자의 가장 큰 약수는?
//    자기자신이다.
//    우리는
// 1. 소수란 약수의 갯수가 2개인 숫자
// 2. 약수란 어떤 수를 나누었을때 나머지가 0인 숫자
// 3. 어떤 숫자의 가장 큰 약수는 자기자신
//    이 3가지 조건을 이용해서 1부터 100까지의 소수를 구해볼것이다.


public class Ex04PrimeNumber {
    public static void main(String[] args) {
        // i for문에서 i는 해당 숫자가 소수인지 아닌지를 검사할 대상이 된다.
        // 그렇다면 i의 초기화식은?
        // i = 1
        // 그렇다면 i for문의 조건식은?
        // i <= 100
        // i for 변화식은?
        // i++
        for(int i = 1; i <= 100; i++) {
            //약수의 갯수를 저장할 int변수 count를 만들자
           int count = 0;
           // j for문에서 j는
           // i의 약수인지 아닌지를 검사할 숫자가 된다.
           // 그렇다면
           // j의 초기화 식은?
           // j = 1
           // j for문의 조건식은?
           // j <= i
           // j for문의 변화식은?
           // j++
           for(int j=1; j<=i; j++) {
               //i나누기 j의 나머지가 0일때마다
               //count를 1씩 증가시켜준다.
               if(i%j==0) {
                   //j가 i의 약수이므로 count를 1증가시킨다.
                   count++;
               }    
           }
           
           // j for문이 종료되었다 = 약수의 갯수가 count에 저장되었다
           // 그렇다면 count가 2일때마다 i가 소수이다라고 출력하면 된다.
           
           if(count == 2) {
               System.out.println(i+"는 소수입니다.");
           }
           
           
        }
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
