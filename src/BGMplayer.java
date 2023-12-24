import javax.sound.sampled.*;
import java.io.File;
public class BGMplayer implements Runnable {
    private final String musicLoc;

    public BGMplayer(String musicLoc){
        this.musicLoc = musicLoc;
    }

    @Override
    public void run() {
        try{
            File musicPath = new File(musicLoc);
            if(musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                while (clip.isRunning()){
                    Thread.sleep(1000);
                }
            }else{
                System.out.println("음악 파일을 찾을 수 없습니다.");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
