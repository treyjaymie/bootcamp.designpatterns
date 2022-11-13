package lab.designpatterns.answer4;

import lab.designpatterns.answer4.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

	private MediaAdapter mediaAdapter;
	
	/*
	 AudioPlayer uses the adapter class MediaAdapter passing it the desired
	 audio type without knowing the actual class which can play the desired
	 format. AdapterPatternDemo, our demo class will use AudioPlayer class
	 to play various formats.
	 */
	@Override
	public void play() {
		mediaAdapter.play();
	}
	
	
	public void play(MediaType type) {
		mediaAdapter.play(type);
	}
	
	public void setMediaAdapter(MediaAdapter mediaAdapter) {
		this.mediaAdapter = mediaAdapter;
	}
}
