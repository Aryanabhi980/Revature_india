package eg1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		li.add("hey");
		li.add(13444);
		li.add(22.11d);
		li.add(new Object());
		li.add(1111111111111L);
		li.add(true);
		
		System.out.println("li : "+li);
		
		List<Integer> li2 = new ArrayList<>();
		li2.add(1222);
		li2.add(100);
		li2.add(1222);
		li2.add(1222);
		li2.add(null);
		li2.add(null);
		li2.add(122);
		li2.add(100);
		li2.add(1229);
		li2.add(2222);
		li2.add(100);
		li2.add(1222);
		System.out.println("li2 :"+li2);
		li2.add(1, 9000);//insert at specific index
		System.out.println("li2 :"+li2);
		li2.add(1, 9999);//update
		System.out.println("li2 :"+li2);
		System.out.println("li2.size() :"+li2.size());
		System.out.println("li2.get(5) :" +li2.get(5));
		
		System.out.println("Iteration using for each loop");
		for(int i=0;i<li2.size();i++)
		{
			System.out.println("li2.get("+i+") :"+li2.get(i));
		}
		System.out.println("Iteration using for each loop");
		for(Integer i:li2) {
			System.out.println(i);
		}
		li2.remove(1);
		System.out.println("li2 :"+li2);
		Integer i=100;
		li2.remove(i);
		System.out.println("li2 :"+li2);
		
		while(li2.remove(i)) {
			
		}
		System.out.println("li2 :"+li2);
		
		System.out.println("li2.contains(100) :"+li2.contains(100));
		System.out.println("li2.contains(1222) :"+li2.contains(1222));
		
		System.out.println("Li2.indexOf(1222) :"+li2.indexOf(1222) );
		System.out.println("li2.LastIndexOf(1222) :"+li2.lastIndexOf(1222));
		
		Collections.reverse(li2);
		
		System.out.println("li2 :"+li2);
		
		Collections.replaceAll(li2, null, -1);
		System.out.println("li2 :"+li2);
		
		
		
	}

}
