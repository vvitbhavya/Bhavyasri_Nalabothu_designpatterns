package designpatterns.pattern1;

abstract class Rocket1{
	  public abstract int getPayload();
	  
	  public String toString() {
	    return "load:" + this.getPayload();
}
}

class AP extends Rocket1 {
int payload;

AP(int payload) {
this.payload =payload;
}

@Override
public int getPayload() {
return this.payload;
}
}

class Agni extends Rocket1 {
int payload;

Agni(int payload) {
this.payload = payload;
}

@Override
public int getPayload() {
return this.payload;
}
}

class payloadDesign{
public static Rocket1 getInstance(String type, int payload) {
if(type == "AP") {
	return new AP(payload);
} 
else if(type == "Agni") {
	return new Agni(payload);
}
return null;
}
}

public class factoryDesign {

public static void main(String[] args) {
System.out.println("AP--Payload"); 
Rocket1 g = payloadDesign.getInstance("gsat", 2000);
System.out.println(g);
System.out.println("Agni--Payload in kg");
Rocket1 a = payloadDesign.getInstance("GSLV", 22000);
System.out.println(a);
}

}