package Section5;

public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(bigCount<0||smallCount<0||goal<0) return false;
        if(bigCount*5>goal){
            return smallCount >= goal - (bigCount - 1) * 5;
        }
        else if (bigCount*5<=goal){
            return bigCount*5+smallCount>=goal;
        }
        else return false;
    }
}
