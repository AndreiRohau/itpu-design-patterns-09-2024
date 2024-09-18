interface Player {
    play(): void
}

interface AudioPlayer extends Player {
    playAudio(): void
    recordAudio(): void
}

interface VideoPlayer extends Player {
    playVideo(): void
}

class AudioPlayer implements AudioPlayer {
    playAudio() {
        console.log('AudioPlayer # playAudio')
    }
    recordAudio() {
        console.log('AudioPlayer # recordAudio')
    }
    play() {
        playAudio()
    }
}

class VideoPlayer implements VideoPlayer {
    playVideo() {
        console.log('VideoPlayer # playVideo')
    }
    play() {
        playVideo()
    }
}
