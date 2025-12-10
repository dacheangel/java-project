public class SalesData{
    public static void main(String[]args){
        int[][][]sales={
            {{10,20,30},{15,25,35}},
            {{5,10,15},{8,16,25}}
        };
        System.out.println("All Sales Data:");
        for(int branch=0;branch<sales.length;branch++){
            for(int month=0;month<sales[branch].length;month++){
                for(int product=0;product<sales[branch][month].length;product++){
                    System.out.print(sales[branch][month][product] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        int totalBranch1=0;
        for(int month=0;month<sales[0].length;month++){
            for(int product=0;product<sales[0][month].length;product++){
                totalBranch1+=sales[0][month][product];
            }
        }
        System.out.println("Total Sales for Branch 1: " + totalBranch1);
    }
}