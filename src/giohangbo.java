import java.util.ArrayList;

import bean.giohangbean;

public class giohangbo {
	public ArrayList<giohangbean>ds= new ArrayList<giohangbean>();
	public void Them(String masach, String tensach, long giasach, long soluong, String anh) {
		for(giohangbean g: ds) {
			if(g.getMasach().equals(masach)) {
				g.setSoluong(soluong+g.getSoluong());
				return;
			}
		}
		ds.add(new giohangbean(masach, tensach, giasach, soluong, anh));
	}
	public long tongtien() {
		long s=0;
		for(giohangbean g: ds) {
			s+=g.getThanhtien();
			}
		return s;
	}
}
