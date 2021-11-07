package ��Ŀ����1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

interface IParking {
	// ��ӡ������
	public void print();

	// ����Ƿ��� carType ��Ӧ��ͣ��λ
	// ���û�пճ�λ���뷵�� false �����򽫸ó�ͣ�복λ������ true
	public boolean addCar(int carType);

	// ��������������Ĳ�������ʽ�������ĵ�����
	public static IParams parse() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("���û������ַ�����ʽ������[[1, 1, 0], [1], [2], [3], [1]]");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str, "[] ,");
		String[] s = new String[st.countTokens()];
		int i = 0;
		while (st.hasMoreTokens()) {
			s[i] = st.nextToken();
			i++;
		}
		sc.close();

		return new IParams() {
			@Override
			public int getBig() {
				// TODO Auto-generated method stub
				return Integer.parseInt(s[0]);
			}

			@Override
			public int getMedium() {
				// TODO Auto-generated method stub
				return Integer.parseInt(s[1]);
			}

			@Override
			public int getSmall() {
				return Integer.parseInt(s[2]);
				// TODO Auto-generated method stub
			}

			@Override
			public ArrayList<Integer> getPlanParking() {
				ArrayList<Integer> arrayList = new ArrayList<Integer>();
				for (int i = 3; i < s.length; i++) {
					arrayList.add(Integer.parseInt(s[i]));
				}
				return arrayList;
			}
		};
	};

}
