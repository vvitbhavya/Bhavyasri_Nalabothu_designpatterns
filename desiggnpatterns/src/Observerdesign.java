package designpatterns.pattern1;
import java.util.ArrayList;
import java.util.List;

interface Subject {
  void register(Observer obj);
  void notifyObservers();
}

class View implements Subject {
  private List<Observer> observers;
  private String location;
  
  public void register(Observer obj) {
    observers.add(obj);
  }

  public void notifyObservers() {
    for(Observer obj : observers) {
      obj.update(location);
    }
  }
  public View() {
	    this.observers = new ArrayList<Observer>();
	  }

  public void locationChanged() {
    this.location = getLocation();
    notifyObservers();
  }
  
  public String getLocation() {
    return "Yplace";
  }
}


interface Observer {
  public void update(String location);
}


class Viewgallery implements Observer {
  private String loc;
  
  public void update(String loc) {
    this.loc = loc;
    showLocation();
  }

  public void showLocation() {
    System.out.println("Current Location: " + loc);
  }
}

class User implements Observer {
  private String location;
  
  public void update(String location) {
    this.location = location;
    showLocation();
  }

  public void showLocation() {
    System.out.println("Current Location: " + location);
  }
}

class MainCenter implements Observer {
  private String location;
  
  public void update(String location) {
    this.location = location;
    showLocation();
  }

  public void showLocation() {
    System.out.println("ISRO-Current Location: " + location);
  }
}

public class Observerdesign {

  public static void main(String[] args) {
     View v = new View();
    
    Observer obj1 = new Viewgallery();
    Observer obj2 = new User();
    
    v.register(obj1);
    v.register(obj2);
    v.locationChanged();
    System.out.println("location changed");
    v.locationChanged();
    
  }
}