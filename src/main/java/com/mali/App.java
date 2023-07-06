package com.mali;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws AWTException
     */
    public static void main(String[] args) throws AWTException {
        try {
            // Create a Robot instance
            Robot robot = new Robot();

            // Get the screen size
            Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            // Capture the screen image
            BufferedImage screenshot = robot.createScreenCapture(screenRect);

            // Save the screenshot to a file
            File output = new File("screenshot.png");
            ImageIO.write(screenshot, "png", output);

            System.out.println("Screenshot captured successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
