interface AudioPlayer {
    playAudio(): void
    recordAudio(): void
}

interface VideoPlayer {
    playVideo(): void
}

class AudioPlayer implements AudioPlayer {
    playAudio() {
        console.log('AudioPlayer # playAudio')
    }
    recordAudio() {
        console.log('AudioPlayer # recordAudio')
    }
}

class VideoPlayer implements VideoPlayer {
    playVideo() {
        console.log('VideoPlayer # playVideo')
    }
}
