import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner SC = new Scanner(System.in);
     Scanner Sc = new Scanner(System.in);
     Scanner sc = new Scanner(System.in);
    int height = SC.nextInt();
    while(height<=188 && height >=122){
      System.out.println("Do you have back trouble?");
      String bckcheck = sc.nextLine();
      String string1 = "YES";
      boolean a = bckcheck.equalsIgnoreCase(string1);
      if(a){
        System.out.println("Forget it.");
            break;
          } else{
             System.out.println("Then do you have heart trouble?");
             String hrtcheck = Sc.nextLine();
          if(hrtcheck.equalsIgnoreCase(string1)){
             System.out.println("Nah go home.");
          break;
          }
        else {
          System.out.println("You are good. Now get ready for despair.");
        }
    };
    SC.close();
    Sc.close();
    sc.close();
    break;
  }
 }
} 