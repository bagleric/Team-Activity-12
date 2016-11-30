/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socialmedia;

/**
 *
 * @author Eric
 */
public class VideoAdapter implements SocialMediaEntry{
       String author;
       String description;
       int shares;

    public VideoAdapter(){
        author      = "";
        description = "";
        shares      = 0 ;
    
}
        public VideoAdapter(YouTubeVideo theVideo) {
        this.author      = theVideo.getAuthor();
        this.description = theVideo.getTitle()+"," +theVideo.getDescription();
    }
         
       @Override
    public String getUser() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

       @Override
    public String getPostText() {
        return description;
    }

    public void setPostText(String description) {
        this.description = description;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

}
