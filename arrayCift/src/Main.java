public class Main {
    static boolean isFind (int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] star = {12,12,26,26,45,89,78,78,2,2,6,4,4,6,8,8};
        int[] duplicate = new int [star.length];
        int startIndex = 0;

        for (int i=0; i< star.length;i++){
            for (int j = 0; j< star.length;j++){
                if((i != j) && (star[i] == star[j])){
                    if (star[i] % 2 ==0) {
                        if (!isFind(duplicate, star[i])) {
                            duplicate[startIndex++] = star[i];
                        }
                    }
                    break;
                }
            }
        }

        for (int value : duplicate){
            if (value != 0){
                System.out.println("Tekrar Eden Çift Sayılar: "+value+" ");
            }
        }
    }
}