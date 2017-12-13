/**
 * Created by Rajeev Verma on 12/13/2017.
 */

package patterns.singleton;


/***
 * Use singleton implementation.
 */
public class SingletonMain {

    public static void main(String[] args) {
        SingletonImpl firstInstance = SingletonImpl.getInstance();

        SingletonImpl secondInstance = SingletonImpl.getInstance();

        if (firstInstance == secondInstance) {
            System.out.println("Congratulation !!! You have just passed the singleton test.");

        } else {
            System.out.println("Ooops !! Something went horribly wrong and singleton test failed.");
        }

    }
}
