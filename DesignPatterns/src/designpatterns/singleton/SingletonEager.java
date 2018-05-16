package designpatterns.singleton;

public class SingletonEager {
	 //One instance always exists
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager() {}
    public static SingletonEager getInstance()
    {
        return instance;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
