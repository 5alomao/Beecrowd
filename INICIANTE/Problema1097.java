public class Main {
    public static void main (String[] args){
        
        int x = 1;
        int y = 7;

        for(int i = 0;i<9;i++){
            if(x%2==1){
                for(int j=0;j<3;j++){
                    System.out.printf("I=%d J=%d\n",x,y);
                    y--;
                }
                y+=5;
            }
            x++;
        }
    }
}
