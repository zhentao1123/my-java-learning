package com.sample.pattern;

import org.junit.Test;

import com.sample.pattern.adapter.AudioPlayer;

public class AdapterPatteryTest {

	@Test
	public void test() {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}
}
