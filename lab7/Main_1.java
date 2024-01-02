public static void ex1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pls input csv file name : ");
        String fname = scanner.nextLine();
        
        File f = new File(fname + ".csv");
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            System.out.print("Pls input String : ");
            String search = scanner.nextLine();
            String s;
            while ((s = br.readLine()) != null) {
                if (s.contains(search)) 
                    System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                br.close(); fr.close(); scanner.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
