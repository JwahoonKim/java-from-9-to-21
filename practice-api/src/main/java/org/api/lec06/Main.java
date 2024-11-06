package org.api.lec06;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        varKeywordPractice();
        copyOfPractice();
    }

    private static void copyOfPractice() {
        List<Integer> oldNums = new ArrayList<>();
        oldNums.add(1);
        oldNums.add(2);

        List<Integer> newNums = List.copyOf(oldNums);
        oldNums.add(3);

        System.out.println("newNums = " + newNums); // [1, 2] 출력됨 (deep copy)
    }

    private static void varKeywordPractice() {
        var num = 3;
        num = 4; // 기본적으로 가변
        // num = "Hello"; 한번 추록되면 타입이 고정된
        final var num2 = 4; // final 키워드를 사용하면 변경 불가능
        var list = List.of(1, 2, 3);
    }

}
