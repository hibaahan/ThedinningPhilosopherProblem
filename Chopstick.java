public class Chopstick {
	private int ID;
// hint: use a local variable to indicate whether the chopstick is free 
//                        (lying on the table), e.g.  private boolean free;

	Chopstick(int ID) {
		  this.ID = ID;
	
	}
	
	synchronized void take() {
	
	}
	
	synchronized void release() {
	
	}
	    
	public int getID() {
	    return(ID);
	}
}
