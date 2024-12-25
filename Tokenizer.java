import java.util.StringTokenizer;
import java.lang.String;
import java.util.Scanner;
class  Tokenizer
{
public static void main(String []args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter_text_for_tokenizer");
String s ="|C|C++|Java|Python|";
String s1 =sc.nextLine();

StringTokenizer toke =new StringTokenizer(s1);
while(toke.hasMoreTokens())
{
System.out.println(toke.nextToken());	
}
StringTokenizer tok = new StringTokenizer(s,"|");

while (tok.hasMoreTokens())
{
System.out.println(tok.nextToken());
}
}
}