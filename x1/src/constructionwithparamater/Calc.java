package constructionwithparamater;

public class Calc {

	int a;
	int b;
	
	public Calc(int i, int j) {
		
		a = i;
		b = j;
		
		
	}

	void add(){
		
		int t = a+b;
		System.out.println(t);
	

	}
	
	void subs(){
		
		int t = a-b;
		System.out.println(t);
	}
	
	void multi(){
		int t = a*b;
		System.out.println(t);
		
	}
	void divi(){
		 
		 int t = a/b;
		 System.out.println(t);
	 }
	
}


