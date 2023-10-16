import javax.swing.*;

public class Runner{
    VirtualPet v = new VirtualPet();
        public Runner(){
        
        //  possible moods: angel, angry, annoyed, asleep, astonished, cry, dead, depressed, ecstatic, enraged, exercising, happy, hungry,
        //  joyful, love, normal, pushing daisies, sad, shocked, sick, skeleton, starving, surprised, tired, verysad, verysick

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
        q = "Let's go to the gym, buddy?";
        ans = getAnswer(q);
        v.saySomething(q);
        if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("Okay")){
            v.setMood("happy");
            v.saySomething("Sweet! We can do some jumping jacks.");
            takeABeat(10000);
            v.exercise();
            takeABeat(5000);
            v.saySomething("I can go for some running, too!");
            v.running();
            takeABeat(3000);
            v.exercise();
        }
        else if(ans.equalsIgnoreCase("no")){
            v.setMood("verysad");
            v.saySomething("That sucks.");
        }
        takeABeat(3000);
        q = "Do you want to eat something?";
        ans = getAnswer(q);
        v.saySomething(q);
        if(ans.equalsIgnoreCase("yes")){
            v.setMood("happy");
            v.saySomething("Sweet! I'm hungry.");
            takeABeat(10000);
            v.feed();
        }
        else if(ans.equalsIgnoreCase("No")){
            v.setMood("hungry");
            v.saySomething("Okay... I'm really hungry.");
        }
        takeABeat(5000);
        v.saySomething("I'm getting tired. I'm going to go to sleep.");
        v.sleep();
        takeABeat(10000);
        if (v.getHunger() >= 10){
            v.death();
            v.saySomething("I died from hunger!");
        } 
        else{
            v.setMood("normal");
            v.saySomething("Good morning.");

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