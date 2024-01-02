    public static void ex2() {
        Scanner scanner = new Scanner(System.in);

        File f = new File("Test1.txt");
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            int i = 1;
            while (true) {
                System.out.print("Pls input name : ");
                String name = scanner.nextLine();

                if (name.equals("Q"))
                    break;
                bw.write("Name[" + i + "] : " + name + "\n");
                i++;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                    bw.close();
                    fw.close();
                    scanner.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
