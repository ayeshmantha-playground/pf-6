void main(){
    int[][] coordinates = {{2, 3}, {4, 2}, {8, 2}, {9, 3}};

    for (int i = 0; i < coordinates.length; i++) {
        int[] coordinatePair = coordinates[i];
        System.out.println(coordinatePair);
        System.out.print("(");
        for (int j = 0; j < coordinatePair.length; j++) {
            int value = coordinatePair[j];
            System.out.print(STR."\{value}, ");

        }
        System.out.println("\b)\n");
    }

    System.out.println("Using Enhanced for Loop");

    for(int [] coordinatePair: coordinates) {
        System.out.println(coordinatePair);
        System.out.print("(");
        for (int value : coordinatePair) System.out.print(STR."\{value}, ");
        System.out.println("\b)\n");
    }
}