interface AudioPlayer {
  playAudio(): void;
  recordAudio(): void;
}

interface VideoPlayer {
  playVideo(): void;
}

class AudioPlayer implements AudioPlayer {
  playAudio() {
    // Implementation for playing audio
  }

  recordAudio() {
    // Implementation for recording audio
  }
}

class VideoPlayer implements VideoPlayer {
  playVideo() {
    // Implementation for playing video
  }
}
