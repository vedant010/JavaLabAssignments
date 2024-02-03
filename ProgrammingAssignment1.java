public class SY2022bit060 {
    public static void main(String[] args) {
        SY2022bit060 RegNo = new SY2022bit060();
        System.out.println(RegNo.getValidRegistrationsCount(args));
    }

    public static int getValidRegistrationsCount(String[] arguments) {
        int count = 0;
        String[] valid_Courses = {"bit", "bcs", "bme", "bch"};

        for (String regNumber : arguments){
            if (regNumber.length() != 10) 
                continue;

            String year = regNumber.substring(0, 4);
            String course = regNumber.substring(4, 7).toLowerCase();
            String num = regNumber.substring(7, 10);

            int year = Integer.parseInt(year);
            if (year < 2000 || year > 2024){ 
                continue;
            }
            if (!Arrays.asList(valid_Courses).contains(course)){
                continue;
            }
            if (!num.matches("\\d{3}")){ 
                continue;
            }
            count++;
        }

        return count;
    }
}

