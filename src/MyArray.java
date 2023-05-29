public class MyArray {
    static int count;
    static int sum;
    public static void main(String[] args) {
//        String[] employees = new String[5] ;
        String[] employees1 =  {"ED001","ED002","ED003","ED004","ED005"};
        int[] rollNO= {1,2,3,4,5,6,7,8,9,10};

        System.out.println("even values in array using (for each)");
        for (int a:rollNO){
            if(a%2==0){
//                System.out.println(a);
                count = count + 1;
                sum = sum + a;
            }
        }
        System.out.println("count: "+count+"; sum"+sum);
    //============================================================
//        for (int i=0;i<=rollNO.length-1;i++) {
//            if(i%2==0){
////                System.out.println(i);
//                count = count + 1;
//                sum = sum + rollNO[i];
//            }
//        }
        //System.out.println("count: "+count+"; sum"+sum);
//
//        for (int i=0;i<=employees1.length-1;i++) {
//            System.out.println(employees1[i]);
//        }

    }
}
