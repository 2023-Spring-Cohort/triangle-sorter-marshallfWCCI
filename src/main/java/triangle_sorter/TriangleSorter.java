package triangle_sorter;

public class TriangleSorter {
    public String analyze(int sideA, int sideB, int sideC) {
        if (sideA > sideC) {
            int temp = sideA;
            sideA = sideC;
            sideC = temp;
        }
        if (sideB > sideC) {
            int temp = sideB;
            sideB = sideC;
            sideC = temp;
        }
        if (sideA == sideB && sideB == sideC)
            return "Equilateral";
        if (sideA * sideA + sideB * sideB == sideC * sideC)
            return "Right";
        if (sideC >= sideA + sideB)
            return "Impossible";
        if (sideA == sideB || sideA == sideC || sideB == sideC)
            return "Isosceles";
        return "Scalene";
    }
}
