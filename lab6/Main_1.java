    public static void ex1(){
       
        Scanner scanner = new Scanner(System.in);

        int num;
        int arr[][];

        while (true){
            try {
                System.out.print("Input number : ");
                num = scanner.nextInt();
                arr = new int[num][];
                break;
            } catch (Exception e){
                num = -1;
                scanner.nextLine();
            }
        }

        int count = num;
        for (int i = 0 ; i < num ; i++)
            arr[i] = new int[count--];
        
        int value = 1;
        for (int j = 0; j < arr.length ; j++)
            for (int k = 0 ; k < arr[j].length ; k++)
                arr[j][k] = value++;

        for (int j = 0; j < arr.length ; j++){
            for (int k = 0 ; k < arr[j].length ; k++)
                System.out.print(arr[j][k] + " ");
            System.out.print("\n");
        } 
        scanner.close();
    }
}
