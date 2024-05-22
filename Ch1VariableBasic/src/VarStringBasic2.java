import java.util.Scanner;

public class VarStringBasic2 {

	public static void main(String[] args) {
		
		String str = "abcd";
		
		char ch = 'a';
		
		byte b = 1;
		
		int num = 100;
		
		str = str + num;
		
		System.out.println("아\t" + "한글이 된다");
		System.out.println(str + "헐 뭐야/?");
		System.out.println(num + ">" + num);
		
		System.out.println(" " + " " + 7);
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
		
		System.out.printf("오 C언어 생각나네%s\n", str);
		
		System.out.print("테스트1");
		System.out.print("테스트2");
		System.out.print("테스트3");
		
		Scanner scan = new Scanner(System.in);

		System.out.println("입력하세요!\n");
		
		//String input = scan.nextLine();
		num = scan.nextInt();
		
		num = num + 4;
		
		System.out.println("결과 : " + num);
	}
	
}
