package aa_basics.chapter1;

public class MultiplicationTable {
	void print(int table) {
		for(int i = 0 ;i <=10; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
	}
}
