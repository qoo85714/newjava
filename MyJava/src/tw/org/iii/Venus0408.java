package tw.org.iii;

public class Venus0408 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int y[] = {4,5,6};
		new Venus0408().go(x,y);

	}

	void go(int[]...z){
		// z => int[][] =>{{1,2,3},{4,5,6}}
		for(int[] a:z){
			System.out.println(a[0]);
		}
	}
}
