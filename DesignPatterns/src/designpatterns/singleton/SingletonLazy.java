package designpatterns.singleton;

/**
 * SingletonLazy.getInstance();
 * @author Andy Liu
 *
 */
public class SingletonLazy {
	   private static volatile SingletonLazy instance = null;

       private SingletonLazy() {}

       public static SingletonLazy getInstance()
       {
           if (instance == null)
           {
               synchronized (SingletonLazy.class)
               {
                   if (instance == null) //double check for multiple threads
                   {
                       instance = new SingletonLazy();//because new Singleton1() is not atomic op
                   }
               }
           }
           return instance;
       }

   	public static void main(String[] args) {
		// TODO Auto-generated method stub
   		SingletonLazy instance = SingletonLazy.getInstance();
 	}
}
