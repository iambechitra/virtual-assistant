package Assistant;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;


public class TextToSpeech {
    public static final String VOICENAME = "kevin";
    
    public static void generateVoice(String text) {
        
        VoiceManager vm = VoiceManager.getInstance();
        Voice voice = vm.getVoice(VOICENAME);
        voice.allocate();
        
        voice.speak(text);
    }
}
