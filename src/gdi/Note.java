package gdi;

public class Note {

	final int instrumentNumber = 0;
	String name; // the name of the note to be created via constructor(eg, c1,
					// c#1 etc)
	int pitch; // value in semitones ranging 1-12 (for MIDI sound play back)

	// int octave; // the octave the note resides in 1, 2, 3 etc

	// constructor of the main class
	public Note(String name, int pitch) {
		this.name = name;
		this.pitch = pitch;
		// this.octave = octave;
	}

	public void print_noteParams() {
		System.out.println("Name: " + name + "Pitch: " + pitch);
	}

	public Object get_name() {
		return name;
	}

	public Object get_pitch() {
		return pitch;
	}
	
	public int getInstType() {
		return instrumentNumber;
	}
	
	public void transmitInstType() {
		SynthThread.setInstType(instrumentNumber);
	}
}
