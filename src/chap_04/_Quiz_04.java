package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 조건문을 활용하여 주차 요금 정산 프로그램 작성
        // 내가 작성한 조건문
        boolean normalCar = false; // true : 일반차량, false : 경차 또는 장애인
        int parkingTime = 10; // 주차시간
        int parkingFee = 4000; // 1시간당 기본 주차 요금
        if (normalCar == true && parkingTime*parkingFee <= 30000) {
            System.out.println("주차 요금은 " + parkingFee*parkingTime +"원입니다.");
        } else if (normalCar == true && parkingTime*parkingFee > 30000) {
            System.out.println("주차 요금은 30000원입니다.");
        } else if (normalCar == false && parkingTime*parkingFee <= 30000) {
            System.out.println("주차 요금은 " + parkingFee*parkingTime/2 +"원입니다.");
        } else {
            System.out.println("주차 요금은 " + 15000 +"원입니다.");
        }

        System.out.println("아래는 나도 코딩 정답");

        // 나도코딩 정답 코드
        int hour = 10; // 주차 시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금 (시간당 4000원 곱하기)

        // 30000 원 초과 시 일일 최대 요금으로 수정
        if (fee>30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledPerson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행결과 출력
        System.out.println("주차 요금은 " + fee + "원입니다.");


    }
}
