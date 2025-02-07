public class subArrays {
    public static void createSubArrays(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(k+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int arey[] = {1,2,3,4,5};
        createSubArrays(arey);
    }
}
