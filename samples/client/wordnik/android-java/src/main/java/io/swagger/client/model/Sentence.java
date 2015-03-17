package io.swagger.client.model;

import java.util.*;
import io.swagger.client.model.ScoredWord;

import com.wordnik.swagger.annotations.*;


@ApiModel(description = "")
public class Sentence  { 
  private Boolean hasScoredWords = null;
  private Long id = null;
  
  //public enum idEnum {  }; 
  
  private List<ScoredWord> scoredWords = new ArrayList<ScoredWord>() ;
  private String display = null;
  private Integer rating = null;
  
  //public enum ratingEnum {  }; 
  
  private Long documentMetadataId = null;
  
  //public enum documentMetadataIdEnum {  }; 
  
  
  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Boolean getHasScoredWords() {
    return hasScoredWords;
  }
  public void setHasScoredWords(Boolean hasScoredWords) {
    this.hasScoredWords = hasScoredWords;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public List<ScoredWord> getScoredWords() {
    return scoredWords;
  }
  public void setScoredWords(List<ScoredWord> scoredWords) {
    this.scoredWords = scoredWords;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public String getDisplay() {
    return display;
  }
  public void setDisplay(String display) {
    this.display = display;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Integer getRating() {
    return rating;
  }
  public void setRating(Integer rating) {
    this.rating = rating;
  }

  
  /**
   **/
  @ApiModelProperty(required = false, value = "")
  public Long getDocumentMetadataId() {
    return documentMetadataId;
  }
  public void setDocumentMetadataId(Long documentMetadataId) {
    this.documentMetadataId = documentMetadataId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sentence {\n");
    
    sb.append("  hasScoredWords: ").append(hasScoredWords).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  scoredWords: ").append(scoredWords).append("\n");
    sb.append("  display: ").append(display).append("\n");
    sb.append("  rating: ").append(rating).append("\n");
    sb.append("  documentMetadataId: ").append(documentMetadataId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
