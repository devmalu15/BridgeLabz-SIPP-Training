import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Problem3 {
	public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dmyFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDmy = currentDate.format(dmyFormat);
        System.out.println(formattedDmy);
        DateTimeFormatter ymdFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedYmd = currentDate.format(ymdFormat);
        System.out.println(formattedYmd);
        DateTimeFormatter eMyFormat = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        String formattedEMy = currentDate.format(eMyFormat);
        System.out.println(formattedEMy);;
        }
}
