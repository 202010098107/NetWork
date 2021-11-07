package 项目管理1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

interface IParking {
	// 打印输出结果
	public void print();

	// 检查是否有 carType 对应的停车位
	// 如果没有空车位，请返回 false ，否则将该车停入车位并返回 true
	public boolean addCar(int carType);

	// 解析命令行输入的参数（格式），如文档描述
	public static IParams parse() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("请用户输入字符串格式：例如[[1, 1, 0], [1], [2], [3], [1]]");
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
