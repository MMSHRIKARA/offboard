package day5;

public class MainClass {
	public static void main(String[] args) {
		String a = "A";
		String b = "B";
		System.out.println(a.compareTo(b));//result -1
		System.out.println(b.compareTo(a));//result +1
		System.out.println(a.compareTo(a));//result 0
		
		System.out.println("---------");
		Integer x = 20;
		Integer y = 30;
		System.out.println(x.compareTo(y));//-1
		System.out.println(y.compareTo(x));//+1
		System.out.println(x.compareTo(x));//0
		
	}

}
