import java.lang.String;

class Stringfunc
{
public static void main(String []args)
{
	
String s ="swEra_Shashwat";
String success ="_is_Successful_IAS";
String combination =s+success;
System.out.println("String_Length:"+combination.length());
System.out.println("Lower_Case:"+combination.toLowerCase());
System.out.println("Upper_Case:"+combination.toUpperCase());
System.out.println("Trim_String:"+combination.trim());
System.out.println("Substring_with_Initial:"+combination.substring(10));
System.out.println("Substring_with_Initial&final_index:"+combination.substring(8,19));
System.out.println("Replace:"+success.replace('A','F'));
int compare =s.compareTo(success);
System.out.println("differene_between_string:"+compare);
System.out.println("Starts_With:"+success.startsWith("su"));
System.out.println("Ends_With:"+success.endsWith("ia"));
System.out.println("Character_Index:"+success.charAt(8));
System.out.println("String_index:"+success.indexOf(s));
System.out.println("String_index_from_particular_Index:"+success.indexOf(s,3));
System.out.println("Last_Index:"+success.lastIndexOf("S"));
System.out.println("Last_Index:Before_index:"+success.lastIndexOf("s",3));
System.out.println(s.equals(success));
System.out.println(s.equalsIgnoreCase(success));
System.out.println(s.concat(success));






StringBuilder sb =new StringBuilder();

 /*wrong analogy*/
 //char  greeting[]="Blessing";
/* wrong statement*/ 
 //System.out.println(greeting);
/* char * temp =malloc(6);
 strncpy =(temp ,greeting,3);
 strncpy =(temp+3,"p!",3);
 greeting =temp;*/
 
//System.out.println(combination);
}
}