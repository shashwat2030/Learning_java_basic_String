import java.lang.StringBuilder;
import java.lang.String;
import java.util.*;

public class StringBuilderfunc
{
public static void main(String [] main)
{
Scanner sc =new Scanner(System.in);

System.out.println("Enter_your_Notation");
String sb =sc.nextLine();

int ln =sb.length();
System.out.println("Length:"+ln);
String up=sb.toUpperCase();
System.out.println("Upper_Case:"+up);
boolean Ns =sb.startsWith("J");
System.out.println(Ns);
String cmbine=sb+up;

System.out.println(cmbine);




}
}