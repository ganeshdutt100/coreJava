public class code6 {

//        public int add(int a, int b){
//            return a+b;
//        }
//        public int add(int a, int b,int c){
//            return a+b+c;
//        }
//        public int add(int a, int b,int c,int d){
//         return a + b;
//        }

      public int add(int... numbers){
          int result = 0;
          for(int num :numbers){
              result +=num;
          }
          return result;
      }
        public static void main(String[] args) {
            code6 sumMethods = new code6();
//            System.out.println( obj.add(12,89));
//            System.out.println( obj.add(12,89 , 89));
            System.out.println( "sum :  "+sumMethods.add(12,89 ));
            System.out.println( "sum :  "+sumMethods.add(12,89,34 ));
            System.out.println( "sum :  "+sumMethods.add(12,89,78,56 ));
            System.out.println( "sum :  "+sumMethods.add(12,89,78,56,98 ));
            System.out.println( "sum :  "+sumMethods.add(12,89,78,56,98,87,56 ));
        }


}

//text... ellipsis = >  (...)