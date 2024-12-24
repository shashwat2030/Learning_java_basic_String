import java.lang.String;
public class EqDiff
{
public static void main(String[] args)
{
String s1 ="Hello";
String s2 =new String(s1);
System.out.println(s1==s2);
System.out.println(s1.equals(s2));
String s3 ="hello";
String s4 =s3;
System.out.println(s3==s4);
System.out.println(s3.equals(s4));
}
}