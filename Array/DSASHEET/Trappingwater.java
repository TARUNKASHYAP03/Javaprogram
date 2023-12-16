package JavaProgram.Array.DSASheet;

public class Trappingwater {
    public static int trapedwater(int heigth[]) {
        int n = heigth.length;
        // left max boundary

        int leftmax[] = new int[n];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i - 1]);
        }

        // right max boundary

        int rightmax[] = new int[n];
        rightmax[n - 1] = heigth[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(heigth[i], rightmax[i + 1]);
        }

        int trapedwate = 0;

        // loop

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);// waterlevel
            trapedwate += (waterlevel - heigth[i]);// trapped waterlevel
        }
        return trapedwate;
    }

    public static void main(String[] args) {
        int heigth[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trapedwater(heigth));
    }
}
