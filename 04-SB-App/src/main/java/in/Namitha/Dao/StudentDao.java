package in.Namitha.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
	public String findName(int id) {
		if (id==100){
			return "kupi";
		}else {
			return "nami";
		}
		
	}

}
