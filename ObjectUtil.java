public class ObjectUtil {

    /**
     * print array
     * @param "int array"
     */
    public void printArray(int[] result){
        System.out.print("[");
        for(int i = 0 ; i < result.length ; i++){
            System.out.print( result[i] );
            if(!(i == result.length-1)){
                System.out.print(",");
            }
        }
        System.out.print("]");
    }
}
