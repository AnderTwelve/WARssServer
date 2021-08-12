package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rometools.rome.feed.synd.SyndFeed;

@Repository
public interface rssRepository extends JpaRepository<SyndFeed, String>{

}
