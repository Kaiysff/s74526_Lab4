package lab6;

public class q5 {

    public static void main(String[] args) {
        int apartmentBulding = 20;

        int rentsperUnit = 800;
        int building = 1;
        int unitperBuilding = 15;

        String[] month = {"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November",
            "December"};

        String[] date = {"31/1/2024", "28/2/2024", "31/3/2024", "30/4/2024", "31/5/2024",
            "30/6/2024", "31/7/2024", "31/8/2024", "30/9/2024", "31/10/2024",
            "30/11/2024", "31/12/2024"};

        while (building <= 20) {

            int unit = 1;
            while (unit <= 15) {

                int monthIndex = 0;

                
                while (monthIndex < month.length) {
                    String months = month[monthIndex];

                  
                        System.out.println("--------------------------------------------");
                        System.out.println("Payment coupun for " + months);
                        System.out.println("no buildingApartment : " + building + "     no unit :  " + unit);
                        System.out.println("Amount of rent : RM " + rentsperUnit);
                        System.out.println("Rent Due : " + date[monthIndex]);

                        
                    
                    monthIndex++;
                }
                unit++;
            }

            building++;
        }
    }
}


