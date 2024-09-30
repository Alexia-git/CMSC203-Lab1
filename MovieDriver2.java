import java.util.Scanner;

public class MovieDriver2 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Movie movie = new Movie();
		String answer;
		do 
			{
			System.out.println("Enter the title of the movie");
		
        String title = input.nextLine();
        movie.setTitle(title); 
        System.out.println("Enter the rating of the movie");
        String rating = input.nextLine();
        movie.setRating(rating);
        System.out.println("Enter the number of tickets sold at this movie");
        int ticketsSold = input.nextInt();
        movie.setSoldTickets(ticketsSold);     
        System.out.println(movie.toString());
        input.nextLine();
        System.out.println("Do you want to enter another movie? (y/n): ");
         answer = input.nextLine();
			} 
				while(answer.equalsIgnoreCase("y"));
				System.out.print("Goodbye");
        
		

	}
	
}
