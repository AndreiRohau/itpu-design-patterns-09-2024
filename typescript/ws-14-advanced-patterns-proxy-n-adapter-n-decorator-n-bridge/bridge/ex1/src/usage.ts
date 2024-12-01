console.log("works")  

// Define common interfaces for different device actions
interface Output {
    click(): void;
    move(): void;
    drag(): void;
    zoom(): void;
}

// Input Devices
class Gestures {
    private output: Output;

    constructor(output: Output) {
        this.output = output;
    }

    tap(): void {
        this.output.click();
    }

    swipe(): void {
        this.output.move();
    }

    pan(): void {
        this.output.drag();
    }

    pinch(): void {
        this.output.zoom();
    }
}

class Mouse {
    private output: Output;

    constructor(output: Output) {
        this.output = output;
    }

    click(): void {
        this.output.click();
    }

    move(): void {
        this.output.move();
    }

    down(): void {
        this.output.drag();
    }

    wheel(): void {
        this.output.zoom();
    }
}

// Output Devices
class ScreenV2 implements Output {
    click(): void {
        console.log("ScreenV2 select");
    }

    move(): void {
        console.log("ScreenV2 move");
    }

    drag(): void {
        console.log("ScreenV2 drag");
    }

    zoom(): void {
        console.log("ScreenV2 zoom in");
    }
}

class AudioV2 implements Output {
    click(): void {
        console.log("Sound oink");
    }

    move(): void {
        console.log("Sound waves");
    }

    drag(): void {
        console.log("Sound screetch");
    }

    zoom(): void {
        console.log("Sound volume up");
    }
}

// Function to run interactions
function run(): void {
    const screenV2 = new ScreenV2();
    const audioV2 = new AudioV2();

    const hand = new Gestures(screenV2);
    const mouse = new Mouse(audioV2);

    hand.tap();
    hand.swipe();
    hand.pinch();

    mouse.click();
    mouse.move();
    mouse.wheel();
}

run();