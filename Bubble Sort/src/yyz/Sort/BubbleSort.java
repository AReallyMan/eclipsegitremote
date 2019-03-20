package yyz.Sort;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
//asdlkjflasdjflasdjk;
public class BubbleSort {
	public static void time() {
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println("now the time is:"+localDateTime);
		LocalDate localDate=localDateTime.toLocalDate();
		Month month=localDateTime.getMonth();
		int day=localDateTime.getDayOfMonth();
		int second=localDateTime.getSecond();
		System.out.println("月:"+month+"日"+day+"秒"+second);
	}

	public static void main(String args[]){
		time();
	}
}
