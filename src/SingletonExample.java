
class Singleton
{
	
	private static Singleton instance;
	
	private Singleton() {
	        // Constructor code here
	    }
    public static Singleton getInstance() {
        // If instance is null, create a new instance
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
	
}
    
    
public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton singleton = Singleton.getInstance();

	}

}
