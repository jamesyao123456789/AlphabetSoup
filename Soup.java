//Name: James Yao
//Date: 09/29/26
//This program creates an AlphabetSoup object that stores letters, allows words to be added or removed, randomly selects letters, and inserts a company name into the center of the letters.
public class Soup {
   //these are instance variables
   private String letters;
   private String company;


   //this is a constructor it sets the instance variables (more on this later in the year)
   public Soup(){
       letters ="";
       company = "none";
   }




   //sets the name of the company to the provided name
   public void setCompany(String company){
       this.company = company;
   }


   //returns the company name
   public String getCompany(){
       return company;
   }


   //returns letters
   public String getLetters(){
       return letters;
   }


//below are the functions you'll be writing.


   //adds a word to the pool of letters known as "letters"
   //Input: A String word and the command "add"
   //Output: Letters value is changed and strings can be added to the value without replacing it
   public void add(String word){
       letters += word;


   }




   //Use Math.random() to get a random character from the letters string and return it.
   //Input: The command "randomLetter"
   //Output: A randomly selected char from letters.
   public char randomLetter(){
       int numRandom = (int)(Math.random()*letters.length());
       char randomC = letters.charAt(numRandom);
       return randomC;
   }




   //returns the letters currently stored with the company name placed directly in the center of all
   //the letters
   //Input: The command "centered"
   //Output: A String containing letters with the company name in the middle of it
   public String companyCentered(){
       int middle = letters.length() / 2;
       String left = letters.substring(0,middle);
       String right = letters.substring(middle);
       return left + company + right;
   }




   //should remove the first available vowel from letters. If there are no vowels this method has no effect.
   //Input: The command "removeVowel"
   //Output: It outputs the letters with the first occuring vowel removed, if there is no vowel, nothing is changed
   public void removeFirstVowel(){
      
           letters = letters.replaceFirst("[aeiouAEIOU]", "");
       }


   //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
   //Input: An int num representing how many characters to remove, the command "removeSome" then the num
   //Output: The letters will be outputted with the num amount of characters removed from it, it is random in which letters are removed, nothing is done if there is no more value for letters
   public void removeSome(int num){
       int index = (int)(Math.random()* (letters.length()-num + 1));
       letters = letters.substring(0,index) + letters.substring(index + num);
   }


   //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
   //Input: A string word
   //Output: If the word is found in letters, it removes it
   public void removeWord(String word){
        letters = letters.replace(word, "");
        }

}


