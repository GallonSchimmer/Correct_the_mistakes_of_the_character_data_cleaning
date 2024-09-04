public class Correct {
  public static String correct(String string) {
    
    StringBuilder newString = new StringBuilder();
    
    final char falseS = '5';
    final char falseO = '0';
    final char falseI = '1';
    
    final char correctS = 'S';
    final char correctO = 'O';
    final char correctI = 'I';
    
    System.out.println("print string: " + string);
    
    for(int i = 0; i < string.length(); i++){
      char letter = string.charAt(i);
        
        if(letter == falseS){ // if statements or switch case
          letter = correctS;
        } 
        if (letter == falseO){
          letter = correctO;
        }
        if (letter == falseI){
          letter = correctI;
        }
      
      
      newString.append(letter);
    
      } // end forloop
    
     
     System.out.println("print newString: " + newString.toString());
     return newString.toString();
    
    } //end static method
  
  } //end class Correct