package dao;

import java.util.ArrayList;

import bean.sachbean;



public class sachdao {
	
	   public ArrayList<sachbean> getsach(){
		 ArrayList<sachbean> dssach= new ArrayList<sachbean>();
		   dssach.add(new sachbean("s1", "Cấu trúc dữ liệu", "Nguyễn Hoảng Hà", 100, 100000, "b1.jpg", "tin"));
			dssach.add(new sachbean("s2", "Cấu trúc dữ liệu", "Nguyễn Hoảng Hà", 100, 100000, "b2.jpg", "tin"));
			dssach.add(new sachbean("s3", "Cơ sở toán", "Nguyễn Hoảng Hà", 100, 100000, "b3.jpg", "toan"));
			dssach.add(new sachbean("s4", "Giải tích", "Nguyễn Hoảng Hà", 100, 100000, "b4.jpg", "toan"));
			dssach.add(new sachbean("s5", "Truyền Kiều", "Nguyễn Hoảng Hà", 100, 100000, "b5.jpg", "van"));
			
			return dssach;
	   }
//	   public ArrayList<sachbean> timkiemloai(ArrayList<sachbean> ds, String ml){
//		   ArrayList<sachbean> dstimkiem = new ArrayList<sachbean>();
//		   for (sachbean o : ds) {
//			   if(o.getMaloai().equals(ml)) {
//				   dstimkiem.add(o);
//			   }
//			
//		}
//		   return dstimkiem;
//		   
//		   
//	   }
//	   public ArrayList<sachbean> timkiemteni (ArrayList<sachbean> ds, String ten ){
//		   ArrayList<sachbean> dstimkiem = new ArrayList<sachbean>();
//		   for (sachbean o : ds) {
//			   if (o.getTensach().toLowerCase().trim().contains(ten.toLowerCase().trim())
//						 || o.getMaloai().toLowerCase().trim().contains(ten.toLowerCase().trim())
//						 || o.getTacgia().toLowerCase().trim().contains(ten.toLowerCase().trim())) {
//				   dstimkiem.add(o);
//				}
//		}
//		   return dstimkiem;
//	   }
}
