
class Computer{

    public void playMusic(){
        System.out.println("Music starts playing: ");

    }
    public String getmepen(int cost){
        if (cost >=10){
            return "pen rcd";
        }
        return "Try again";
    }
//    public is for access and void means it doesn't return anyting but performs some action

}
public class class_object2
{
    public static void main(String[] args) {
        Computer comp = new Computer();
        comp.playMusic();
        String res = comp.getmepen(0);
        System.out.println(res);

    }

}
