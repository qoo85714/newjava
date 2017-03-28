package tw.org.iii;

import java.io.IOException;
import java.rmi.RemoteException;

public class Jason032504 {

	public static void main(String[] args) {
	
	}
}
class Jason461 {
	void m1() throws IOException {}
}
class Jason462 extends Jason461 {
	void m1() throws RemoteException {}//繼承後的例外需比父類別範圍小或一樣
}
