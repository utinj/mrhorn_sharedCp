package simpleFourInARow;

import info.gridworld.gui.WorldFrame;

import javax.swing.JApplet;
import javax.swing.JFrame;

public class Main extends JApplet
{
    private static final long serialVersionUID = -1524028465898073836L;

    public void init()
    {
        FourInARow game = new FourInARow();
        JFrame frame = new WorldFrame<Disc>(game);
		setSize(500, 450);
		setContentPane(frame.getContentPane());
		setJMenuBar(frame.getJMenuBar());
    }
}
