import java.text.Format;
import java.util.Formatter;

public class APIResponseParser {

	/**
	 * Parses the input text and returns a Book instance containing the parsed
	 * data.
	 * 
	 * @param response
	 *            text to be parsed
	 * @return Book instance containing parsed data
	 */
	public static Book parse(String response) {
		Book book = new Book();
		String endRule = "<";
		
		String startRule = "<title>";
		String imageStartRule = "<image_url>";
		String authorStartRule = "<name>";
		String publicationYearSR = "<original_publication_year type=\"integer\">";
		String avgRateStartRule = "<average_rating>";
		String ratingsCountSRule = "<ratings_count type=\"integer\">";
		
		String title = parse(response, startRule, endRule);
		String imageUrl = parse(response, imageStartRule, endRule);
		String author = parse(response, authorStartRule, endRule);
		String publicationYear = parse(response, publicationYearSR, endRule);
		String averageRating = parse(response,avgRateStartRule, endRule);
		String ratingsCount = parse(response, ratingsCountSRule, endRule).trim().replaceAll(",", "");
		
		//ratingsCount.trim().replaceAll("1,16,315", "0");
		
		System.out.println(ratingsCount);
		
		book.setTitle(title);
		book.setImageUrl(imageUrl);
		book.setAuthor(author);
		book.setPublicationYear(Integer.valueOf(publicationYear));
		book.setAverageRating(Double.valueOf(averageRating));

	
		System.out.println();
		book.setRatingsCount(Integer.valueOf(ratingsCount));

		// Your code
		return book;
	}

	// write overloaded parse method with the 3 parameters response, startRule, endRule
	public static String parse(String response, String startRule, String endRule) {
		String parseValue = null;
		if (response != null && response.contains(startRule)
				&& response.contains(endRule)) {
			int startPosition = response.indexOf(startRule)
					+ startRule.length();
			int endPosition = response.indexOf(endRule, startPosition);
			System.out.println("startPosition: " + startPosition
					+ " endPosition: " + endPosition + " parse: "
					+ response.substring(startPosition, endPosition));
			parseValue = response.substring(startPosition, endPosition);
		}
		return parseValue;
	}
	public static String replaceString(String target, String replacement){
		target.replace(target, replacement);
		return target;
	}

	public static void main(String[] args) {
		String response = "<work>"
				+ "<id type=\"integer\">2361393</id>"
				+ "<books_count type=\"integer\">813</books_count>"
				+ "<ratings_count type=\"integer\">1,16,315</ratings_count>"
				+ "<text_reviews_count type=\"integer\">3439</text_reviews_count>"
				+ "<original_publication_year type=\"integer\">1854</original_publication_year>"
				+ "<original_publication_month type=\"integer\" nil=\"true\"/>"
				+ "<original_publication_day type=\"integer\" nil=\"true\"/>"
				+ "<average_rating>3.79</average_rating>"
				+ "<best_book type=\"Book\">"
				+ "<id type=\"integer\">16902</id>" + "<title>Walden</title>"
				+ "<author>" + "<id type=\"integer\">10264</id>"
				+ "<name>Henry David Thoreau</name>" + "</author>"
				+ "<image_url>"
				+ "http://images.gr-assets.com/books/1465675526m/16902.jpg"
				+ "</image_url>" + "<small_image_url>"
				+ "http://images.gr-assets.com/books/1465675526s/16902.jpg"
				+ "</small_image_url>" + "</best_book>" + "</work>";

		APIResponseParser.parse(response);
	}
}