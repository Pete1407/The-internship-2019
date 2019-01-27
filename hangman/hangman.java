import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class hangman {
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		int[] array = null;
		int check_zero = 0;
		System.out.println("------------------------");
		System.out.println("Select Category:(1/2/3) or exit(4)");
		System.out.println("1.One Piece");
		System.out.println("2.Country");
		System.out.println("3.Famous Song");
		System.out.println("------------------------");
		System.out.println("4.Exit game");
		
		System.out.printf("You choose number: ");
		int input = scan.nextInt();
		String path = "./src";
		String[] blank = null;
		String hint = null;
		Random rand = new Random();
		int i = 0;
		int live = 5;
		int digit = 0;
		
		if(input==1)
		{
			
			path += "/onepiece.txt";
			
		    System.out.println("You chose one piece.");
			try 
			{
				BufferedReader read = new BufferedReader(new FileReader(path));
				String a = read.readLine();
				while(a!=null)
				{
					list.add(a);
					
					a = read.readLine();
				}
				 array = new int[list.size()];
				 check_zero = 0;
			/*	for(int count=0;count<array.length;count++)
				{
					array[count] = 0;
				}
				
				for(int count2=0;count2<array.length;count2++)
				{
					System.out.println(array[count2]+" ---- - - -  ");
				}
			*/
				 /////////////////////////////////
		do 
	    {
				
				
				int position = rand.nextInt(5);
				String txt = list.get(position);
			/*	if(array[position]==0)
				{
					array[position] = 1;
					check_zero++;
				}
			*/	
				
				blank = new String[txt.length()];
				
				for(int count=0;count<txt.length();count++)
				{
					blank[count] = "_";
				}
				
		  
			  for(int count=0;count<txt.length();count++)
			  {
				  if(Character.isWhitespace(txt.charAt(count)))
				  {
					  blank[count] = " ";
				  }
				  else if(txt.charAt(count)=='0' || txt.charAt(count)=='1' || txt.charAt(count)=='2'|| txt.charAt(count)=='3'|| txt.charAt(count)=='4'||txt.charAt(count)=='5'|| txt.charAt(count)=='6'||txt.charAt(count)=='7'||txt.charAt(count)=='8'||txt.charAt(count)=='9' ||txt.charAt(count)=='!')
				  {
					  switch(txt.charAt(count))
					  {
					      case '0' : blank[count] = "0";
					      break;
					      
					      case '1' : blank[count] = "1";
					      break;
					      
					      case '2' : blank[count] = "2";
					      break;
					      
					      case '3' : blank[count] = "3";
					      break;
					      
					      case '4' : blank[count] = "4";
					      break;
					      
					      case '5' : blank[count] = "5";
					      break;
					      
					      case '6' : blank[count] = "6";
					      break;
					      
					      case '7' : blank[count] = "7";
					      break;
					      
					      case '8' : blank[count] = "8";
					      break;
					      
					      case '9' : blank[count] = "9";
					      break;
					      
					      case '!' : blank[count] = "!";
					      break;
					  }
				  }
			  }
 
	    System.out.printf("Are you ready to 1.play or 2.exit ??? (1/2): ");
	    
	    int choose = 0;
	    int score = 0;
	    char miss = ' ';
	   
	    
	     i = scan.nextInt();
	 
	    switch(i)
	    {
	       case 1: choose = 1;
	       break;
	    
	       case 2: choose = 2;
	       break;
	    
	       default :
	    }
	    
	    
	    
	    if(choose==1)
	    {
	    	
	    	
	    	if(txt.equals("bigmom"))
			{
				hint = "four emperor";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("lufy") || txt.equals("sanji") || txt.equals("solo"))
			{
				hint = "Straw Pirate";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("do flamingos"))
			{
				hint = "Seven Warlords";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
	    	
	    	System.out.println();
	    	
	    	
	    	
	      	    
		     while(live>0)
		     {
	            for(int count2=0;count2<blank.length;count2++)
	            {
	    	         System.out.printf(blank[count2]+" ");
	            } 
	            
	            if(miss==' ')
	            {
	            	System.out.printf("score "+score+","+"remaining wrong guess "+live);
	            }
	            else
	            {
	            	 System.out.printf("score "+score+","+"remaining wrong guess "+live+", "+"wrong guessed: "+miss);
	            }
	               
	                System.out.println();
	           
	                
	                char charac = scan.next().charAt(0);
	                if(txt.contains(charac+""))
	                {
	                	for(int count3=0;count3<txt.length();count3++)
	                	{
	                		if(charac==txt.charAt(count3))
	                		{
	                			blank[count3] = String.valueOf(charac);
	                			score = score + 5;
	                			digit++;
	                		}
	                		
	                	}
	                	
	                	if(digit>1)
	                	{
	                		score = score - 5;
	                	}
	                		digit = 0;
	                		
	                	
	                }
	                else
	                {
	                	miss = charac;
	                	live--;
	                }
	                String result = "";
	                
	                for(int count4=0;count4<blank.length;count4++)
	                {
	                	result = result + blank[count4];
	                }
	                	
	                if(txt.equals(result))
	                {
	                	System.out.println("You Win for "+"\""+txt+"\"");
	                	System.out.println("Score :"+score);
	                	for(int count5=0;count5<blank.length;count5++)
	                	{
	                		blank[count5] = "_";
	                	}
	                	txt = "";
	                	live = 5;
	                	miss = ' ';
	                	score = 0;
	                	break;
	                }
	           
		     }
		     
		     if(live==0)
		     {
		       System.out.println("You lose");
		       System.out.println("Answer is "+"\""+txt+"\"");
		       live = 5;
		     }
	    	 
	    }
	    else if(choose==2)
	    {
	    	System.out.println("Good Bye!!!");
	    }
	
				
				
	   }while(i==1);
		
		} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}	
			
			////////////////////
			
		}
		
		else if(input==2)
		{
			System.out.println("You chose country.");
			path += "/country.txt";
			
			try 
			{
				BufferedReader read = new BufferedReader(new FileReader(path));
				String a = read.readLine();
				while(a!=null)
				{
					list.add(a);
					//System.out.println(a);
					a = read.readLine();
				}
				
				do 
				{
				int position = rand.nextInt(5);
			/*	if(array[position]==0)
				{
					array[position] = 1;
					check_zero++;
				}
			*/	
				String txt = list.get(position);
				
					
				blank = new String[txt.length()];
				
				for(int count=0;count<txt.length();count++)
				{
					blank[count] = "_";
				}
				
		     
			  for(int count=0;count<txt.length();count++)
			  {
				  if(Character.isWhitespace(txt.charAt(count)))
				  {
					  blank[count] = " ";
				  }
				  else if(txt.charAt(count)=='0' || txt.charAt(count)=='1' || txt.charAt(count)=='2'|| txt.charAt(count)=='3'|| txt.charAt(count)=='4'||txt.charAt(count)=='5'|| txt.charAt(count)=='6'||txt.charAt(count)=='7'||txt.charAt(count)=='8'||txt.charAt(count)=='9' ||txt.charAt(count)=='!')
				  {
					  switch(txt.charAt(count))
					  {
					      case '0' : blank[count] = "0";
					      break;
					      
					      case '1' : blank[count] = "1";
					      break;
					      
					      case '2' : blank[count] = "2";
					      break;
					      
					      case '3' : blank[count] = "3";
					      break;
					      
					      case '4' : blank[count] = "4";
					      break;
					      
					      case '5' : blank[count] = "5";
					      break;
					      
					      case '6' : blank[count] = "6";
					      break;
					      
					      case '7' : blank[count] = "7";
					      break;
					      
					      case '8' : blank[count] = "8";
					      break;
					      
					      case '9' : blank[count] = "9";
					      break;
					      
					      case '!' : blank[count] = "!";
					      break;
					  }
				  }
			  }
  
		
		
			  
	    System.out.println("Are you ready to 1.play or 2.exit ??? (1/2): ");
	    int choose = 0;
	    int score = 0;
	    char miss = ' ';
	   
	  
	     i = scan.nextInt();
	 
	    switch(i)
	    {
	       case 1: choose = 1;
	       break;
	    
	       case 2: choose = 2;
	       break;
	    
	       default :
	    }
	    
	    if(choose==1)
	    {
	    	
	    	if(txt.equals("england"))
			{
				hint = "Queen";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("china"))
			{
				hint = "dragon";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("laos") || txt.equals("thailand"))
			{
				hint = "Asia";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("america"))
			{
				hint = "Statue of Liberty";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
	    	
	    	System.out.println();
	      	    
		     while(live>0)
		     {
	            for(int count2=0;count2<blank.length;count2++)
	            {
	    	         System.out.printf(blank[count2]+" ");
	            } 
	            
	            if(miss==' ')
	            {
	            	System.out.printf("score "+score+","+"remaining wrong guess "+live);
	            }
	            else
	            {
	            	 System.out.printf("score "+score+","+"remaining wrong guess "+live+", "+"wrong guessed: "+miss);
	            }
	               
	                System.out.println();
	           
	                
	                char charac = scan.next().charAt(0);
	                if(txt.contains(charac+""))
	                {
	                	for(int count3=0;count3<txt.length();count3++)
	                	{
	                		if(charac==txt.charAt(count3))
	                		{
	                			blank[count3] = String.valueOf(charac);
	                			score = score + 5;
	                			digit++;
	                		}
	                	}
	                	
	                	if(digit>1)
	                	{
	                		score = score - 5;
	                	}
	                		digit = 0;
	                }
	                else
	                {
	                	miss = charac;
	                	live--;
	                }
	                String result = "";
	                
	                for(int count4=0;count4<blank.length;count4++)
	                {
	                	result = result + blank[count4];
	                }
	                	
	                if(txt.equals(result))
	                {
	                	System.out.println("You Win for "+"\""+txt+"\"");
	                	System.out.println("Score :"+score);
	                	for(int count5=0;count5<blank.length;count5++)
	                	{
	                		blank[count5] = "_";
	                	}
	                	txt = "";
	                	live = 5;
	                	miss = ' ';
	                	score = 0;
	                	break;
	                }
	           
		     }
		     
		     if(live==0)
		     {
		       System.out.println("You lose");
		       System.out.println("Answer is "+"\""+txt+"\"");
		       live = 5;
		     }
	    	 
	   
	    }
	    else if(choose==2)
	    {
	    	System.out.println("Good Bye!!!");
	    }
	    	
		}while(i==1);
				
				
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}	
		}
		else if(input==3)
		{
			
			System.out.println("You chose famous song.");
			path += "/famous_song.txt";
			
			try 
			{
				BufferedReader read = new BufferedReader(new FileReader(path));
				String a = read.readLine();
				while(a!=null)
				{
					list.add(a);
					a = read.readLine();
				}
				
				
				do 
				{
				int position = rand.nextInt(5);
			/*	if(array[position]==0)
				{
					array[position] = 1;
					check_zero++;
				}
			*/
				String txt = list.get(position);
				
				
				
				blank = new String[txt.length()];
				for(int count=0;count<txt.length();count++)
				{
					blank[count] = "_";
				}
				
		 
			  for(int count=0;count<txt.length();count++)
			  {
				  if(Character.isWhitespace(txt.charAt(count)))
				  {
					  blank[count] = " ";
				  }
				  else if(txt.charAt(count)=='0' || txt.charAt(count)=='1' || txt.charAt(count)=='2'|| txt.charAt(count)=='3'|| txt.charAt(count)=='4'||txt.charAt(count)=='5'|| txt.charAt(count)=='6'||txt.charAt(count)=='7'||txt.charAt(count)=='8'||txt.charAt(count)=='9' ||txt.charAt(count)=='!')
				  {
					  switch(txt.charAt(count))
					  {
					      case '0' : blank[count] = "0";
					      break;
					      
					      case '1' : blank[count] = "1";
					      break;
					      
					      case '2' : blank[count] = "2";
					      break;
					      
					      case '3' : blank[count] = "3";
					      break;
					      
					      case '4' : blank[count] = "4";
					      break;
					      
					      case '5' : blank[count] = "5";
					      break;
					      
					      case '6' : blank[count] = "6";
					      break;
					      
					      case '7' : blank[count] = "7";
					      break;
					      
					      case '8' : blank[count] = "8";
					      break;
					      
					      case '9' : blank[count] = "9";
					      break;
					      
					      case '!' : blank[count] = "!";
					      break;
					  }
				  }
			  }
  
		
		
			  
	    System.out.printf("Are you ready to 1.play or 2.exit ??? (1/2): ");
	    int choose = 0;
	    int score = 0;
	    char miss = ' ';
	   
	     i = scan.nextInt();
	 
	    switch(i)
	    {
	       case 1: choose = 1;
	       break;
	    
	       case 2: choose = 2;
	       break;
	    
	       default :
	    }
	    
	    if(choose==1)
	    {
	    	if(txt.equals("bad blood"))
			{
				hint = "Taylor Swift";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("what do you mean"))
			{
				hint = "Justin Bieber";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("chandelier"))
			{
				hint = "Sia";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("dance with stranger"))
			{
				hint = "Sam Smith";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
			else if(txt.equals("pills n potions"))
			{
				hint = "Nicki Minaj";
				System.out.println("Hint:"+"\""+hint+"\"");
			}
	    	System.out.println();
		     while(live>0)
		     {
	            for(int count2=0;count2<blank.length;count2++)
	            {
	    	         System.out.printf(blank[count2]+" ");
	            } 
	            
	            if(miss==' ')
	            {
	            	System.out.printf("score "+score+","+"remaining wrong guess "+live);
	            }
	            else
	            {
	            	 System.out.printf("score "+score+","+"remaining wrong guess "+live+", "+"wrong guessed: "+miss);
	            }
	               
	                System.out.println();
	           
	                
	                char charac = scan.next().charAt(0);
	                if(txt.contains(charac+""))
	                {
	                	for(int count3=0;count3<txt.length();count3++)
	                	{
	                		if(charac==txt.charAt(count3))
	                		{
	                			blank[count3] = String.valueOf(charac);
	                			score = score + 5;
	                			digit++;
	                		}
	                	}
	                	if(digit>1)
	                	{
	                		score = score - 5;
	                	}
	                		digit = 0;
	                }
	                else
	                {
	                	miss = charac;
	                	//System.out.println(miss+" **** ");
	                	live--;
	                }
	                String result = "";
	                
	                for(int count4=0;count4<blank.length;count4++)
	                {
	                	result = result + blank[count4];
	                }
	                	
	                if(txt.equals(result))
	                {
	                	System.out.println("You Win for "+"\""+txt+"\"");
	                	System.out.println("Score :"+score);
	                	for(int count5=0;count5<blank.length;count5++)
	                	{
	                		blank[count5] = "_";
	                	}
	                	txt = "";
	                	live = 5;
	                	miss = ' ';
	                	score = 0;
	                	break;
	                }
	           
		     }
		   
		     if(live==0)
		     {
		       System.out.println("You lose");
		       System.out.println("Answer is "+"\""+txt+"\"");
		       live = 5;
		     }
	    }
	    else if(choose==2)
	    {
	    	System.out.println("Good Bye!!!");
	    }
	    	
		}while(i==1);
					
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}	
		}
		else if(input==4)
		{
			System.out.println("Good Bye ,Don't forget to back.");
		}
		
		
	
	}
}
