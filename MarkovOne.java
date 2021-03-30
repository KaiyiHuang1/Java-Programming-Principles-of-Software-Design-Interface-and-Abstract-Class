
/**
 * Write a description of MarkovOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Random;
import java.util.*;

public class MarkovOne {
    private String myText;
    private Random myRandom;
    
    public MarkovOne() {
        myRandom = new Random();
    }
    
    public void setRandom(int seed){
        myRandom = new Random(seed);
    }
    
    public void setTraining(String s){
        myText = s.trim();
    }
    
    public String getRandomText(int numChars){
        StringBuffer sb = new StringBuffer();
        int index = myRandom.nextInt(myText.length() - 1);
        String key = myText.substring(index, index +1);
        sb.append(key);
        
        for(int k=0; k < numChars - 1; k++){
           ArrayList<String> follows = getFllows(key);
           if(follows.size() == 0){
               break;
            }
            index = myRandom.nextInt(follows.size());
            String next = follows.get(index);
            sb.append(next);
            key = next;
        }
        
        return sb.toString();
    }
    
    public ArrayList<String> getFllows(String key){
        ArrayList<String> result = new ArrayList<String>();
        int pos = 0;
        int index = 0;
        while(pos < myText.length()){
            index = myText.indexOf(key,pos);
            //System.out.println(index);
            if(index < 0){
                break;
            }
            if(key.length() >= myText.length() - index){
                break;
            }
            result.add(myText.substring(index+key.length(),index+key.length()+1));
            pos = index + key.length();
           }
           return result;
       }

}
