package pattern;

public class MultipleTypePyramid {
    public static void print(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(i <= j)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(i + j >= row + 1)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(4,4);
    }
}
