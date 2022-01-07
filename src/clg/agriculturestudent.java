package clg;

public class agriculturestudent {
String name,username,password;
private double a=0;
agriculturestudent(){
	this.name="unknown";this.username="not available";
	password="not available";
}
public void item(String a,String b,String c){
	this.name=a;
	this.username=b;
	this.password=c;
}
public double check(String n,String p){
	if(this.name==n) {
		if(this.password==p) {
			a=1;
		return a;	
		}
		else {
			return a;
		}
	}
	return a;
}
}

