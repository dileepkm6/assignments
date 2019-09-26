public class ChessBoard {
    public void printChessBoard()
    {
        int chessBoard[][]=new int[8][8];
        int count=0;
        String ww="WW";
        String bb="BB";
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                if(j%2==0)
                {
                    System.out.print(ww+"|");
                }
                else
                {
                    System.out.print(bb+"|");
                }
            }
            System.out.println();
            String temp=ww;
            ww=bb;
            bb=temp;
        }
    }
    public static void main(String []args)
    {
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.printChessBoard();
    }
}
