package Chap1;

/*
 * ���ڿ� ������ ����
 * ���ĺ� �빮�ڿ� ����(0~9)�θ� ������ ���ڿ��� �Է�
 * ��� ���ĺ��� ������������ �����Ͽ� �̾ ����� �ڿ� ��� ���ڸ� ���� �� �̾ ���
 */

import java.util.*;

public class p8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		ArrayList<Character> list = new ArrayList<>();
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			if(Character.isLetter(s.charAt(i))) list.add(s.charAt(i));
			else sum += (s.charAt(i) - '0');
		}
		Collections.sort(list);
		for(int i = 0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
		if(sum != 0) System.out.println(sum);

	}

}
