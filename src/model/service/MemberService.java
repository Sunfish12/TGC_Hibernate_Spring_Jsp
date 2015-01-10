package model.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Member;
import model.Interface.MemberDAO_Interface;

public class MemberService {
	private MemberDAO_Interface dao;

	public MemberService() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		// ApplicationContext context = new ClassPathXmlApplicationContext(
		// "model-config2-JndiObjectFactoryBean.xml");
		dao = (MemberDAO_Interface) context.getBean("MemberDAO");
	}

	public boolean addMember(Member bean) {// 註冊會員
		java.util.Date utilDate = java.util.Calendar.getInstance().getTime();
		SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String JoinDate = sdFormat.format(utilDate);
		bean.setJoinDate(java.sql.Timestamp.valueOf(JoinDate));
		dao.insert(bean);
		return true;
	}

	public boolean updateMember(Member bean) {// 會員資料修改
		// 先把舊的資料撈出來
		Member origin = dao.findByPrimeKey(bean.getMemberId());
		// 代表資料庫有資料，才修改不能新增
		if (origin != null) {
			// 不得修改的欄位直接用舊的資料
			bean.setUsername(origin.getUsername());
			bean.setPswd(origin.getPswd());// 改密碼功能另外寫
			bean.setIdCard(origin.getIdCard());
			// 不得為空值的欄位，如果沒有收到輸入值，就塞回舊資料
			if (bean.getEmail() == null) {
				bean.setEmail(origin.getEmail());
			}
			if (bean.getLastname() == null) {
				bean.setLastname(origin.getLastname());
			}
			if (bean.getFirstname() == null) {
				bean.setFirstname(origin.getFirstname());
			}
			dao.update(bean);
			return true;
		}
		return false;
	}

	public boolean deleteMember(Integer memberId) {// 刪除會員
		dao.delete(memberId);
		return true;
	}

	public Member getOneMember(Integer memberId) {// 查詢單筆會員(主鍵-memberId)
		return dao.findByPrimeKey(memberId);
	}

	public List<Member> getOneMember(Member bean) {// 查詢單筆會員(非主鍵(傳bean)-username)
		return dao.findByUsername(bean.getUsername());
	}

	public List<Member> getOneMember(String unknown) {// 模糊查詢會員(非主鍵-unknown)
		return dao.findByUnknown(unknown);
	}

	public List<Member> getAll() {// 查全部
		return dao.getAll();
	}

	public static void main(String[] args) {
		MemberService service = new MemberService();
		// 新增
		// Member bean1 = new Member();
		// bean1.setUsername("pewdiepie");
		// bean1.setPswd("Aa@pdp".getBytes());
		// bean1.setEmail("pewdiepie@gmail.com");
		// bean1.setLastname("皮");
		// bean1.setFirstname("弟派");
		// bean1.setGender("男");
		// bean1.setNickname("PewDiePie");
		// bean1.setBirthday(java.sql.Date.valueOf("1990-10-24"));
		// bean1.setIdCard("A154730489");
		// // 改成系統抓現在時間，請見上面的 addMember()
		// bean1.setJoinDate(java.sql.Date.valueOf("2007-2-28"));
		// bean1.setPhone("0986731905");
		// bean1.setMemberAddress("106台北市大安區復興南路一段390號");
		// String filename1 = "boardgames.jpg";
		// bean1.setImgFileName(filename1);
		// File f = new File("WebContent/res/" + bean1.getImgFileName());
		// try {
		// InputStream is = new FileInputStream(f);
		// ByteArrayOutputStream buffer = new ByteArrayOutputStream();
		// int nRead;
		// byte[] data = new byte[1024];
		// while ((nRead = is.read(data, 0, data.length)) != -1) {
		// buffer.write(data, 0, nRead);
		// buffer.flush();
		// }
		// data = buffer.toByteArray();
		// is.close();
		// bean1.setMemberImage(data);
		// } catch (IOException e) {
		// e.printStackTrace();
		// }
		// service.addMember(bean1);
		// 修改
		// Member bean2 = new Member();
		// bean2.setMemberId(1);// 資料不完全修改
		// service.updateMember(bean2);
		// bean2.setMemberId(1);// 資料全修改
		// bean2.setUsername("qksniper");
		// bean2.setPswd("Cc@qksniper".getBytes());
		// bean2.setEmail("qksniper@gmail.com");
		// bean2.setLastname("Q");
		// bean2.setFirstname("K");
		// bean2.setGender("男");
		// bean2.setNickname("QK");
		// bean2.setBirthday(java.sql.Date.valueOf("1993-8-13"));
		// bean2.setIdCard("A191154952");
		// bean2.setJoinDate(java.sql.Date.valueOf("2009-1-18"));
		// bean2.setPhone("0960636461");
		// bean2.setMemberAddress("106台北市大安區敦化南路一段305號");
		// bean2.setIsGroupBan(true);
		// bean2.setIsCommentBan(true);
		// service.updateMember(bean2);
		// 刪除
		// service.deleteMember(1);
		// 查詢單筆
		// Member b1 = service.getOneMember(1);
		// System.out.println(b1.getUsername());
		// Member member = new Member();
		// member.setUsername("pewdiepie");
		// List<Member> b2 = service.getOneMember(member);
		// for (Member vo : b2) {
		// System.out.println(vo.getUsername());
		// }
		String unknownQuery = "老";
		List<Member> b3 = service.getOneMember(unknownQuery);
		for (Member vo : b3) {
			System.out.println(vo.getNickname());
		}
		// 查詢多筆
		// List<Member> beans = service.getAll();
		// for (Member vo : beans) {
		// System.out.println(vo.getMemberId());
		// System.out.println(vo.getUsername());
		// System.out.println(vo.getNickname());
		// }
	}
}
