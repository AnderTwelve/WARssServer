package com.Rss.RssParsing.Service;

import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import Models.Feed;
import Repositories.rssRepository;

@Service
public class rssService {
	
	public Feed readFeed(String url) { 
		boolean ok = false; 
		try { 	
			URL feedUrl = new URL(url); 
			SyndFeedInput input = new SyndFeedInput(); 
			SyndFeed feed = input.build(new XmlReader(feedUrl)); 
			
			
			Feed output = new Feed(); 
			output.setDescription(feed.getDescription()); 
			output.setTitle(feed.getTitle()); 
			output.setLink(feed.getLink()); 
			output.setEntries(feed.getEntries());
			
			System.out.println(feed.getEntries()); 
		
			ok = true; 
			
			return output;  
		} catch (Exception ex) { 
			ex.printStackTrace();
			System.out.println(); 
		}
		
		if (!ok) { 
			System.out.println("Incorrect URL"); 
		}
		return null; 
	}

}
