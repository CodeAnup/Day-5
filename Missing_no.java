public class Missing_no {
        public static int miss(int n, int arr[]){
            int sum1=0;
            int sum2=0;

            sum1=(n*(n+1)/2);

            for(int i=0;i<n-1;i++){
                sum2+=arr[i];
            }
            int missing_element=sum1-sum2;
            return missing_element;

        }

        public static void main(String[] args) {
            int n=5;
            int arr[]={1,2,4,5,6};
            int ans=miss(n,arr);
            System.out.println("The final result is: "+ans);
        }
    }

