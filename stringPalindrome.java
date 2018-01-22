package lesson13_10;
import java.util.Scanner;
public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while(true)
		{
			// 輸入字串存入字元陣列
			String str = input.next();
			char[] ch = str.toCharArray();
			
			// 單字長度不會超過20
			if(ch.length > 20)
			{
				System.out.print("Your words is too long! Shorter!");
				continue;
			}
			
			// 計算相等次數
			int count = 0;
			
			// 次數等同一半字母
			for(int i = 0 ; i < ch.length / 2 ; i++)
				if(ch[i] == ch[ch.length - 1 - i])
					count++;
			
			if(count == ch.length / 2)
				System.out.print("Yes");
			else
				System.out.print("No");
		}

	}

}
