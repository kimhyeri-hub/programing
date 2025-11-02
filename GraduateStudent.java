package sec02;

public class GraduateStudent extends Student{ //대학원생
	public GraduateStudent(String name) {
	super(name);
  }
	public void computeGrade() {
	if(score>80) 
		grade="통과";
		else
			grade="실패";
	}
}
