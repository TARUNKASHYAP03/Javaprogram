package JavaProgram.String;

import java.util.*;

public class Shortestpath {
    public static float getshortestpath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'E') {
                x++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'N') {
                y++;
            }
            // South
            else {
                y--;
            }
        }
        int X = x * x;
        int Y = y * y;

        return (float) Math.sqrt(X + Y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the path string in (E,W,N,S) = ");
        String path = sc.nextLine();

        System.out.println(getshortestpath(path));
        sc.close();
    }
}
