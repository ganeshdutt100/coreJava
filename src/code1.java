public class code1 {
    public static void main(String[] args) {
        String ame1 = "Value1";
        String ame2 = "Value1";
        String ame3 = "Value1";

        String arr[] = {"Name1", "Name2","Name3"};
//        System.out.println(arr[0] + " "+arr[1]);
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }


        int arr1[][] = {
                {1,2,3,5,7,},
                {1,2,3,5,7,},
                {1,2,3,5,7,}
        };

        for(int [] x : arr1){
            for(int y : x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
