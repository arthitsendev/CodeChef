import java.util.*;
class sumofcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, j, k, i, s1 = 0, c = 0, a3, b3, c3, d3, l, m;
        a = sc.nextInt();
        b = sc.nextInt();
        for (i = a; i <= b; i++) {
            for (j = 1; j <= i; j++) {
                a3 = j * j * j;
                if (a3 > i)
                    break;
                for (k = j; k <= i; k++) {
                    b3 = k * k * k;
                    if (a3 + b3 > i)
                        break;
                    for (l = j + 1; l <= i; l++) {
                        c3 = l * l * l;
                        if (c3 > a3 + b3)
                            break;
                        for (m = l; m <= i; m++) {
                            d3 = m * m * m;
                            if (c3 + d3 > a3 + b3)
                                break;
                            if (c3 + d3 == a3 + b3) {
                                System.out.println(i);
                            }
                        }
                    }
                }
            }
        }
    }
}
