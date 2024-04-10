package enumm;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        System.out.println("상태코드를 입력해주세요 :");
        Scanner sc = new Scanner(System.in);
        int inputCode = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(inputCode);
        if (status == null) {
            System.out.println("정의되지 않은 코드");
        } else {
            System.out.println("HTTP CODE :"+ status.getCode());
            System.out.println(status.getCode()+" "+status.getMessage());
            System.out.println("isSuccess : "+ status.isSuccess());
        }
    }
}
