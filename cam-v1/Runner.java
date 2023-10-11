import javax.swing.*;

public class Runner{
    public Runner(){
        VirtualPet v = new VirtualPet();
        v.feed();
        takeABeat(1000);
        v.exercise();
        String ans = getAnswer("How are you?");
        if(ans.equalsIgnoreCase("Good")){

        }
    }
    
    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a response",
                    JOptionPane.PLAIN_MESSAGE
        );
        if (s.equals("Yes")){
            return "Yes";        
        }
    }
    public void takeABeat(int milliseconds){
        try {
            Thread.sleep(1000); //milliseconds
        } catch(Exception e){

        }
    }

    public static void main(String[] args) {
        new Runner();
    }
}