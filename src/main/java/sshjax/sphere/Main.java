package sshjax.sphere;

import java.io.IOException;

/**
 *
 *
 * @author ykalapusha
 */
public class Main {

    public static void main(String[] args) {
        try {
            new Worker().doSphereArt();
        } catch (IOException e) {
            System.out.println("Unable to do art.");
        }
    }
}
