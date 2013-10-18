package gdi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;

public class Guiano3 extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private static SynthThread thread;
	private static SynthThreadAuto threadAuto;
	private JPanel contentPane;
	boolean GuianoLogoBtnOn = false;

	final JLabel lblTextDisplay = new JLabel(
			"Select a note from the piano or guitar. . .");
	final JButton btnClearSelected = new JButton("Clear Selection");
	final static JLabel pia_cS = new JLabel("C#");
	final static JLabel pia_dS = new JLabel("D#");
	final static JLabel pia_fS = new JLabel("F#");
	final static JLabel pia_gS = new JLabel("G#");
	final static JLabel pia_aS = new JLabel("A#");
	final static JLabel pia_c = new JLabel("C");
	final static JLabel pia_d = new JLabel("D");
	final static JLabel pia_e = new JLabel("E");
	final static JLabel pia_f = new JLabel("F");
	final static JLabel pia_g = new JLabel("G");
	final static JLabel pia_a = new JLabel("A");
	final static JLabel pia_b = new JLabel("B");
	JLabel pianoBg = new JLabel("");
	final static JLabel git_dS_5 = new JLabel("D#");
	final static JLabel git_dS_4 = new JLabel("D#");
	final static JLabel git_dS_3 = new JLabel("D#");
	final static JLabel git_dS_2 = new JLabel("D#");
	final static JLabel git_dS_1 = new JLabel("D#");
	final static JLabel git_dS = new JLabel("D#");
	final static JLabel git_d_6 = new JLabel("D");
	final static JLabel git_d_5 = new JLabel("D");
	final static JLabel git_d_4 = new JLabel("D");
	final static JLabel git_d_3 = new JLabel("D");
	final static JLabel git_d_2 = new JLabel("D");
	final static JLabel git_d_1 = new JLabel("D");
	final static JLabel git_d = new JLabel("D");
	final static JLabel git_cS_5 = new JLabel("C#");
	final static JLabel git_cS_4 = new JLabel("C#");
	final static JLabel git_cS_3 = new JLabel("C#");
	final static JLabel git_cS_2 = new JLabel("C#");
	final static JLabel git_cS_1 = new JLabel("C#");
	final static JLabel git_cS = new JLabel("C#");
	final static JLabel git_c_5 = new JLabel("C");
	final static JLabel git_c_4 = new JLabel("C");
	final static JLabel git_c_3 = new JLabel("C");
	final static JLabel git_c_2 = new JLabel("C");
	final static JLabel git_c_1 = new JLabel("C");
	final static JLabel git_c = new JLabel("C");
	final static JLabel git_b_6 = new JLabel("B");
	final static JLabel git_b_5 = new JLabel("B");
	final static JLabel git_b_4 = new JLabel("B");
	final static JLabel git_b_3 = new JLabel("B");
	final static JLabel git_b_2 = new JLabel("B");
	final static JLabel git_b_1 = new JLabel("B");
	final static JLabel git_b = new JLabel("B");
	final static JLabel git_aS_5 = new JLabel("A#");
	final static JLabel git_aS_4 = new JLabel("A#");
	final static JLabel git_aS_3 = new JLabel("A#");
	final static JLabel git_aS_2 = new JLabel("A#");
	final static JLabel git_aS_1 = new JLabel("A#");
	final static JLabel git_aS = new JLabel("A#");
	final static JLabel git_a_6 = new JLabel("A");
	final static JLabel git_a_5 = new JLabel("A");
	final static JLabel git_a_4 = new JLabel("A");
	final static JLabel git_a_3 = new JLabel("A");
	final static JLabel git_a_2 = new JLabel("A");
	final static JLabel git_a_1 = new JLabel("A");
	final static JLabel git_a = new JLabel("A");
	final static JLabel git_gS_5 = new JLabel("G#");
	final static JLabel git_gS_4 = new JLabel("G#");
	final static JLabel git_gS_3 = new JLabel("G#");
	final static JLabel git_gS_2 = new JLabel("G#");
	final static JLabel git_gS_1 = new JLabel("G#");
	final static JLabel git_gS = new JLabel("G#");
	final static JLabel git_g_6 = new JLabel("G");
	final static JLabel git_g_5 = new JLabel("G");
	final static JLabel git_g_4 = new JLabel("G");
	final static JLabel git_g_3 = new JLabel("G");
	final static JLabel git_g_2 = new JLabel("G");
	final static JLabel git_g_1 = new JLabel("G");
	final static JLabel git_g = new JLabel("G");
	final static JLabel git_fS_5 = new JLabel("F#");
	final static JLabel git_fS_4 = new JLabel("F#");
	final static JLabel git_fS_3 = new JLabel("F#");
	final static JLabel git_fS_2 = new JLabel("F#");
	final static JLabel git_fS_1 = new JLabel("F#");
	final static JLabel git_fS = new JLabel("F#");
	final static JLabel git_f_5 = new JLabel("F");
	final static JLabel git_f_4 = new JLabel("F");
	final static JLabel git_f_3 = new JLabel("F");
	final static JLabel git_f_2 = new JLabel("F");
	final static JLabel git_f_1 = new JLabel("F");
	final static JLabel git_f = new JLabel("F");
	final static JLabel git_e_7 = new JLabel("E");
	final static JLabel git_e_6 = new JLabel("E");
	final static JLabel git_e_5 = new JLabel("E");
	final static JLabel git_e_4 = new JLabel("E");
	final static JLabel git_e_3 = new JLabel("E");
	final static JLabel git_e_2 = new JLabel("E");
	final static JLabel git_e_1 = new JLabel("E");
	final static JLabel git_e = new JLabel("E");
	final JButton btnSoundOn = new JButton("Sound On");
	final JButton btnSoundOff = new JButton("Sound Off");

	final static Guitar c_5 = new Guitar("C", 72);
	final static Guitar c_4 = new Guitar("C", 60);
	final static Guitar c_3 = new Guitar("C", 60);
	final static Guitar c_2 = new Guitar("C", 60);
	final static Guitar c_1 = new Guitar("C", 48);
	final static Guitar c_0 = new Guitar("C", 48);
	final static Note c_0p = new Note("C", 60);

	final static Guitar cS_5 = new Guitar("C#", 73);
	final static Guitar cS_4 = new Guitar("C#", 61);
	final static Guitar cS_3 = new Guitar("C#", 61);
	final static Guitar cS_2 = new Guitar("C#", 61);
	final static Guitar cS_1 = new Guitar("C#", 49);
	final static Guitar cS_0 = new Guitar("C#", 49);
	final static Note cS_0p = new Note("C#", 61);

	final static Guitar d_6 = new Guitar("D", 74);
	final static Guitar d_5 = new Guitar("D", 62);
	final static Guitar d_4 = new Guitar("D", 62);
	final static Guitar d_3 = new Guitar("D", 62);
	final static Guitar d_2 = new Guitar("D", 50);
	final static Guitar d_1 = new Guitar("D", 50);
	final static Guitar d_0 = new Guitar("D", 50);
	final static Note d_0p = new Note("D", 62);

	final static Guitar dS_5 = new Guitar("D#", 75);
	final static Guitar dS_4 = new Guitar("D#", 63);
	final static Guitar dS_3 = new Guitar("D#", 63);
	final static Guitar dS_2 = new Guitar("D#", 51);
	final static Guitar dS_1 = new Guitar("D#", 51);
	final static Guitar dS_0 = new Guitar("D#", 51);
	final static Note dS_0p = new Note("D#", 63);

	final static Guitar e_7 = new Guitar("E", 76);
	final static Guitar e_6 = new Guitar("E", 64);
	final static Guitar e_5 = new Guitar("E", 64);
	final static Guitar e_4 = new Guitar("E", 64);
	final static Guitar e_3 = new Guitar("E", 52);
	final static Guitar e_2 = new Guitar("E", 52);
	final static Guitar e_1 = new Guitar("E", 52);
	final static Guitar e_0 = new Guitar("E", 40);
	final static Note e_0p = new Note("E", 64);

	final static Guitar f_5 = new Guitar("F", 65);
	final static Guitar f_4 = new Guitar("F", 65);
	final static Guitar f_3 = new Guitar("F", 65);
	final static Guitar f_2 = new Guitar("F", 53);
	final static Guitar f_1 = new Guitar("F", 53);
	final static Guitar f_0 = new Guitar("F", 41);
	final static Note f_0p = new Note("F", 65);

	final static Guitar fS_5 = new Guitar("F#", 66);
	final static Guitar fS_4 = new Guitar("F#", 66);
	final static Guitar fS_3 = new Guitar("F#", 66);
	final static Guitar fS_2 = new Guitar("F#", 54);
	final static Guitar fS_1 = new Guitar("F#", 54);
	final static Guitar fS_0 = new Guitar("F#", 42);
	final static Note fS_0p = new Note("F#", 66);

	final static Guitar g_6 = new Guitar("G", 67);
	final static Guitar g_5 = new Guitar("G", 67);
	final static Guitar g_4 = new Guitar("G", 67);
	final static Guitar g_3 = new Guitar("G", 55);
	final static Guitar g_2 = new Guitar("G", 55);
	final static Guitar g_1 = new Guitar("G", 55);
	final static Guitar g_0 = new Guitar("G", 43);
	final static Note g_0p = new Note("G", 67);

	final static Guitar gS_5 = new Guitar("G#", 68);
	final static Guitar gS_4 = new Guitar("G#", 68);
	final static Guitar gS_3 = new Guitar("G#", 56);
	final static Guitar gS_2 = new Guitar("G#", 56);
	final static Guitar gS_1 = new Guitar("G#", 56);
	final static Guitar gS_0 = new Guitar("G#", 44);
	final static Note gS_0p = new Note("G#", 68);

	final static Guitar a_6 = new Guitar("A", 69);
	final static Guitar a_5 = new Guitar("A", 69);
	final static Guitar a_4 = new Guitar("A", 57);
	final static Guitar a_3 = new Guitar("A", 57);
	final static Guitar a_2 = new Guitar("A", 57);
	final static Guitar a_1 = new Guitar("A", 45);
	final static Guitar a_0 = new Guitar("A", 45);
	final static Note a_0p = new Note("A", 69);

	final static Guitar aS_5 = new Guitar("A#", 70);
	final static Guitar aS_4 = new Guitar("A#", 70);
	final static Guitar aS_3 = new Guitar("A#", 58);
	final static Guitar aS_2 = new Guitar("A#", 58);
	final static Guitar aS_1 = new Guitar("A#", 46);
	final static Guitar aS_0 = new Guitar("A#", 46);
	final static Note aS_0p = new Note("A#", 70);

	final static Guitar b_6 = new Guitar("B", 71);
	final static Guitar b_5 = new Guitar("B", 71);
	final static Guitar b_4 = new Guitar("B", 59);
	final static Guitar b_3 = new Guitar("B", 59);
	final static Guitar b_2 = new Guitar("B", 59);
	final static Guitar b_1 = new Guitar("B", 47);
	final static Guitar b_0 = new Guitar("B", 47);
	final static Note b_0p = new Note("B", 71);

	public static void main(String[] args) {

		thread = new SynthThread();
		thread.start();
		threadAuto = new SynthThreadAuto();
		threadAuto.start();

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Guiano3 frame = new Guiano3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Guiano3() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				Guiano3.class.getResource("/img/batIcon.png")));
		setResizable(false);
		setTitle("Guiano 1.3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 748, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Using JLabel instead of buttons as when button gains mouse focus
		// their graphic is brought to the front, JLabel stays put so long as
		// not opaque

		lblTextDisplay
				.setBorder(new TitledBorder(UIManager
						.getBorder("TitledBorder.border"), "Information",
						TitledBorder.RIGHT, TitledBorder.TOP, null, new Color(
								0, 0, 0)));
		lblTextDisplay.setOpaque(true);
		lblTextDisplay.setBackground(Color.WHITE);
		lblTextDisplay.setVerticalAlignment(SwingConstants.TOP);
		lblTextDisplay.setBounds(300, 0, 284, 161);
		contentPane.add(lblTextDisplay);

		btnClearSelected.setBorder(UIManager.getBorder("Button.border"));
		btnClearSelected.setFont(new Font("Tahoma", Font.PLAIN, 9));
		contentPane.add(btnClearSelected);
		btnClearSelected.setBounds(300, 160, 123, 27);
		btnClearSelected.addMouseListener(this);

		setCharacteristicsPiaSharp(pia_cS);
		setCharacteristicsPiaSharp(pia_dS);
		setCharacteristicsPiaSharp(pia_fS);
		setCharacteristicsPiaSharp(pia_gS);
		setCharacteristicsPiaSharp(pia_aS);
		setCharacteristicsPia(pia_c);
		setCharacteristicsPia(pia_d);
		setCharacteristicsPia(pia_e);
		setCharacteristicsPia(pia_f);
		setCharacteristicsPia(pia_g);
		setCharacteristicsPia(pia_a);
		setCharacteristicsPia(pia_b);

		setCharacteristicsGit(git_dS_5);
		setCharacteristicsGit(git_dS_4);
		setCharacteristicsGit(git_dS_3);
		setCharacteristicsGit(git_dS_2);
		setCharacteristicsGit(git_dS_1);
		setCharacteristicsGit(git_dS);
		setCharacteristicsGit(git_d_6);
		setCharacteristicsGit(git_d_5);
		setCharacteristicsGit(git_d_4);
		setCharacteristicsGit(git_d_3);
		setCharacteristicsGit(git_d_2);
		setCharacteristicsGit(git_d_1);
		setCharacteristicsGit(git_d);
		setCharacteristicsGit(git_cS_5);
		setCharacteristicsGit(git_cS_4);
		setCharacteristicsGit(git_cS_3);
		setCharacteristicsGit(git_cS_2);
		setCharacteristicsGit(git_cS_1);
		setCharacteristicsGit(git_cS);
		setCharacteristicsGit(git_c_5);
		setCharacteristicsGit(git_c_4);
		setCharacteristicsGit(git_c_3);
		setCharacteristicsGit(git_c_2);
		setCharacteristicsGit(git_c_1);
		setCharacteristicsGit(git_c);
		setCharacteristicsGit(git_b_6);
		setCharacteristicsGit(git_b_5);
		setCharacteristicsGit(git_b_4);
		setCharacteristicsGit(git_b_3);
		setCharacteristicsGit(git_b_2);
		setCharacteristicsGit(git_b_1);
		setCharacteristicsGit(git_b);
		setCharacteristicsGit(git_aS_5);
		setCharacteristicsGit(git_aS_4);
		setCharacteristicsGit(git_aS_3);
		setCharacteristicsGit(git_aS_2);
		setCharacteristicsGit(git_aS_1);
		setCharacteristicsGit(git_aS);
		setCharacteristicsGit(git_a_6);
		setCharacteristicsGit(git_a_5);
		setCharacteristicsGit(git_a_4);
		setCharacteristicsGit(git_a_3);
		setCharacteristicsGit(git_a_2);
		setCharacteristicsGit(git_a_1);
		setCharacteristicsGit(git_a);
		setCharacteristicsGit(git_gS_5);
		setCharacteristicsGit(git_gS_4);
		setCharacteristicsGit(git_gS_3);
		setCharacteristicsGit(git_gS_2);
		setCharacteristicsGit(git_gS_1);
		setCharacteristicsGit(git_gS);
		setCharacteristicsGit(git_g_6);
		setCharacteristicsGit(git_g_5);
		setCharacteristicsGit(git_g_4);
		setCharacteristicsGit(git_g_3);
		setCharacteristicsGit(git_g_2);
		setCharacteristicsGit(git_g_1);
		setCharacteristicsGit(git_g);
		setCharacteristicsGit(git_fS_5);
		setCharacteristicsGit(git_fS_4);
		setCharacteristicsGit(git_fS_3);
		setCharacteristicsGit(git_fS_2);
		setCharacteristicsGit(git_fS_1);
		setCharacteristicsGit(git_fS);
		setCharacteristicsGit(git_f_5);
		setCharacteristicsGit(git_f_4);
		setCharacteristicsGit(git_f_3);
		setCharacteristicsGit(git_f_2);
		setCharacteristicsGit(git_f_1);
		setCharacteristicsGit(git_f);
		setCharacteristicsGit(git_e_7);
		setCharacteristicsGit(git_e_6);
		setCharacteristicsGit(git_e_5);
		setCharacteristicsGit(git_e_4);
		setCharacteristicsGit(git_e_3);
		setCharacteristicsGit(git_e_2);
		setCharacteristicsGit(git_e_1);
		setCharacteristicsGit(git_e);

		pia_cS.setBounds(38, 10, 22, 100);
		pia_dS.setBounds(78, 10, 22, 100);
		pia_fS.setBounds(158, 10, 22, 100);
		pia_gS.setBounds(198, 10, 22, 100);
		pia_aS.setBounds(238, 10, 22, 100);

		pia_c.setBounds(10, 10, 39, 167);
		pia_d.setBounds(50, 10, 39, 167);
		pia_e.setBounds(90, 10, 39, 167);
		pia_f.setBounds(130, 10, 39, 167);
		pia_g.setBounds(170, 10, 39, 167);
		pia_a.setBounds(210, 10, 39, 167);
		pia_b.setBounds(250, 10, 39, 167);

		pianoBg.setOpaque(true);
		pianoBg.setBackground(Color.BLACK);
		pianoBg.setBounds(0, 0, 300, 187);
		contentPane.add(pianoBg);

		git_dS_5.setBounds(619, 198, 50, 27);
		git_dS_4.setBounds(214, 226, 50, 27);
		git_dS_3.setBounds(445, 254, 50, 27);
		git_dS_2.setBounds(41, 282, 50, 27);
		git_dS_1.setBounds(330, 310, 50, 27);
		git_dS.setBounds(619, 338, 50, 27);
		git_d_6.setBounds(561, 198, 50, 27);
		git_d_5.setBounds(156, 226, 50, 27);
		git_d_4.setBounds(388, 254, 50, 27);
		git_d_3.setBounds(677, 282, 50, 27);
		git_d_2.setBounds(10, 282, 21, 27);
		git_d_1.setBounds(272, 310, 50, 27);
		git_d.setBounds(561, 338, 50, 27);
		git_cS_5.setBounds(503, 198, 50, 27);
		git_cS_4.setBounds(99, 226, 50, 27);
		git_cS_3.setBounds(330, 254, 50, 27);
		git_cS_2.setBounds(619, 282, 50, 27);
		git_cS_1.setBounds(214, 310, 50, 27);
		git_cS.setBounds(503, 338, 50, 27);
		git_c_5.setBounds(445, 198, 50, 27);
		git_c_4.setBounds(41, 226, 50, 27);
		git_c_3.setBounds(272, 254, 50, 27);
		git_c_2.setBounds(561, 282, 50, 27);
		git_c_1.setBounds(156, 310, 50, 27);
		git_c.setBounds(445, 338, 50, 27);
		git_b_6.setBounds(388, 198, 50, 27);
		git_b_5.setBounds(677, 226, 50, 27);
		git_b_4.setBounds(10, 226, 21, 27);
		git_b_3.setBounds(214, 254, 50, 27);
		git_b_2.setBounds(503, 282, 50, 27);
		git_b_1.setBounds(99, 310, 50, 27);
		git_b.setBounds(388, 338, 50, 27);
		git_aS_5.setBounds(330, 198, 50, 27);
		git_aS_4.setBounds(619, 226, 50, 27);
		git_aS_3.setBounds(156, 254, 50, 27);
		git_aS_2.setBounds(445, 282, 50, 27);
		git_aS_1.setBounds(41, 310, 50, 27);
		git_aS.setBounds(330, 338, 50, 27);
		git_a_6.setBounds(272, 198, 50, 27);
		git_a_5.setBounds(561, 226, 50, 27);
		git_a_4.setBounds(99, 254, 50, 27);
		git_a_3.setBounds(388, 282, 50, 27);
		git_a_2.setBounds(677, 310, 50, 27);
		git_a_1.setBounds(10, 310, 21, 27);
		git_a.setBounds(272, 338, 50, 27);
		git_gS_5.setBounds(214, 198, 50, 27);
		git_gS_4.setBounds(503, 226, 50, 27);
		git_gS_3.setBounds(41, 254, 50, 27);
		git_gS_2.setBounds(330, 282, 50, 27);
		git_gS_1.setBounds(619, 310, 50, 27);
		git_gS.setBounds(214, 338, 50, 27);
		git_g_6.setBounds(156, 198, 50, 27);
		git_g_5.setBounds(445, 226, 50, 27);
		git_g_4.setBounds(677, 254, 50, 27);
		git_g_3.setBounds(10, 254, 21, 27);
		git_g_2.setBounds(272, 282, 50, 27);
		git_g_1.setBounds(561, 310, 50, 27);
		git_g.setBounds(156, 338, 50, 27);
		git_fS_5.setBounds(99, 198, 50, 27);
		git_fS_4.setBounds(388, 226, 50, 27);
		git_fS_3.setBounds(619, 254, 50, 27);
		git_fS_2.setBounds(214, 282, 50, 27);
		git_fS_1.setBounds(503, 310, 50, 27);
		git_fS.setBounds(99, 338, 50, 27);
		git_f_5.setBounds(41, 198, 50, 27);
		git_f_4.setBounds(330, 226, 50, 27);
		git_f_3.setBounds(561, 254, 50, 27);
		git_f_2.setBounds(156, 282, 50, 27);
		git_f_1.setBounds(445, 310, 50, 27);
		git_f.setBounds(41, 338, 50, 27);
		git_e_7.setBounds(677, 198, 50, 27);
		git_e_6.setBounds(10, 198, 21, 27);
		git_e_5.setBounds(272, 226, 50, 27);
		git_e_4.setBounds(503, 254, 50, 27);
		git_e_3.setBounds(99, 282, 50, 27);
		git_e_2.setBounds(388, 310, 50, 27);
		git_e_1.setBounds(677, 338, 50, 27);
		git_e.setBounds(10, 338, 21, 27);

		c_5.set_string(6);
		c_4.set_string(5);
		c_3.set_string(4);
		c_2.set_string(3);
		c_1.set_string(2);
		c_0.set_string(1);

		cS_5.set_string(6);
		cS_4.set_string(5);
		cS_3.set_string(4);
		cS_2.set_string(3);
		cS_1.set_string(2);
		cS_0.set_string(1);

		d_6.set_string(6);
		d_5.set_string(5);
		d_4.set_string(4);
		d_3.set_string(3);
		d_2.set_string(3);
		d_1.set_string(2);
		d_0.set_string(1);

		dS_5.set_string(6);
		dS_4.set_string(5);
		dS_3.set_string(4);
		dS_2.set_string(3);
		dS_1.set_string(2);
		dS_0.set_string(1);

		e_7.set_string(6);
		e_6.set_string(6);
		e_5.set_string(5);
		e_4.set_string(4);
		e_3.set_string(3);
		e_2.set_string(2);
		e_1.set_string(1);
		e_0.set_string(1);

		f_5.set_string(6);
		f_4.set_string(5);
		f_3.set_string(4);
		f_2.set_string(3);
		f_1.set_string(2);
		f_0.set_string(1);

		fS_5.set_string(6);
		fS_4.set_string(5);
		fS_3.set_string(4);
		fS_2.set_string(3);
		fS_1.set_string(2);
		fS_0.set_string(1);

		g_6.set_string(6);
		g_5.set_string(5);
		g_4.set_string(4);
		g_3.set_string(4);
		g_2.set_string(3);
		g_1.set_string(2);
		g_0.set_string(1);

		gS_5.set_string(6);
		gS_4.set_string(5);
		gS_3.set_string(4);
		gS_2.set_string(3);
		gS_1.set_string(2);
		gS_0.set_string(1);

		a_6.set_string(6);
		a_5.set_string(5);
		a_4.set_string(4);
		a_3.set_string(3);
		a_2.set_string(2);
		a_1.set_string(2);
		a_0.set_string(1);

		aS_5.set_string(6);
		aS_4.set_string(5);
		aS_3.set_string(4);
		aS_2.set_string(3);
		aS_1.set_string(2);
		aS_0.set_string(1);

		b_6.set_string(6);
		b_5.set_string(5);
		b_4.set_string(5);
		b_3.set_string(4);
		b_2.set_string(3);
		b_1.set_string(2);
		b_0.set_string(1);

		JLabel gBridge = new JLabel("");
		gBridge.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gBridge.png")));
		gBridge.setBounds(30, 198, 12, 167);
		contentPane.add(gBridge);

		JLabel gFret2 = new JLabel("");
		gFret2.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret2.setBounds(91, 198, 8, 167);
		contentPane.add(gFret2);

		JLabel gFret3 = new JLabel("");
		gFret3.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret3.setBounds(149, 198, 8, 167);
		contentPane.add(gFret3);

		JLabel gFret4 = new JLabel("");
		gFret4.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret4.setBounds(206, 198, 8, 167);
		contentPane.add(gFret4);

		JLabel gFret5 = new JLabel("");
		gFret5.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret5.setBounds(264, 198, 8, 167);
		contentPane.add(gFret5);

		JLabel gFret6 = new JLabel("");
		gFret6.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret6.setBounds(322, 198, 8, 167);
		contentPane.add(gFret6);

		JLabel gFret7 = new JLabel("");
		gFret7.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret7.setBounds(380, 198, 8, 167);
		contentPane.add(gFret7);

		JLabel gFret8 = new JLabel("");
		gFret8.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret8.setBounds(438, 198, 8, 167);
		contentPane.add(gFret8);

		JLabel gFret9 = new JLabel("");
		gFret9.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret9.setBounds(495, 198, 8, 167);
		contentPane.add(gFret9);

		JLabel gFret10 = new JLabel("");
		gFret10.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret10.setBounds(553, 198, 8, 167);
		contentPane.add(gFret10);

		JLabel gFret11 = new JLabel("");
		gFret11.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret11.setBounds(611, 198, 8, 167);
		contentPane.add(gFret11);

		JLabel gFret12 = new JLabel("");
		gFret12.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret12.setBounds(669, 198, 8, 167);
		contentPane.add(gFret12);

		JLabel gFret13 = new JLabel("");
		gFret13.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/gFret.png")));
		gFret13.setBounds(727, 198, 8, 167);
		contentPane.add(gFret13);

		JLabel guitarBg = new JLabel("");
		guitarBg.setOpaque(true);
		guitarBg.setBackground(Color.BLACK);
		guitarBg.setBounds(0, 188, 745, 187);
		contentPane.add(guitarBg);

		final JToggleButton GuianoLogo = new JToggleButton("");
		GuianoLogo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (GuianoLogoBtnOn == false) {
					GuianoLogoBtnOn = true;
					SynthThreadAuto.GuianoLogoBtnOn = true;
					SynthThreadAuto.enableSound();
				} else if (GuianoLogoBtnOn == true) {
					GuianoLogoBtnOn = false;
					SynthThreadAuto.GuianoLogoBtnOn = false;
					SynthThreadAuto.disableSound();
					SynthThreadAuto.noteGeneratedUnHighlight();
				}
				
			}
		});
		GuianoLogo.setVerticalAlignment(SwingConstants.TOP);
		GuianoLogo.setHorizontalTextPosition(SwingConstants.CENTER);
		GuianoLogo.setHorizontalAlignment(SwingConstants.CENTER);
		GuianoLogo.setBackground(Color.BLACK);
		GuianoLogo.setOpaque(true);
		GuianoLogo.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/Guiano.png")));
		GuianoLogo.setBounds(583, 0, 161, 187);
		contentPane.add(GuianoLogo);

		btnSoundOn.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSoundOn.setBounds(423, 160, 80, 27);
		btnSoundOn.addMouseListener(this);
		contentPane.add(btnSoundOn);

		btnSoundOff.setEnabled(false);
		btnSoundOff.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSoundOff.setBounds(503, 160, 80, 27);
		btnSoundOff.addMouseListener(this);
		contentPane.add(btnSoundOff);
	}

	private void setCharacteristicsGit(JLabel gitKey) {
		// Sets initial JLabel characteristics for guitar notes
		gitKey.setOpaque(true);
		gitKey.setBackground(Color.WHITE);
		gitKey.setHorizontalAlignment(SwingConstants.CENTER);
		gitKey.setHorizontalTextPosition(SwingConstants.CENTER);
		gitKey.setFont(new Font("Tahoma", Font.PLAIN, 11));
		gitKey.addMouseListener(this);
		contentPane.add(gitKey);
	}

	private void setCharacteristicsPia(JLabel piaKey) {
		// Sets initial JLabel characteristics for white piano keys
		piaKey.setBackground(Color.WHITE);
		piaKey.setHorizontalAlignment(SwingConstants.CENTER);
		piaKey.setHorizontalTextPosition(SwingConstants.CENTER);
		piaKey.setFont(new Font("Tahoma", Font.PLAIN, 11));
		piaKey.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/pkWht.gif")));
		piaKey.addMouseListener(this);
		contentPane.add(piaKey);
	}

	private void setCharacteristicsPiaSharp(JLabel sharpPiaKey) {
		// Sets initial JLabel characteristics for black piano keys
		sharpPiaKey.setBackground(Color.BLACK);
		sharpPiaKey.setForeground(Color.WHITE);
		sharpPiaKey.setHorizontalAlignment(SwingConstants.CENTER);
		sharpPiaKey.setHorizontalTextPosition(SwingConstants.CENTER);
		sharpPiaKey.setFont(new Font("Tahoma", Font.PLAIN, 11));
		sharpPiaKey.setIcon(new ImageIcon(Guiano3.class
				.getResource("/img/pkBlk.gif")));
		sharpPiaKey.addMouseListener(this);
		contentPane.add(sharpPiaKey);
	}

	protected void playSound(Guitar noteIN) {

		noteIN.transmitInstType();
		SynthThread.setPitchIN((int) noteIN.get_pitch());
		SynthThread.noteOn();

	}

	protected void playSound(Note noteIN) {

		noteIN.transmitInstType();
		SynthThread.setPitchIN((int) noteIN.get_pitch());
		SynthThread.noteOn();

	}

	protected void setBordersOn(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6, JLabel g7) {
		p0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g2.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g3.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g4.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g5.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g6.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g7.setBorder(new LineBorder(new Color(255, 0, 0), 2));
	}

	protected void setBordersOn(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6) {
		p0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g2.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g3.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g4.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g5.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g6.setBorder(new LineBorder(new Color(255, 0, 0), 2));
	}

	protected void setBordersOn(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5) {
		p0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g0.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g1.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g2.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g3.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g4.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		g5.setBorder(new LineBorder(new Color(255, 0, 0), 2));
	}

	protected static void highlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6, JLabel g7) {
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g1.setFont(new Font("Tahoma", Font.BOLD, 12));
		g2.setFont(new Font("Tahoma", Font.BOLD, 12));
		g3.setFont(new Font("Tahoma", Font.BOLD, 12));
		g4.setFont(new Font("Tahoma", Font.BOLD, 12));
		g5.setFont(new Font("Tahoma", Font.BOLD, 12));
		g6.setFont(new Font("Tahoma", Font.BOLD, 12));
		g7.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setBackground(Color.LIGHT_GRAY);
		g1.setBackground(Color.LIGHT_GRAY);
		g2.setBackground(Color.LIGHT_GRAY);
		g3.setBackground(Color.LIGHT_GRAY);
		g4.setBackground(Color.LIGHT_GRAY);
		g5.setBackground(Color.LIGHT_GRAY);
		g6.setBackground(Color.LIGHT_GRAY);
		g7.setBackground(Color.LIGHT_GRAY);
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkGry.gif")));
	}

	protected static void highlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6) {
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g1.setFont(new Font("Tahoma", Font.BOLD, 12));
		g2.setFont(new Font("Tahoma", Font.BOLD, 12));
		g3.setFont(new Font("Tahoma", Font.BOLD, 12));
		g4.setFont(new Font("Tahoma", Font.BOLD, 12));
		g5.setFont(new Font("Tahoma", Font.BOLD, 12));
		g6.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setBackground(Color.LIGHT_GRAY);
		g1.setBackground(Color.LIGHT_GRAY);
		g2.setBackground(Color.LIGHT_GRAY);
		g3.setBackground(Color.LIGHT_GRAY);
		g4.setBackground(Color.LIGHT_GRAY);
		g5.setBackground(Color.LIGHT_GRAY);
		g6.setBackground(Color.LIGHT_GRAY);
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkGry.gif")));
	}

	protected static void highlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5) {
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g1.setFont(new Font("Tahoma", Font.BOLD, 12));
		g2.setFont(new Font("Tahoma", Font.BOLD, 12));
		g3.setFont(new Font("Tahoma", Font.BOLD, 12));
		g4.setFont(new Font("Tahoma", Font.BOLD, 12));
		g5.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setBackground(Color.LIGHT_GRAY);
		g1.setBackground(Color.LIGHT_GRAY);
		g2.setBackground(Color.LIGHT_GRAY);
		g3.setBackground(Color.LIGHT_GRAY);
		g4.setBackground(Color.LIGHT_GRAY);
		g5.setBackground(Color.LIGHT_GRAY);
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkGry.gif")));
	}

	protected static void highlightSharp(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5) {
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setFont(new Font("Tahoma", Font.BOLD, 12));
		g1.setFont(new Font("Tahoma", Font.BOLD, 12));
		g2.setFont(new Font("Tahoma", Font.BOLD, 12));
		g3.setFont(new Font("Tahoma", Font.BOLD, 12));
		g4.setFont(new Font("Tahoma", Font.BOLD, 12));
		g5.setFont(new Font("Tahoma", Font.BOLD, 12));
		g0.setBackground(Color.LIGHT_GRAY);
		g1.setBackground(Color.LIGHT_GRAY);
		g2.setBackground(Color.LIGHT_GRAY);
		g3.setBackground(Color.LIGHT_GRAY);
		g4.setBackground(Color.LIGHT_GRAY);
		g5.setBackground(Color.LIGHT_GRAY);
		p0.setFont(new Font("Tahoma", Font.BOLD, 12));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkGryS.gif")));
	}

	protected static void resetHighlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6, JLabel g7) {
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g7.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setBackground(Color.WHITE);
		g1.setBackground(Color.WHITE);
		g2.setBackground(Color.WHITE);
		g3.setBackground(Color.WHITE);
		g4.setBackground(Color.WHITE);
		g5.setBackground(Color.WHITE);
		g6.setBackground(Color.WHITE);
		g7.setBackground(Color.WHITE);
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkWht.gif")));
	}

	protected static void resetHighlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5, JLabel g6) {
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g6.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setBackground(Color.WHITE);
		g1.setBackground(Color.WHITE);
		g2.setBackground(Color.WHITE);
		g3.setBackground(Color.WHITE);
		g4.setBackground(Color.WHITE);
		g5.setBackground(Color.WHITE);
		g6.setBackground(Color.WHITE);
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkWht.gif")));
	}

	protected static void resetHighlight(JLabel p0, JLabel g0, JLabel g1, JLabel g2,
			JLabel g3, JLabel g4, JLabel g5) {
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setBackground(Color.WHITE);
		g1.setBackground(Color.WHITE);
		g2.setBackground(Color.WHITE);
		g3.setBackground(Color.WHITE);
		g4.setBackground(Color.WHITE);
		g5.setBackground(Color.WHITE);
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkWht.gif")));
	}

	protected static void resetHighlightSharp(JLabel p0, JLabel g0, JLabel g1,
			JLabel g2, JLabel g3, JLabel g4, JLabel g5) {
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		g0.setBackground(Color.WHITE);
		g1.setBackground(Color.WHITE);
		g2.setBackground(Color.WHITE);
		g3.setBackground(Color.WHITE);
		g4.setBackground(Color.WHITE);
		g5.setBackground(Color.WHITE);
		p0.setFont(new Font("Tahoma", Font.PLAIN, 11));
		p0.setIcon(new ImageIcon(Guiano3.class.getResource("/img/pkBlk.gif")));

	}

	/*
	 * Major scale verify (opt 3) Midi Note Numbers {0, 2, 4, 5, 7, 9, 11}
	 * define the intervals.
	 * 
	 * @return true if number is in the scale or any number of octaves higher
	 * (values above 127 ignored) (Takes original input number and -12 until
	 * value is between 0-11 (one octave) if value matches a note.. .. in the
	 * scale return true, else report numbers tried. (Can
	 */
	public static boolean isMajor(int number) {
		int note = number;
		if (note < 127) // ignore input values above 127.
		{
			for (int i = note; i > -1; i--) // loop from note input value down
			// until reached -1
			{
				if (note == 0 || note == 2 || note == 4 || note == 5
						|| note == 7 || note == 9 || note == 11) // modify for
				// any scale
				{
					System.out.print("\n	Note found: " + note
							+ " Number derived from original value of "
							+ number);
					return true; // number is in major scale
				} else {
					System.out.print("Tried note: " + note + ", ");
					note = note - 12; // Minus 1 octave on each iteration of
					// loop where no match found..
					if (note < 0)
						break; // .. until note value less than 0.
				}
			}
		}
		System.out.println("BROKE OUT on value:" + note);
		return false; // number is not major

	}

	@Override
	public void mouseClicked(MouseEvent e) {		
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(pia_c) || e.getSource().equals(git_c)
				|| e.getSource().equals(git_c_1)
				|| e.getSource().equals(git_c_2)
				|| e.getSource().equals(git_c_3)
				|| e.getSource().equals(git_c_4)
				|| e.getSource().equals(git_c_5)) {
			highlight(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4, git_c_5);
		} else if (e.getSource().equals(pia_cS) || e.getSource().equals(git_cS)
				|| e.getSource().equals(git_cS_1)
				|| e.getSource().equals(git_cS_2)
				|| e.getSource().equals(git_cS_3)
				|| e.getSource().equals(git_cS_4)
				|| e.getSource().equals(git_cS_5)) {
			highlightSharp(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
		} else if (e.getSource().equals(pia_d) || e.getSource().equals(git_d)
				|| e.getSource().equals(git_d_1)
				|| e.getSource().equals(git_d_2)
				|| e.getSource().equals(git_d_3)
				|| e.getSource().equals(git_d_4)
				|| e.getSource().equals(git_d_5)
				|| e.getSource().equals(git_d_6)) {
			highlight(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
		} else if (e.getSource().equals(pia_dS) || e.getSource().equals(git_dS)
				|| e.getSource().equals(git_dS_1)
				|| e.getSource().equals(git_dS_2)
				|| e.getSource().equals(git_dS_3)
				|| e.getSource().equals(git_dS_4)
				|| e.getSource().equals(git_dS_5)) {
			highlightSharp(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
		} else if (e.getSource().equals(pia_e) || e.getSource().equals(git_e)
				|| e.getSource().equals(git_e_1)
				|| e.getSource().equals(git_e_2)
				|| e.getSource().equals(git_e_3)
				|| e.getSource().equals(git_e_4)
				|| e.getSource().equals(git_e_5)
				|| e.getSource().equals(git_e_6)
				|| e.getSource().equals(git_e_7)) {
			highlight(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
		} else if (e.getSource().equals(pia_f) || e.getSource().equals(git_f)
				|| e.getSource().equals(git_f_1)
				|| e.getSource().equals(git_f_2)
				|| e.getSource().equals(git_f_3)
				|| e.getSource().equals(git_f_4)
				|| e.getSource().equals(git_f_5)) {
			highlight(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4, git_f_5);
		} else if (e.getSource().equals(pia_fS) || e.getSource().equals(git_fS)
				|| e.getSource().equals(git_fS_1)
				|| e.getSource().equals(git_fS_2)
				|| e.getSource().equals(git_fS_3)
				|| e.getSource().equals(git_fS_4)
				|| e.getSource().equals(git_fS_5)) {
			highlightSharp(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
		} else if (e.getSource().equals(pia_g) || e.getSource().equals(git_g)
				|| e.getSource().equals(git_g_1)
				|| e.getSource().equals(git_g_2)
				|| e.getSource().equals(git_g_3)
				|| e.getSource().equals(git_g_4)
				|| e.getSource().equals(git_g_5)
				|| e.getSource().equals(git_g_6)) {
			highlight(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
		} else if (e.getSource().equals(pia_gS) || e.getSource().equals(git_gS)
				|| e.getSource().equals(git_gS_1)
				|| e.getSource().equals(git_gS_2)
				|| e.getSource().equals(git_gS_3)
				|| e.getSource().equals(git_gS_4)
				|| e.getSource().equals(git_gS_5)) {
			highlightSharp(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
		} else if (e.getSource().equals(pia_a) || e.getSource().equals(git_a)
				|| e.getSource().equals(git_a_1)
				|| e.getSource().equals(git_a_2)
				|| e.getSource().equals(git_a_3)
				|| e.getSource().equals(git_a_4)
				|| e.getSource().equals(git_a_5)
				|| e.getSource().equals(git_a_6)) {
			highlight(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
		} else if (e.getSource().equals(pia_aS) || e.getSource().equals(git_aS)
				|| e.getSource().equals(git_aS_1)
				|| e.getSource().equals(git_aS_2)
				|| e.getSource().equals(git_aS_3)
				|| e.getSource().equals(git_aS_4)
				|| e.getSource().equals(git_aS_5)) {
			highlightSharp(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
		} else if (e.getSource().equals(pia_b) || e.getSource().equals(git_b)
				|| e.getSource().equals(git_b_1)
				|| e.getSource().equals(git_b_2)
				|| e.getSource().equals(git_b_3)
				|| e.getSource().equals(git_b_4)
				|| e.getSource().equals(git_b_5)
				|| e.getSource().equals(git_b_6)) {
			highlight(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(pia_c) || e.getSource().equals(git_c)
				|| e.getSource().equals(git_c_1)
				|| e.getSource().equals(git_c_2)
				|| e.getSource().equals(git_c_3)
				|| e.getSource().equals(git_c_4)
				|| e.getSource().equals(git_c_5)) {
			resetHighlight(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
		} else if (e.getSource().equals(pia_cS) || e.getSource().equals(git_cS)
				|| e.getSource().equals(git_cS_1)
				|| e.getSource().equals(git_cS_2)
				|| e.getSource().equals(git_cS_3)
				|| e.getSource().equals(git_cS_4)
				|| e.getSource().equals(git_cS_5)) {
			resetHighlightSharp(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
		} else if (e.getSource().equals(pia_d) || e.getSource().equals(git_d)
				|| e.getSource().equals(git_d_1)
				|| e.getSource().equals(git_d_2)
				|| e.getSource().equals(git_d_3)
				|| e.getSource().equals(git_d_4)
				|| e.getSource().equals(git_d_5)
				|| e.getSource().equals(git_d_6)) {
			resetHighlight(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
		} else if (e.getSource().equals(pia_dS) || e.getSource().equals(git_dS)
				|| e.getSource().equals(git_dS_1)
				|| e.getSource().equals(git_dS_2)
				|| e.getSource().equals(git_dS_3)
				|| e.getSource().equals(git_dS_4)
				|| e.getSource().equals(git_dS_5)) {
			resetHighlightSharp(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
		} else if (e.getSource().equals(pia_e) || e.getSource().equals(git_e)
				|| e.getSource().equals(git_e_1)
				|| e.getSource().equals(git_e_2)
				|| e.getSource().equals(git_e_3)
				|| e.getSource().equals(git_e_4)
				|| e.getSource().equals(git_e_5)
				|| e.getSource().equals(git_e_6)
				|| e.getSource().equals(git_e_7)) {
			resetHighlight(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
		} else if (e.getSource().equals(pia_f) || e.getSource().equals(git_f)
				|| e.getSource().equals(git_f_1)
				|| e.getSource().equals(git_f_2)
				|| e.getSource().equals(git_f_3)
				|| e.getSource().equals(git_f_4)
				|| e.getSource().equals(git_f_5)) {
			resetHighlight(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
		} else if (e.getSource().equals(pia_fS) || e.getSource().equals(git_fS)
				|| e.getSource().equals(git_fS_1)
				|| e.getSource().equals(git_fS_2)
				|| e.getSource().equals(git_fS_3)
				|| e.getSource().equals(git_fS_4)
				|| e.getSource().equals(git_fS_5)) {
			resetHighlightSharp(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
		} else if (e.getSource().equals(pia_g) || e.getSource().equals(git_g)
				|| e.getSource().equals(git_g_1)
				|| e.getSource().equals(git_g_2)
				|| e.getSource().equals(git_g_3)
				|| e.getSource().equals(git_g_4)
				|| e.getSource().equals(git_g_5)
				|| e.getSource().equals(git_g_6)) {
			resetHighlight(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
		} else if (e.getSource().equals(pia_gS) || e.getSource().equals(git_gS)
				|| e.getSource().equals(git_gS_1)
				|| e.getSource().equals(git_gS_2)
				|| e.getSource().equals(git_gS_3)
				|| e.getSource().equals(git_gS_4)
				|| e.getSource().equals(git_gS_5)) {
			resetHighlightSharp(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
		} else if (e.getSource().equals(pia_a) || e.getSource().equals(git_a)
				|| e.getSource().equals(git_a_1)
				|| e.getSource().equals(git_a_2)
				|| e.getSource().equals(git_a_3)
				|| e.getSource().equals(git_a_4)
				|| e.getSource().equals(git_a_5)
				|| e.getSource().equals(git_a_6)) {
			resetHighlight(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
		} else if (e.getSource().equals(pia_aS) || e.getSource().equals(git_aS)
				|| e.getSource().equals(git_aS_1)
				|| e.getSource().equals(git_aS_2)
				|| e.getSource().equals(git_aS_3)
				|| e.getSource().equals(git_aS_4)
				|| e.getSource().equals(git_aS_5)) {
			resetHighlightSharp(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
		} else if (e.getSource().equals(pia_b) || e.getSource().equals(git_b)
				|| e.getSource().equals(git_b_1)
				|| e.getSource().equals(git_b_2)
				|| e.getSource().equals(git_b_3)
				|| e.getSource().equals(git_b_4)
				|| e.getSource().equals(git_b_5)
				|| e.getSource().equals(git_b_6)) {
			resetHighlight(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(git_c)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_0.get_name()
					+ "<br>MIDI Number: " + c_0.get_pitch()
					+ "<br>Guitar String: " + c_0.get_string() + "</html>");
			playSound(c_0);
		} else if (e.getSource().equals(git_c_1)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_1.get_name()
					+ "<br>MIDI Number: " + c_1.get_pitch()
					+ "<br>Guitar String: " + c_1.get_string() + "</html>");
			playSound(c_1);
		} else if (e.getSource().equals(git_c_2)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_2.get_name()
					+ "<br>MIDI Number: " + c_2.get_pitch()
					+ "<br>Guitar String: " + c_2.get_string() + "</html>");
			playSound(c_2);
		} else if (e.getSource().equals(git_c_3)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_3.get_name()
					+ "<br>MIDI Number: " + c_3.get_pitch()
					+ "<br>Guitar String: " + c_3.get_string() + "</html>");
			playSound(c_3);
		} else if (e.getSource().equals(git_c_4)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_4.get_name()
					+ "<br>MIDI Number: " + c_4.get_pitch()
					+ "<br>Guitar String: " + c_4.get_string() + "</html>");
			playSound(c_4);
		} else if (e.getSource().equals(git_c_5)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_5.get_name()
					+ "<br>MIDI Number: " + c_5.get_pitch()
					+ "<br>Guitar String: " + c_5.get_string() + "</html>");
			playSound(c_5);
		} else if (e.getSource().equals(pia_c)) {
			clearSelected();
			setBordersOn(pia_c, git_c, git_c_1, git_c_2, git_c_3, git_c_4,
					git_c_5);
			lblTextDisplay.setText("<html>Note selected: " + c_0p.get_name()
					+ "<br>MIDI Number: " + c_0p.get_pitch() + "</html>");
			playSound(c_0p);
		} else if (e.getSource().equals(git_cS)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_0.get_name()
					+ "<br>MIDI Number: " + cS_0.get_pitch()
					+ "<br>Guitar String: " + cS_0.get_string() + "</html>");
			playSound(cS_0);
		} else if (e.getSource().equals(git_cS_1)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_1.get_name()
					+ "<br>MIDI Number: " + cS_1.get_pitch()
					+ "<br>Guitar String: " + cS_1.get_string() + "</html>");
			playSound(cS_1);
		} else if (e.getSource().equals(git_cS_2)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_2.get_name()
					+ "<br>MIDI Number: " + cS_2.get_pitch()
					+ "<br>Guitar String: " + cS_2.get_string() + "</html>");
			playSound(cS_2);
		} else if (e.getSource().equals(git_cS_3)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_3.get_name()
					+ "<br>MIDI Number: " + cS_3.get_pitch()
					+ "<br>Guitar String: " + cS_3.get_string() + "</html>");
			playSound(cS_3);
		} else if (e.getSource().equals(git_cS_4)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_4.get_name()
					+ "<br>MIDI Number: " + cS_4.get_pitch()
					+ "<br>Guitar String: " + cS_4.get_string() + "</html>");
			playSound(cS_4);
		} else if (e.getSource().equals(git_cS_5)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_5.get_name()
					+ "<br>MIDI Number: " + cS_5.get_pitch()
					+ "<br>Guitar String: " + cS_5.get_string() + "</html>");
			playSound(cS_5);
		} else if (e.getSource().equals(pia_cS)) {
			clearSelected();
			setBordersOn(pia_cS, git_cS, git_cS_1, git_cS_2, git_cS_3,
					git_cS_4, git_cS_5);
			lblTextDisplay.setText("<html>Note selected: " + cS_0p.get_name()
					+ "<br>MIDI Number: " + cS_0p.get_pitch() + "</html>");
			playSound(cS_0p);
		} else if (e.getSource().equals(git_d)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_0.get_name()
					+ "<br>MIDI Number: " + d_0.get_pitch()
					+ "<br>Guitar String: " + d_0.get_string() + "</html>");
			playSound(d_0);
		} else if (e.getSource().equals(git_d_1)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_1.get_name()
					+ "<br>MIDI Number: " + d_1.get_pitch()
					+ "<br>Guitar String: " + d_1.get_string() + "</html>");
			playSound(d_1);
		} else if (e.getSource().equals(git_d_2)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_2.get_name()
					+ "<br>MIDI Number: " + d_2.get_pitch()
					+ "<br>Guitar String: " + d_2.get_string() + "</html>");
			playSound(d_2);
		} else if (e.getSource().equals(git_d_3)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_3.get_name()
					+ "<br>MIDI Number: " + d_3.get_pitch()
					+ "<br>Guitar String: " + d_3.get_string() + "</html>");
			playSound(d_3);
		} else if (e.getSource().equals(git_d_4)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_4.get_name()
					+ "<br>MIDI Number: " + d_4.get_pitch()
					+ "<br>Guitar String: " + d_4.get_string() + "</html>");
			playSound(d_4);
		} else if (e.getSource().equals(git_d_5)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_5.get_name()
					+ "<br>MIDI Number: " + d_5.get_pitch()
					+ "<br>Guitar String: " + d_5.get_string() + "</html>");
			playSound(d_5);
		} else if (e.getSource().equals(git_d_6)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_6.get_name()
					+ "<br>MIDI Number: " + d_6.get_pitch()
					+ "<br>Guitar String: " + d_6.get_string() + "</html>");
			playSound(d_6);
		} else if (e.getSource().equals(pia_d)) {
			clearSelected();
			setBordersOn(pia_d, git_d, git_d_1, git_d_2, git_d_3, git_d_4,
					git_d_5, git_d_6);
			lblTextDisplay.setText("<html>Note selected: " + d_0p.get_name()
					+ "<br>MIDI Number: " + d_0p.get_pitch() + "</html>");
			playSound(d_0p);
		} else if (e.getSource().equals(git_dS)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_0.get_name()
					+ "<br>MIDI Number: " + dS_0.get_pitch()
					+ "<br>Guitar String: " + dS_0.get_string() + "</html>");
			playSound(dS_0);
		} else if (e.getSource().equals(git_dS_1)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_1.get_name()
					+ "<br>MIDI Number: " + dS_1.get_pitch()
					+ "<br>Guitar String: " + dS_1.get_string() + "</html>");
			playSound(dS_1);
		} else if (e.getSource().equals(git_dS_2)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_2.get_name()
					+ "<br>MIDI Number: " + dS_2.get_pitch()
					+ "<br>Guitar String: " + dS_2.get_string() + "</html>");
			playSound(dS_2);
		} else if (e.getSource().equals(git_dS_3)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_3.get_name()
					+ "<br>MIDI Number: " + dS_3.get_pitch()
					+ "<br>Guitar String: " + dS_3.get_string() + "</html>");
			playSound(dS_3);
		} else if (e.getSource().equals(git_dS_4)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_4.get_name()
					+ "<br>MIDI Number: " + dS_4.get_pitch()
					+ "<br>Guitar String: " + dS_4.get_string() + "</html>");
			playSound(dS_4);
		} else if (e.getSource().equals(git_dS_5)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_5.get_name()
					+ "<br>MIDI Number: " + dS_5.get_pitch()
					+ "<br>Guitar String: " + dS_5.get_string() + "</html>");
			playSound(dS_5);
		} else if (e.getSource().equals(pia_dS)) {
			clearSelected();
			setBordersOn(pia_dS, git_dS, git_dS_1, git_dS_2, git_dS_3,
					git_dS_4, git_dS_5);
			lblTextDisplay.setText("<html>Note selected: " + dS_0p.get_name()
					+ "<br>MIDI Number: " + dS_0p.get_pitch() + "</html>");
			playSound(dS_0p);
		} else if (e.getSource().equals(git_e)) {
			clearSelected();
			lblTextDisplay.setText("<html>Note selected: " + e_0.get_name()
					+ "<br>MIDI Number: " + e_0.get_pitch()
					+ "<br>Guitar String: " + e_0.get_string() + "</html>");
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			playSound(e_0);
		} else if (e.getSource().equals(git_e_1)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_1.get_name()
					+ "<br>MIDI Number: " + e_1.get_pitch()
					+ "<br>Guitar String: " + e_1.get_string() + "</html>");
			playSound(e_1);
		} else if (e.getSource().equals(git_e_2)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_2.get_name()
					+ "<br>MIDI Number: " + e_2.get_pitch()
					+ "<br>Guitar String: " + e_2.get_string() + "</html>");
			playSound(e_2);
		} else if (e.getSource().equals(git_e_3)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_3.get_name()
					+ "<br>MIDI Number: " + e_3.get_pitch()
					+ "<br>Guitar String: " + e_3.get_string() + "</html>");
			playSound(e_3);
		} else if (e.getSource().equals(git_e_4)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_4.get_name()
					+ "<br>MIDI Number: " + e_4.get_pitch()
					+ "<br>Guitar String: " + e_4.get_string() + "</html>");
			playSound(e_4);
		} else if (e.getSource().equals(git_e_5)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_5.get_name()
					+ "<br>MIDI Number: " + e_5.get_pitch()
					+ "<br>Guitar String: " + e_5.get_string() + "</html>");
			playSound(e_5);
		} else if (e.getSource().equals(git_e_6)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_6.get_name()
					+ "<br>MIDI Number: " + e_6.get_pitch()
					+ "<br>Guitar String: " + e_6.get_string() + "</html>");
			playSound(e_6);
		} else if (e.getSource().equals(git_e_7)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_7.get_name()
					+ "<br>MIDI Number: " + e_7.get_pitch()
					+ "<br>Guitar String: " + e_7.get_string() + "</html>");
			playSound(e_7);
		} else if (e.getSource().equals(pia_e)) {
			clearSelected();
			setBordersOn(pia_e, git_e, git_e_1, git_e_2, git_e_3, git_e_4,
					git_e_5, git_e_6, git_e_7);
			lblTextDisplay.setText("<html>Note selected: " + e_0p.get_name()
					+ "<br>MIDI Number: " + e_0p.get_pitch() + "</html>");
			playSound(e_0p);
		} else if (e.getSource().equals(git_f)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_0.get_name()
					+ "<br>MIDI Number: " + f_0.get_pitch()
					+ "<br>Guitar String: " + f_0.get_string() + "</html>");
			playSound(f_0);
		} else if (e.getSource().equals(git_f_1)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_1.get_name()
					+ "<br>MIDI Number: " + f_1.get_pitch()
					+ "<br>Guitar String: " + f_1.get_string() + "</html>");
			playSound(f_1);
		} else if (e.getSource().equals(git_f_2)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_2.get_name()
					+ "<br>MIDI Number: " + f_2.get_pitch()
					+ "<br>Guitar String: " + f_2.get_string() + "</html>");
			playSound(f_2);
		} else if (e.getSource().equals(git_f_3)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_3.get_name()
					+ "<br>MIDI Number: " + f_3.get_pitch()
					+ "<br>Guitar String: " + f_3.get_string() + "</html>");
			playSound(f_3);
		} else if (e.getSource().equals(git_f_4)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_4.get_name()
					+ "<br>MIDI Number: " + f_4.get_pitch()
					+ "<br>Guitar String: " + f_4.get_string() + "</html>");
			playSound(f_4);
		} else if (e.getSource().equals(git_f_5)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_5.get_name()
					+ "<br>MIDI Number: " + f_5.get_pitch()
					+ "<br>Guitar String: " + f_5.get_string() + "</html>");
			playSound(f_5);
		} else if (e.getSource().equals(pia_f)) {
			clearSelected();
			setBordersOn(pia_f, git_f, git_f_1, git_f_2, git_f_3, git_f_4,
					git_f_5);
			lblTextDisplay.setText("<html>Note selected: " + f_0p.get_name()
					+ "<br>MIDI Number: " + f_0p.get_pitch() + "</html>");
			playSound(f_0p);
		} else if (e.getSource().equals(git_fS)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_0.get_name()
					+ "<br>MIDI Number: " + fS_0.get_pitch()
					+ "<br>Guitar String: " + fS_0.get_string() + "</html>");
			playSound(fS_0);
		} else if (e.getSource().equals(git_fS_1)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_1.get_name()
					+ "<br>MIDI Number: " + fS_1.get_pitch()
					+ "<br>Guitar String: " + fS_1.get_string() + "</html>");
			playSound(fS_1);
		} else if (e.getSource().equals(git_fS_2)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_2.get_name()
					+ "<br>MIDI Number: " + fS_2.get_pitch()
					+ "<br>Guitar String: " + fS_2.get_string() + "</html>");
			playSound(fS_2);
		} else if (e.getSource().equals(git_fS_3)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_3.get_name()
					+ "<br>MIDI Number: " + fS_3.get_pitch()
					+ "<br>Guitar String: " + fS_3.get_string() + "</html>");
			playSound(fS_3);
		} else if (e.getSource().equals(git_fS_4)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_4.get_name()
					+ "<br>MIDI Number: " + fS_4.get_pitch()
					+ "<br>Guitar String: " + fS_4.get_string() + "</html>");
			playSound(fS_4);
		} else if (e.getSource().equals(git_fS_5)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_5.get_name()
					+ "<br>MIDI Number: " + fS_5.get_pitch()
					+ "<br>Guitar String: " + fS_5.get_string() + "</html>");
			playSound(fS_5);
		} else if (e.getSource().equals(pia_fS)) {
			clearSelected();
			setBordersOn(pia_fS, git_fS, git_fS_1, git_fS_2, git_fS_3,
					git_fS_4, git_fS_5);
			lblTextDisplay.setText("<html>Note selected: " + fS_0p.get_name()
					+ "<br>MIDI Number: " + fS_0p.get_pitch() + "</html>");
			playSound(fS_0p);
		} else if (e.getSource().equals(git_g)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_0.get_name()
					+ "<br>MIDI Number: " + g_0.get_pitch()
					+ "<br>Guitar String: " + g_0.get_string() + "</html>");
			playSound(g_0);
		} else if (e.getSource().equals(git_g_1)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_1.get_name()
					+ "<br>MIDI Number: " + g_1.get_pitch()
					+ "<br>Guitar String: " + g_1.get_string() + "</html>");
			playSound(g_1);
		} else if (e.getSource().equals(git_g_2)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_2.get_name()
					+ "<br>MIDI Number: " + g_2.get_pitch()
					+ "<br>Guitar String: " + g_2.get_string() + "</html>");
			playSound(g_2);
		} else if (e.getSource().equals(git_g_3)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_3.get_name()
					+ "<br>MIDI Number: " + g_3.get_pitch()
					+ "<br>Guitar String: " + g_3.get_string() + "</html>");
			playSound(g_3);
		} else if (e.getSource().equals(git_g_4)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_4.get_name()
					+ "<br>MIDI Number: " + g_4.get_pitch()
					+ "<br>Guitar String: " + g_4.get_string() + "</html>");
			playSound(g_4);
		} else if (e.getSource().equals(git_g_5)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_5.get_name()
					+ "<br>MIDI Number: " + g_5.get_pitch()
					+ "<br>Guitar String: " + g_5.get_string() + "</html>");
			playSound(g_5);
		} else if (e.getSource().equals(git_g_6)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_6.get_name()
					+ "<br>MIDI Number: " + g_6.get_pitch()
					+ "<br>Guitar String: " + g_6.get_string() + "</html>");
			playSound(g_6);
		} else if (e.getSource().equals(pia_g)) {
			clearSelected();
			setBordersOn(pia_g, git_g, git_g_1, git_g_2, git_g_3, git_g_4,
					git_g_5, git_g_6);
			lblTextDisplay.setText("<html>Note selected: " + g_0p.get_name()
					+ "<br>MIDI Number: " + g_0p.get_pitch() + "</html>");
			playSound(g_0p);
		} else if (e.getSource().equals(git_gS)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_0.get_name()
					+ "<br>MIDI Number: " + gS_0.get_pitch()
					+ "<br>Guitar String: " + gS_0.get_string() + "</html>");
			playSound(gS_0);
		} else if (e.getSource().equals(git_gS_1)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_1.get_name()
					+ "<br>MIDI Number: " + gS_1.get_pitch()
					+ "<br>Guitar String: " + gS_1.get_string() + "</html>");
			playSound(gS_1);
		} else if (e.getSource().equals(git_gS_2)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_2.get_name()
					+ "<br>MIDI Number: " + gS_2.get_pitch()
					+ "<br>Guitar String: " + gS_2.get_string() + "</html>");
			playSound(gS_2);
		} else if (e.getSource().equals(git_gS_3)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_3.get_name()
					+ "<br>MIDI Number: " + gS_3.get_pitch()
					+ "<br>Guitar String: " + gS_3.get_string() + "</html>");
			playSound(gS_3);
		} else if (e.getSource().equals(git_gS_4)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_4.get_name()
					+ "<br>MIDI Number: " + gS_4.get_pitch()
					+ "<br>Guitar String: " + gS_4.get_string() + "</html>");
			playSound(gS_4);
		} else if (e.getSource().equals(git_gS_5)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_5.get_name()
					+ "<br>MIDI Number: " + gS_5.get_pitch()
					+ "<br>Guitar String: " + gS_5.get_string() + "</html>");
			playSound(gS_5);
		} else if (e.getSource().equals(pia_gS)) {
			clearSelected();
			setBordersOn(pia_gS, git_gS, git_gS_1, git_gS_2, git_gS_3,
					git_gS_4, git_gS_5);
			lblTextDisplay.setText("<html>Note selected: " + gS_0p.get_name()
					+ "<br>MIDI Number: " + gS_0p.get_pitch() + "</html>");
			playSound(gS_0p);
		} else if (e.getSource().equals(git_a)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_0.get_name()
					+ "<br>MIDI Number: " + a_0.get_pitch()
					+ "<br>Guitar String: " + a_0.get_string() + "</html>");
			playSound(a_0);
		} else if (e.getSource().equals(git_a_1)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_1.get_name()
					+ "<br>MIDI Number: " + a_1.get_pitch()
					+ "<br>Guitar String: " + a_1.get_string() + "</html>");
			playSound(a_1);
		} else if (e.getSource().equals(git_a_2)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_2.get_name()
					+ "<br>MIDI Number: " + a_2.get_pitch()
					+ "<br>Guitar String: " + a_2.get_string() + "</html>");
			playSound(a_2);
		} else if (e.getSource().equals(git_a_3)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_3.get_name()
					+ "<br>MIDI Number: " + a_3.get_pitch()
					+ "<br>Guitar String: " + a_3.get_string() + "</html>");
			playSound(a_3);
		} else if (e.getSource().equals(git_a_4)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_4.get_name()
					+ "<br>MIDI Number: " + a_4.get_pitch()
					+ "<br>Guitar String: " + a_4.get_string() + "</html>");
			playSound(a_4);
		} else if (e.getSource().equals(git_a_5)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_5.get_name()
					+ "<br>MIDI Number: " + a_5.get_pitch()
					+ "<br>Guitar String: " + a_5.get_string() + "</html>");
			playSound(a_5);
		} else if (e.getSource().equals(git_a_6)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_6.get_name()
					+ "<br>MIDI Number: " + a_6.get_pitch()
					+ "<br>Guitar String: " + a_6.get_string() + "</html>");
			playSound(a_6);
		} else if (e.getSource().equals(pia_a)) {
			clearSelected();
			setBordersOn(pia_a, git_a, git_a_1, git_a_2, git_a_3, git_a_4,
					git_a_5, git_a_6);
			lblTextDisplay.setText("<html>Note selected: " + a_0p.get_name()
					+ "<br>MIDI Number: " + a_0p.get_pitch() + "</html>");
			playSound(a_0p);
		} else if (e.getSource().equals(git_aS)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_0.get_name()
					+ "<br>MIDI Number: " + aS_0.get_pitch()
					+ "<br>Guitar String: " + aS_0.get_string() + "</html>");
			playSound(aS_0);
		} else if (e.getSource().equals(git_aS_1)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_1.get_name()
					+ "<br>MIDI Number: " + aS_1.get_pitch()
					+ "<br>Guitar String: " + aS_1.get_string() + "</html>");
			playSound(aS_1);
		} else if (e.getSource().equals(git_aS_2)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_2.get_name()
					+ "<br>MIDI Number: " + aS_2.get_pitch()
					+ "<br>Guitar String: " + aS_2.get_string() + "</html>");
			playSound(aS_2);
		} else if (e.getSource().equals(git_aS_3)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_3.get_name()
					+ "<br>MIDI Number: " + aS_3.get_pitch()
					+ "<br>Guitar String: " + aS_3.get_string() + "</html>");
			playSound(aS_3);
		} else if (e.getSource().equals(git_aS_4)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_4.get_name()
					+ "<br>MIDI Number: " + aS_4.get_pitch()
					+ "<br>Guitar String: " + aS_4.get_string() + "</html>");
			playSound(aS_4);
		} else if (e.getSource().equals(git_aS_5)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_5.get_name()
					+ "<br>MIDI Number: " + aS_5.get_pitch()
					+ "<br>Guitar String: " + aS_5.get_string() + "</html>");
			playSound(aS_5);
		} else if (e.getSource().equals(pia_aS)) {
			clearSelected();
			setBordersOn(pia_aS, git_aS, git_aS_1, git_aS_2, git_aS_3,
					git_aS_4, git_aS_5);
			lblTextDisplay.setText("<html>Note selected: " + aS_0p.get_name()
					+ "<br>MIDI Number: " + aS_0p.get_pitch() + "</html>");
			playSound(aS_0p);
		} else if (e.getSource().equals(git_b)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_0.get_name()
					+ "<br>MIDI Number: " + b_0.get_pitch()
					+ "<br>Guitar String: " + b_0.get_string() + "</html>");
			playSound(b_0);
		} else if (e.getSource().equals(git_b_1)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_1.get_name()
					+ "<br>MIDI Number: " + b_1.get_pitch()
					+ "<br>Guitar String: " + b_1.get_string() + "</html>");
			playSound(b_1);
		} else if (e.getSource().equals(git_b_2)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_2.get_name()
					+ "<br>MIDI Number: " + b_2.get_pitch()
					+ "<br>Guitar String: " + b_2.get_string() + "</html>");
			playSound(b_2);
		} else if (e.getSource().equals(git_b_3)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_3.get_name()
					+ "<br>MIDI Number: " + b_3.get_pitch()
					+ "<br>Guitar String: " + b_3.get_string() + "</html>");
			playSound(b_3);
		} else if (e.getSource().equals(git_b_4)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_4.get_name()
					+ "<br>MIDI Number: " + b_4.get_pitch()
					+ "<br>Guitar String: " + b_4.get_string() + "</html>");
			playSound(b_4);
		} else if (e.getSource().equals(git_b_5)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_5.get_name()
					+ "<br>MIDI Number: " + b_5.get_pitch()
					+ "<br>Guitar String: " + b_5.get_string() + "</html>");
			playSound(b_5);
		} else if (e.getSource().equals(git_b_6)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_6.get_name()
					+ "<br>MIDI Number: " + b_6.get_pitch()
					+ "<br>Guitar String: " + b_6.get_string() + "</html>");
			playSound(b_6);
		} else if (e.getSource().equals(pia_b)) {
			clearSelected();
			setBordersOn(pia_b, git_b, git_b_1, git_b_2, git_b_3, git_b_4,
					git_b_5, git_b_6);
			lblTextDisplay.setText("<html>Note selected: " + b_0p.get_name()
					+ "<br>MIDI Number: " + b_0p.get_pitch() + "</html>");
			playSound(b_0p);
		} else if (e.getSource().equals(btnSoundOn)) {
			SynthThread.enableSound();
			btnSoundOn.setEnabled(false);
			btnSoundOff.setEnabled(true);
		} else if (e.getSource().equals(btnSoundOff)) {
			SynthThread.disableSound();
			btnSoundOn.setEnabled(true);
			btnSoundOff.setEnabled(false);
		} else if (e.getSource().equals(btnClearSelected)) {
			clearSelected();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
	private void clearSelected() {
		// Sets all JLabel border values back to null
		pia_c.setBorder(null);
		pia_cS.setBorder(null);
		pia_d.setBorder(null);
		pia_dS.setBorder(null);
		pia_e.setBorder(null);
		pia_f.setBorder(null);
		pia_fS.setBorder(null);
		pia_g.setBorder(null);
		pia_gS.setBorder(null);
		pia_a.setBorder(null);
		pia_aS.setBorder(null);
		pia_b.setBorder(null);

		git_e_7.setBorder(null);
		git_e_6.setBorder(null);
		git_e_5.setBorder(null);
		git_e_4.setBorder(null);
		git_e_3.setBorder(null);
		git_e_2.setBorder(null);
		git_e_1.setBorder(null);
		git_e.setBorder(null);

		git_f_5.setBorder(null);
		git_f_4.setBorder(null);
		git_f_3.setBorder(null);
		git_f_2.setBorder(null);
		git_f_1.setBorder(null);
		git_f.setBorder(null);

		git_fS_5.setBorder(null);
		git_fS_4.setBorder(null);
		git_fS_3.setBorder(null);
		git_fS_2.setBorder(null);
		git_fS_1.setBorder(null);
		git_fS.setBorder(null);

		git_g_6.setBorder(null);
		git_g_5.setBorder(null);
		git_g_4.setBorder(null);
		git_g_3.setBorder(null);
		git_g_2.setBorder(null);
		git_g_1.setBorder(null);
		git_g.setBorder(null);

		git_gS_5.setBorder(null);
		git_gS_4.setBorder(null);
		git_gS_3.setBorder(null);
		git_gS_2.setBorder(null);
		git_gS_1.setBorder(null);
		git_gS.setBorder(null);

		git_a_6.setBorder(null);
		git_a_5.setBorder(null);
		git_a_4.setBorder(null);
		git_a_3.setBorder(null);
		git_a_2.setBorder(null);
		git_a_1.setBorder(null);
		git_a.setBorder(null);

		git_aS_5.setBorder(null);
		git_aS_4.setBorder(null);
		git_aS_3.setBorder(null);
		git_aS_2.setBorder(null);
		git_aS_1.setBorder(null);
		git_aS.setBorder(null);

		git_b_6.setBorder(null);
		git_b_5.setBorder(null);
		git_b_4.setBorder(null);
		git_b_3.setBorder(null);
		git_b_2.setBorder(null);
		git_b_1.setBorder(null);
		git_b.setBorder(null);

		git_c_5.setBorder(null);
		git_c_4.setBorder(null);
		git_c_3.setBorder(null);
		git_c_2.setBorder(null);
		git_c_1.setBorder(null);
		git_c.setBorder(null);

		git_cS_5.setBorder(null);
		git_cS_4.setBorder(null);
		git_cS_3.setBorder(null);
		git_cS_2.setBorder(null);
		git_cS_1.setBorder(null);
		git_cS.setBorder(null);

		git_d_6.setBorder(null);
		git_d_5.setBorder(null);
		git_d_4.setBorder(null);
		git_d_3.setBorder(null);
		git_d_2.setBorder(null);
		git_d_1.setBorder(null);
		git_d.setBorder(null);

		git_dS_5.setBorder(null);
		git_dS_4.setBorder(null);
		git_dS_3.setBorder(null);
		git_dS_2.setBorder(null);
		git_dS_1.setBorder(null);
		git_dS.setBorder(null);
	}
}