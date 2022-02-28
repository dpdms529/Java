package Chap8;

import java.util.*;

class p2 {
    public static int n = 1000; // 2���� 1,000������ ��� ���� ���Ͽ� �Ҽ� �Ǻ�
    public static boolean[] arr = new boolean[n + 1];

    public static void main(String[] args) {
        Arrays.fill(arr, true); // ó���� ��� ���� �Ҽ�(True)�� ������ �ʱ�ȭ(0�� 1�� ����)
        // �����佺�׳׽��� ü �˰��� ����
        // 2���� n�� �����ٱ����� ��� ���� Ȯ���ϸ�
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // i�� �Ҽ��� ���(���� ���� ���)
            if (arr[i] == true) {
                // i�� ������ i�� ��� ����� �����
                int j = 2;
                while (i * j <= n) {
                    arr[i * j] = false;
                    j += 1;
                }
            }
        }
        // ��� �Ҽ� ���
        for (int i = 2; i <= n; i++) {
            if (arr[i]) System.out.print(i + " ");
        }
    }
}