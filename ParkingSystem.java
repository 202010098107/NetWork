package 项目管理1;

import java.util.ArrayList;

public class ParkingSystem implements IParking {
	public static void main(String[] args) throws Exception {
		IParams params = IParking.parse();// ParkingSystem.parse();
		ParkingSystem ps = new ParkingSystem(params.getBig(), params.getMedium(), params.getSmall());
		ArrayList<Integer> plan = params.getPlanParking();
		for (int i = 0; i < plan.size(); i++) {
			ps.addCar(plan.get(i));
		}
		ps.print();

	}

	int count[] = new int[3];
	ArrayList<String> arrayList = new ArrayList<>();

	public ParkingSystem(int big, int medium, int small) {
		count[0] = big;
		count[1] = medium;
		count[2] = small;
	}

	public void print() {
		String s1 = "[";
		String s2 = "]";
		String str = "null,";
		for (int i = 0; i < arrayList.size(); i++) {
			if (i < arrayList.size() - 1) {
				str += arrayList.get(i) + ",";
			}
			if (i == arrayList.size() - 1) {
				str = str + arrayList.get(i);
			}
		}
		System.out.println(s1 + str + s2);

	}

	public boolean addCar(int carType) {
		if (carType == 1) {
			if (count[0] != 0) {
				count[0]--;
				arrayList.add("true");
			} else {
				arrayList.add("false");
				return false;
			}
		}
		if (carType == 2) {
			if (count[1] != 0) {
				count[1]--;
				arrayList.add("true");
			} else {
				arrayList.add("false");
				return false;
			}
		}
		if (carType == 3) {
			if (count[2] != 0) {
				count[2]--;
				arrayList.add("true");
			} else {
				arrayList.add("false");
				return false;
			}
		}
		return true;
	}

}
