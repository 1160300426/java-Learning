package delegation;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {
	List<Course> courses = new ArrayList<>();
	public void add (Course c) {
		courses.add(c);
	}
	public void remove (Course c) {
		courses.remove(c);
	}
}
