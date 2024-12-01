package lab6;
public class q5 {
    public static void main(String[] args) {
        int apartmentBulding = 20;
        int unitperBuilding = 15;
        int rentsperUnit = 800;

        String[] month = {"January", "February", "March", "April", "May", "June",
                          "July", "August", "September", "October", "November",
                          "December"};

        String[] date = {"31/1/2024", "28/2/2024", "31/3/2024", "30/4/2024", "31/5/2024",
                         "30/6/2024", "31/7/2024", "31/8/2024", "30/9/2024", "31/10/2024",
                         "30/11/2024", "31/12/2024"};
            for (int building = 1; building <= apartmentBulding; building++) {

                for (int unit = 1; unit <= unitperBuilding; unit++) {

                    for (int tarikh = 0; tarikh < date.length; tarikh++) {
                        
                    System.out.println("--------------------------------------------");
                    System.out.println("Payment coupun for " + month[tarikh]);
                    System.out.println("no buildingApartment : " + building + "     no unit :  " + unit);
                    System.out.println("Amount of rent : RM " + rentsperUnit);
                    System.out.println("Rent Due : " + date[tarikh]);
            }
        }
    }
}
}
