import java.util.Scanner;
public class HealthKiosk {
    public static void main(String[] args) {
        //Declaring variables
        char service_code;
        double weight=0;
        double height=0;
        double required_dosage;
        double numberoftablets;
        char baseCode=0;
        double metricResult=0;
        //Accepting input from the user
        Scanner input=new Scanner(System.in);
        System.out.print("You are welcome to my health kiosk project\n");
        System.out.print("Enter service code(P/L/T/C)");
         service_code =input.next().toUpperCase().charAt(0);

         switch (service_code) {
             case 'P':
                 System.out.println("Go to pharmacy desk");
                 break;
             case 'L':
                 System.out.println("Go to Lab desk");
                 break;
             case 'T':
                 System.out.println("Go to Triage desk");
                 break;
             case 'C':
                 System.out.println("Go to counselling desk");
                 break;
             default:
                 System.out.println("Invalid service code");
         }

         if (service_code == 'T') {
             System.out.print("Press\n" +
                     "1.BMI\n" +
                     "2.Dosage round up\n" +
                     "3.simple trig helper\n");
             int metric_input=input.nextInt();
             switch(metric_input) {
                 case 1:
                     System.out.print("Enter weight in pounds");
                     weight=input.nextDouble();
                     System.out.print("Enter height in meters");
                     height=input.nextDouble();
                     double BMI=weight/Math.pow(height,2);
                     double BMIrounded=Math.round(BMI*10)/10.0;
                     System.out.println("BMI rounded to 1 decimal is :"+BMIrounded);
                     metricResult=(int)Math.round(BMI);
                     System.out.println("BMI is:"+BMI);
                     if (BMI<18.5) {
                         System.out.print("You are underweight");
                     }
                     else if (BMI>=18.5 && BMI<=24.9) {
                         System.out.print("You are normal");
                     }
                     else if (BMI>=25.0 && BMI<=29.9) {
                         System.out.print("You are overweight");
                     }
                     else{
                         System.out.print("You are obese");
                     }
                     break;
                 case 2:
                     System.out.print("Enter the required dosage in mg");
                     required_dosage=input.nextDouble();
                     numberoftablets=Math.ceil(required_dosage/250);
                     System.out.println("The number of tablets are"+(int)numberoftablets);
                     metricResult=(int)numberoftablets;
                     break;
                 case 3:
                     System.out.print("Enter an angle in degrees");
                     double angle=input.nextDouble();
                     double convertedradians=Math.toRadians(angle);
                     System.out.println("The converted radians are"+convertedradians);

                     double sinValue=Math.sin(convertedradians);
                     double cosValue=Math.cos(convertedradians);

                     sinValue=Math.round(sinValue*1000)/1000.0;
                     cosValue=Math.round(cosValue*1000)/1000.0;
                     System.out.println("The sin value is"+sinValue);
                     System.out.println("The cos value is"+cosValue);
                     metricResult=(int)Math.round(sinValue*100);
                     break;

                 default:
                     System.out.println("Invalid metric choice");
                     return;

             }

         }
         //Generating random variable

         String letter =(String)("A"+(int)(Math.random()*26));
         int randomNum=3333+(int)(Math.random()*(9999-3333+1));
         String ID=letter+String.valueOf(randomNum);
         System.out.println("Your ID is"+ID);
         //validating ID

         if (ID.length()==5){
             System.out.println("Your ID is valid");
         }else{
             System.out.println("Your ID is invalid it must be 5 characters long");
         }
         if(Character.isLetter(ID.charAt(0))) {
             System.out.println("First character is a letter");
         }else {
             System.out.println("Invalid,First character must be a letter");
         }
         boolean isdigit=true;
         for(int i=1;i<5;i++) {
             if (!Character.isDigit(ID.charAt(i))) {
                 isdigit = false;
                 break;

             }
         }
         //finding first and last name shift
         if(isdigit) {
             System.out.println("The last 4 characters are digits");
         }else {
             System.out.println("Invalid,Last 4 characters must be digit");
         }
         System.out.println("Enter your first name");
         String first_name=input.next();
         char first_Letter=first_name.charAt(0);
        System.out.println("the firsletter of your name is"+first_Letter);
        char baseCode=(char)("A"+first_Letter-"A"+2)%26);
        System.out.println("the base code is "+baseCode);
         }else{
             System.out.println("Invalid first name,name cannot be empty");
         }
         //last two of ID
         if (ID.length()>=2) {
             String last_two = ID.substring(ID.length() - 2);
             System.out.println("Your last two is" + last_two);
         }else {
             System.out.println("Invalid first name,name cannot be empty");
         }
         //Final ID
         String finalID=ID+metricResult;
         System.out.println("Your final ID is"+finalID);

         }
}







