package lab.designpatterns.answer4;

import lab.designpatterns.answer4.interfaces.AdvancedMediaPlayer;
import lab.designpatterns.answer4.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter() {
		
	}
	
	public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}
	
	@Override
	public void play() {
		System.out.println("Playing MP3 file through Audio player");
	}

	public void play(MediaType type) {
		switch (type) {
		case MP3:
			System.out.println("Playing MP3 file through audio player");
			break;
		case MP4:
			advancedMediaPlayer.playMp4();
			break;
		case VLC:
			advancedMediaPlayer.playVLC();
			break;
		default:
			System.out.println("Cannot play media file");
		}
	}

	public AdvancedMediaPlayer getAdvancedMediaPlayer() {
		return advancedMediaPlayer;
	}

	public void setAdvancedMediaPlayer(AdvancedMediaPlayer advancedMediaPlayer) {
		this.advancedMediaPlayer = advancedMediaPlayer;
	}

	
}
