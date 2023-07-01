package HanoiTower;

import java.util.Scanner;

public class HanoiTower {

    static int count = 0;
    int n;
    char from_rod, to_rod, aux_rod;

    public HanoiTower(int n, char from_rod, char to_rod, char aux_rod) {
        this.n = n;
        this.from_rod = from_rod;
        this.to_rod = to_rod;
        this.aux_rod = aux_rod;
    }

    public static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + from_rod + " to rod " + to_rod);
            count++;
            return;
        }
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " + from_rod + " to rod " + to_rod);
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
        count++;
    }

    public int temp() {
        HanoiTower hanoiTower = new HanoiTower(n, 'A', 'B', 'C');
        return (int) (Math.pow(2, hanoiTower.n)) - 1;
    }

    //------------main--------------

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks :");
        int input = scanner.nextInt();
        towerOfHanoi(input, 'A', 'C', 'B');
    }
}
