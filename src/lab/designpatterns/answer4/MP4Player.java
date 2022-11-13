package lab.designpatterns.answer4;

import lab.designpatterns.answer4.interfaces.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

	@Override
	public void playVLC() {
		System.out.println("Playing VLC file through MP4 player");
	}

	@Override
	public void playMp4() {
		System.out.println("Playing MP4 file through MP4 player");
	}
}
