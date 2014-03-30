	package module2;
/* Add large numbers
Two strings representing two numbers have been provided as input. The numbers in the string can be so large that they may not be represented by the Java datatype int. The objective is to add the two numbers and output it as a string. You can assume that the numbers are non negative
add("123456776587789","23455876876896987")="23579333653484776"
add("10101","20202")="30303" */

public class AddLargeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddLargeNumbers adl = new AddLargeNumbers();
		System.out.println(adl.getAdditionString("123456776587789","23455876876896987"));
	}
	
	
	
	
	String getAdditionString(String strNum1 ,String strNum2)
	{
		String sum ="";
		//Start adding rightmost chars
		int len1 =strNum1.length();
		int len2 = strNum2.length();
		int len = len1>len2?len1:len2;
		int carry =0;
		int num1 =0,num2=0;
		
		
		int diff = len1<len2 ? len2- len1 : len1 -len2;
		String zerostring ="";
			for(int i=0;i<diff;i++)
			{
				zerostring =zerostring +'0';
			}
		if(len1<len2)
		{
			strNum1 =zerostring+strNum1;
			
		}
		else if(len2<len1)
		{
			strNum2 =zerostring+strNum2;
			
		}
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		for (int i=len-1;i>=0;i--)
		{
			num1 = strNum1.charAt(i)-48 ;
			num2 = strNum2.charAt(i)-48 ;
			int sum1 = num1 + num2 +carry;
			System.out.println("Sum1 is"+ sum1 + "Carry is"+ carry);
			if(sum1 >= 10)
			{
				carry = sum1/10;
				sum1= sum1%10 ;
			
				
				System.out.println("carry is" + carry);
				
			}
			else
			{
				carry=0;
			}
			
				sum = sum1+sum;
				System.out.println(sum);
		}
		return sum;
		
		}
	}

	

