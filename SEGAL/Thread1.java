/**
 * Class Thread1 extends Thread
 * Thread1 handles the sounds do mi sol si and do-octave
 * 
 * @author George Ghoryafi
 * @version 1.0
 */

class Thread1 extends Thread {

    FilePlayer fp = new FilePlayer();
    String[] data = { "Sounds\\do.wav", "Sounds\\mi.wav", "Sounds\\sol.wav", "Sounds\\si.wav"};


    /**
     * run method
     * 
     * @param none
     * @return none
     * 
     * loops through the file names stored in data and plays them
     * places a 600 millisecond delay between each sound
     * plays the sound do-octave.wav at the end
     */
    public void run() {
        for (int i = 0; i < data.length; i++) {
            fp.play(data[i]);
            System.out.println(data[i]);
            try {
                Thread.sleep(600);
            } catch (Exception e) {
            }
        }

        fp.play("Sounds\\do-octave.wav");
        System.out.println("do-octave.wav");
    }
}


