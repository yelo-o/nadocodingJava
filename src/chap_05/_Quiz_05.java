package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 배열을 활용하여 쇼핑몰에서 구매 가능한 신발 사이즈 옵션을 출력하는 프로그램을 작성
        // 조건1 : 신발 사이즈는 250~295까지 5단위로 증가
        // 조건2 : 신발 사이즈 수는 총 10가지

        // # 내가 작성한 답
        for (int i = 250; i <= 295 ; i += 5) {
            System.out.println("사이즈 " + i + " (재고 있음)");
        }

        System.out.println("===================================");
        System.out.println("아래는 나도코딩 정답");

        // # 나도코딩 정답
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5*i);
        }

        for (int size : sizeArray
             ) {
            System.out.println("사이즈 " + size + " (재고 있음)");

        }
    }
}
