interface MediaPlayer {
  playAudio(): void;
  recordAudio(): void;
}

class AudioPlayer implements MediaPlayer {
  playAudio() {
    // Implementation for playing audio
  }

  recordAudio() {
    // Implementation for recording audio
  }
}

class VideoPlayer implements MediaPlayer {
  playAudio() {
    // Implementation for playing audio of the video
  }

  recordAudio() {
    // This method is irrelevant for video playback
  }
}