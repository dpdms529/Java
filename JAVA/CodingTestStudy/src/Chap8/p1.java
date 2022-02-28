package Chap8;

import java.util.*;

class p1 {
    // �Ҽ� �Ǻ� �Լ�(2�̻��� �ڿ����� ���Ͽ�)
    public static boolean isPrimeNumber(int x) {
        // 2���� x�� �����ٱ����� ��� ���� Ȯ���ϸ�
        for (int i = 2; i <= Math.sqrt(x); i++) {
            // x�� �ش� ���� ����������ٸ�
            if (x % i == 0) {
                return false; // �Ҽ��� �ƴ�
            }
        }
        return true; // �Ҽ���
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(4));
        System.out.println(isPrimeNumber(7));
    }
}
