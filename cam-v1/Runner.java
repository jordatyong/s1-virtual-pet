import javax.swing.*;

public class Runner{
    }    
    public Runner(){
        VirtualPet v = new VirtualPet();
        // v.feed();
        // takeABeat(1000);
        // v.exercise();
        takeABeat(1500);
        String q = "How are you?";
        String ans = getAnswer(q);
        v.saySomething(q);
        if(ans.equalsIgnoreCase("Good")){
            v.setMood("happy");
            v.saySomething("Good!");
        }
        else if (ans.equalsIgnoreCase("Not good")||ans.equalsIgnoreCase("Bad")){
            v.setMood("sad");
            v.saySomething("That's too bad.");
        }
        takeABeat(3000);
        q = "Do you want to exercise?";
        ans = getAnswer(q);
        v.saySomething(q);
        if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("Okay")){
            v.setMood("happy");
            v.saySomething("Sweet! We can do some jumping jacks.");
            takeABeat(10000);
            v.exercise();
        }
        else if(ans.equalsIgnoreCase("no")){
            v.setMood("depressed");
            v.saySomething("That sucks.");
        }
        takeABeat(3000);
        q = "Do you want to eat something?";
        ans = getAnswer(q);
        v.saySomething(q);
        if(ans.equalsIgnoreCase("yes")){
            v.setMood("happy");
            v.saySomething("Sweet! I'm hungry.");
            takeABeat(1000);
            v.feed();
        }
        else if(ans.equalsIgnoreCase("No")){
            v.setMood("hungry");
            v.saySomething("Okay... I'm really hungry.");
            takeABeat(4000);
            v.death();
            takeABeat(10000);
            v.decompose();
        }

    }
    
    public String getAnswer(String q){
        String s = (String)JOptionPane.showInputDialog(
                    new JFrame(),
                    q,
                    "Get a response",
                    JOptionPane.PLAIN_MESSAGE
                    );
                    return s;
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