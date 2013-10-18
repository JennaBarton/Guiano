package gdi;

import java.util.Random;

import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

public class SynthThreadAuto extends Thread {

	static int pitch;
	static int velocity;
	static boolean play;
	static boolean GuianoLogoBtnOn;

	static int pause;
	static int instType = 0; // 0 for piano - 27 for guitar
	int notes = 60;
	int rand = 8;
	int repeats = 5;
	MidiChannel channel;
	Random generator = new Random();

	public static void enableSound() {
		velocity = 127;
	}

	public static void disableSound() {
		velocity = 0;
	}

	public void run() {

		try {
			Synthesizer synthesizer = MidiSystem.getSynthesizer();
			synthesizer.open();
			channel = synthesizer.getChannels()[0];

			while (true) {

				// get 8 notes & check if in major scale
				// additionally play root note
				for (int iEight = 0; iEight < 8; iEight++) {
					pause = 0;
					rand = generator.nextInt(127 - 55) + 55; // only notes
																// between
																// 50-127
					if (GuianoLogoBtnOn == true) {
						notes = rand;
						if (isMajor(notes)) {
							channel.noteOn(notes, velocity);
							noteGeneratedHighlight(notes);

							if (iEight == 0) {
								notes = 60;
								channel.noteOn(notes, velocity);
								noteGeneratedHighlight(notes);
							}
						}
					}
					pause = 1000;
				}
				try {
					Thread.sleep(pause);
				} catch (InterruptedException e) {
					break;
				}
				if (GuianoLogoBtnOn == true) {
					noteGeneratedUnHighlight();
					channel.allNotesOff();

				}

			}

		} catch (MidiUnavailableException e) {
			e.printStackTrace();
		} finally {
			channel.allNotesOff();
		}
	}

	/*
	 * Major scale verify. MIDI Note Numbers {0, 2, 4, 5, 7, 9, 11} define the intervals.
	 * 
	 * @return true if number is in the scale or any number of octaves higher
	 * (values above 127 ignored) (Takes original input number and -12 until
	 * value is between 0-11 (one octave) if value matches a note in the
	 * scale method returns true; else returns false.
	 */
	public static boolean isMajor(int number) {
		int note = number;
		if (note < 128) // ignore input values above 127.
		{
			for (int i = note; i > -1; i--) // loop from note input value down
											// until reached -1
			{
				if (note == 0 || note == 2 || note == 4 || note == 5
						|| note == 7 || note == 9 || note == 11) // modify for
																	// any scale
				{
					return true; // number is in major scale
				} else {
					note = note - 12; // Minus 1 octave on each iteration of
										// loop where no match found..
					if (note < 0)
						break; // .. until note value less than 0.
				}
			}
		}
		return false; // number is not major
	}

