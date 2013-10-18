package gdi;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class SynthThread extends Thread {

	static int pitch;
	static int velocity;
	static boolean play;
	static int pause;
	static int instType = 0; // 0 for piano - 27 for guitar

	public static void enableSound() {
		velocity = 127;
	}

	public static void disableSound() {
		velocity = 0;
	}

	public static void noteOn() {
		play = true;
	}

	public static void setInstType(int instTypeIN) {
		instType = instTypeIN;
	}

	public static void setPitchIN(int pitchIN) {
		pitch = pitchIN;
	}

	public void run() {

		try {
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
			synthesizer.open();
			MidiChannel channel = synthesizer.getChannels()[0];

			while (true) {

				if (play == true) {
					channel.programChange(instType);
					channel.noteOn(pitch, velocity);
					pause = 350;
					play = false;
				}
				try {
					Thread.sleep(pause);
				} catch (InterruptedException e) {
				} finally {
					channel.noteOff(pitch);
				}
				pause = 0;
			}
		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		}
	}
}
