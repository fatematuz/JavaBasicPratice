/*
<html>
<body>
<div>
<p>Transaction Successful</p>
<p>Trnx ID: TXN5164870</p>
</div>
</body>
</html>
Extract only transaction ID from the HTML
.*/

package Assignment_2;

public class problem6 {
    public static void main(String[] args) {
        String str = "<html>\n" +
                "<body>\n" +
                "<div>\n" +
                "<p>Transaction Successful</p>\n" +
                "<p>Trnx ID: TXN5164870</p>\n" +
                "</div>";
        System.out.println("Result : " );
        System.out.println("==================" );
        System.out.println("Transaction ID: "+str.substring(42,72));
    }
}
