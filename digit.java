

public class digit{
    public static void main(String[] args){
        int[] digits = {1, 2, 3, 4};
        int count = 0;

        for(int i=0; i<digits.length; i++){
            for(int j=0; j<digits.length; j++){
                for(int k=0; k<digits.length; k++){
                    if(i!=j && j!=k && k!=i){
                        System.out.println(digits[i]*100 + digits[j]*10 + digits[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println("Total number of unique three-digit numbers: " + count);
    }
}