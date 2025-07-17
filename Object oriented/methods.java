
class computer{

    public void musicplayer(){
        System.out.println("Playing Music");
    }

    public String getpen(int cost){
        if(cost >=10)
            return ("pen");
            
        // else
        //     return ("Nothing");
        return ("Nothing");      //we can also write like this
    }
}



public class methods {
    public static void main(String[] args) {
        
        computer comp = new computer();
        comp.musicplayer();

        String pen = comp.getpen(5);
        System.out.println("You got a " + pen);
    }
}
