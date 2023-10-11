/* Virtual Pet, version 1
 * 
 * @author Cam
 * @author ?
 */
public class VirtualPet {
    
    VirtualPetFace face;
    int hunger = 0;   // how hungry the pet is.
    
    // constructor
    public VirtualPet() {
        face = new VirtualPetFace();
        face.setImage("normal");
        face.setMessage("Hello.");
    }
    
    public void feed() {
        if (hunger > 10) {
            hunger = hunger - 10;
        } else {
            hunger = 0;
        }
        face.setMessage("Yum, thanks");
        face.setImage("normal");
    }
    
    public void exercise() {
        hunger = hunger + 3;
        face.setMessage("1, 2, 3, jump.  Whew.");
        face.setImage("tired");
    }
    
    public void sleep() {
        hunger = hunger + 1;
        face.setImage("asleep");
    }

    public void setMood(String mood) {
        //  possible moods: angel, angry, annoyed, asleep, astonished, cry, dead, depressed, ecstatic, enraged, exercising, happy, hungry,
        //  joyful, love, normal, pushing daisies, sad, shocked, sick, skeleton, starving, surprised, tired, verysad, verysick
        face.setImage(mood);
    }
    public void saySomething(String in){
        face.setMessage(in);
    }

    public void death(){
        if(hunger>=10){
            face.setImage("dead");
        }
    }
    public void decompose(){
        face.setImage("skeleton");
    }

} // end Virtual Pet
