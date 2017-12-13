/**
 * Created by Rajeev Verma on 12/13/2017.
 */

package patterns.singleton;


/***
 * Provide implementation for Singleton pattern and ensures that this is Thread safe.
 */
public class SingletonImpl {

    // Volatile keyword ensures that multiple threads handle the singletonInstance correctly
    private volatile static SingletonImpl singletonInstance;

    /**
     * Private constructor to ensure no one outside this class can create object of it.
     */
    private SingletonImpl() {
        System.out.println("Creating Singleton class instance.");
    }

    /**
     * @return Instance of SingletonImpl
     */
    public static SingletonImpl getInstance() {
        if (SingletonImpl.singletonInstance == null) {
            synchronized (SingletonMain.class) { // Synchronized block which require class level lock
                if (SingletonImpl.singletonInstance == null) { // Checking again to make it 100% thread safe
                    SingletonImpl.singletonInstance = new SingletonImpl();
                }
            }
        }
        return singletonInstance;
    }
}

