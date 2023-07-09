package sshjax.sphere;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import static sshjax.sphere.Constants.*;


/**
 * @author ykalapusha
 */
public class Worker {

    void doSphereArt() throws IOException {
        Random random = new Random();
        CenterPoint centerPoint = new CenterPoint();
        BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = bufferedImage.createGraphics();

        graphics2D.setColor(BASE_IMAGE_COLOR);
        graphics2D.fillRect(0, 0, WIDTH, HEIGHT);

        graphics2D.setColor(SPHERE_COLOR);
        for (int i = 0; i <= CAPACITY_OF_ANGLES_IN_DEGREES ; i++) {
            graphics2D.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            graphics2D.drawLine(centerPoint.x, centerPoint.y, (int)(RADIUS*Math.sin(Math.toRadians(i))+centerPoint.x), (int)(RADIUS*Math.cos(Math.toRadians(i))+centerPoint.y));
        }

        graphics2D.dispose();
        File imageFile = new File(BASE_DIRECTORY + BASE_IMAGE_NAME + IMAGE_EXTENSION);
        ImageIO.write(bufferedImage, FORMAT_NAME, imageFile);
    }


    public static class CenterPoint {
        private final int x;
        private final int y;

        CenterPoint() {
            x = HEIGHT/2;
            y = WIDTH/2;
        }
    }
}
