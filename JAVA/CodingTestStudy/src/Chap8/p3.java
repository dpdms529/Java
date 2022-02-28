package Chap8;

import java.util.*;

class p3 {
    public static int n = 5; // �������� ���� N
    public static int m = 5; // ã���� �ϴ� �κ��� M
    public static int[] arr = {1, 2, 3, 2, 5}; // ��ü ����

    public static void main(String[] args) {
        int cnt = 0;
        int intervalSum = 0;
        int end = 0;

        // start�� ���ʴ�� ������Ű�� �ݺ�
        for (int start = 0; start < n; start++) {
            // end�� ������ ��ŭ �̵���Ű��
            while (intervalSum < m && end < n) {
                intervalSum += arr[end];
                end += 1;
            }
            // �κ����� m�� �� ī��Ʈ ����
            if (intervalSum == m) {
                cnt += 1;
            }
            intervalSum -= arr[start];
        }

        System.out.println(cnt);
    }
}