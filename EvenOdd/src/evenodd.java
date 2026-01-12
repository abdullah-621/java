public class evenodd {
    static void main(String[] args){
        for(int i = 0; i < 10; i++)
        {
            if(i % 2 == 0)
            {
                System.out.println("Even index = "+ i);
            }
            else{
                System.out.println("Odd index = " + i);
            }
        }
    }
}