public class Coin{

    private String face=" ";

    public Coin (){

    }
    public String getFace(){
        return face;
    }
    public void setFace(String faces){
        face=faces;
    }
    public void flip(){
        int result = (int)(Math.random()* 2);
        if (result==0){
            face="Heads";
        }
        else {face= "Tails";
    }

    }
    public String toString(){
        return getFace();

    }



}

