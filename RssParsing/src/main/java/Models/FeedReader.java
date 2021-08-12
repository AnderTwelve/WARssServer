package Models;

import java.net.URL;
import java.io.InputStreamReader;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

public class FeedReader {

	public void readFeed(String url) { 
		boolean ok = false; 
		try { 	
			URL feedUrl = new URL(url); 
			SyndFeedInput input = new SyndFeedInput(); 
			SyndFeed feed = input.build(new XmlReader(feedUrl)); 
		
			System.out.println(feed); 
			ok = true; 
		} catch (Exception ex) { 
			ex.printStackTrace();
			System.out.println("Brother what the heck"); 
		}
		
		if (!ok) { 
			System.out.println("Incorrect URL"); 
		}
	}

}
