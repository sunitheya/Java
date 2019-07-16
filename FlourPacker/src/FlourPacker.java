public class FlourPacker {
    // write your code here
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(goal < 5){
            if(goal <= smallCount){
                return true;
            }
            return false;
        }else{
            if(goal % 5 <= smallCount && bigCount * 5 + smallCount >= goal)
                return true;
            return false;
        }
    }
}
