public class AdditionalTask {
    public static void main(String[] args) {
        int n = 58;
        long resolut = calculateFactoria(n);
        System.out.println(resolut);
    }

    public static long calculateFactoria(int n){

        if(n == 0|| n== 1){
            return 1;
        }
        else{
        return n * calculateFactoria(n-1);
    }

}}
