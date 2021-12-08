package state;

public class PausedState implements State {

  public void pause(MediaPlayer player) {

  }

  public void play(MediaPlayer player) {
    player.setState(new PlayingState());
    player.setIcon("pause button");
    System.out.println("Video playing, icon set to " + player.getIcon());
  }
}
