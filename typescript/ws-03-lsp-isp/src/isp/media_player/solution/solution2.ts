interface AudioPlayable {
  playAudio(): void;
}

interface AudioRecordable {
  recordAudio(): void;
}

interface VideoPlayable {
  playVideo(): void;
}

class AudioPlayer implements AudioPlayable, AudioRecordable {
  playAudio() {
    // Implementation for playing audio
  }

  recordAudio() {
    // Implementation for recording audio
  }
}

class VideoPlayer implements AudioPlayable, VideoPlayable {
  playAudio() {
    // Implementation for playing audio of the video
  }

  playVideo() {
    // Implementation for playing video
  }
}