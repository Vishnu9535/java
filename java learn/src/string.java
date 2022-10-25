public class string {
    public static void main(String[] args){
        String str_Sample = "RockStar";
System.out.println("Character at position 5: " + str_Sample.charAt(5));
//Index of a given character
System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
System.out.println("Compare To 'ROCKSTAR': " + str_Sample.compareTo("rockstar"));
  //Compare to - Ignore case
  System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + str_Sample.compareToIgnoreCase("ROCKSTAR"));
    System.out.println("Contains sequence 'tar': " + str_Sample.contains("tar"));
    System.out.println("Convert to LowerCase: " + str_Sample.toLowerCase());
    //Convert to UpperCase
    System.out.println("Convert to UpperCase: " + str_Sample.toUpperCase());
  }
}
