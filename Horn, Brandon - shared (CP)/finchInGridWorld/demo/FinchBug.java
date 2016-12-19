package demo;

import java.awt.Color;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import info.gridworld.actor.Bug;

public class FinchBug extends Bug
{
    private Finch finch;
    
    public FinchBug()
    {
        finch = new Finch();
    }
    
    public void act()
    {
        finch.setLED(new Color(
                (int) (Math.random() * 256),
                (int) (Math.random() * 256),
                (int) (Math.random() * 256)));
    }
}