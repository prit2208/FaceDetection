# FaceDetection
The Criminal Face Detection System is a Java-based application that aims to detect and identify criminal faces from images using computer vision techniques. The system leverages the OpenCV library for face detection and offers a foundation for integrating more advanced functionalities such as face recognition and database integration.

This code will first load the trained XML file that contains the facial features of criminals. Then, it will read the image file of a criminal and convert it to a Mat object. The face detector will then be used to detect faces in the image. For each detected face, a rectangle will be drawn around it. Finally, the image with the detected faces will be saved.

To run this code, you will need to have the OpenCV library installed on your computer. You can download the library from the OpenCV website.

Once you have the library installed, you can compile and run the code by typing the following commands into the command prompt:

Code snippet
javac CriminalFaceDetection.java
java CriminalFaceDetection
Use code with caution. Learn more

This will compile the code and then run it. The output of the code will be an image file with the detected faces.
