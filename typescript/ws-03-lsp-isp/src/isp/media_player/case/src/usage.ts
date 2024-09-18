interface MediaPlayer {
    playAudio(): void;
    recordAudio(): void;
}

class AudioPlayer implements MediaPlayer {
    playAudio() {
        console.log('AudioPlayer # playAudio')
    }
    recordAudio() {
        console.log('AudioPlayer # recordAudio')
    }
}

class VideoPlayer implements MediaPlayer {
    playAudio() {
        console.log('VideoPlayer # playAudio')
    }
    recordAudio() {
        // WE ARE FORCE TO IMPL THIS METHOD!!!
        console.log('VideoPlayer # CANNOT!!! recordAudio')
    }
}
