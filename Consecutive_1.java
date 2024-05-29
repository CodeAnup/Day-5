public class Consecutive_1 {
    public static void main(String[] args) {

                int n=9;
                int arr[]={1,1,0,0,1,1,1,0,0};
                int count=0;
                int maxm=0;

                for(int i=0;i<n;i++){
                    if(arr[i]==1){
                        count++;
                        maxm=Math.max(maxm,count);
                    }
                    else{
                        count=0;
                    }
                }
                System.out.println(maxm);
            }
        }


