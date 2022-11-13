package lab.designpatterns.answer4;

import lab.designpatterns.answer4.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer{

	@Override
	public void playVLC() {
		System.out.println("Playing VLC file through VLC player");
	}

	@Override
	public void playMp4() {
		System.out.println("Playing MP4 file through VLC player");
	}

}
