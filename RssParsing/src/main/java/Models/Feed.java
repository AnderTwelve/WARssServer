package Models;

import java.util.List;

import com.rometools.rome.feed.synd.SyndEntry;

public class Feed {
	private String description; 
	private String link; 
	private String title;
	private List<SyndEntry> entries; 
	
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	} 
	
	public List<SyndEntry> getEntries() { 
		return this.entries; 
	}
	
	public void setEntries(List<SyndEntry> entries) { 
		this.entries = entries; 
	}

}
