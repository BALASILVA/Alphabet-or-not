package fibonasis;
import java.util.Scanner;
public class AlpabetOrNot {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the element");
	char ch=sc.next().charAt(0);
	char ch1='a';
	char ch2='z';
	char ch3='A';
	char ch4='Z';
	sc.close();
	
	int temp=0;
	temp=(int)ch;
	if(((int)ch1>=temp&&(int)ch2<=temp))
	{
		System.out.println("The given element is char");
	}
	else if(((int)ch3>=temp&&(int)ch4<=temp)){
		System.out.println("The given element is char");
	}
	else{
		System.out.println("the given element is not albabet");
	}
}
}
