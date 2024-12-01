package lab6;

public class q4 {

    public static void main(String[] args) {

        int tutionFee = 4000;
        double totaltutionFeeInTenY = tutionFee;
        for (int year = 1; year <= 10; year++) {
            totaltutionFeeInTenY = (totaltutionFeeInTenY*0.05) + totaltutionFeeInTenY;
        }
        System.out.printf("tution fee in ten year  : RM%.2f\n " , totaltutionFeeInTenY);
        
        double tutionFeeInFourY = tutionFee;
        double totalcosttutionFeeInFourY = 0 ;
        for (int year = 1; year <= 4; year++) {
            tutionFeeInFourY  = (tutionFeeInFourY*0.05) + tutionFeeInFourY;
            totalcosttutionFeeInFourY = totalcosttutionFeeInFourY + tutionFeeInFourY;
        }
            System.out.printf("four years tution fee starting from now  : RM%.2f\n" , totalcosttutionFeeInFourY);
        }
    }

