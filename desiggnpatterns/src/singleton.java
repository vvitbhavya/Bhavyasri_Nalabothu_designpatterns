package designpatterns.pattern1;

public class singleton {
private static singleton s;
public singleton() {}
public static singleton getInstance() {
	if (s==null) {
		s=new singleton();
	}
	return s;
}

}