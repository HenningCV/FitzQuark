package FitzQuark;

public class FitzQuarkMain {

    public static void main(String[] args) {
        Counting counting=new Counting();

        for(int i=0;i<100;i++){
            counting.checkFitzQuark();
            counting.countUp();
        }
    }

}
