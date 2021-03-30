
/**
 * Write a description of Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;
import java.util.*;
public class Tester {
    public void testGetFollows(){
        //FileResource fr = new FileResource();
	//String st = fr.asString();
	//st = st.replace('\n', ' ');
	String st = "this is a test yes this is a test.";
	MarkovOne markov = new MarkovOne();
	markov.setTraining(st);
	ArrayList<String> Follows = new ArrayList<String>();
	Follows = markov.getFllows("e");
	System.out.println(Follows);
    }
    
    public void testGetFollowsWithFile(){
        FileResource fr = new FileResource();
	String st = fr.asString();
	//st = st.replace('\n', ' ');
	//String st = "this is a test yes this is a test.";
	MarkovOne markov = new MarkovOne();
	markov.setTraining(st);
	ArrayList<String> Follows = new ArrayList<String>();
	Follows = markov.getFllows("th");
	System.out.println(Follows.size());
    }

}
