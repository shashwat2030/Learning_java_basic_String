import java.lang.String;
import java.lang.StringBuilder;
import javax.swing;
class Stringfunc
{
public static void main(String []args)
{
	
String s ="swEra_Shashwat";
String success ="_is_Successful_IAS";
String combination =s+success;
System.out.println("length_of_string:"+combination.length());
System.out.println("character_at_specified_position:"+combination.charAt(8));
System.out.println("finding_substring_at_initial_stage:"+combination.substring(3));
System.out.println("finding_substring_from_initial_to_final_stage:"+combination.substring(8,24));
System.out.println("concatenation_operation:"+s.concat(success));
System.out.println("index_operation_of_String:"+combination.indexOf("swEra_Shashwat"));
System.out.println("index_of_string:"+combination.indexOf('s',8);
int compare =s.compareTo(success);
System.out.println("differene_between_string:"+compare);
System.out.println(combination.toLowerCase());
System.out.println(combination.toUpperCase());
System.out.println(s.trim());
String s1 ="feeksforfeeks";
String s2 =s1.replace('f','g');
System.out.println(s2);





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