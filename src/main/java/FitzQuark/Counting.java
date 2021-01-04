package FitzQuark;

public class Counting {
    private int actualNumber=1;

    public void callNumber(){
        System.out.println(actualNumber);
    }

    public void callFitz(){
        System.out.println("Fitz");
    }

    public void callQuark(){
        System.out.println("Quark");
    }

    public void countUp(){
        actualNumber++;
    }

    public void checkFitzQuark(){
        if(actualNumber%5==0 && actualNumber%7==0){
            System.out.println("FitzQuark");
        }
        else if(actualNumber%5==0){
            this.callFitz();
        }
        else if(actualNumber%7==0){
            this.callQuark();
        }
        else{
            this.callNumber();
        }
    }
}
