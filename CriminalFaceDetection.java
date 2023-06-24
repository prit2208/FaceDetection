import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.objdetect.CascadeClassifier;

public class CriminalFaceDetection {

    private static final String TRAINED_XML_FILE = "haarcascade_frontalface_default.xml";

    public static void main(String[] args) throws IOException {
        // Load the trained XML file
        CascadeClassifier faceDetector = new CascadeClassifier(TRAINED_XML_FILE);

        // Read the image file
        File imageFile = new File("criminal.jpg");
        BufferedImage image = ImageIO.read(imageFile);

        // Convert the image to a Mat object
        Mat mat = new Mat(image);

        // Detect faces in the image
        MatOfRect faces = new MatOfRect();
        faceDetector.detectMultiScale(mat, faces);

        // Iterate over the detected faces
        for (Rect face : faces.toArray()) {
            // Draw a rectangle around the face
            Core.rectangle(mat, face.tl(), face.br(), new Scalar(0, 255, 0));
        }

        // Save the image with the detected faces
        ImageIO.write(mat, "criminal_face_detected.jpg", "jpg");
    }
}