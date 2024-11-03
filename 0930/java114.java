package javaproject2;
import java.util.Scanner;
public class java114 {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("자동차 상태 입력>>");
        int status = scanner.nextInt();
        
        // Extract temperature (bits 0-5)
        int temperature = status & 0b00111111;

        // Check if air conditioner is on (bit 6)
        boolean isAirConditionerOn = (status & 0b01000000) != 0;

        // Check if the car is moving (bit 7)
        boolean isCarMoving = (status & 0b10000000) != 0;

        // Check if there’s a fault (bit 8)
        boolean hasIssue = (status & 0b100000000) != 0;

        // Output the results
        System.out.println("자동차 상태 분석:");
        System.out.println("현재 온도: " + temperature + "도");
        System.out.println("에어컨 상태: " + (isAirConditionerOn ? "켜짐" : "꺼짐"));
        System.out.println("차량 상태: " + (isCarMoving ? "달리는 상태" : "정지 상태"));
        System.out.println("고장 여부: " + (hasIssue ? "문제 있음" : "문제 없음"));
    }

	}


