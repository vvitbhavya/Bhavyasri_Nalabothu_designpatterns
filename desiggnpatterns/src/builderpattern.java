package designpatterns.pattern1;

class Rocket{
	  int stages;
	  String launch;
	  int launches;
	  
	  public int getStages() {
	    return this.stages;
	  }
	  
	  public String getLaunch() {
	    return this.launch;
	  }
	  
	  public int getLaunches() {
	    return this.launches;
	  }
	  
	  private Rocket(SatelliteVehicles builder) {
	    this.stages = builder.stages;
	    this.launch = builder.launch;
	    this.launches = builder.launches;
	  }
public static class SatelliteVehicles {
	    public int stages;
		private String launch;
	    private int launches;
	    public SatelliteVehicles(int stages,String recent_launch, int total_launches) {
	      this.stages=stages;
	      this.launch = recent_launch;
	      this.launches = total_launches;
	    }
	    
	    public SatelliteVehicles setLaunches(int total_launches) {
	      this.launches = total_launches;
	      return this;
	    }
	    
	    public Rocket build() {
	      return new Rocket(this);
	    }
	  }
	}

	public class builderpattern{
	  
	  public static void main(String[] args) {
	    Rocket p = new Rocket.SatelliteVehicles(4,"PSLV", 50).setLaunches(50).build();
	    Rocket g = new Rocket.SatelliteVehicles(3,"GSLV", 13).build();
  System.out.println(p.getStages());
  System.out.println(p.getLaunch());
  System.out.println(p.getLaunches());
  System.out.println(g.getStages());
  System.out.println(g.getLaunch());
  System.out.println(g.getLaunches());
}
}

