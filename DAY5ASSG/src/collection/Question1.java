package collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		HashSet<String> st = new HashSet<String>();
//		for(int i = 0 ; i < 5 ; i++) {
//			String input = scan.next();
//			st.add(input);
//		}
		
		
//		Iterator<String> it = st.iterator();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			
//		}

//		String result = "";
//		while(it.hasNext()) {
//			result += it.next();
//		}
//		
//		System.out.println(result);
		
		HashSet<Float> ft = new HashSet<Float>();
		for(int i = 0 ; i < 3 ; i++) {
			Float input = scan.nextFloat();
			ft.add(input);
		}
		
		
        Iterator<Float> i = ft.iterator();
        Float sum = 0.0f;
        while(i.hasNext()) {
        	sum += i.next();
        }
        
        System.out.println(sum);
        
	}

}
