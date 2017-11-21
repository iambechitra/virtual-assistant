/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assistant;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author bechitra
 */
public class Main {

    private static LiveSpeechRecognizer recognizer;
    private static  Configuration configuration;
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException, InterruptedException {
        MainWindow mainwindow = new MainWindow();
        //TextToSpeech tts = new TextToSpeech();
        mainwindow.show();
        configuration = new Configuration();
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        configuration.setDictionaryPath("file:\\C:\\Users\\bechitra\\Documents\\NetBeansProjects\\Assistant\\src\\DictionaryPath\\1671.dic");
        configuration.setLanguageModelPath("file:\\C:\\Users\\bechitra\\Documents\\NetBeansProjects\\Assistant\\src\\LanguagePath\\1671.lm");
        recognizer = new LiveSpeechRecognizer(configuration);
        recognizer.startRecognition(true);
        
        System.out.println("listening...");
        SpeechResult sr;
        boolean flag = false;
        while( (sr= recognizer.getResult()) != null) {
            String data = sr.getHypothesis();
            System.out.println(data);
            if(data.toLowerCase().contains("up") || data.toLowerCase().contains("wake"))
                flag = true;
            if(data.toLowerCase().contains("sleep"))
                flag = false;
            if(flag) {
                mainwindow.isRecognitionStart("ON");
                mainwindow.setStatusMode("Voice");
                mainwindow.DataProcessor(data);
                System.out.println("I am called!");
            }
            
            if(!flag) {
                mainwindow.isRecognitionStart("OFF");
                mainwindow.setStatusMode("Manual");
            }
        }
    }
    
}
