package surendran01;
public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=10;
int a=1,b=1;
System.out.println("fibonacci series upto"+n+"terms");
for(int i=1;i<n;++i) {
	System.out.println(a+" ");
	int sum =a+b;
	a=b;
	b=sum;
}

	}

}
