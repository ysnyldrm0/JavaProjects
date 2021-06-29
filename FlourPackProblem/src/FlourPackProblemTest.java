public class FlourPackProblemTest {

    public static void main (String[] args){

        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
        System.out.println(canPack(5,3,24));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if( bigCount < 0 || smallCount < 0 || goal < 0 )
            return false;

        int bigCountValue = bigCount * 5;
        int smallCountValue = smallCount;

        while (bigCountValue > goal)
            bigCountValue-=5;

        if(goal < 5){
            if (smallCountValue >= goal)
                return true;
        }
        else{
            if(bigCountValue == 0){
                if (smallCountValue >= goal)
                    return true;
            }
            else{
                goal = goal - bigCountValue;
                if (smallCountValue >= goal)
                    return true;
            }
        }
        return false;
    }
}
