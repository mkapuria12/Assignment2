package Collections_assignements;

public class Library implements Comparable<Library>{
	
	Integer lnum,totalBooks;
	 Library(int lnum,int totalBooks) {
	this.lnum=lnum;
	this.totalBooks=totalBooks;
	 }
		public int compareTo(Library obj) {
			return this.lnum.compareTo(obj.lnum);
		}
}
