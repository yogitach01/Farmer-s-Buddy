package clg;
import java.util.*;
public class Farmer {
	String name,username,password;
	private double a=0;
	Farmer(){
	 name="null";username="unknown";password="unavailable";	
	}
void item(String a,String b,String c){
		this.name=a;
		this.username=b;
		this.password=c;
	}
public String check(String n){
String p="null";
		if(this.name==n) {
			p=this.password;
		}
		return p;
	}
}
