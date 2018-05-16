package designpatterns.singleton;

public class SingletonWithHolder {
	 private SingletonWithHolder() {}
     private static class SingletonHolder {
         private static SingletonWithHolder instance = new SingletonWithHolder();
     }
     //It makes lazy initialization
     public static SingletonWithHolder getInstance()
     {
         return SingletonHolder.instance;
     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
