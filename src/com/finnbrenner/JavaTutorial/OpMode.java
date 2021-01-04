package com.finnbrenner.JavaTutorial;

public abstract class OpMode {
    boolean hasStarted = false;
    boolean hasStopped = false;


    public abstract void init();
    public abstract void initloop();
    public abstract void start();
    public abstract void loop();
    public abstract void stop();

    public void run() {
        init();
        while (!hasStarted) {
            initloop();
        }
        start();
        while (!hasStopped) {
            loop();
        }
    stop();
    }
}
