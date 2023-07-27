public class WordList {
    String[] words;
    int count;
    public WordList() {
        words = new String[2];
        count = 0;

    }
    public int addWord(String x){
        if (findWord(x) != -1){
            return count;
        }
        if (count == words.length){
            String[] newWords = new String[words.length*2];
            for (int j=0; j<words.length; j++){
                newWords[j] = words[j];
            }
            words = newWords;
        }
        
        words[count] = x;
        return count++;

    }
    public void removeWord(String y){
        if (findWord(y) == -1){
            return;
        }
        else{
            int a = findWord(y);
            for (int k = a; k<count-1; k++){
                words[k] = words [k+1]; 
            }
            count--;
            words[count] = null;
            return;
        } 

    }
    public int findWord(String z){
        for(int i = 0; i < count; i++){
            if (z.equals(words[i])){
                return i;
            }
        }
        return -1;

    }

    public boolean equals(WordList other){
        if(count != other.count){
            return false;
        }
        for(int c = 0; c<count; c++){
            if(!words[c].equals(other.words[c])){
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String output = "There are " + count + " words in the word list:\n";
        for (int i = 0; i < count; i++) {
            output += words[i] + "\n";
        }
        return output;
    }
    public static void main(String[] args){
        WordList w1 = new WordList();
        w1.addWord("computer");
        w1.addWord("abacus");
        w1.addWord("computer");
        w1.removeWord("computer");
        System.out.println(w1);
        WordList w2 = new WordList();
        w1.equals(w2);
        w2.addWord("abacus");
        w1.equals(w2);

    }
}
