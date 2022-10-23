package TeachMeSkills.com.com.Lesson4.HomeWork;

import java.util.Scanner;

public class CrossAndNulls {
    public static void main(String[] args) {
        String player1 = "Player 1";
        String player2 = "Player 2";
        char noUseSpace = ' ';
        char x = 'X';
        char o = 'O';
        char[][] playground = new char[3][3];
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        int firstCoord;
        int secondCoord;
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                playground[i][j] = noUseSpace;
            }
        }
        for(;;)
        {
            if(count % 2 != 0)
            {
                System.out.println(player1 + " turn! press coords to enter ur X");
                System.out.println("First coord: ");
                firstCoord = scanner.nextInt();
                System.out.println("Second coord: ");
                secondCoord = scanner.nextInt();
                if(firstCoord < 3 && secondCoord < 3 && playground[firstCoord][secondCoord] == noUseSpace)
                {
                    playground[firstCoord][secondCoord] = x;
                    if((playground[0][0] == x && playground[1][1] == x && playground[2][2] == x) ||
                            (playground[0][0] == x && playground[0][1] == x && playground[0][2] == x) ||
                            (playground[0][0] == x && playground[1][0] == x && playground[2][0] == x) ||
                            (playground[1][0] == x && playground[1][1] == x && playground[1][2] == x) ||
                            (playground[2][0] == x && playground[2][1] == x && playground[2][2] == x) ||
                            (playground[0][2] == x && playground[1][1] == x && playground[2][0] == x) ||
                            (playground[2][2] == x && playground[1][2] == x && playground[0][2] == x) ||
                            (playground[2][1] == x && playground[1][1] == x && playground[0][1] == x) ||
                            (playground[2][0] == x && playground[1][0] == x && playground[1][1] == x))
                    {
                        System.out.println(player1 + " Win");
                        for(int i = 0; i < 3; i++)
                        {
                            for(int j = 0; j < 3; j++)
                            {
                                System.out.print(playground[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    count++;
                }
                else {
                        System.out.println("U entered wrong value");
                }
            }
            else
            {
                System.out.println(player2 + " turn! press coords to enter ur O");
                System.out.println("First coord: ");
                firstCoord = scanner.nextInt();
                System.out.println("Second coord: ");
                secondCoord = scanner.nextInt();
                if(firstCoord < 3 && secondCoord < 3 && playground[firstCoord][secondCoord] == noUseSpace)
                {
                    playground[firstCoord][secondCoord] = o;
                    if((playground[0][0] == o && playground[1][1] == o && playground[2][2] == o) ||
                            (playground[0][0] == o && playground[0][1] == o && playground[0][2] == o) ||
                            (playground[0][0] == o && playground[1][0] == o && playground[2][0] == o) ||
                            (playground[1][0] == o && playground[1][1] == o && playground[1][2] == o) ||
                            (playground[2][0] == o && playground[2][1] == o && playground[2][2] == o) ||
                            (playground[0][2] == o && playground[1][1] == o && playground[2][0] == o) ||
                            (playground[2][2] == o && playground[1][2] == o && playground[0][2] == o) ||
                            (playground[2][1] == o && playground[1][1] == o && playground[0][1] == o) ||
                            (playground[2][0] == o && playground[1][0] == o && playground[1][1] == o))
                    {
                        System.out.println(player2 + " Win");
                        for(int i = 0; i < 3; i++)
                        {
                            for(int j = 0; j < 3; j++)
                            {
                                System.out.print(playground[i][j] + " ");
                            }
                            System.out.println();
                        }
                        break;
                    }
                    count++;
                }
                else {
                    System.out.println("U entered wrong value");
                }

            }
            for(int i = 0; i < 3; i++)
            {
                for(int j = 0; j < 3; j++)
                {
                    System.out.print(playground[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
