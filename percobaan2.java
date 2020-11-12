public class percobaan2 { protected String name; protected
String address;
public percobaan2(){
System.out.println("Inside Person:Constructor");
name = "";
address = "";
}
public percobaan2( String name, String address) {
this.name = name;
this.address = address;
}
public String getName() {
return name;
}
public String getAddress() {
return address;
}
public void setName(String name) {
this.name = name;
}
public void setAddress(String add) {
this.address = add;
}
}