	public void noteGeneratedHighlight(int notesIN) {

		if (notesIN == (int) gdi.Guiano3.c_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.c_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_c, gdi.Guiano3.git_c,
					gdi.Guiano3.git_c_1, gdi.Guiano3.git_c_2,
					gdi.Guiano3.git_c_3, gdi.Guiano3.git_c_4,
					gdi.Guiano3.git_c_5);
		} else if (notesIN == (int) gdi.Guiano3.cS_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.cS_0p.get_pitch()) {
			gdi.Guiano3.highlightSharp(gdi.Guiano3.pia_cS, gdi.Guiano3.git_cS,
					gdi.Guiano3.git_cS_1, gdi.Guiano3.git_cS_2,
					gdi.Guiano3.git_cS_3, gdi.Guiano3.git_cS_4,
					gdi.Guiano3.git_cS_5);
		} else if (notesIN == (int) gdi.Guiano3.d_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_6.get_pitch()
				|| notesIN == (int) gdi.Guiano3.d_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_d, gdi.Guiano3.git_d,
					gdi.Guiano3.git_d_1, gdi.Guiano3.git_d_2,
					gdi.Guiano3.git_d_3, gdi.Guiano3.git_d_4,
					gdi.Guiano3.git_d_5, gdi.Guiano3.git_d_6);
		} else if (notesIN == (int) gdi.Guiano3.dS_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.dS_0p.get_pitch()) {
			gdi.Guiano3.highlightSharp(gdi.Guiano3.pia_dS, gdi.Guiano3.git_dS,
					gdi.Guiano3.git_dS_1, gdi.Guiano3.git_dS_2,
					gdi.Guiano3.git_dS_3, gdi.Guiano3.git_dS_4,
					gdi.Guiano3.git_dS_5);
		} else if (notesIN == (int) gdi.Guiano3.e_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_6.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_7.get_pitch()
				|| notesIN == (int) gdi.Guiano3.e_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_e, gdi.Guiano3.git_e,
					gdi.Guiano3.git_e_1, gdi.Guiano3.git_e_2,
					gdi.Guiano3.git_e_3, gdi.Guiano3.git_e_4,
					gdi.Guiano3.git_e_5, gdi.Guiano3.git_e_6,
					gdi.Guiano3.git_e_7);
		} else if (notesIN == (int) gdi.Guiano3.f_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.f_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_f, gdi.Guiano3.git_f,
					gdi.Guiano3.git_f_1, gdi.Guiano3.git_f_2,
					gdi.Guiano3.git_f_3, gdi.Guiano3.git_f_4,
					gdi.Guiano3.git_f_5);
		} else if (notesIN == (int) gdi.Guiano3.fS_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.fS_0p.get_pitch()) {
			gdi.Guiano3.highlightSharp(gdi.Guiano3.pia_fS, gdi.Guiano3.git_fS,
					gdi.Guiano3.git_fS_1, gdi.Guiano3.git_fS_2,
					gdi.Guiano3.git_fS_3, gdi.Guiano3.git_fS_4,
					gdi.Guiano3.git_fS_5);
		} else if (notesIN == (int) gdi.Guiano3.g_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_6.get_pitch()
				|| notesIN == (int) gdi.Guiano3.g_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_g, gdi.Guiano3.git_g,
					gdi.Guiano3.git_g_1, gdi.Guiano3.git_g_2,
					gdi.Guiano3.git_g_3, gdi.Guiano3.git_g_4,
					gdi.Guiano3.git_g_5, gdi.Guiano3.git_g_6);
		} else if (notesIN == (int) gdi.Guiano3.gS_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.gS_0p.get_pitch()) {
			gdi.Guiano3.highlightSharp(gdi.Guiano3.pia_gS, gdi.Guiano3.git_gS,
					gdi.Guiano3.git_gS_1, gdi.Guiano3.git_gS_2,
					gdi.Guiano3.git_gS_3, gdi.Guiano3.git_gS_4,
					gdi.Guiano3.git_gS_5);
		} else if (notesIN == (int) gdi.Guiano3.a_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_6.get_pitch()
				|| notesIN == (int) gdi.Guiano3.a_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_a, gdi.Guiano3.git_a,
					gdi.Guiano3.git_a_1, gdi.Guiano3.git_a_2,
					gdi.Guiano3.git_a_3, gdi.Guiano3.git_a_4,
					gdi.Guiano3.git_a_5, gdi.Guiano3.git_a_6);
		} else if (notesIN == (int) gdi.Guiano3.aS_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.aS_0p.get_pitch()) {
			gdi.Guiano3.highlightSharp(gdi.Guiano3.pia_aS, gdi.Guiano3.git_aS,
					gdi.Guiano3.git_aS_1, gdi.Guiano3.git_aS_2,
					gdi.Guiano3.git_aS_3, gdi.Guiano3.git_aS_4,
					gdi.Guiano3.git_aS_5);
		} else if (notesIN == (int) gdi.Guiano3.b_0.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_1.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_2.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_3.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_4.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_5.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_6.get_pitch()
				|| notesIN == (int) gdi.Guiano3.b_0p.get_pitch()) {
			gdi.Guiano3.highlight(gdi.Guiano3.pia_b, gdi.Guiano3.git_b,
					gdi.Guiano3.git_b_1, gdi.Guiano3.git_b_2,
					gdi.Guiano3.git_b_3, gdi.Guiano3.git_b_4,
					gdi.Guiano3.git_b_5, gdi.Guiano3.git_b_6);
		}
	}
	
	static void noteGeneratedUnHighlight() {
		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_c, gdi.Guiano3.git_c,
				gdi.Guiano3.git_c_1, gdi.Guiano3.git_c_2, gdi.Guiano3.git_c_3,
				gdi.Guiano3.git_c_4, gdi.Guiano3.git_c_5);

		gdi.Guiano3.resetHighlightSharp(gdi.Guiano3.pia_cS, gdi.Guiano3.git_cS,
				gdi.Guiano3.git_cS_1, gdi.Guiano3.git_cS_2,
				gdi.Guiano3.git_cS_3, gdi.Guiano3.git_cS_4,
				gdi.Guiano3.git_cS_5);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_d, gdi.Guiano3.git_d,
				gdi.Guiano3.git_d_1, gdi.Guiano3.git_d_2, gdi.Guiano3.git_d_3,
				gdi.Guiano3.git_d_4, gdi.Guiano3.git_d_5, gdi.Guiano3.git_d_6);

		gdi.Guiano3.resetHighlightSharp(gdi.Guiano3.pia_dS, gdi.Guiano3.git_dS,
				gdi.Guiano3.git_dS_1, gdi.Guiano3.git_dS_2,
				gdi.Guiano3.git_dS_3, gdi.Guiano3.git_dS_4,
				gdi.Guiano3.git_dS_5);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_e, gdi.Guiano3.git_e,
				gdi.Guiano3.git_e_1, gdi.Guiano3.git_e_2, gdi.Guiano3.git_e_3,
				gdi.Guiano3.git_e_4, gdi.Guiano3.git_e_5, gdi.Guiano3.git_e_6,
				gdi.Guiano3.git_e_7);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_f, gdi.Guiano3.git_f,
				gdi.Guiano3.git_f_1, gdi.Guiano3.git_f_2, gdi.Guiano3.git_f_3,
				gdi.Guiano3.git_f_4, gdi.Guiano3.git_f_5);

		gdi.Guiano3.resetHighlightSharp(gdi.Guiano3.pia_fS, gdi.Guiano3.git_fS,
				gdi.Guiano3.git_fS_1, gdi.Guiano3.git_fS_2,
				gdi.Guiano3.git_fS_3, gdi.Guiano3.git_fS_4,
				gdi.Guiano3.git_fS_5);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_g, gdi.Guiano3.git_g,
				gdi.Guiano3.git_g_1, gdi.Guiano3.git_g_2, gdi.Guiano3.git_g_3,
				gdi.Guiano3.git_g_4, gdi.Guiano3.git_g_5, gdi.Guiano3.git_g_6);

		gdi.Guiano3.resetHighlightSharp(gdi.Guiano3.pia_gS, gdi.Guiano3.git_gS,
				gdi.Guiano3.git_gS_1, gdi.Guiano3.git_gS_2,
				gdi.Guiano3.git_gS_3, gdi.Guiano3.git_gS_4,
				gdi.Guiano3.git_gS_5);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_a, gdi.Guiano3.git_a,
				gdi.Guiano3.git_a_1, gdi.Guiano3.git_a_2, gdi.Guiano3.git_a_3,
				gdi.Guiano3.git_a_4, gdi.Guiano3.git_a_5, gdi.Guiano3.git_a_6);

		gdi.Guiano3.resetHighlightSharp(gdi.Guiano3.pia_aS, gdi.Guiano3.git_aS,
				gdi.Guiano3.git_aS_1, gdi.Guiano3.git_aS_2,
				gdi.Guiano3.git_aS_3, gdi.Guiano3.git_aS_4,
				gdi.Guiano3.git_aS_5);

		gdi.Guiano3.resetHighlight(gdi.Guiano3.pia_b, gdi.Guiano3.git_b,
				gdi.Guiano3.git_b_1, gdi.Guiano3.git_b_2, gdi.Guiano3.git_b_3,
				gdi.Guiano3.git_b_4, gdi.Guiano3.git_b_5, gdi.Guiano3.git_b_6);
	}
}