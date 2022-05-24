import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AudioTest {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		File file = new File("MyWave.wav");

		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

		Clip clip = AudioSystem.getClip();

		clip.open(audioStream);

		Scanner scanner = new Scanner(System.in);

		clip.start();

		scanner.nextLine();
	}

}
