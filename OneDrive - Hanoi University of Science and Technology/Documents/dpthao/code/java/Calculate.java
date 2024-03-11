import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args){
        String strNum1, strNum2;
        String strNotification = "Sum: ";
        
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);   
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double diff = Math.abs(num1-num2);
        double product = num1 * num2;
        
        strNotification += String.valueOf(sum) + "\nDifference: " + String.valueOf(diff) + "\nProduct: " + String.valueOf(product);

        if(num2==0) {
            strNotification += "\nCan't calculate quotient since num2 = 0";
        } else {
            double quotient = num1/num2;
            strNotification += "\nQuotient: " + String.valueOf(quotient);
        }
        JOptionPane.showMessageDialog(null, strNotification, "Calculate", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}