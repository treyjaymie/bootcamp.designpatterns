package lab.designpatterns.answer4;

public class AdapterPatternDemo {
	public static void main(String[] args) {
		MediaAdapter mediaAdapter = new MediaAdapter();
		mediaAdapter.setAdvancedMediaPlayer(new VLCPlayer());
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.setMediaAdapter(mediaAdapter);
		
		audioPlayer.play(MediaType.MP3);
		audioPlayer.play(MediaType.MP4);
		audioPlayer.play(MediaType.VLC);
		
		mediaAdapter.setAdvancedMediaPlayer(new MP4Player());
		audioPlayer.play(MediaType.MP3);
		audioPlayer.play(MediaType.MP4);
		audioPlayer.play(MediaType.VLC);
	}
}
