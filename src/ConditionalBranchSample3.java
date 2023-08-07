
public class ConditionalBranchSample3 {

	public static void main(String[] args) {
		
		//さいころを振る
		System.out.println("さいころを振ります");

		//0から5までの乱数を生成
		int x = new java.util.Random().nextInt(6);
		//1から6にするために+1
		x++;
		
		//xの値に応じてifを使用して分岐処理
		if(x == 1) {
			System.out.println("1がでました");
		} else if (x == 2){
			System.out.println("2がでました");
		} else if (x == 3) {
			System.out.println("3がでました");
		} else if(x == 4) {
			System.out.println("4が出ました");
		} else if(x == 5) {
			System.out.println("5が出ました");
		} else if(x == 6) {
			System.out.println("6が出ました");
		} else {
			System.out.println("1から6以外が出ました");
		}

		
		
		System.out.println("--------");
		
		
		
		switch (x) {
			case 1:
				System.out.println("1がでました");
				break;
			case 2:
				System.out.println("2がでました");
				break;
			case 3:
				System.out.println("3がでました");
				break;
			case 4:
				System.out.println("4がでました");
				break;
			case 5:
				System.out.println("5がでました");
				break;
			case 6:
				System.out.println("6がでました");
				break;
			default:
				System.out.println("1から6以外が出ました");
		}

	}

}
