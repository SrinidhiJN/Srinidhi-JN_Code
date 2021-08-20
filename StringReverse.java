import java.util.*;
import java.util.ArrayList;
public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the size of string array : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			names.add(sc.next());
		}
		for (int i = 0, j = names.size() - 1; i < j; i++) {
            names.add(i, names.remove(j));
        }
 
        System.out.println(names);
	}

}
