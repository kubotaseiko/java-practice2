package task8;

import java.util.*;
import org.apache.commons.lang3.builder.*;

public class Book implements Comparable<Book>, Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public int hashCoda() {
		int r = 1;
		r = 31 * publishDate.hashCode();
		r = 31 * title.hashCode();
		return r;
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		if(!publishDate.equals(b.publishDate)) {
			return false;
		}
		if(!title.equals(b.title)) {
			return false;
		}
		return true;
	}

	public int compareTo(Book o) {
		return this.publishDate.compareTo(o.publishDate);
	}

	public Book clone(){
		Book b = new Book();
		b.title = this.title;
		b.comment = this.comment;
		b.publishDate = (Date)this.publishDate.clone();
		return b;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String toString() {
		return this.title;
	}

}
