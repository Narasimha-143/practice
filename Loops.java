class Loops{
    public static void main(String[] args) {
        for(int i = 1; i < 6; i++){
            for(int j = 1; j < 6; j++){
                if(j == 3){
                    continue;
                }
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        System.out.println("While loop--------");
        int i = 0;
        while(i < 10){
            i++;
            if(i == 5){
                continue;
            }
            System.out.print(i + " ");
           
        }
        System.out.println("\nDo while loop----------");
        int j = 1;
        do{
            System.out.println(j + " ");
            j++;
        }while(j < 10);

        if(10 < 10.3){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are different");
        }
    }
}