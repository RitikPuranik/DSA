
public class array {
    public static void main(String args[]) {
       // int [] array=new int[4];
        int [] arr ={1,2,3,4,56};
        // int sum=0;
        // for(int i=arr[0];i<arr[3];i++){
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);

        // int a=0;
        // for(int i=0;i<arr.length;i++){
        //       if(arr[i]>a){
        //         a=arr[i];
        //       }
        // }
        // System.out.println(a);

        int k=2;
        int a=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                a++;
                break;
            }
        }
        if(a==1){
            System.out.println("the element is in array");
        }
        else{
            System.out.println("the element is not in array");
        }
    }
    
}
