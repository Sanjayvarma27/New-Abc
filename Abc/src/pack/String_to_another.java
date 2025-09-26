package pack;

public class String_to_another {





public static void main(String args[]) {
	
	String s = "siva";
	
	
	
char a[]= 	s.toCharArray();
int n =	a.length;
	char b[]= new char[n];
	int i =0;
	while(i!=n) {
		
	b[i]	= a[i];
		i++;
	}
	System.out.println(b);
	System.out.println(a);
	}
	
	
	
}