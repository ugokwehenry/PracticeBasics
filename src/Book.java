
public class Book {
String title;
/**
 * @param title
 */
public Book(String title) {
	this.title = title;
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}


@Override
public String toString() {
	return "Book Me [ title =" + title + "]";
}


}
