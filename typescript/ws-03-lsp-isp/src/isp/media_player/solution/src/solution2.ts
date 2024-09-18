interface AudioPlayable {
    playAudio(): void
}

interface AudioRecordable {
    recordAudio(): void
}

interface VideoPlayable {
    playVideo(): void
}

class AudioPlayer implements AudioPlayable, AudioRecordable {
    playAudio() {
        console.log('AudioPlayer # playAudio')
    }
    recordAudio() {
        console.log('AudioPlayer # recordAudio')
    }
}

class VideoPlayer implements AudioPlayable, VideoPlayable {
    playAudio() {
        console.log('VideoPlayer # playAudio')
    }
    playVideo() {
        console.log('VideoPlayer # playVideo')
    }
}