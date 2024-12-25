import java.lang.StringBuffer;
public class StringBufferfunc
{
public static void main(String [] args)
{
StringBuffer s1 = new StringBuffer("swEra_Shashwat_");//declaring the string buffer
s1.insert(15,"love");// insertion operation using the insert operation
int ln_s1 =s1.length();// length of the string buffer
System.out.println(ln_s1);// printing the length of the string buffer
System.out.println(s1.append("_java"));// basically appending at the end of the stringBuilder
System.out.println(s1.append(7));// adding the 7 into stringBuilder
System.out.println(s1.append('c'));//inserting the c character
System.out.println(s1.appendCodePoint(10));// implemting the codepoint functon
System.out.println(s1.insert(19,'y'));//inserting funtion with year"
System.out.println(s1.delete(5,7));// deleting operation on the string 
System.out.println(s1.replace(19,24,"python"));// replace java with python
System.out.println(s1.reverse());//now just reverse the string 
System.out.println(s1.substring(10)); // now taking the substring part of the subrstring
System.out.println(s1);// now printing the final operation on the string buffer


}
}