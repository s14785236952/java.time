
import java.time.LocalDateTime;

public class Time {
	public static void main(String[] args) {

		System.out.printf("Now: %s%n", LocalDateTime.now());

		System.out.printf("6 months from now: %s%n", LocalDateTime.now().plusMonths(6));

		System.out.printf("6 months ago: %s%n", LocalDateTime.now().minusMonths(6));

	}
}
