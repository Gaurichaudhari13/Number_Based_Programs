package number_based_program;

public class XylemPhloem {
	public static String isXylemPhloem(int n) {
	int count1=0;
	int count2=0;
	int sum1=0;
	int sum2=0;
	int temp=n;

	while(n>0) {
		n=n/10;
		count1++;
	}
	//to perform sum
	while(temp>0) {
		int lastdigit=n%10;
		count2++;
	if(count2==count1||count2==1) {
			sum1=sum1+lastdigit;
		}
		else {
			sum2=sum2+lastdigit;
		}
		temp=temp/10;
	}
	if(sum1==sum2) {
		return "xylem";
	}
	else {
		return "phloem";
	}
}

	public static void main(String[] args) {
		System.out.println(isXylemPhloem(13338));
	}
}
