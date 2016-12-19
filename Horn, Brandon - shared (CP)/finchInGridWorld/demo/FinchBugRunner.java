package demo;

import info.gridworld.actor.ActorWorld;

public class FinchBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        world.add(new FinchBug());
        world.show();
    }
}
