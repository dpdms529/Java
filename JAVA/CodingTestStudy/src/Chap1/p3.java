package Chap1;

/*
 * ���ϱ� Ȥ�� ���ϱ� ����
 * �� �ڸ��� ����(0~9)�θ� �̷���� ���ڿ� S�� �־����� ��, ���ʺ��� ���������� �ϳ��� ��� ���ڸ�
 * Ȯ���ϸ� ���� ���̿� 'x' Ȥ�� '+' �����ڸ� �־� ��������� ������� �� �ִ� ���� ū �� ���ϱ�
 * �� +���� x�� ���� ����ϴ� �Ϲ����� ��İ� �޸�, ��� ������ ���ʿ������� ������� �̷�����ٰ� ����
 */

import java.util.*;

public class p3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		//ù��° ���ڸ� ���ڷ� ������ ���� ����
		long result = str.charAt(0) - '0';
		for(int i = 1;i<str.length();i++) {
			//�� �� �߿��� �ϳ��� '0' Ȥ�� '1'�� ���, ���ϱ⺸�ٴ� ���ϱ� ����
			int num = str.charAt(i) - '0';
			if(num <= 1 || result <= 1) {
				result += num;
			}else {
				result *= num;
			}
		}
		System.out.println(result);
	}

}
