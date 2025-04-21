package javaTestPack;

import java.util.Scanner;

public class gameStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
					Scanner sc = new Scanner(System.in);
					while(true) {
					System.out.println("\nPick a game to buy:\n 1. Call of Warfare - 1500 \n 2. Speed Racers - 1200\n 3.  Mystery Mansion - 1000 \n 4.  Pixel Adventure - 800 \n 5.Puzzle Mania - 500 \n 6. Checkout / Exit");
					int choice = sc.nextInt();
					if (choice == 6) {
						System.out.println("Thank you for shopping..!!");
//						 System.exit(0);
						break;
					}
					if(choice>6 || choice < 0) {
						System.out.println("Enter valid choice..!!!");
					continue;
					}
					System.out.println("Enter quantity: ");
					int quant=sc.nextInt();

						if(choice <= 6 && choice > 0) {
							switch(choice) {
							case 1:	System.out.println("Game added to cart");
									if(quant>=1) {
										int number=1500*quant;
										System.out.println("Total price is: "+number);
										break;
									}								
									break;
							case 2:	System.out.println("Game added to cart");
									if(quant>=1) {
										int number=1200*quant;
										System.out.println("Total price is: "+number);
										break;
									}							
							case 3: System.out.println("Game added to cart");
									if(quant>=1) {
									int number=1200*quant;
									System.out.println("Total price is: "+number);
									break;
									}
							case 4: System.out.println("Game added to cart");
									if(quant>=1) {
									int number=1000*quant;
									System.out.println("Total price is: "+number);
									break;
									}
							case 5: System.out.println("Game added to cart");
									if(quant>=1) {
									int number=800*quant;
									System.out.println("Total price is: "+number);
									break;
									}
							case 6: System.out.println("Game added to cart");
									if(quant>=1) {
										int number=500*quant;
										System.out.println("Total price is: "+number);
										break;
									}
							default: System.out.println("Enter a valid input !!!");
							}
						}
						}
					}

//					}

	}

	

