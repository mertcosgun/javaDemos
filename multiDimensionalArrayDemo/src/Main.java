public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Sakarya";
        cities[0][2] = "Bursa";

        cities[1][0] = "Ankara";
        cities[1][1] = "Eskişehir";
        cities[1][2] = "Nevşehir";

        cities[2][0] = "İzmir";
        cities[2][1] = "Aydın";
        cities[2][2] = "Manisa";
        for (int i = 0; i <= 2; i++) {
            System.out.println("---------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }

        }
    }
}