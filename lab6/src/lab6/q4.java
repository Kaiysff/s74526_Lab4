package lab6;

public class q4 {

    public static void main(String[] args) {

        int fee = 4000;
        int i = 1;
        double inc = 0.05;
        int tenyear = 10;
        int fouryear = 4;
                
        double totalfeeInTenY = fee;
        while (i <= tenyear){
            totalfeeInTenY = totalfeeInTenY + (fee*inc);
            i++;
        }
        System.out.println("tuiton in ten years is : RM" + totalfeeInTenY);

        fee = 4000;
        i = 1;
        double totalfee = fee;
        double totalfeeinfouryear = 0;
        while(i <= fouryear){
            totalfee = totalfee +  (fee*inc);
            totalfeeinfouryear = totalfeeinfouryear + totalfee;
            i++;
        }
         System.out.println("total cost of four years tuition fee starting from now : RM" + totalfeeinfouryear);
}
}

