import java.util.*;

//using for class scanner

public class FlowEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//example an use switch ~ case
		System.out.println("���� ���� �Է�. > ");
		
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt();
		// save month an type int data on screen;
		switch(month) {
		case 3: case 4: case 5:
			System.out.println(" �� ");
			break;
		case 6: case 7: case 8:
			System.out.println(" ���� ");
			break;
		case 9: case 10: case 11:
			System.out.println(" ���� ");
			break;
		case 12: case 1: case 2:
			System.out.println(" �ܿ� ");
			break;
		default:
			System.out.println(" �ƴ� ���ε��� ");
			break;
		}
		
		
		sc.close();
	}

}
