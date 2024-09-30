package Maths;

public class BasicMaths {
    static void reversNum(int num){
        int res=0;
        while(num>0){
            int last=num%10;
            res=res*10+last;
            num/=10;
        }
        System.out.println(res+" reverse a number !");
    }

    static void tarailingZeroFact(int num){
        double ans=0;
        for(int i=5; i<=num; i*=5){
            ans+=num/i;
        }
        System.out.println(ans);
    }

    static void fastExpo(int num, int power){
        int ans=1;
        while(power>0){
            if((power&1)==1){
                ans*=num;
            }
            power/=2;
            num*=num;
        }
        System.out.println(ans);
    }
    static void powerOfNum(int num, int power){
        int res=1;
        for(int i=0; i<power; i++){
            res*=num;
        }
        System.out.println(res+" power ! ");
    }
    public static void main(String[] args) {
//        reversNum(5015);
//        powerOfNum(2,3);
//        fastExpo(2,3);
        tarailingZeroFact(30);
    }
}
