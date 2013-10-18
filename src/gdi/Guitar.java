package gdi;

public class Guitar extends Note {
	
	final int instrumentNumber = 27;
	int string; // 1=low E, 6=high E (low-E, A, D, G, B, high-E)

	public Guitar(String name, int pitch) {
		super(name, pitch);
	}

	public void set_string(int stringIN) {
		string = stringIN;
	}

	public Object get_string() {
		return string;
	}
	
	public int getInstType() {
		return instrumentNumber;
	}
	
	public void transmitInstType() {
		SynthThread.setInstType(instrumentNumber);
	}
}
