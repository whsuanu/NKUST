public class prime {
    public static void main(String[] args) {
        int r, i ;
        for(r = 2; r <= 100; r++){
            for(i = 2; i<= r/2; i++) {
                if(r % i == 0 )
                    break;
    }
            if (i > r / 2){
                System.out.println(i);
            }
        }
    }



}
