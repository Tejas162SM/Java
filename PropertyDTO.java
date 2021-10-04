public class PropertyDTO{

public PropertyDTO(){
System.out.println("Property DTO created");
}
private String ownerName;
private String surveyNum;
private int area;

public String getOwnerName(){
return ownerName;
}
public void setOwnerName(String ownerName){
this.ownerName = ownerName;
}

public String getSurveyNum(){
return surveyNum;
}
public void setSurveyNum(String surveyNum){
this.surveyNum = surveyNum;
}

public int getArea(){
return area;
}
public void setArea(){
this.area = area;
}

}