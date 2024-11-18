console.log("works")

import {MediaLibrary, MediaPlayer} from './app'

let library = new MediaLibrary()

let player1 = new MediaPlayer()
library.attach(player1)

let player2 = new MediaPlayer()
library.attach(player2)

let player3 = new MediaPlayer()
library.attach(player3)

library.addMedia("video.mp4")
library.addMedia("audio.mp3")

library.detach(player3)
