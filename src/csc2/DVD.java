package csc2;

public class DVD {

	private String movie;
	private int year;
	private String genero;
	private double rentalPrice;

	public DVD( String newMovie, int newYear,String newGenero, double newRentalPrice ) {
		
		this.movie=newMovie;
		year= newYear;
		genero=newGenero;
	    rentalPrice=newRentalPrice;
		
	}
	
	public class  DVDlist  {
		DVD f =  new DVD( " Parasite " ,2020 , " Drama ", 6.0) ;
		DVD e =  new DVD( " Toy Story 3", 2010 ," Animation ",5.0) ;
		DVD d =  new DVD( "Mad Max", 2015 ," Action ",3.20 ) ;
		DVD c =  new DVD( " A Quiet Place", 2018, "Horror", 4.0 ) ;
		DVD b =  new DVD( " La La Land", 2016, "Comedy", 5.5) ;
		DVD a =  new DVD( " Amy ",2015,"Musical",4.7 ) ;
		int DVDcount = 6;
		DVDlist dl = new DVDlist();
	}



	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}
	




}


	
