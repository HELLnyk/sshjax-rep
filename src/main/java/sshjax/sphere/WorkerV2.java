package sshjax.sphere;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import static sshjax.sphere.Constants.*;
import static sshjax.sphere.Constants.FORMAT_NAME;

/**
 * @author ykalapusha
 */
public class WorkerV2 {

    void doSphereArt() throws IOException {
        Random random = new Random();
        Worker.CenterPoint centerPoint = new Worker.CenterPoint();
        BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
//        Graphics2D graphics2D = bufferedImage.createGraphics();

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
//                graphics2D.setColor();
                bufferedImage.setRGB(i, j,new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)).getRGB());
            }
        }


//        graphics2D.dispose();
        File imageFile = new File(BASE_DIRECTORY + BASE_IMAGE_NAME + IMAGE_EXTENSION);
        ImageIO.write(bufferedImage, FORMAT_NAME, imageFile);
    }
}
