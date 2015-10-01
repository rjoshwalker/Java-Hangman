/**
 * Created by User on 3/4/2015.
 */
public class WordList {

    private static String[] wordList = {//Contains the possible words for the puzzle.
    	"parrot",
    	"daisy",
    	"pebble",
    	"random",
    	"guitar",
    	"spring",
    	"pudding",
    	"parade",
    	"camel",
    	"socks",
    	"cake",
    	"muffin",
    	"picnic",
    	"dragon",
    	"waterfall",
    	"train",
    	"pirate",
    	"roses",
    	"chime",
    	"forest",
    	"energy",
    	"zebra",
    	"cherry",
    	"mittens",
    	"storm",
    	"bacon",
    	"music",
    	"letters",
    	"birthday",
    	"pilot",
    	"empire",
    	"ticket",
    	"whistle",
    	"jacket",
    	"desert",
    	"dinosaur",
    	"volume",
    	"waves",
    	"queen",
    	"toast",
    	"beach",
    	"mountain",
    	"monster",
    	"potato",
    	"banana",
    	"cabin"
    };


    public static int numberOfWords()//Returns the total number of words in the array.
    {
        return wordList.length;
    }

    public static String getWordAtIndex(int number)//Returns the word at the selected index position.
    {
        String word;

        word = wordList[number];

        return word;
    }
}
