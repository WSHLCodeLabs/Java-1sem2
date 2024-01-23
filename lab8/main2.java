    public static void ex2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number : ");
        int n = Integer.parseInt(input.nextLine());
        int arr[] = new int[n];
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print("Arr["+i+"] = ");
            arr[i] = Integer.parseInt(input.nextLine());
        }
        System.out.println("Output : ");
        Triangle(arr);
        input.close();
    }
    public static void Triangle(int arr[]){
        if (arr.length == 1) {
            System.out.println("["+arr[0]+"]");
        } else {
            int tmp[] = new int[arr.length - 1];
            for (int i = 0 ; i < tmp.length ; i++){
                tmp[i] = arr[i] + arr[i+1];
            }
            Triangle(tmp);
            System.out.println(Arrays.toString(tmp));
        }
    }
}
