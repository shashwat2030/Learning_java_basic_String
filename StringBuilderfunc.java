import java.lang.StringBuilder;

public class StringBuilderfunc
{
public static void main(String []args)
{
StringBuilder sb = new StringBuilder("swEra_shashwat");
int ln=sb.length();
// length of the string to be calculated
System.out.println(sb.reverse());
// to calculate reverse_of the string
StringBuilder sb1 = new StringBuilder("wanted_to_become_IAS_Developer");
// declaring the string
// new String Builder CLass
System.out.println("Length:"+ln);
// printing the length 
System.out.println("Append_function_for_String_function:"+sb.append("is_an_ias_officer"));
// append text at the end
System.out.println("Append_function_for_Integer_function:"+sb.append(786));
// append integer at the end
System.out.println("Insertion_at_the_End:"+sb.insert(15,"will_go_to_google"));
// inserting text and integer at the end
System.out.println("printing_last_index_from"
+sb1.lastIndexOf("wanted",15));
// printing the last index of the  sb1 string builder
System.out.println(sb.delete(7,15));
//just deleting the string of the format
System.out.println(sb1.substring(5));
// generating the substring of the sb1 
System.out.println(sb1.substring(5,19));
// generating the substring of the sb1

}
}