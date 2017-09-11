package com.practice;

public class PolymorphisumEx {
	 public static void main(String [] args) {
	      Salary s = new Salary("Swami", "pune", 3, 3600.00);
	      Employee e = new Salary("pramod", "pune", 2, 2400.00);
	      System.out.println("Call mailCheck using Salary reference --");   
	      s.mailCheck();
	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
	   }
}
