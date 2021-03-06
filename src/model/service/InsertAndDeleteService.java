package model.service;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import model.Administrator;
import model.GroupRoom_Message;
import model.Interface.AdministratorDAO_Interface;
import model.Interface.GroupRoom_MessageDAO_Interface;
import model.BoardGameKind;
import model.Interface.BoardGameKindDAO_Interface;
import model.BoardGames;
import model.Interface.BoardGamesDAO_Interface;
import model.GroupChoiceGames;
import model.Interface.GroupChoiceGamesDAO_Interface;
import model.GroupRoom;
import model.Interface.GroupRoomDAO_Interface;
import model.GroupRoom_Info;
import model.Interface.GroupRoom_InfoDAO_Interface;
import model.Joiner_Info;
import model.Interface.Joiner_InfoDAO_Interface;
import model.Member;
import model.Interface.MemberDAO_Interface;
import model.Member_FavoredType;
import model.Interface.Member_FavoredTypeDAO_Interface;
import model.RentalTime;
import model.Interface.RentalTimeDAO_Interface;
import model.StoreInformation;
import model.Interface.StoreInformationDAO_Interface;
import model.StoreInformation_Image;
import model.Interface.StoreInformation_ImageDAO_Interface;
import model.StoreMember;
import model.Interface.StoreMemberDAO_Interface;
import model.StoreScore;
import model.Interface.StoreScoreDAO_Interface;
import model.TabuUsernameTable;
import model.Interface.TabuUsernameTableDAO_Interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InsertAndDeleteService {

	public static void main(String[] args) {
		//呼叫DAO		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		MemberDAO_Interface dao = (MemberDAO_Interface) context
				.getBean("MemberDAO");
		
		ApplicationContext context2 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		AdministratorDAO_Interface dao2 = (AdministratorDAO_Interface) context2
				.getBean("AdministratorDAO");
		
		ApplicationContext context3 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		StoreMemberDAO_Interface dao3 = (StoreMemberDAO_Interface) context3
				.getBean("StoreMemberDAO");
		
		ApplicationContext context4 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		Member_FavoredTypeDAO_Interface dao4 = (Member_FavoredTypeDAO_Interface) context4
				.getBean("Member_FavoredTypeDAO");
		
		ApplicationContext context5 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		TabuUsernameTableDAO_Interface dao5 = (TabuUsernameTableDAO_Interface) context5
				.getBean("TabuUsernameTableDAO");
		
		ApplicationContext context6 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		StoreInformationDAO_Interface dao6 = (StoreInformationDAO_Interface) context6
				.getBean("StoreInformationDAO");
		
		ApplicationContext context7 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		StoreInformation_ImageDAO_Interface dao7 = (StoreInformation_ImageDAO_Interface) context7
				.getBean("StoreInformation_ImageDAO");
		
		ApplicationContext context8 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		RentalTimeDAO_Interface dao8 = (RentalTimeDAO_Interface) context8
				.getBean("RentalTimeDAO");
		
		ApplicationContext context9 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		StoreScoreDAO_Interface dao9 = (StoreScoreDAO_Interface) context9
				.getBean("StoreScoreDAO");
		
		ApplicationContext context10 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		BoardGameKindDAO_Interface dao10 = (BoardGameKindDAO_Interface) context10
				.getBean("BoardGameKindDAO");
		
		ApplicationContext context11 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		BoardGamesDAO_Interface dao11 = (BoardGamesDAO_Interface) context11
				.getBean("BoardGamesDAO");
		
		ApplicationContext context13 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		GroupRoomDAO_Interface dao13 = (GroupRoomDAO_Interface) context13
				.getBean("GroupRoomDAO");
		ApplicationContext context14 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		GroupRoom_InfoDAO_Interface dao14 = (GroupRoom_InfoDAO_Interface) context14
				.getBean("GroupRoom_InfoDAO");
		ApplicationContext context15 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		Joiner_InfoDAO_Interface dao15 = (Joiner_InfoDAO_Interface) context15
				.getBean("Joiner_InfoDAO");
		ApplicationContext context16 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		GroupRoom_MessageDAO_Interface dao16 = (GroupRoom_MessageDAO_Interface) context16
				.getBean("GroupRoom_MessageDAO");
		ApplicationContext context17 = new ClassPathXmlApplicationContext(
				"model-config1-DriverManagerDataSource.xml");
		GroupChoiceGamesDAO_Interface dao17 = (GroupChoiceGamesDAO_Interface) context17
				.getBean("GroupChoiceGamesDAO");
		//insert 
		Member beanMember1 = new Member();
		beanMember1.setUsername("pewdiepie");
		beanMember1.setPswd("Aa@pdp".getBytes());
		beanMember1.setEmail("pewdiepie@gmail.com");
		beanMember1.setLastname("皮");
		beanMember1.setFirstname("弟派");
		beanMember1.setGender("男");
		beanMember1.setNickname("あかいつき");
		beanMember1.setBirthday(java.sql.Date.valueOf("1990-10-24"));
		beanMember1.setIdCard("A154730489");
		beanMember1.setJoinDate(java.sql.Date.valueOf("2007-2-28"));
		beanMember1.setPhone("0986731905");
		beanMember1.setMemberAddress("106台北市大安區復興南路一段390號");
		String filenameMember1 = "Member1.gif";
		beanMember1.setImgFileName(filenameMember1);
		File fMember1 = new File("WebContent/res/Member/" + beanMember1.getImgFileName());
		try {
			InputStream isMember1 = new FileInputStream(fMember1);
			ByteArrayOutputStream bufferMember1 = new ByteArrayOutputStream();
			int nReadMember1;
			byte[] dataMember1 = new byte[1024];
			while ((nReadMember1 = isMember1.read(dataMember1, 0, dataMember1.length)) != -1) {
				bufferMember1.write(dataMember1, 0, nReadMember1);
				bufferMember1.flush();
			}
			dataMember1 = bufferMember1.toByteArray();
			isMember1.close();
			beanMember1.setMemberImage(dataMember1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember1);

		Member beanMember2 = new Member();
		beanMember2.setUsername("opchannel");
		beanMember2.setPswd("Bb@op".getBytes());
		beanMember2.setEmail("opchannel@gmail.com");
		beanMember2.setLastname("皮");
		beanMember2.setFirstname("老");
		beanMember2.setGender("男");
		beanMember2.setNickname("老皮");
		beanMember2.setBirthday(java.sql.Date.valueOf("1992-5-6"));
		beanMember2.setIdCard("H189519637");
		beanMember2.setJoinDate(java.sql.Date.valueOf("2007-5-12"));
		beanMember2.setPhone("0924496029");
		beanMember2.setMemberAddress("337桃園縣大園鄉華中街46號");
		String filename2 = "Member2.gif";
		beanMember2.setImgFileName(filename2);
		File fMember2 = new File("WebContent/res/Member/" + beanMember2.getImgFileName());
		try {
			InputStream isMember2 = new FileInputStream(fMember2);
			ByteArrayOutputStream bufferMember2 = new ByteArrayOutputStream();
			int nReadMember2;
			byte[] dataMember2 = new byte[1024];
			while ((nReadMember2 = isMember2.read(dataMember2, 0, dataMember2.length)) != -1) {
				bufferMember2.write(dataMember2, 0, nReadMember2);
				bufferMember2.flush();
			}
			dataMember2 = bufferMember2.toByteArray();
			isMember2.close();
			beanMember2.setMemberImage(dataMember2);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember2);
		
		
		Member beanMember3 = new Member();
		beanMember3.setUsername("qksniper");
		beanMember3.setPswd("Cc@qksniper".getBytes());
		beanMember3.setEmail("qksniper@gmail.com");
		beanMember3.setLastname("Q");
		beanMember3.setFirstname("K");
		beanMember3.setGender("男");
		beanMember3.setNickname("QK");
		beanMember3.setBirthday(java.sql.Date.valueOf("1993-8-13"));
		beanMember3.setIdCard("A191154952");
		beanMember3.setJoinDate(java.sql.Date.valueOf("2009-1-18"));
		beanMember3.setPhone("0960636461");
		beanMember3.setMemberAddress("106台北市大安區敦化南路一段305號");
		String filename3 = "Member3.jpg";
		beanMember3.setImgFileName(filename3);
		File fMember3 = new File("WebContent/res/Member/" + beanMember3.getImgFileName());
		try {
			InputStream isMember3 = new FileInputStream(fMember3);
			ByteArrayOutputStream bufferMember3 = new ByteArrayOutputStream();
			int nReadMember3;
			byte[] dataMember3 = new byte[1024];
			while ((nReadMember3 = isMember3.read(dataMember3, 0, dataMember3.length)) != -1) {
				bufferMember3.write(dataMember3, 0, nReadMember3);
				bufferMember3.flush();
			}
			dataMember3 = bufferMember3.toByteArray();
			isMember3.close();
			beanMember3.setMemberImage(dataMember3);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember3);
		
		
		Member beanMember4 = new Member();
		beanMember4.setUsername("cclearner");
		beanMember4.setPswd("Dd@cclearner".getBytes());
		beanMember4.setEmail("cclearner@gmail.com");
		beanMember4.setLastname("熙");
		beanMember4.setFirstname("熙");
		beanMember4.setGender("女");
		beanMember4.setNickname("CC");
		beanMember4.setBirthday(java.sql.Date.valueOf("1991-6-12"));
		beanMember4.setIdCard("Q298996775");
		beanMember4.setJoinDate(java.sql.Date.valueOf("2015-1-2"));
		beanMember4.setPhone("0989704656");
		beanMember4.setMemberAddress("600嘉義市東區蘭井街163號");
		String filenameMember4 = "Member4.jpg";
		beanMember4.setImgFileName(filenameMember4);
		File fMember4 = new File("WebContent/res/Member/" + beanMember4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember4.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember4);
		
		
		Member beanMember5 = new Member();
		beanMember5.setUsername("steampower");
		beanMember5.setPswd("Ee@steampower".getBytes());
		beanMember5.setEmail("steampower@yahoo.com.tw");
		beanMember5.setLastname("蒸");
		beanMember5.setFirstname("氣力");
		beanMember5.setGender("男");
		beanMember5.setNickname("蒸氣力");
		beanMember5.setBirthday(java.sql.Date.valueOf("1988-10-31"));
		beanMember5.setIdCard("U136615299");
		beanMember5.setJoinDate(java.sql.Date.valueOf("2010-2-17"));
		beanMember5.setPhone("0939012177");
		beanMember5.setMemberAddress("973花蓮縣吉安鄉廣豐路126號");
		String filenameMember5 = "Member5.jpg";
		beanMember5.setImgFileName(filenameMember5);
		File fMember5 = new File("WebContent/res/Member/" + beanMember5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember5.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember5);
		
		
		Member beanMember6 = new Member();
		beanMember6.setUsername("javaprogrammer");
		beanMember6.setPswd("Ff@javaprogrammer".getBytes());
		beanMember6.setEmail("javaporgrammer@gmail.com");
		beanMember6.setLastname("爪");
		beanMember6.setFirstname("哇");
		beanMember6.setGender("男");
		beanMember6.setNickname("Java");
		beanMember6.setBirthday(java.sql.Date.valueOf("1989-3-22"));
		beanMember6.setIdCard("C108699413");
		beanMember6.setJoinDate(java.sql.Date.valueOf("2010-3-3"));
		beanMember6.setPhone("0960229679");
		beanMember6.setMemberAddress("200基隆市仁愛區仁二路216號");
		String filenameMember6 = "Member6.jpg";
		beanMember6.setImgFileName(filenameMember6);
		File fMember6 = new File("WebContent/res/Member/" + beanMember6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember6.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember6);
		
		
		Member beanMember7 = new Member();
		beanMember7.setUsername("bahagamer");
		beanMember7.setPswd("Gg@bahagamer".getBytes());
		beanMember7.setEmail("bahagamer@gmail.com");
		beanMember7.setLastname("巴哈");
		beanMember7.setFirstname("姆特");
		beanMember7.setGender("男");
		beanMember7.setNickname("巴哈");
		beanMember7.setBirthday(java.sql.Date.valueOf("1989-4-10"));
		beanMember7.setIdCard("F182530270");
		beanMember7.setJoinDate(java.sql.Date.valueOf("2011-12-24"));
		beanMember7.setPhone("0952146195");
		beanMember7.setMemberAddress("235新北市中和區立言街60號");
		String filenameMember7 = "Member7.jpg";
		beanMember7.setImgFileName(filenameMember7);
		File fMember7 = new File("WebContent/res/Member/" + beanMember7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember7.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember7);

		
		Member beanMember8 = new Member();
		beanMember8.setUsername("Hicupok");
		beanMember8.setPswd("Hicupok".getBytes());
		beanMember8.setEmail("Hicupok@gmail.com");
		beanMember8.setLastname("蘭");
		beanMember8.setFirstname("中島");
		beanMember8.setGender("女");
		beanMember8.setNickname("蘭");
		beanMember8.setBirthday(java.sql.Date.valueOf("1988-3-23"));
		beanMember8.setIdCard("L276997274");
		beanMember8.setJoinDate(java.sql.Date.valueOf("2012-5-14"));
		beanMember8.setPhone("0928891913");
		beanMember8.setMemberAddress("436台中市清水區中央路41巷16號");
		String filenameMember8 = "Member8.gif";
		beanMember8.setImgFileName(filenameMember8);
		File fMember8 = new File("WebContent/res/Member/" + beanMember8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember8.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember8);
		
		
		Member beanMember9 = new Member();
		beanMember9.setUsername("Wompeat");
		beanMember9.setPswd("Wompeat".getBytes());
		beanMember9.setEmail("Wompeat@gmail.com");
		beanMember9.setLastname("次郎");
		beanMember9.setFirstname("小");
		beanMember9.setGender("女");
		beanMember9.setNickname("佐佐");
		beanMember9.setBirthday(java.sql.Date.valueOf("2005-11-4"));
		beanMember9.setIdCard("A268170313");
		beanMember9.setJoinDate(java.sql.Date.valueOf("2013-6-25"));
		beanMember9.setPhone("0937240788");
		beanMember9.setMemberAddress("106台北市大安區八德路二段10巷35號");
		String filenameMember9 = "Member9.jpg";
		beanMember9.setImgFileName(filenameMember9);
		File fMember9 = new File("WebContent/res/Member/" + beanMember9.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember9);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember9.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember9);
		
		
		Member beanMember10 = new Member();
		beanMember10.setUsername("Condeeng");
		beanMember10.setPswd("Condeeng".getBytes());
		beanMember10.setEmail("Condeeng@gmail.com");
		beanMember10.setLastname("子");
		beanMember10.setFirstname("金");
		beanMember10.setGender("女");
		beanMember10.setNickname("京子");
		beanMember10.setBirthday(java.sql.Date.valueOf("2002-11-27"));
		beanMember10.setIdCard("K294912582");
		beanMember10.setJoinDate(java.sql.Date.valueOf("2013-7-16"));
		beanMember10.setPhone("0923905769");
		beanMember10.setMemberAddress("360苗栗縣苗栗市長安街89巷22號");
		String filenameMember10 = "Member10.jpg";
		beanMember10.setImgFileName(filenameMember10);
		File fMember10 = new File("WebContent/res/Member/" + beanMember10.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember10);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember10.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember10);
		
		
		Member beanMember11 = new Member();
		beanMember11.setUsername("Hismasheight");
		beanMember11.setPswd("Hismasheight".getBytes());
		beanMember11.setEmail("Hismasheight@gmail.com");
		beanMember11.setLastname("奈奈");
		beanMember11.setFirstname("水術");
		beanMember11.setGender("女");
		beanMember11.setNickname("奈奈");
		beanMember11.setBirthday(java.sql.Date.valueOf("2000-11-6"));
		beanMember11.setIdCard("D231251613");
		beanMember11.setJoinDate(java.sql.Date.valueOf("2013-10-14"));
		beanMember11.setPhone("0988855392");
		beanMember11.setMemberAddress("700台南市中西區海安路二段268號");
		String filenameMember11 = "Member11.jpg";
		beanMember11.setImgFileName(filenameMember11);
		File fMember11 = new File("WebContent/res/Member/" + beanMember11.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember11);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember11.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember11);
		
		
		Member beanMember12 = new Member();
		beanMember12.setUsername("Withrect");
		beanMember12.setPswd("Withrect".getBytes());
		beanMember12.setEmail("Withrect@gmail.com");
		beanMember12.setLastname("姬");
		beanMember12.setFirstname("火");
		beanMember12.setGender("女");
		beanMember12.setNickname("姬");
		beanMember12.setBirthday(java.sql.Date.valueOf("1989-4-5"));
		beanMember12.setIdCard("J285596999");
		beanMember12.setJoinDate(java.sql.Date.valueOf("2014-8-25"));
		beanMember12.setPhone("0960326729");
		beanMember12.setMemberAddress("300新竹市香山區中華路四段451巷100號");
		String filenameMember12 = "Member12.jpg";
		beanMember12.setImgFileName(filenameMember12);
		File fMember12 = new File("WebContent/res/Member/" + beanMember12.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember12);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember12.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember12);
		
		
		Member beanMember13 = new Member();
		beanMember13.setUsername("Bract1957");
		beanMember13.setPswd("Bract1957".getBytes());
		beanMember13.setEmail("Bract1957@gmail.com");
		beanMember13.setLastname("光太");
		beanMember13.setFirstname("西山");
		beanMember13.setGender("男");
		beanMember13.setNickname("光太");
		beanMember13.setBirthday(java.sql.Date.valueOf("1989-2-5"));
		beanMember13.setIdCard("J186549616");
		beanMember13.setJoinDate(java.sql.Date.valueOf("2009-5-30"));
		beanMember13.setPhone("0927843616");
		beanMember13.setMemberAddress("300新竹市東區東光路252號");
		String filenameMember13 = "Member13.jpg";
		beanMember13.setImgFileName(filenameMember13);
		File fMember13 = new File("WebContent/res/Member/" + beanMember13.getImgFileName());
		try {
			InputStream is = new FileInputStream(fMember13);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanMember13.setMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao.insert(beanMember13);

		
		
		//insert Administrator
		Administrator beanAdministrator1 = new Administrator();
		beanAdministrator1.setAdminUsername("Admin001");
		beanAdministrator1.setAdminPswd("admin001".getBytes());
		beanAdministrator1.setImgFileName("boardgames.jpg");
		String filenameAdministrator1 = "Administrator1.jpg";
		beanAdministrator1.setImgFileName(filenameAdministrator1);
		File fAdministrator1 = new File("WebContent/res/Administrator/" + beanAdministrator1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fAdministrator1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanAdministrator1.setAdminMemberImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao2.insert(beanAdministrator1);
		
		
		//insert StoreMember
		StoreMember beanStoreMember1 = new StoreMember();
		beanStoreMember1.setStoreUsername("littleworld");
		beanStoreMember1.setStorePswd("Zz#littleworld".getBytes());
		beanStoreMember1.setStoreJoinDate(java.sql.Date.valueOf("2007-6-13"));
		beanStoreMember1.setStorePhone("0920949521");
		String filenameStoreMember1 = "StoreMember1.jpg";
		beanStoreMember1.setImgFileName(filenameStoreMember1);
		File fStoreMember1 = new File("WebContent/res/StoreMember/" + beanStoreMember1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember1.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember1.setStoreEmail("littleworld@gmail.com");
		beanStoreMember1.setStoreWebsite("www.littleworld.com");
		dao3.insert(beanStoreMember1);

		
		StoreMember beanStoreMember2 = new StoreMember();
		beanStoreMember2.setStoreUsername("Hinforms");
		beanStoreMember2.setStorePswd("Hinforms".getBytes());
		beanStoreMember2.setStoreJoinDate(java.sql.Date.valueOf("2007-5-22"));
		beanStoreMember2.setStorePhone("0968190017");
		String filenameStoreMember2 = "StoreMember2.gif";
		beanStoreMember2.setImgFileName(filenameStoreMember2);
		File fStoreMember2 = new File("WebContent/res/StoreMember/" + beanStoreMember2.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember2);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember2.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember2.setStoreEmail("Hinforms@gmail.com");
		beanStoreMember2.setStoreWebsite("www.Hinforms.com");
		dao3.insert(beanStoreMember2);
		
		
		StoreMember beanStoreMember3 = new StoreMember();
		beanStoreMember3.setStoreUsername("Sairing");
		beanStoreMember3.setStorePswd("Sairing".getBytes());
		beanStoreMember3.setStoreJoinDate(java.sql.Date.valueOf("2009-6-11"));
		beanStoreMember3.setStorePhone("0960596493");
		String filenameStoreMember3 = "StoreMember3.jpg";
		beanStoreMember3.setImgFileName(filenameStoreMember3);
		File fStoreMember3 = new File("WebContent/res/StoreMember/" + beanStoreMember3.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember3);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember3.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember3.setStoreEmail("Sairing@gmail.com");
		beanStoreMember3.setStoreWebsite("www.Sairing.com");
		dao3.insert(beanStoreMember3);
		
		
		StoreMember beanStoreMember4 = new StoreMember();
		beanStoreMember4.setStoreUsername("Youggs");
		beanStoreMember4.setStorePswd("Youggs".getBytes());
		beanStoreMember4.setStoreJoinDate(java.sql.Date.valueOf("2014-5-21"));
		beanStoreMember4.setStorePhone("0988868630");
		String filenameStoreMember4 = "StoreMember4.png";
		beanStoreMember4.setImgFileName(filenameStoreMember4);
		File fStoreMember4 = new File("WebContent/res/StoreMember/" + beanStoreMember4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember4.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember4.setStoreEmail("Youggs@gmail.com");
		beanStoreMember4.setStoreWebsite("www.Youggs.com");
		dao3.insert(beanStoreMember4);
		
		
		StoreMember beanStoreMember5 = new StoreMember();
		beanStoreMember5.setStoreUsername("Alung1971");
		beanStoreMember5.setStorePswd("Alung1971".getBytes());
		beanStoreMember5.setStoreJoinDate(java.sql.Date.valueOf("2010-6-17"));
		beanStoreMember5.setStorePhone("0970185923");
		String filenameStoreMember5 = "StoreMember5.gif";
		beanStoreMember5.setImgFileName(filenameStoreMember5);
		File fStoreMember5 = new File("WebContent/res/StoreMember/" + beanStoreMember5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember5.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember5.setStoreEmail("Alung1971@gmail.com");
		beanStoreMember5.setStoreWebsite("www.Alung1971.com");
		dao3.insert(beanStoreMember5);
		
		
		StoreMember beanStoreMember6 = new StoreMember();
		beanStoreMember6.setStoreUsername("Squitteord");
		beanStoreMember6.setStorePswd("Squitteord".getBytes());
		beanStoreMember6.setStoreJoinDate(java.sql.Date.valueOf("2009-9-15"));
		beanStoreMember6.setStorePhone("0928203165");
		String filenameStoreMember6 = "StoreMember6.jpg";
		beanStoreMember6.setImgFileName(filenameStoreMember6);
		File fStoreMember6 = new File("WebContent/res/StoreMember/" + beanStoreMember6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember6.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember6.setStoreEmail("Squitteord@gmail.com");
		beanStoreMember6.setStoreWebsite("www.Squitteord.com");
		dao3.insert(beanStoreMember6);
		
		
		StoreMember beanStoreMember7 = new StoreMember();
		beanStoreMember7.setStoreUsername("Magaized");
		beanStoreMember7.setStorePswd("Magaized".getBytes());
		beanStoreMember7.setStoreJoinDate(java.sql.Date.valueOf("2012-7-19"));
		beanStoreMember7.setStorePhone("0972329006");
		String filenameStoreMember7 = "StoreMember7.jpg";
		beanStoreMember7.setImgFileName(filenameStoreMember7);
		File fStoreMember7 = new File("WebContent/res/StoreMember/" + beanStoreMember7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember7.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember7.setStoreEmail("Magaized@gmail.com");
		beanStoreMember7.setStoreWebsite("www.Magaized.com");
		dao3.insert(beanStoreMember7);
		
		
		StoreMember beanStoreMember8 = new StoreMember();
		beanStoreMember8.setStoreUsername("Ounceephot");
		beanStoreMember8.setStorePswd("Ounceephot".getBytes());
		beanStoreMember8.setStoreJoinDate(java.sql.Date.valueOf("2012-1-11"));
		beanStoreMember8.setStorePhone("0958278786");
		String filenameStoreMember8 = "StoreMember8.jpg";
		beanStoreMember8.setImgFileName(filenameStoreMember8);
		File fStoreMember8 = new File("WebContent/res/StoreMember/" + beanStoreMember8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember8.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember8.setStoreEmail("Ounceephot@gmail.com");
		beanStoreMember8.setStoreWebsite("www.Ounceephot.com");
		dao3.insert(beanStoreMember8);
		
		
		StoreMember beanStoreMember9 = new StoreMember();
		beanStoreMember9.setStoreUsername("Trephis");
		beanStoreMember9.setStorePswd("Trephis".getBytes());
		beanStoreMember9.setStoreJoinDate(java.sql.Date.valueOf("2013-10-10"));
		beanStoreMember9.setStorePhone("0939957399");
		String filenameStoreMember9 = "StoreMember9.jpg";
		beanStoreMember9.setImgFileName(filenameStoreMember9);
		File fStoreMember9 = new File("WebContent/res/StoreMember/" + beanStoreMember9.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember9);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember9.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember9.setStoreEmail("Trephis@gmail.com");
		beanStoreMember9.setStoreWebsite("www.Trephis.com");
		dao3.insert(beanStoreMember9);
		
		
		StoreMember beanStoreMember10 = new StoreMember();
		beanStoreMember10.setStoreUsername("Pribits");
		beanStoreMember10.setStorePswd("Pribits".getBytes());
		beanStoreMember10.setStoreJoinDate(java.sql.Date.valueOf("2012-12-19"));
		beanStoreMember10.setStorePhone("0960642772");
		String filenameStoreMember10 = "StoreMember10.jpg";
		beanStoreMember10.setImgFileName(filenameStoreMember10);
		File fStoreMember10 = new File("WebContent/res/StoreMember/" + beanStoreMember10.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreMember10);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreMember10.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreMember10.setStoreEmail("Pribits@gmail.com");
		beanStoreMember10.setStoreWebsite("www.Pribits.com");
		dao3.insert(beanStoreMember10);
		
		
		//insert MemberFavoredType
		Member_FavoredType beanMember_FavoredType1 = new Member_FavoredType();
		MemberDAO_Interface mdao = (MemberDAO_Interface) context4.getBean("MemberDAO");
		Member mbeanMember_FavoredType1 = mdao.findByPrimeKey(1);
		System.out.println(mbeanMember_FavoredType1.getUsername());
		beanMember_FavoredType1.setMember(mbeanMember_FavoredType1);
		beanMember_FavoredType1.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType1);

		Member_FavoredType beanMember_FavoredType2 = new Member_FavoredType();
		Member mbeanMember_FavoredType2 = mdao.findByPrimeKey(1);
		beanMember_FavoredType2.setMember(mbeanMember_FavoredType2);
		beanMember_FavoredType2.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType2);

		Member_FavoredType beanMember_FavoredType3 = new Member_FavoredType();
		Member mbeanMember_FavoredType3 = mdao.findByPrimeKey(1);
		beanMember_FavoredType3.setMember(mbeanMember_FavoredType3);
		beanMember_FavoredType3.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType3);
		
		Member_FavoredType beanMember_FavoredType4 = new Member_FavoredType();
		Member mbeanMember_FavoredType4 = mdao.findByPrimeKey(2);
		beanMember_FavoredType4.setMember(mbeanMember_FavoredType4);
		beanMember_FavoredType4.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType4);
		
		Member_FavoredType beanMember_FavoredType5 = new Member_FavoredType();
		Member mbeanMember_FavoredType5 = mdao.findByPrimeKey(2);
		beanMember_FavoredType5.setMember(mbeanMember_FavoredType5);
		beanMember_FavoredType5.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType5);
		
		Member_FavoredType beanMember_FavoredType6 = new Member_FavoredType();
		Member mbeanMember_FavoredType6 = mdao.findByPrimeKey(3);
		beanMember_FavoredType6.setMember(mbeanMember_FavoredType6);
		beanMember_FavoredType6.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType6);
		
		Member_FavoredType beanMember_FavoredType7 = new Member_FavoredType();
		Member mbeanMember_FavoredType7 = mdao.findByPrimeKey(4);
		beanMember_FavoredType7.setMember(mbeanMember_FavoredType7);
		beanMember_FavoredType7.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType7);
		
		Member_FavoredType beanMember_FavoredType8 = new Member_FavoredType();
		Member mbeanMember_FavoredType8 = mdao.findByPrimeKey(4);
		beanMember_FavoredType8.setMember(mbeanMember_FavoredType8);
		beanMember_FavoredType8.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType8);
		
		Member_FavoredType beanMember_FavoredType9 = new Member_FavoredType();
		Member mbeanMember_FavoredType9 = mdao.findByPrimeKey(5);
		beanMember_FavoredType9.setMember(mbeanMember_FavoredType9);
		beanMember_FavoredType9.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType9);
		
		Member_FavoredType beanMember_FavoredType10 = new Member_FavoredType();
		Member mbeanMember_FavoredType10 = mdao.findByPrimeKey(6);
		beanMember_FavoredType10.setMember(mbeanMember_FavoredType10);
		beanMember_FavoredType10.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType10);
		
		Member_FavoredType beanMember_FavoredType11 = new Member_FavoredType();
		Member mbeanMember_FavoredType11 = mdao.findByPrimeKey(6);
		beanMember_FavoredType11.setMember(mbeanMember_FavoredType11);
		beanMember_FavoredType11.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType11);
		
		Member_FavoredType beanMember_FavoredType12 = new Member_FavoredType();
		Member mbeanMember_FavoredType12 = mdao.findByPrimeKey(6);
		beanMember_FavoredType12.setMember(mbeanMember_FavoredType12);
		beanMember_FavoredType12.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType12);
		
		Member_FavoredType beanMember_FavoredType13 = new Member_FavoredType();
		Member mbeanMember_FavoredType13 = mdao.findByPrimeKey(7);
		beanMember_FavoredType13.setMember(mbeanMember_FavoredType13);
		beanMember_FavoredType13.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType13);
		
		Member_FavoredType beanMember_FavoredType14 = new Member_FavoredType();
		Member mbeanMember_FavoredType14 = mdao.findByPrimeKey(7);
		beanMember_FavoredType14.setMember(mbeanMember_FavoredType14);
		beanMember_FavoredType14.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType14);
		
		Member_FavoredType beanMember_FavoredType15 = new Member_FavoredType();
		Member mbeanMember_FavoredType15 = mdao.findByPrimeKey(7);
		beanMember_FavoredType15.setMember(mbeanMember_FavoredType15);
		beanMember_FavoredType15.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType15);
		
		Member_FavoredType beanMember_FavoredType16 = new Member_FavoredType();
		Member mbeanMember_FavoredType16 = mdao.findByPrimeKey(8);
		beanMember_FavoredType16.setMember(mbeanMember_FavoredType16);
		beanMember_FavoredType16.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType16);
		
		Member_FavoredType beanMember_FavoredType17 = new Member_FavoredType();
		Member mbeanMember_FavoredType17 = mdao.findByPrimeKey(8);
		beanMember_FavoredType17.setMember(mbeanMember_FavoredType17);
		beanMember_FavoredType17.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType17);
		
		Member_FavoredType beanMember_FavoredType18 = new Member_FavoredType();
		Member mbeanMember_FavoredType18 = mdao.findByPrimeKey(9);
		beanMember_FavoredType18.setMember(mbeanMember_FavoredType18);
		beanMember_FavoredType18.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType18);
		
		Member_FavoredType beanMember_FavoredType19 = new Member_FavoredType();
		Member mbeanMember_FavoredType19 = mdao.findByPrimeKey(10);
		beanMember_FavoredType19.setMember(mbeanMember_FavoredType19);
		beanMember_FavoredType19.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType19);
		
		Member_FavoredType beanMember_FavoredType20 = new Member_FavoredType();
		Member mbeanMember_FavoredType20 = mdao.findByPrimeKey(10);
		beanMember_FavoredType20.setMember(mbeanMember_FavoredType20);
		beanMember_FavoredType20.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType20);
		
		Member_FavoredType beanMember_FavoredType21 = new Member_FavoredType();
		Member mbeanMember_FavoredType21 = mdao.findByPrimeKey(10);
		beanMember_FavoredType21.setMember(mbeanMember_FavoredType21);
		beanMember_FavoredType21.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType21);
		
		Member_FavoredType beanMember_FavoredType22 = new Member_FavoredType();
		Member mbeanMember_FavoredType22 = mdao.findByPrimeKey(11);
		beanMember_FavoredType22.setMember(mbeanMember_FavoredType22);
		beanMember_FavoredType22.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType22);
		
		Member_FavoredType beanMember_FavoredType23 = new Member_FavoredType();
		Member mbeanMember_FavoredType23 = mdao.findByPrimeKey(12);
		beanMember_FavoredType23.setMember(mbeanMember_FavoredType23);
		beanMember_FavoredType23.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType23);
		
		Member_FavoredType beanMember_FavoredType24 = new Member_FavoredType();
		Member mbeanMember_FavoredType24 = mdao.findByPrimeKey(12);
		beanMember_FavoredType24.setMember(mbeanMember_FavoredType24);
		beanMember_FavoredType24.setFavoredType("益智遊戲");
		dao4.insert(beanMember_FavoredType24);
		
		Member_FavoredType beanMember_FavoredType25 = new Member_FavoredType();
		Member mbeanMember_FavoredType25 = mdao.findByPrimeKey(13);
		beanMember_FavoredType25.setMember(mbeanMember_FavoredType25);
		beanMember_FavoredType25.setFavoredType("策略遊戲");
		dao4.insert(beanMember_FavoredType25);
		
		Member_FavoredType beanMember_FavoredType26 = new Member_FavoredType();
		Member mbeanMember_FavoredType26 = mdao.findByPrimeKey(13);
		beanMember_FavoredType26.setMember(mbeanMember_FavoredType26);
		beanMember_FavoredType26.setFavoredType("角色扮演遊戲");
		dao4.insert(beanMember_FavoredType26);
		
		
		//insert TabuUsernameTable
		TabuUsernameTable bean = new TabuUsernameTable();
		Member gubeanTabuUsernameTable1 = dao.findByPrimeKey(7);
		bean.setMemberByTabuMemberId(gubeanTabuUsernameTable1);
		Member gubeanTabuUsernameTable2 = dao.findByPrimeKey(8);
		bean.setMemberByToTabuMemberId(gubeanTabuUsernameTable2);
		bean.setTabuReason("大雄把胖虎重要的東西偷走了");
		dao5.insert(bean);
		
		//insert StoreInformation
		StoreInformation beanStoreInformation1 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation1 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation1 = SMdaoStoreInformation1.findByPrimeKey(1);
		beanStoreInformation1.setStoreMember(smbeanStoreInformation1);
		beanStoreInformation1.setStoreName("瘋桌遊-益智遊戲專賣店(汐止店)");
		beanStoreInformation1.setStoreAddress("新北市汐止區仁愛路160號");
		String filenameStoreInformation1 = "StoreInformation1.jpg";
		beanStoreInformation1.setImgFileName(filenameStoreInformation1);
		File fStoreInformation1 = new File("WebContent/res/StoreInformation/" + beanStoreInformation1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation1.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation1.setStoreTel("(02)2643-8686");
		beanStoreInformation1.setRentAreaCost(120.0);
		beanStoreInformation1.setGroupUpperLimit(50);
		dao6.insert(beanStoreInformation1);
		
		StoreInformation beanStoreInformation2 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation2 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation2 = SMdaoStoreInformation2.findByPrimeKey(1);
		beanStoreInformation2.setStoreMember(smbeanStoreInformation2);
		beanStoreInformation2.setStoreName("瘋桌遊-益智遊戲專賣店(松山店)");
		beanStoreInformation2.setStoreAddress("台北市松山區三民路102巷20號");
		String filenameStoreInformation2 = "StoreInformation2.png";
		beanStoreInformation2.setImgFileName(filenameStoreInformation2);
		File fStoreInformation2 = new File("WebContent/res/StoreInformation/" + beanStoreInformation2.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation2);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation2.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation2.setStoreTel("(02)2528-2765");
		beanStoreInformation2.setRentAreaCost(120.0);
		beanStoreInformation2.setGroupUpperLimit(30);
		dao6.insert(beanStoreInformation2);
		
		StoreInformation beanStoreInformation3 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation3 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation3 = SMdaoStoreInformation3.findByPrimeKey(2);
		beanStoreInformation3.setStoreMember(smbeanStoreInformation3);
		beanStoreInformation3.setStoreName("卡牌屋-台北店");
		beanStoreInformation3.setStoreAddress("台北市開封街一段19號2樓");
		String filenameStoreInformation3 = "StoreInformation3.jpg";
		beanStoreInformation3.setImgFileName(filenameStoreInformation3);
		File fStoreInformation3 = new File("WebContent/res/StoreInformation/" + beanStoreInformation3.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation3);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation3.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation3.setStoreTel("(02)2311-2981");
		beanStoreInformation3.setRentAreaCost(110.0);
		beanStoreInformation3.setGroupUpperLimit(65);
		dao6.insert(beanStoreInformation3);
		
		StoreInformation beanStoreInformation4 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation4 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation4 = SMdaoStoreInformation4.findByPrimeKey(2);
		beanStoreInformation4.setStoreMember(smbeanStoreInformation4);
		beanStoreInformation4.setStoreName("卡牌屋-新竹店");
		beanStoreInformation4.setStoreAddress("新竹市東山街85號");
		String filenameStoreInformation4 = "StoreInformation4.jpg";
		beanStoreInformation4.setImgFileName(filenameStoreInformation4);
		File fStoreInformation4 = new File("WebContent/res/StoreInformation/" + beanStoreInformation4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation4.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation4.setStoreTel("(03)573-4115");
		beanStoreInformation4.setRentAreaCost(100.0);
		beanStoreInformation4.setGroupUpperLimit(120);
		dao6.insert(beanStoreInformation4);
		
		StoreInformation beanStoreInformation5 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation5 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation5 = SMdaoStoreInformation5.findByPrimeKey(3);
		beanStoreInformation5.setStoreMember(smbeanStoreInformation5);
		beanStoreInformation5.setStoreName("艾客米忠孝復興店");
		beanStoreInformation5.setStoreAddress("台北市大安區忠孝東路三段305號9F-1");
		String filenameStoreInformation5 = "StoreInformation5.jpeg";
		beanStoreInformation5.setImgFileName(filenameStoreInformation5);
		File fStoreInformation5 = new File("WebContent/res/StoreInformation/" + beanStoreInformation5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation5.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation5.setStoreTel("(02)2741-9964");
		beanStoreInformation5.setRentAreaCost(130.0);
		beanStoreInformation5.setGroupUpperLimit(60);
		dao6.insert(beanStoreInformation5);
		
		StoreInformation beanStoreInformation6 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation6 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation6 = SMdaoStoreInformation6.findByPrimeKey(4);
		beanStoreInformation6.setStoreMember(smbeanStoreInformation6);
		beanStoreInformation6.setStoreName("艾客米東門店");
		beanStoreInformation6.setStoreAddress("台北市大安區信義路二段 283 號 3F");
		String filenameStoreInformation6 = "StoreInformation6.jpg";
		beanStoreInformation6.setImgFileName(filenameStoreInformation6);
		File fStoreInformation6 = new File("WebContent/res/StoreInformation/" + beanStoreInformation6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation6.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation6.setStoreTel("(02)2393-6050");
		beanStoreInformation6.setRentAreaCost(80.0);
		beanStoreInformation6.setGroupUpperLimit(70);
		dao6.insert(beanStoreInformation6);
		
		StoreInformation beanStoreInformation7 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation7 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation7 = SMdaoStoreInformation7.findByPrimeKey(5);
		beanStoreInformation7.setStoreMember(smbeanStoreInformation7);
		beanStoreInformation7.setStoreName("卡卡城-三重店");
		beanStoreInformation7.setStoreAddress("新北市三重區光興街140號");
		String filenameStoreInformation7 = "StoreInformation7.jpg";
		beanStoreInformation7.setImgFileName(filenameStoreInformation7);
		File fStoreInformation7 = new File("WebContent/res/StoreInformation/" + beanStoreInformation7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation7.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation7.setStoreTel("(02)2970-1593");
		beanStoreInformation7.setRentAreaCost(100.0);
		beanStoreInformation7.setGroupUpperLimit(40);
		dao6.insert(beanStoreInformation7);
		
		StoreInformation beanStoreInformation8 = new StoreInformation();
		StoreMemberDAO_Interface SMdaoStoreInformation8 = (StoreMemberDAO_Interface) context6
				.getBean("StoreMemberDAO");
		StoreMember smbeanStoreInformation8 = SMdaoStoreInformation8.findByPrimeKey(6);
		beanStoreInformation8.setStoreMember(smbeanStoreInformation8);
		beanStoreInformation8.setStoreName("卡卡城-東門店");
		beanStoreInformation8.setStoreAddress("台北市大安區金山南路二段12號4樓之2");
		String filenameStoreInformation8 = "StoreInformation8.jpg";
		beanStoreInformation8.setImgFileName(filenameStoreInformation8);
		File fStoreInformation8 = new File("WebContent/res/StoreInformation/" + beanStoreInformation8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation8.setStoreImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		beanStoreInformation8.setStoreTel("(02)2322-3992");
		beanStoreInformation8.setRentAreaCost(95.0);
		beanStoreInformation8.setGroupUpperLimit(65);
		dao6.insert(beanStoreInformation8);
		
		//insert StoreInformation_Image
		StoreInformation_Image beanStoreInformation_Image1 = new StoreInformation_Image();
		
		StoreInformation sibeanStoreInformation_Image1 = dao6.findByPrimeKey(1);
		beanStoreInformation_Image1.setStoreInformation(sibeanStoreInformation_Image1);
		String filenameStoreInformation_Image1 = "StoreInformation_Image_0101.jpg";
		beanStoreInformation_Image1.setImgFileName(filenameStoreInformation_Image1);
		File fStoreInformation_Image1 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image1.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image1);
		
		StoreInformation_Image beanStoreInformation_Image2 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image2 = dao6.findByPrimeKey(1);
		beanStoreInformation_Image2.setStoreInformation(sibeanStoreInformation_Image2);
		String filenameStoreInformation_Image2 = "StoreInformation_Image_0102.jpg";
		beanStoreInformation_Image2.setImgFileName(filenameStoreInformation_Image2);
		File fStoreInformation_Image2 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image2.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image2);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image2.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image2);
		
		StoreInformation_Image beanStoreInformation_Image3 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image3 = dao6.findByPrimeKey(1);
		beanStoreInformation_Image3.setStoreInformation(sibeanStoreInformation_Image3);
		String filenameStoreInformation_Image3 = "StoreInformation_Image_0103.jpg";
		beanStoreInformation_Image3.setImgFileName(filenameStoreInformation_Image3);
		File fStoreInformation_Image3 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image3.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image3);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image3.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image3);
		
		StoreInformation_Image beanStoreInformation_Image4 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image4 = dao6.findByPrimeKey(1);
		beanStoreInformation_Image4.setStoreInformation(sibeanStoreInformation_Image4);
		String filenameStoreInformation_Image4 = "StoreInformation_Image_0104.jpg";
		beanStoreInformation_Image4.setImgFileName(filenameStoreInformation_Image4);
		File fStoreInformation_Image4 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image4.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image4);
		
		StoreInformation_Image beanStoreInformation_Image5 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image5 = dao6.findByPrimeKey(1);
		beanStoreInformation_Image5.setStoreInformation(sibeanStoreInformation_Image5);
		String filenameStoreInformation_Image5 = "StoreInformation_Image_0105.jpg";
		beanStoreInformation_Image5.setImgFileName(filenameStoreInformation_Image5);
		File fStoreInformation_Image5 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image5.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image5);
		
		StoreInformation_Image beanStoreInformation_Image6 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image6 = dao6.findByPrimeKey(2);
		beanStoreInformation_Image6.setStoreInformation(sibeanStoreInformation_Image6);
		String filenameStoreInformation_Image6 = "StoreInformation_Image_0201.jpg";
		beanStoreInformation_Image6.setImgFileName(filenameStoreInformation_Image6);
		File fStoreInformation_Image6 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image6.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image6);
		
		StoreInformation_Image beanStoreInformation_Image7 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image7 = dao6.findByPrimeKey(2);
		beanStoreInformation_Image7.setStoreInformation(sibeanStoreInformation_Image7);
		String filenameStoreInformation_Image7 = "StoreInformation_Image_0202.jpg";
		beanStoreInformation_Image7.setImgFileName(filenameStoreInformation_Image7);
		File fStoreInformation_Image7 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image7.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image7);
		
		StoreInformation_Image beanStoreInformation_Image8 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image8 = dao6.findByPrimeKey(2);
		beanStoreInformation_Image8.setStoreInformation(sibeanStoreInformation_Image8);
		String filenameStoreInformation_Image8 = "StoreInformation_Image_0203.jpg";
		beanStoreInformation_Image8.setImgFileName(filenameStoreInformation_Image8);
		File fStoreInformation_Image8 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image8.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image8);
		
		StoreInformation_Image beanStoreInformation_Image9 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image9 = dao6.findByPrimeKey(2);
		beanStoreInformation_Image9.setStoreInformation(sibeanStoreInformation_Image9);
		String filenameStoreInformation_Image9 = "StoreInformation_Image_0204.jpg";
		beanStoreInformation_Image9.setImgFileName(filenameStoreInformation_Image9);
		File fStoreInformation_Image9 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image9.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image9);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image9.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image9);
		
		StoreInformation_Image beanStoreInformation_Image10 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image10 = dao6.findByPrimeKey(2);
		beanStoreInformation_Image10.setStoreInformation(sibeanStoreInformation_Image10);
		String filenameStoreInformation_Image10 = "StoreInformation_Image_0205.jpg";
		beanStoreInformation_Image10.setImgFileName(filenameStoreInformation_Image10);
		File fStoreInformation_Image10 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image10.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image10);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image10.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image10);
		
		StoreInformation_Image beanStoreInformation_Image11 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image11 = dao6.findByPrimeKey(3);
		beanStoreInformation_Image11.setStoreInformation(sibeanStoreInformation_Image11);
		String filenameStoreInformation_Image11 = "StoreInformation_Image_0301.jpg";
		beanStoreInformation_Image11.setImgFileName(filenameStoreInformation_Image11);
		File fStoreInformation_Image11 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image11.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image11);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image11.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image11);
		
		StoreInformation_Image beanStoreInformation_Image12 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image12 = dao6.findByPrimeKey(3);
		beanStoreInformation_Image12.setStoreInformation(sibeanStoreInformation_Image12);
		String filenameStoreInformation_Image12 = "StoreInformation_Image_0302.jpg";
		beanStoreInformation_Image12.setImgFileName(filenameStoreInformation_Image12);
		File fStoreInformation_Image12 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image12.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image12);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image12.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image12);
		
		StoreInformation_Image beanStoreInformation_Image13 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image13 = dao6.findByPrimeKey(3);
		beanStoreInformation_Image13.setStoreInformation(sibeanStoreInformation_Image13);
		String filenameStoreInformation_Image13 = "StoreInformation_Image_0303.jpg";
		beanStoreInformation_Image13.setImgFileName(filenameStoreInformation_Image13);
		File fStoreInformation_Image13 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image13.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image13);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image13.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image13);
		
		StoreInformation_Image beanStoreInformation_Image14 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image14 = dao6.findByPrimeKey(3);
		beanStoreInformation_Image14.setStoreInformation(sibeanStoreInformation_Image14);
		String filenameStoreInformation_Image14 = "StoreInformation_Image_0304.jpg";
		beanStoreInformation_Image14.setImgFileName(filenameStoreInformation_Image14);
		File fStoreInformation_Image14 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image14.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image14);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image14.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image14);
		
		StoreInformation_Image beanStoreInformation_Image15 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image15 = dao6.findByPrimeKey(3);
		beanStoreInformation_Image15.setStoreInformation(sibeanStoreInformation_Image15);
		String filenameStoreInformation_Image15 = "StoreInformation_Image_0305.jpg";
		beanStoreInformation_Image15.setImgFileName(filenameStoreInformation_Image15);
		File fStoreInformation_Image15 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image15.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image15);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image15.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image15);
		
		StoreInformation_Image beanStoreInformation_Image16 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image16 = dao6.findByPrimeKey(4);
		beanStoreInformation_Image16.setStoreInformation(sibeanStoreInformation_Image16);
		String filenameStoreInformation_Image16 = "StoreInformation_Image_0401.jpg";
		beanStoreInformation_Image16.setImgFileName(filenameStoreInformation_Image16);
		File fStoreInformation_Image16 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image16.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image16);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image16.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image16);
		
		StoreInformation_Image beanStoreInformation_Image17 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image17 = dao6.findByPrimeKey(4);
		beanStoreInformation_Image17.setStoreInformation(sibeanStoreInformation_Image17);
		String filenameStoreInformation_Image17 = "StoreInformation_Image_0402.jpg";
		beanStoreInformation_Image17.setImgFileName(filenameStoreInformation_Image17);
		File fStoreInformation_Image17 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image17.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image17);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image17.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image17);
		
		StoreInformation_Image beanStoreInformation_Image18 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image18 = dao6.findByPrimeKey(4);
		beanStoreInformation_Image18.setStoreInformation(sibeanStoreInformation_Image18);
		String filenameStoreInformation_Image18 = "StoreInformation_Image_0403.jpg";
		beanStoreInformation_Image18.setImgFileName(filenameStoreInformation_Image18);
		File fStoreInformation_Image18 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image18.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image18);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image18.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image18);
		
		StoreInformation_Image beanStoreInformation_Image19 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image19 = dao6.findByPrimeKey(4);
		beanStoreInformation_Image19.setStoreInformation(sibeanStoreInformation_Image19);
		String filenameStoreInformation_Image19 = "StoreInformation_Image_0404.jpg";
		beanStoreInformation_Image19.setImgFileName(filenameStoreInformation_Image19);
		File fStoreInformation_Image19 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image19.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image19);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image19.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image19);
		
		StoreInformation_Image beanStoreInformation_Image20 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image20 = dao6.findByPrimeKey(4);
		beanStoreInformation_Image20.setStoreInformation(sibeanStoreInformation_Image20);
		String filenameStoreInformation_Image20 = "StoreInformation_Image_0405.jpg";
		beanStoreInformation_Image20.setImgFileName(filenameStoreInformation_Image20);
		File fStoreInformation_Image20 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image20.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image20);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image20.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image20);
		
		StoreInformation_Image beanStoreInformation_Image21 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image21 = dao6.findByPrimeKey(5);
		beanStoreInformation_Image21.setStoreInformation(sibeanStoreInformation_Image21);
		String filenameStoreInformation_Image21 = "StoreInformation_Image_0501.jpg";
		beanStoreInformation_Image21.setImgFileName(filenameStoreInformation_Image21);
		File fStoreInformation_Image21 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image21.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image21);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image21.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image21);
		
		StoreInformation_Image beanStoreInformation_Image22 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image22 = dao6.findByPrimeKey(5);
		beanStoreInformation_Image22.setStoreInformation(sibeanStoreInformation_Image22);
		String filenameStoreInformation_Image22 = "StoreInformation_Image_0502.jpg";
		beanStoreInformation_Image22.setImgFileName(filenameStoreInformation_Image22);
		File fStoreInformation_Image22 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image22.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image22);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image22.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image22);
		
		StoreInformation_Image beanStoreInformation_Image23 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image23 = dao6.findByPrimeKey(5);
		beanStoreInformation_Image23.setStoreInformation(sibeanStoreInformation_Image23);
		String filenameStoreInformation_Image23 = "StoreInformation_Image_0503.jpg";
		beanStoreInformation_Image23.setImgFileName(filenameStoreInformation_Image23);
		File fStoreInformation_Image23 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image23.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image23);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image23.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image23);
		
		StoreInformation_Image beanStoreInformation_Image24 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image24 = dao6.findByPrimeKey(5);
		beanStoreInformation_Image24.setStoreInformation(sibeanStoreInformation_Image24);
		String filenameStoreInformation_Image24 = "StoreInformation_Image_0504.jpg";
		beanStoreInformation_Image24.setImgFileName(filenameStoreInformation_Image24);
		File fStoreInformation_Image24 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image24.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image24);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image24.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image24);
		
		StoreInformation_Image beanStoreInformation_Image25 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image25 = dao6.findByPrimeKey(5);
		beanStoreInformation_Image25.setStoreInformation(sibeanStoreInformation_Image25);
		String filenameStoreInformation_Image25 = "StoreInformation_Image_0505.jpg";
		beanStoreInformation_Image25.setImgFileName(filenameStoreInformation_Image25);
		File fStoreInformation_Image25 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image25.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image25);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image25.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image25);
		
		StoreInformation_Image beanStoreInformation_Image26 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image26 = dao6.findByPrimeKey(6);
		beanStoreInformation_Image26.setStoreInformation(sibeanStoreInformation_Image26);
		String filenameStoreInformation_Image26 = "StoreInformation_Image_0601.jpg";
		beanStoreInformation_Image26.setImgFileName(filenameStoreInformation_Image26);
		File fStoreInformation_Image26 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image26.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image26);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image26.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image26);
		
		StoreInformation_Image beanStoreInformation_Image27 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image27 = dao6.findByPrimeKey(6);
		beanStoreInformation_Image27.setStoreInformation(sibeanStoreInformation_Image27);
		String filenameStoreInformation_Image27 = "StoreInformation_Image_0602.jpg";
		beanStoreInformation_Image27.setImgFileName(filenameStoreInformation_Image27);
		File fStoreInformation_Image27 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image27.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image27);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image27.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image27);
		
		StoreInformation_Image beanStoreInformation_Image28 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image28 = dao6.findByPrimeKey(6);
		beanStoreInformation_Image28.setStoreInformation(sibeanStoreInformation_Image28);
		String filenameStoreInformation_Image28 = "StoreInformation_Image_0603.jpg";
		beanStoreInformation_Image28.setImgFileName(filenameStoreInformation_Image28);
		File fStoreInformation_Image28 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image28.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image28);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image28.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image28);
		
		StoreInformation_Image beanStoreInformation_Image29 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image29 = dao6.findByPrimeKey(6);
		beanStoreInformation_Image29.setStoreInformation(sibeanStoreInformation_Image29);
		String filenameStoreInformation_Image29 = "StoreInformation_Image_0604.jpg";
		beanStoreInformation_Image29.setImgFileName(filenameStoreInformation_Image29);
		File fStoreInformation_Image29 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image29.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image29);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image29.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image29);
		
		StoreInformation_Image beanStoreInformation_Image30 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image30 = dao6.findByPrimeKey(6);
		beanStoreInformation_Image30.setStoreInformation(sibeanStoreInformation_Image30);
		String filenameStoreInformation_Image30 = "StoreInformation_Image_0605.jpg";
		beanStoreInformation_Image30.setImgFileName(filenameStoreInformation_Image30);
		File fStoreInformation_Image30 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image30.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image30);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image30.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image30);
		
		StoreInformation_Image beanStoreInformation_Image31 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image31 = dao6.findByPrimeKey(7);
		beanStoreInformation_Image31.setStoreInformation(sibeanStoreInformation_Image31);
		String filenameStoreInformation_Image31 = "StoreInformation_Image_0701.jpg";
		beanStoreInformation_Image31.setImgFileName(filenameStoreInformation_Image31);
		File fStoreInformation_Image31 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image31.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image31);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image31.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image31);
		
		StoreInformation_Image beanStoreInformation_Image32 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image32 = dao6.findByPrimeKey(7);
		beanStoreInformation_Image32.setStoreInformation(sibeanStoreInformation_Image32);
		String filenameStoreInformation_Image32 = "StoreInformation_Image_0702.jpg";
		beanStoreInformation_Image32.setImgFileName(filenameStoreInformation_Image32);
		File fStoreInformation_Image32 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image32.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image32);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image32.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image32);
		
		StoreInformation_Image beanStoreInformation_Image33 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image33 = dao6.findByPrimeKey(7);
		beanStoreInformation_Image33.setStoreInformation(sibeanStoreInformation_Image33);
		String filenameStoreInformation_Image33 = "StoreInformation_Image_0703.jpg";
		beanStoreInformation_Image33.setImgFileName(filenameStoreInformation_Image33);
		File fStoreInformation_Image33 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image33.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image33);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image33.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image33);
		
		StoreInformation_Image beanStoreInformation_Image34 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image34 = dao6.findByPrimeKey(7);
		beanStoreInformation_Image34.setStoreInformation(sibeanStoreInformation_Image34);
		String filenameStoreInformation_Image34 = "StoreInformation_Image_0704.jpg";
		beanStoreInformation_Image34.setImgFileName(filenameStoreInformation_Image34);
		File fStoreInformation_Image34 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image34.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image34);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image34.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image34);
		
		StoreInformation_Image beanStoreInformation_Image35 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image35 = dao6.findByPrimeKey(7);
		beanStoreInformation_Image35.setStoreInformation(sibeanStoreInformation_Image35);
		String filenameStoreInformation_Image35 = "StoreInformation_Image_0705.jpg";
		beanStoreInformation_Image35.setImgFileName(filenameStoreInformation_Image35);
		File fStoreInformation_Image35 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image35.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image35);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image35.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image35);
		
		StoreInformation_Image beanStoreInformation_Image36 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image36 = dao6.findByPrimeKey(8);
		beanStoreInformation_Image36.setStoreInformation(sibeanStoreInformation_Image36);
		String filenameStoreInformation_Image36 = "StoreInformation_Image_0801.jpg";
		beanStoreInformation_Image36.setImgFileName(filenameStoreInformation_Image36);
		File fStoreInformation_Image36 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image36.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image36);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image36.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image36);
		
		StoreInformation_Image beanStoreInformation_Image37 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image37 = dao6.findByPrimeKey(8);
		beanStoreInformation_Image37.setStoreInformation(sibeanStoreInformation_Image37);
		String filenameStoreInformation_Image37 = "StoreInformation_Image_0802.jpg";
		beanStoreInformation_Image37.setImgFileName(filenameStoreInformation_Image37);
		File fStoreInformation_Image37 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image37.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image37);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image37.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image37);
		
		StoreInformation_Image beanStoreInformation_Image38 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image38 = dao6.findByPrimeKey(8);
		beanStoreInformation_Image38.setStoreInformation(sibeanStoreInformation_Image38);
		String filenameStoreInformation_Image38 = "StoreInformation_Image_0803.jpg";
		beanStoreInformation_Image38.setImgFileName(filenameStoreInformation_Image38);
		File fStoreInformation_Image38 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image38.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image38);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image38.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image38);
		
		StoreInformation_Image beanStoreInformation_Image39 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image39 = dao6.findByPrimeKey(8);
		beanStoreInformation_Image39.setStoreInformation(sibeanStoreInformation_Image39);
		String filenameStoreInformation_Image39 = "StoreInformation_Image_0804.jpg";
		beanStoreInformation_Image39.setImgFileName(filenameStoreInformation_Image39);
		File fStoreInformation_Image39 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image39.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image39);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image39.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image39);
		
		StoreInformation_Image beanStoreInformation_Image40 = new StoreInformation_Image();
		StoreInformation sibeanStoreInformation_Image40 = dao6.findByPrimeKey(8);
		beanStoreInformation_Image40.setStoreInformation(sibeanStoreInformation_Image40);
		String filenameStoreInformation_Image40 = "StoreInformation_Image_0805.jpg";
		beanStoreInformation_Image40.setImgFileName(filenameStoreInformation_Image40);
		File fStoreInformation_Image40 = new File("WebContent/res/StoreInformation_Image/" + beanStoreInformation_Image40.getImgFileName());
		try {
			InputStream is = new FileInputStream(fStoreInformation_Image40);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanStoreInformation_Image40.setAreaImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao7.insert(beanStoreInformation_Image40);
		//insert RentalTime
		
		RentalTime beanRentalTime1 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime1 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime1 = sidaoRentalTime1.findByPrimeKey(1);
		beanRentalTime1.setStoreInformation(sibeanRentalTime1);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd = java.sql.Time.valueOf("22:00:00");
		// 假日
		java.sql.Time holidayStart = java.sql.Time.valueOf("10:00:00");
		java.sql.Time holidayEnd = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime1.setMonStart(weekdayStart);
		beanRentalTime1.setMonEnd(weekdayEnd);
		// 星期二
		beanRentalTime1.setTueStart(null);
		beanRentalTime1.setTueEnd(null);
		// 星期三
		beanRentalTime1.setWedStart(weekdayStart);
		beanRentalTime1.setWedEnd(weekdayEnd);
		// 星期四
		beanRentalTime1.setThuStart(weekdayStart);
		beanRentalTime1.setThuEnd(weekdayEnd);
		// 星期五
		beanRentalTime1.setFriStart(weekdayStart);
		beanRentalTime1.setFriEnd(weekdayEnd);
		// 星期六
		beanRentalTime1.setSatStart(holidayStart);
		beanRentalTime1.setSatEnd(holidayEnd);
		// 星期日
		beanRentalTime1.setSunStart(holidayStart);
		beanRentalTime1.setSunEnd(holidayEnd);
		dao8.insert(beanRentalTime1);
		
		RentalTime beanRentalTime2 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime2 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime2 = sidaoRentalTime2.findByPrimeKey(2);
		beanRentalTime2.setStoreInformation(sibeanRentalTime2);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart2 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd2 = java.sql.Time.valueOf("22:00:00");
		// 假日
		java.sql.Time holidayStart2 = java.sql.Time.valueOf("10:00:00");
		java.sql.Time holidayEnd2 = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime2.setMonStart(weekdayStart2);
		beanRentalTime2.setMonEnd(weekdayEnd2);
		// 星期二
		beanRentalTime2.setTueStart(null);
		beanRentalTime2.setTueEnd(null);
		// 星期三
		beanRentalTime2.setWedStart(weekdayStart2);
		beanRentalTime2.setWedEnd(weekdayEnd2);
		// 星期四
		beanRentalTime2.setThuStart(weekdayStart2);
		beanRentalTime2.setThuEnd(weekdayEnd2);
		// 星期五
		beanRentalTime2.setFriStart(weekdayStart2);
		beanRentalTime2.setFriEnd(weekdayEnd2);
		// 星期六
		beanRentalTime2.setSatStart(holidayStart2);
		beanRentalTime2.setSatEnd(holidayEnd2);
		// 星期日
		beanRentalTime2.setSunStart(holidayStart2);
		beanRentalTime2.setSunEnd(holidayEnd2);
		dao8.insert(beanRentalTime2);
		
		RentalTime beanRentalTime3 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime3 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime3 = sidaoRentalTime3.findByPrimeKey(3);
		beanRentalTime3.setStoreInformation(sibeanRentalTime3);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart3 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd3 = java.sql.Time.valueOf("21:30:00");
		// 假日
		java.sql.Time holidayStart3 = java.sql.Time.valueOf("12:00:00");
		java.sql.Time holidayEnd3 = java.sql.Time.valueOf("21:30:00");
		// 星期一
		beanRentalTime3.setMonStart(weekdayStart3);
		beanRentalTime3.setMonEnd(weekdayEnd3);
		// 星期二
		beanRentalTime3.setTueStart(weekdayStart3);
		beanRentalTime3.setTueEnd(weekdayEnd3);
		// 星期三
		beanRentalTime3.setWedStart(weekdayStart3);
		beanRentalTime3.setWedEnd(weekdayEnd3);
		// 星期四
		beanRentalTime3.setThuStart(weekdayStart3);
		beanRentalTime3.setThuEnd(weekdayEnd3);
		// 星期五
		beanRentalTime3.setFriStart(weekdayStart3);
		beanRentalTime3.setFriEnd(weekdayEnd3);
		// 星期六
		beanRentalTime3.setSatStart(holidayStart3);
		beanRentalTime3.setSatEnd(holidayEnd3);
		// 星期日
		beanRentalTime3.setSunStart(holidayStart3);
		beanRentalTime3.setSunEnd(holidayEnd3);
		dao8.insert(beanRentalTime3);
		
		RentalTime beanRentalTime4 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime4 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime4 = sidaoRentalTime4.findByPrimeKey(4);
		beanRentalTime4.setStoreInformation(sibeanRentalTime4);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart4 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd4 = java.sql.Time.valueOf("21:00:00");
		// 假日
		java.sql.Time holidayStart4 = java.sql.Time.valueOf("12:00:00");
		java.sql.Time holidayEnd4 = java.sql.Time.valueOf("21:00:00");
		// 星期一
		beanRentalTime4.setMonStart(weekdayStart4);
		beanRentalTime4.setMonEnd(weekdayEnd4);
		// 星期二
		beanRentalTime4.setTueStart(null);
		beanRentalTime4.setTueEnd(null);
		// 星期三
		beanRentalTime4.setWedStart(weekdayStart4);
		beanRentalTime4.setWedEnd(weekdayEnd4);
		// 星期四
		beanRentalTime4.setThuStart(weekdayStart4);
		beanRentalTime4.setThuEnd(weekdayEnd4);
		// 星期五
		beanRentalTime4.setFriStart(weekdayStart4);
		beanRentalTime4.setFriEnd(weekdayEnd4);
		// 星期六
		beanRentalTime4.setSatStart(holidayStart4);
		beanRentalTime4.setSatEnd(holidayEnd4);
		// 星期日
		beanRentalTime4.setSunStart(holidayStart4);
		beanRentalTime4.setSunEnd(holidayEnd4);
		dao8.insert(beanRentalTime4);
		
		RentalTime beanRentalTime5 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime5 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime5 = sidaoRentalTime5.findByPrimeKey(5);
		beanRentalTime5.setStoreInformation(sibeanRentalTime5);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart5 = java.sql.Time.valueOf("15:30:00");
		java.sql.Time weekdayEnd5 = java.sql.Time.valueOf("21:30:00");
		java.sql.Time friStart5 = java.sql.Time.valueOf("15:30:00");
		java.sql.Time friEnd5 = java.sql.Time.valueOf("22:30:00");
		// 假日
		java.sql.Time satStart5 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time satEnd5 = java.sql.Time.valueOf("23:00:00");
		java.sql.Time sunStart5 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time sunEnd5 = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime5.setMonStart(weekdayStart5);
		beanRentalTime5.setMonEnd(weekdayEnd5);
		// 星期二
		beanRentalTime5.setTueStart(weekdayStart5);
		beanRentalTime5.setTueEnd(weekdayEnd5);
		// 星期三
		beanRentalTime5.setWedStart(weekdayStart5);
		beanRentalTime5.setWedEnd(weekdayEnd5);
		// 星期四
		beanRentalTime5.setThuStart(weekdayStart5);
		beanRentalTime5.setThuEnd(weekdayEnd5);
		// 星期五
		beanRentalTime5.setFriStart(friStart5);
		beanRentalTime5.setFriEnd(friEnd5);
		// 星期六
		beanRentalTime5.setSatStart(satStart5);
		beanRentalTime5.setSatEnd(satEnd5);
		// 星期日
		beanRentalTime5.setSunStart(sunStart5);
		beanRentalTime5.setSunEnd(sunEnd5);
		dao8.insert(beanRentalTime5);
		
		RentalTime beanRentalTime6 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime6 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime6 = sidaoRentalTime6.findByPrimeKey(6);
		beanRentalTime6.setStoreInformation(sibeanRentalTime6);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart6 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd6 = java.sql.Time.valueOf("21:00:00");
		java.sql.Time friStart6 = java.sql.Time.valueOf("15:30:00");
		java.sql.Time friEnd6 = java.sql.Time.valueOf("22:30:00");
		// 假日
		java.sql.Time satStart6 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time satEnd6 = java.sql.Time.valueOf("23:00:00");
		java.sql.Time sunStart6 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time sunEnd6 = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime6.setMonStart(weekdayStart6);
		beanRentalTime6.setMonEnd(weekdayEnd6);
		// 星期二
		beanRentalTime6.setTueStart(weekdayStart6);
		beanRentalTime6.setTueEnd(weekdayEnd6);
		// 星期三
		beanRentalTime6.setWedStart(weekdayStart6);
		beanRentalTime6.setWedEnd(weekdayEnd6);
		// 星期四
		beanRentalTime6.setThuStart(weekdayStart6);
		beanRentalTime6.setThuEnd(weekdayEnd6);
		// 星期五
		beanRentalTime6.setFriStart(friStart6);
		beanRentalTime6.setFriEnd(friEnd6);
		// 星期六
		beanRentalTime6.setSatStart(satStart6);
		beanRentalTime6.setSatEnd(satEnd6);
		// 星期日
		beanRentalTime6.setSunStart(sunStart6);
		beanRentalTime6.setSunEnd(sunEnd6);
		dao8.insert(beanRentalTime6);
		
		RentalTime beanRentalTime7 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime7 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime7 = sidaoRentalTime7.findByPrimeKey(7);
		beanRentalTime7.setStoreInformation(sibeanRentalTime7);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart7 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time weekdayEnd7 = java.sql.Time.valueOf("22:00:00");
		// 假日
		java.sql.Time holidayStart7 = java.sql.Time.valueOf("10:00:00");
		java.sql.Time holidayEnd7 = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime7.setMonStart(weekdayStart7);
		beanRentalTime7.setMonEnd(weekdayEnd7);
		// 星期二
		beanRentalTime7.setTueStart(null);
		beanRentalTime7.setTueEnd(null);
		// 星期三
		beanRentalTime7.setWedStart(weekdayStart7);
		beanRentalTime7.setWedEnd(weekdayEnd7);
		// 星期四
		beanRentalTime7.setThuStart(weekdayStart7);
		beanRentalTime7.setThuEnd(weekdayEnd7);
		// 星期五
		beanRentalTime7.setFriStart(weekdayStart7);
		beanRentalTime7.setFriEnd(weekdayEnd7);
		// 星期六
		beanRentalTime7.setSatStart(holidayStart7);
		beanRentalTime7.setSatEnd(holidayEnd7);
		// 星期日
		beanRentalTime7.setSunStart(holidayStart7);
		beanRentalTime7.setSunEnd(holidayEnd7);
		dao8.insert(beanRentalTime7);
		
		RentalTime beanRentalTime8 = new RentalTime();
		StoreInformationDAO_Interface sidaoRentalTime8 = (StoreInformationDAO_Interface) context8
				.getBean("StoreInformationDAO");
		StoreInformation sibeanRentalTime8 = sidaoRentalTime8.findByPrimeKey(8);
		beanRentalTime8.setStoreInformation(sibeanRentalTime8);
		// 設定時間
		// 平日
		java.sql.Time weekdayStart8 = java.sql.Time.valueOf("17:00:00");
		java.sql.Time weekdayEnd8 = java.sql.Time.valueOf("22:00:00");
		// 假日
		java.sql.Time holidayStart8 = java.sql.Time.valueOf("13:00:00");
		java.sql.Time holidayEnd8 = java.sql.Time.valueOf("22:00:00");
		// 星期一
		beanRentalTime8.setMonStart(null);
		beanRentalTime8.setMonEnd(null);
		// 星期二
		beanRentalTime8.setTueStart(weekdayStart8);
		beanRentalTime8.setTueEnd(weekdayEnd8);
		// 星期三
		beanRentalTime8.setWedStart(weekdayStart8);
		beanRentalTime8.setWedEnd(weekdayEnd8);
		// 星期四
		beanRentalTime8.setThuStart(weekdayStart8);
		beanRentalTime8.setThuEnd(weekdayEnd8);
		// 星期五
		beanRentalTime8.setFriStart(weekdayStart8);
		beanRentalTime8.setFriEnd(weekdayEnd8);
		// 星期六
		beanRentalTime8.setSatStart(holidayStart8);
		beanRentalTime8.setSatEnd(holidayEnd8);
		// 星期日
		beanRentalTime8.setSunStart(holidayStart8);
		beanRentalTime8.setSunEnd(holidayEnd8);
		dao8.insert(beanRentalTime8);
		
		//storeScore
		StoreScore beanStoreScore1 = new StoreScore();
		Member mbeanStoreScore1 = mdao.findByPrimeKey(1);
		System.out.println(mbeanStoreScore1.getUsername());
		StoreInformation sibeanStoreScore1 = dao6.findByPrimeKey(1);
		beanStoreScore1.setStoreInformation(sibeanStoreScore1);
		beanStoreScore1.setMember(mbeanStoreScore1);
		beanStoreScore1.setStoreScore(8.5);
		beanStoreScore1.setStoreScoreReason("真不錯!!");
		dao9.insert(beanStoreScore1);
		
		StoreScore beanStoreScore2 = new StoreScore();
		Member mbeanStoreScore2 = mdao.findByPrimeKey(2);
		System.out.println(mbeanStoreScore2.getUsername());
		StoreInformation sibeanStoreScore2 = dao6.findByPrimeKey(2);
		beanStoreScore2.setStoreInformation(sibeanStoreScore2);
		beanStoreScore2.setMember(mbeanStoreScore2);
		beanStoreScore2.setStoreScore(9.0);
		beanStoreScore2.setStoreScoreReason("超棒!!!");
		dao9.insert(beanStoreScore2);
		
		StoreScore beanStoreScore3 = new StoreScore();
		Member mbeanStoreScore3 = mdao.findByPrimeKey(3);
		System.out.println(mbeanStoreScore3.getUsername());
		StoreInformation sibeanStoreScore3 = dao6.findByPrimeKey(3);
		beanStoreScore3.setStoreInformation(sibeanStoreScore3);
		beanStoreScore3.setMember(mbeanStoreScore3);
		beanStoreScore3.setStoreScore(8.0);
		beanStoreScore3.setStoreScoreReason("好!");
		dao9.insert(beanStoreScore3);
		
		StoreScore beanStoreScore4 = new StoreScore();
		Member mbeanStoreScore4 = mdao.findByPrimeKey(4);
		System.out.println(mbeanStoreScore4.getUsername());
		StoreInformation sibeanStoreScore4 = dao6.findByPrimeKey(4);
		beanStoreScore4.setStoreInformation(sibeanStoreScore4);
		beanStoreScore4.setMember(mbeanStoreScore4);
		beanStoreScore4.setStoreScore(8.0);
		beanStoreScore4.setStoreScoreReason("好!");
		dao9.insert(beanStoreScore4);
		
		StoreScore beanStoreScore5 = new StoreScore();
		Member mbeanStoreScore5 = mdao.findByPrimeKey(5);
		System.out.println(mbeanStoreScore5.getUsername());
		StoreInformation sibeanStoreScore5 = dao6.findByPrimeKey(5);
		beanStoreScore5.setStoreInformation(sibeanStoreScore5);
		beanStoreScore5.setMember(mbeanStoreScore5);
		beanStoreScore5.setStoreScore(8.5);
		beanStoreScore5.setStoreScoreReason("真不錯!!");
		dao9.insert(beanStoreScore5);
		
		StoreScore beanStoreScore6 = new StoreScore();
		Member mbeanStoreScore6 = mdao.findByPrimeKey(6);
		System.out.println(mbeanStoreScore6.getUsername());
		StoreInformation sibeanStoreScore6 = dao6.findByPrimeKey(6);
		beanStoreScore6.setStoreInformation(sibeanStoreScore6);
		beanStoreScore6.setMember(mbeanStoreScore6);
		beanStoreScore6.setStoreScore(8.0);
		beanStoreScore6.setStoreScoreReason("好!");
		dao9.insert(beanStoreScore6);
		
		StoreScore beanStoreScore7 = new StoreScore();
		Member mbeanStoreScore7 = mdao.findByPrimeKey(7);
		System.out.println(mbeanStoreScore7.getUsername());
		StoreInformation sibeanStoreScore7 = dao6.findByPrimeKey(7);
		beanStoreScore7.setStoreInformation(sibeanStoreScore7);
		beanStoreScore7.setMember(mbeanStoreScore7);
		beanStoreScore7.setStoreScore(8.0);
		beanStoreScore7.setStoreScoreReason("好!");
		dao9.insert(beanStoreScore7);
		
		StoreScore beanStoreScore8 = new StoreScore();
		Member mbeanStoreScore8 = mdao.findByPrimeKey(8);
		System.out.println(mbeanStoreScore8.getUsername());
		StoreInformation sibeanStoreScore8 = dao6.findByPrimeKey(8);
		beanStoreScore8.setStoreInformation(sibeanStoreScore8);
		beanStoreScore8.setMember(mbeanStoreScore8);
		beanStoreScore8.setStoreScore(9.0);
		beanStoreScore8.setStoreScoreReason("超棒!!!");
		dao9.insert(beanStoreScore8);
		
		//select boardgamekind
		BoardGameKind beanboardgamekind1 = new BoardGameKind();
		beanboardgamekind1.setBoardGameSerialNumber(1);
		beanboardgamekind1.setBoardGameStyle("策略遊戲");
		dao10.insert(beanboardgamekind1);

		BoardGameKind beanboardgamekind2 = new BoardGameKind();
		beanboardgamekind2.setBoardGameSerialNumber(2);
		beanboardgamekind2.setBoardGameStyle("益智遊戲");
		dao10.insert(beanboardgamekind2);

		BoardGameKind beanboardgamekind3 = new BoardGameKind();
		beanboardgamekind3.setBoardGameSerialNumber(3);
		beanboardgamekind3.setBoardGameStyle("推理遊戲");
		dao10.insert(beanboardgamekind3);

		BoardGameKind beanboardgamekind4 = new BoardGameKind();
		beanboardgamekind4.setBoardGameSerialNumber(4);
		beanboardgamekind4.setBoardGameStyle("角色扮演遊戲");
		dao10.insert(beanboardgamekind4);

		BoardGameKind beanboardgamekind5 = new BoardGameKind();
		beanboardgamekind5.setBoardGameSerialNumber(5);
		beanboardgamekind5.setBoardGameStyle("小品遊戲");
		dao10.insert(beanboardgamekind5);
		
		//select boardGames
	
		//select BoardGamesImage
		
		//select GroupRoom
		GroupRoom beanGroupRoom1 = new GroupRoom();
		StoreMember smbeanGroupRoom1 = dao3.findByPrimeKey(1);
		beanGroupRoom1.setStoreMember(smbeanGroupRoom1);
		Member mbeanGroupRoom1 = dao.findByPrimeKey(1);
		beanGroupRoom1.setMember(mbeanGroupRoom1);
		StoreInformation sibeanGroupRoom1 = dao6.findByPrimeKey(1);
		beanGroupRoom1.setStoreName(sibeanGroupRoom1.getStoreName());
		beanGroupRoom1.setGroupStartTime(java.sql.Date.valueOf("2014-12-24"));
		beanGroupRoom1.setGroupEndTime(java.sql.Date.valueOf("2014-12-31"));
		beanGroupRoom1.setGroupRoomName("一起打桌遊八!");
		beanGroupRoom1.setGroupSuggestNumber("6-15");
		beanGroupRoom1.setGroupLowerLimit(6);
		beanGroupRoom1.setGroupUpperLimit(15);
		beanGroupRoom1.setGroupGameTime(java.sql.Time.valueOf("03:00:00"));
		beanGroupRoom1.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2015-1-1 13:00:00"));
		beanGroupRoom1.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2015-1-1 16:00:00"));
		beanGroupRoom1.setRoomState(0);
		String filenameGroupRoom1 = "GroupRoom1.jpg";
		beanGroupRoom1.setImgFileName(filenameGroupRoom1);
		File fGroupRoom1 = new File("WebContent/res/GroupRoom/" + beanGroupRoom1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom1.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom1);
		
		GroupRoom beanGroupRoom2 = new GroupRoom();
		StoreMember smbeanGroupRoom2 = dao3.findByPrimeKey(2);
		beanGroupRoom2.setStoreMember(smbeanGroupRoom2);
		Member mbeanGroupRoom2 = dao.findByPrimeKey(2);
		beanGroupRoom2.setMember(mbeanGroupRoom2);
		StoreInformation sibeanGroupRoom2 = dao6.findByPrimeKey(2);
		beanGroupRoom2.setStoreName(sibeanGroupRoom2.getStoreName());
		beanGroupRoom2.setGroupStartTime(java.sql.Date.valueOf("2014-1-1"));
		beanGroupRoom2.setGroupEndTime(java.sql.Date.valueOf("2014-1-8"));
		beanGroupRoom2.setGroupRoomName("來打桌遊");
		beanGroupRoom2.setGroupSuggestNumber("4-10");
		beanGroupRoom2.setGroupLowerLimit(4);
		beanGroupRoom2.setGroupUpperLimit(10);
		beanGroupRoom2.setGroupGameTime(java.sql.Time.valueOf("02:00:00"));
		beanGroupRoom2.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2015-1-10 14:00:00"));
		beanGroupRoom2.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2015-1-10 16:00:00"));
		beanGroupRoom2.setRoomState(0);
		String filenameGroupRoom2 = "GroupRoom2.jpg";
		beanGroupRoom2.setImgFileName(filenameGroupRoom2);
		File fGroupRoom2 = new File("WebContent/res/GroupRoom/" + beanGroupRoom2.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom2);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom2.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom2);
		
		
		GroupRoom beanGroupRoom3 = new GroupRoom();
		StoreMember smbeanGroupRoom3 = dao3.findByPrimeKey(3);
		beanGroupRoom3.setStoreMember(smbeanGroupRoom3);
		Member mbeanGroupRoom3 = dao.findByPrimeKey(3);
		beanGroupRoom3.setMember(mbeanGroupRoom3);
		StoreInformation sibeanGroupRoom3 = dao6.findByPrimeKey(3);
		beanGroupRoom3.setStoreName(sibeanGroupRoom3.getStoreName());
		beanGroupRoom3.setGroupStartTime(java.sql.Date.valueOf("2014-11-28"));
		beanGroupRoom3.setGroupEndTime(java.sql.Date.valueOf("2014-12-5"));
		beanGroupRoom3.setGroupRoomName("GO桌遊");
		beanGroupRoom3.setGroupSuggestNumber("4-12");
		beanGroupRoom3.setGroupLowerLimit(4);
		beanGroupRoom3.setGroupUpperLimit(12);
		beanGroupRoom3.setGroupGameTime(java.sql.Time.valueOf("03:00:00"));
		beanGroupRoom3.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2014-12-6 15:00:00"));
		beanGroupRoom3.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2014-12-6 18:00:00"));
		beanGroupRoom3.setRoomState(0);
		String filenameGroupRoom3 = "GroupRoom3.jpg";
		beanGroupRoom3.setImgFileName(filenameGroupRoom3);
		File fGroupRoom3 = new File("WebContent/res/GroupRoom/" + beanGroupRoom3.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom3);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom3.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom3);
		
		GroupRoom beanGroupRoom4 = new GroupRoom();
		StoreMember smbeanGroupRoom4 = dao3.findByPrimeKey(4);
		beanGroupRoom4.setStoreMember(smbeanGroupRoom4);
		Member mbeanGroupRoom4 = dao.findByPrimeKey(4);
		beanGroupRoom4.setMember(mbeanGroupRoom4);
		StoreInformation sibeanGroupRoom4 = dao6.findByPrimeKey(4);
		beanGroupRoom4.setStoreName(sibeanGroupRoom4.getStoreName());
		beanGroupRoom4.setGroupStartTime(java.sql.Date.valueOf("2014-12-8"));
		beanGroupRoom4.setGroupEndTime(java.sql.Date.valueOf("2014-12-12"));
		beanGroupRoom4.setGroupRoomName("D&D團");
		beanGroupRoom4.setGroupSuggestNumber("5-10");
		beanGroupRoom4.setGroupLowerLimit(5);
		beanGroupRoom4.setGroupUpperLimit(10);
		beanGroupRoom4.setGroupGameTime(java.sql.Time.valueOf("02:00:00"));
		beanGroupRoom4.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2014-12-13 13:00:00"));
		beanGroupRoom4.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2014-12-13 15:00:00"));
		beanGroupRoom4.setRoomState(0);
		String filenameGroupRoom4 = "GroupRoom4.jpg";
		beanGroupRoom4.setImgFileName(filenameGroupRoom4);
		File fGroupRoom4 = new File("WebContent/res/GroupRoom/" + beanGroupRoom4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom4.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom4);
		
		GroupRoom beanGroupRoom5 = new GroupRoom();
		StoreMember smbeanGroupRoom5 = dao3.findByPrimeKey(5);
		beanGroupRoom5.setStoreMember(smbeanGroupRoom5);
		Member mbeanGroupRoom5 = dao.findByPrimeKey(5);
		beanGroupRoom5.setMember(mbeanGroupRoom5);
		StoreInformation sibeanGroupRoom5 = dao6.findByPrimeKey(5);
		beanGroupRoom5.setStoreName(sibeanGroupRoom5.getStoreName());
		beanGroupRoom5.setGroupStartTime(java.sql.Date.valueOf("2014-9-24"));
		beanGroupRoom5.setGroupEndTime(java.sql.Date.valueOf("2014-10-1"));
		beanGroupRoom5.setGroupRoomName("桌遊FUN");
		beanGroupRoom5.setGroupSuggestNumber("8-12");
		beanGroupRoom5.setGroupLowerLimit(8);
		beanGroupRoom5.setGroupUpperLimit(12);
		beanGroupRoom5.setGroupGameTime(java.sql.Time.valueOf("02:00:00"));
		beanGroupRoom5.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2014-10-4 14:00:00"));
		beanGroupRoom5.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2014-10-4 16:00:00"));
		beanGroupRoom5.setRoomState(0);
		String filenameGroupRoom5 = "GroupRoom5.jpg";
		beanGroupRoom5.setImgFileName(filenameGroupRoom5);
		File fGroupRoom5 = new File("WebContent/res/GroupRoom/" + beanGroupRoom5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom5.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom5);
		
		
		GroupRoom beanGroupRoom6 = new GroupRoom();
		StoreMember smbeanGroupRoom6 = dao3.findByPrimeKey(6);
		beanGroupRoom6.setStoreMember(smbeanGroupRoom6);
		Member mbeanGroupRoom6 = dao.findByPrimeKey(6);
		beanGroupRoom6.setMember(mbeanGroupRoom6);
		StoreInformation sibeanGroupRoom6 = dao6.findByPrimeKey(6);
		beanGroupRoom6.setStoreName(sibeanGroupRoom6.getStoreName());
		beanGroupRoom6.setGroupStartTime(java.sql.Date.valueOf("2014-12-1"));
		beanGroupRoom6.setGroupEndTime(java.sql.Date.valueOf("2014-12-8"));
		beanGroupRoom6.setGroupRoomName("新桌遊組團玩");
		beanGroupRoom6.setGroupSuggestNumber("10-14");
		beanGroupRoom6.setGroupLowerLimit(10);
		beanGroupRoom6.setGroupUpperLimit(14);
		beanGroupRoom6.setGroupGameTime(java.sql.Time.valueOf("02:00:00"));
		beanGroupRoom6.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2014-12-13 13:00:00"));
		beanGroupRoom6.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2014-12-13 15:00:00"));
		beanGroupRoom6.setRoomState(0);
		String filenameGroupRoom6 = "GroupRoom6.jpg";
		beanGroupRoom6.setImgFileName(filenameGroupRoom6);
		File fGroupRoom6 = new File("WebContent/res/GroupRoom/" + beanGroupRoom6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom6.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom6);
		
		GroupRoom beanGroupRoom7 = new GroupRoom();
		StoreMember smbeanGroupRoom7 = dao3.findByPrimeKey(7);
		beanGroupRoom7.setStoreMember(smbeanGroupRoom7);
		Member mbeanGroupRoom7 = dao.findByPrimeKey(7);
		beanGroupRoom7.setMember(mbeanGroupRoom7);
		StoreInformation sibeanGroupRoom7 = dao6.findByPrimeKey(7);
		beanGroupRoom7.setStoreName(sibeanGroupRoom7.getStoreName());
		beanGroupRoom7.setGroupStartTime(java.sql.Date.valueOf("2015-1-2"));
		beanGroupRoom7.setGroupEndTime(java.sql.Date.valueOf("2015-1-9"));
		beanGroupRoom7.setGroupRoomName("就是愛桌遊");
		beanGroupRoom7.setGroupSuggestNumber("6-14");
		beanGroupRoom7.setGroupLowerLimit(6);
		beanGroupRoom7.setGroupUpperLimit(14);
		beanGroupRoom7.setGroupGameTime(java.sql.Time.valueOf("03:00:00"));
		beanGroupRoom7.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2015-1-10 16:00:00"));
		beanGroupRoom7.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2015-1-10 19:00:00"));
		beanGroupRoom7.setRoomState(0);
		String filenameGroupRoom7 = "GroupRoom7.png";
		beanGroupRoom7.setImgFileName(filenameGroupRoom7);
		File fGroupRoom7 = new File("WebContent/res/GroupRoom/" + beanGroupRoom7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom7.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom7);
		
		GroupRoom beanGroupRoom8 = new GroupRoom();
		StoreMember smbeanGroupRoom8 = dao3.findByPrimeKey(8);
		beanGroupRoom8.setStoreMember(smbeanGroupRoom8);
		Member mbeanGroupRoom8 = dao.findByPrimeKey(8);
		beanGroupRoom8.setMember(mbeanGroupRoom8);
		StoreInformation sibeanGroupRoom8 = dao6.findByPrimeKey(8);
		beanGroupRoom8.setStoreName(sibeanGroupRoom8.getStoreName());
		beanGroupRoom8.setGroupStartTime(java.sql.Date.valueOf("2014-12-19"));
		beanGroupRoom8.setGroupEndTime(java.sql.Date.valueOf("2014-12-26"));
		beanGroupRoom8.setGroupRoomName("Play Fun ~");
		beanGroupRoom8.setGroupSuggestNumber("4-8");
		beanGroupRoom8.setGroupLowerLimit(4);
		beanGroupRoom8.setGroupUpperLimit(8);
		beanGroupRoom8.setGroupGameTime(java.sql.Time.valueOf("01:00:00"));
		beanGroupRoom8.setReserveGroupStartTime(java.sql.Timestamp
				.valueOf("2014-12-27 17:00:00"));
		beanGroupRoom8.setReserveGroupEndTime(java.sql.Timestamp
				.valueOf("2014-12-27 18:00:00"));
		beanGroupRoom8.setRoomState(0);
		String filenameGroupRoom8 = "GroupRoom8.jpg";
		beanGroupRoom8.setImgFileName(filenameGroupRoom8);
		File fGroupRoom8 = new File("WebContent/res/GroupRoom/" + beanGroupRoom8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom8.setPrivateGroupImage(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao13.insert(beanGroupRoom8);

		//insert GroupRoomInfo
		GroupRoom_Info beanGroupRoom_Info1 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info1 = dao13.findByPrimeKey(1);
		
		beanGroupRoom_Info1.setGroupRoom(grbeanGroupRoom_Info1);
		
		String filenameGroupRoom_Info1 = "GroupRoomInfo_0101.jpg";
		beanGroupRoom_Info1.setImgFileName(filenameGroupRoom_Info1);
		File fGroupRoom_Info1 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info1.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info1);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info1.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info1);
		
		GroupRoom_Info beanGroupRoom_Info2 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info2 = dao13.findByPrimeKey(1);
		beanGroupRoom_Info2.setGroupRoom(grbeanGroupRoom_Info2);
		String filenameGroupRoom_Info2 = "GroupRoomInfo_0102.jpg";
		beanGroupRoom_Info2.setImgFileName(filenameGroupRoom_Info2);
		File fGroupRoom_Info2 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info2.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info2);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info2.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info2);
		
		GroupRoom_Info beanGroupRoom_Info3 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info3 = dao13.findByPrimeKey(1);
		beanGroupRoom_Info3.setGroupRoom(grbeanGroupRoom_Info3);
		String filenameGroupRoom_Info3 = "GroupRoomInfo_0103.jpg";
		beanGroupRoom_Info3.setImgFileName(filenameGroupRoom_Info3);
		File fGroupRoom_Info3 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info3.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info3);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info3.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info3);
		
		GroupRoom_Info beanGroupRoom_Info4 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info4 = dao13.findByPrimeKey(2);
		beanGroupRoom_Info4.setGroupRoom(grbeanGroupRoom_Info4);
		String filenameGroupRoom_Info4 = "GroupRoomInfo_0201.jpg";
		beanGroupRoom_Info4.setImgFileName(filenameGroupRoom_Info4);
		File fGroupRoom_Info4 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info4.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info4);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info4.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info4);
		
		GroupRoom_Info beanGroupRoom_Info5 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info5 = dao13.findByPrimeKey(2);
		beanGroupRoom_Info5.setGroupRoom(grbeanGroupRoom_Info5);
		String filenameGroupRoom_Info5 = "GroupRoomInfo_0202.jpg";
		beanGroupRoom_Info5.setImgFileName(filenameGroupRoom_Info5);
		File fGroupRoom_Info5 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info5.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info5);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info5.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info5);
		
		GroupRoom_Info beanGroupRoom_Info6 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info6 = dao13.findByPrimeKey(2);
		beanGroupRoom_Info6.setGroupRoom(grbeanGroupRoom_Info6);
		String filenameGroupRoom_Info6 = "GroupRoomInfo_0203.jpg";
		beanGroupRoom_Info6.setImgFileName(filenameGroupRoom_Info6);
		File fGroupRoom_Info6 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info6.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info6);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info6.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info6);
		
		GroupRoom_Info beanGroupRoom_Info7 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info7 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info7.setGroupRoom(grbeanGroupRoom_Info7);
		String filenameGroupRoom_Info7 = "GroupRoomInfo_0301.jpg";
		beanGroupRoom_Info7.setImgFileName(filenameGroupRoom_Info7);
		File fGroupRoom_Info7 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info7.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info7);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info7.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info7);
		
		GroupRoom_Info beanGroupRoom_Info8 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info8 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info8.setGroupRoom(grbeanGroupRoom_Info8);
		String filenameGroupRoom_Info8 = "GroupRoomInfo_0302.jpg";
		beanGroupRoom_Info8.setImgFileName(filenameGroupRoom_Info8);
		File fGroupRoom_Info8 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info8.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info8);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info8.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info8);
		
		GroupRoom_Info beanGroupRoom_Info9 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info9 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info9.setGroupRoom(grbeanGroupRoom_Info9);
		String filenameGroupRoom_Info9 = "GroupRoomInfo_0303.jpg";
		beanGroupRoom_Info9.setImgFileName(filenameGroupRoom_Info9);
		File fGroupRoom_Info9 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info9.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info9);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info9.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info9);
		
		GroupRoom_Info beanGroupRoom_Info10 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info10 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info10.setGroupRoom(grbeanGroupRoom_Info10);
		String filenameGroupRoom_Info10 = "GroupRoomInfo_0304.jpg";
		beanGroupRoom_Info10.setImgFileName(filenameGroupRoom_Info10);
		File fGroupRoom_Info10 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info10.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info10);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info10.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info10);
		
		GroupRoom_Info beanGroupRoom_Info11 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info11 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info11.setGroupRoom(grbeanGroupRoom_Info11);
		String filenameGroupRoom_Info11 = "GroupRoomInfo_0305.jpg";
		beanGroupRoom_Info11.setImgFileName(filenameGroupRoom_Info11);
		File fGroupRoom_Info11 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info11.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info11);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info11.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info11);
		
		GroupRoom_Info beanGroupRoom_Info12 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info12 = dao13.findByPrimeKey(3);
		beanGroupRoom_Info12.setGroupRoom(grbeanGroupRoom_Info12);
		String filenameGroupRoom_Info12 = "GroupRoomInfo_0306.jpg";
		beanGroupRoom_Info12.setImgFileName(filenameGroupRoom_Info12);
		File fGroupRoom_Info12 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info12.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info12);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info12.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info12);
		
		GroupRoom_Info beanGroupRoom_Info13 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info13 = dao13.findByPrimeKey(4);
		beanGroupRoom_Info13.setGroupRoom(grbeanGroupRoom_Info13);
		String filenameGroupRoom_Info13 = "GroupRoomInfo_0401.jpg";
		beanGroupRoom_Info13.setImgFileName(filenameGroupRoom_Info13);
		File fGroupRoom_Info13 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info13.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info13);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info13.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info13);
		
		GroupRoom_Info beanGroupRoom_Info14 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info14 = dao13.findByPrimeKey(4);
		beanGroupRoom_Info14.setGroupRoom(grbeanGroupRoom_Info14);
		String filenameGroupRoom_Info14 = "GroupRoomInfo_0402.jpg";
		beanGroupRoom_Info14.setImgFileName(filenameGroupRoom_Info14);
		File fGroupRoom_Info14 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info14.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info14);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info14.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info14);
		
		GroupRoom_Info beanGroupRoom_Info15 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info15 = dao13.findByPrimeKey(4);
		beanGroupRoom_Info15.setGroupRoom(grbeanGroupRoom_Info15);
		String filenameGroupRoom_Info15 = "GroupRoomInfo_0403.jpg";
		beanGroupRoom_Info15.setImgFileName(filenameGroupRoom_Info15);
		File fGroupRoom_Info15 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info15.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info15);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info15.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info15);
		
		GroupRoom_Info beanGroupRoom_Info16 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info16 = dao13.findByPrimeKey(4);
		beanGroupRoom_Info16.setGroupRoom(grbeanGroupRoom_Info16);
		String filenameGroupRoom_Info16 = "GroupRoomInfo_0404.jpg";
		beanGroupRoom_Info16.setImgFileName(filenameGroupRoom_Info16);
		File fGroupRoom_Info16 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info16.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info16);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info16.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info16);
		
		GroupRoom_Info beanGroupRoom_Info17 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info17 = dao13.findByPrimeKey(4);
		beanGroupRoom_Info17.setGroupRoom(grbeanGroupRoom_Info17);
		String filenameGroupRoom_Info17 = "GroupRoomInfo_0405.jpg";
		beanGroupRoom_Info17.setImgFileName(filenameGroupRoom_Info17);
		File fGroupRoom_Info17 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info17.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info17);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info17.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info17);
		
		GroupRoom_Info beanGroupRoom_Info18 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info18 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info18.setGroupRoom(grbeanGroupRoom_Info18);
		String filenameGroupRoom_Info18 = "GroupRoomInfo_0501.jpg";
		beanGroupRoom_Info18.setImgFileName(filenameGroupRoom_Info18);
		File fGroupRoom_Info18 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info18.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info18);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info18.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info18);
		
		GroupRoom_Info beanGroupRoom_Info19 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info19 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info19.setGroupRoom(grbeanGroupRoom_Info19);
		String filenameGroupRoom_Info19 = "GroupRoomInfo_0502.jpg";
		beanGroupRoom_Info19.setImgFileName(filenameGroupRoom_Info19);
		File fGroupRoom_Info19 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info19.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info19);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info19.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info19);
		
		GroupRoom_Info beanGroupRoom_Info20 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info20 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info20.setGroupRoom(grbeanGroupRoom_Info20);
		String filenameGroupRoom_Info20 = "GroupRoomInfo_0503.jpg";
		beanGroupRoom_Info20.setImgFileName(filenameGroupRoom_Info20);
		File fGroupRoom_Info20 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info20.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info20);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info20.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info20);
		
		GroupRoom_Info beanGroupRoom_Info21 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info21 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info21.setGroupRoom(grbeanGroupRoom_Info21);
		String filenameGroupRoom_Info21 = "GroupRoomInfo_0504.jpg";
		beanGroupRoom_Info21.setImgFileName(filenameGroupRoom_Info21);
		File fGroupRoom_Info21 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info21.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info21);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info21.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info21);
		
		GroupRoom_Info beanGroupRoom_Info22 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info22 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info22.setGroupRoom(grbeanGroupRoom_Info22);
		String filenameGroupRoom_Info22 = "GroupRoomInfo_0505.jpg";
		beanGroupRoom_Info22.setImgFileName(filenameGroupRoom_Info22);
		File fGroupRoom_Info22 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info22.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info22);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info22.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info22);
		
		GroupRoom_Info beanGroupRoom_Info23 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info23 = dao13.findByPrimeKey(5);
		beanGroupRoom_Info23.setGroupRoom(grbeanGroupRoom_Info23);
		String filenameGroupRoom_Info23 = "GroupRoomInfo_0506.jpg";
		beanGroupRoom_Info23.setImgFileName(filenameGroupRoom_Info23);
		File fGroupRoom_Info23 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info23.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info23);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info23.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info23);
		
		GroupRoom_Info beanGroupRoom_Info24 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info24 = dao13.findByPrimeKey(6);
		beanGroupRoom_Info24.setGroupRoom(grbeanGroupRoom_Info24);
		String filenameGroupRoom_Info24 = "GroupRoomInfo_0601.jpg";
		beanGroupRoom_Info24.setImgFileName(filenameGroupRoom_Info24);
		File fGroupRoom_Info24 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info24.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info24);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info24.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info24);
		
		GroupRoom_Info beanGroupRoom_Info25 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info25 = dao13.findByPrimeKey(6);
		beanGroupRoom_Info25.setGroupRoom(grbeanGroupRoom_Info25);
		String filenameGroupRoom_Info25 = "GroupRoomInfo_0602.jpg";
		beanGroupRoom_Info25.setImgFileName(filenameGroupRoom_Info25);
		File fGroupRoom_Info25 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info25.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info25);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info25.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info25);
		
		GroupRoom_Info beanGroupRoom_Info26 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info26 = dao13.findByPrimeKey(6);
		beanGroupRoom_Info26.setGroupRoom(grbeanGroupRoom_Info26);
		String filenameGroupRoom_Info26 = "GroupRoomInfo_0603.jpg";
		beanGroupRoom_Info26.setImgFileName(filenameGroupRoom_Info26);
		File fGroupRoom_Info26 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info26.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info26);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info26.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info26);
		
		GroupRoom_Info beanGroupRoom_Info27 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info27 = dao13.findByPrimeKey(6);
		beanGroupRoom_Info27.setGroupRoom(grbeanGroupRoom_Info27);
		String filenameGroupRoom_Info27 = "GroupRoomInfo_0604.jpg";
		beanGroupRoom_Info27.setImgFileName(filenameGroupRoom_Info27);
		File fGroupRoom_Info27 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info27.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info27);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info27.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info27);
		
		GroupRoom_Info beanGroupRoom_Info28 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info28 = dao13.findByPrimeKey(7);
		beanGroupRoom_Info28.setGroupRoom(grbeanGroupRoom_Info28);
		String filenameGroupRoom_Info28 = "GroupRoomInfo_0701.jpg";
		beanGroupRoom_Info28.setImgFileName(filenameGroupRoom_Info28);
		File fGroupRoom_Info28 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info28.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info28);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info28.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info28);
		
		GroupRoom_Info beanGroupRoom_Info29 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info29 = dao13.findByPrimeKey(7);
		beanGroupRoom_Info29.setGroupRoom(grbeanGroupRoom_Info29);
		String filenameGroupRoom_Info29 = "GroupRoomInfo_0702.jpg";
		beanGroupRoom_Info29.setImgFileName(filenameGroupRoom_Info29);
		File fGroupRoom_Info29 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info29.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info29);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info29.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info29);
		
		GroupRoom_Info beanGroupRoom_Info30 = new GroupRoom_Info();
		GroupRoom grbeanGroupRoom_Info30 = dao13.findByPrimeKey(8);
		beanGroupRoom_Info30.setGroupRoom(grbeanGroupRoom_Info30);
		String filenameGroupRoom_Info30 = "GroupRoomInfo_0801.jpg";
		beanGroupRoom_Info30.setImgFileName(filenameGroupRoom_Info30);
		File fGroupRoom_Info30 = new File("WebContent/res/GroupRoomInfo/" + beanGroupRoom_Info30.getImgFileName());
		try {
			InputStream is = new FileInputStream(fGroupRoom_Info30);
			ByteArrayOutputStream buffer = new ByteArrayOutputStream();
			int nRead;
			byte[] data = new byte[1024];
			while ((nRead = is.read(data, 0, data.length)) != -1) {
				buffer.write(data, 0, nRead);
				buffer.flush();
			}
			data = buffer.toByteArray();
			is.close();
			beanGroupRoom_Info30.setGroupPicture(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		dao14.insert(beanGroupRoom_Info30);
		
		
		//insert Joiner_Info
		Joiner_Info beanJoiner_Info1 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info1 = dao13.findByPrimeKey(1);
		beanJoiner_Info1.setGroupRoom(gubeanJoiner_Info1);
		beanJoiner_Info1.setJoinTime(java.sql.Date.valueOf("2014-12-24"));
		beanJoiner_Info1.setUsername("qksmiper");
		dao15.insert(beanJoiner_Info1);
		
		Joiner_Info beanJoiner_Info2 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info2 = dao13.findByPrimeKey(1);
		beanJoiner_Info2.setGroupRoom(gubeanJoiner_Info2);
		beanJoiner_Info2.setJoinTime(java.sql.Date.valueOf("2014-12-26"));
		beanJoiner_Info2.setUsername("Condeeng");
		dao15.insert(beanJoiner_Info2);
		
		Joiner_Info beanJoiner_Info3 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info3 = dao13.findByPrimeKey(2);
		beanJoiner_Info3.setGroupRoom(gubeanJoiner_Info3);
		beanJoiner_Info3.setJoinTime(java.sql.Date.valueOf("2015-1-1"));
		beanJoiner_Info3.setUsername("javaprogrammer");
		dao15.insert(beanJoiner_Info3);
		
		Joiner_Info beanJoiner_Info4 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info4 = dao13.findByPrimeKey(2);
		beanJoiner_Info4.setGroupRoom(gubeanJoiner_Info4);
		beanJoiner_Info4.setJoinTime(java.sql.Date.valueOf("2015-1-5"));
		beanJoiner_Info4.setUsername("bahagamer");
		dao15.insert(beanJoiner_Info4);
		
		Joiner_Info beanJoiner_Info5 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info5 = dao13.findByPrimeKey(2);
		beanJoiner_Info5.setGroupRoom(gubeanJoiner_Info5);
		beanJoiner_Info5.setJoinTime(java.sql.Date.valueOf("2015-1-7"));
		beanJoiner_Info5.setUsername("Hicupok");
		dao15.insert(beanJoiner_Info5);
		
		Joiner_Info beanJoiner_Info6 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info6 = dao13.findByPrimeKey(3);
		beanJoiner_Info6.setGroupRoom(gubeanJoiner_Info6);
		beanJoiner_Info6.setJoinTime(java.sql.Date.valueOf("2014-11-28"));
		beanJoiner_Info6.setUsername("cclearner");
		dao15.insert(beanJoiner_Info6);
		
		Joiner_Info beanJoiner_Info7 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info7 = dao13.findByPrimeKey(3);
		beanJoiner_Info7.setGroupRoom(gubeanJoiner_Info7);
		beanJoiner_Info7.setJoinTime(java.sql.Date.valueOf("2014-12-2"));
		beanJoiner_Info7.setUsername("steampower");
		dao15.insert(beanJoiner_Info7);
		
		Joiner_Info beanJoiner_Info8 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info8 = dao13.findByPrimeKey(3);
		beanJoiner_Info8.setGroupRoom(gubeanJoiner_Info8);
		beanJoiner_Info8.setJoinTime(java.sql.Date.valueOf("2014-12-3"));
		beanJoiner_Info8.setUsername("javaprogrammer");
		dao15.insert(beanJoiner_Info8);
		
		Joiner_Info beanJoiner_Info9 = new Joiner_Info();
		GroupRoom gubeanJoiner_Info9 = dao13.findByPrimeKey(3);
		beanJoiner_Info9.setGroupRoom(gubeanJoiner_Info9);
		beanJoiner_Info9.setJoinTime(java.sql.Date.valueOf("2014-12-4"));
		beanJoiner_Info9.setUsername("pewdiepie");
		dao15.insert(beanJoiner_Info9);
		
		//insert GroupRoomMessage
		GroupRoom_Message beanGroupRoomMessage1 = new GroupRoom_Message();
		GroupRoom sibeanbeanGroupRoomMessage1 = dao13.findByPrimeKey(1);
		beanGroupRoomMessage1.setGroupRoom(sibeanbeanGroupRoomMessage1);
		beanGroupRoomMessage1.setMessageUsername("opchannel");
		beanGroupRoomMessage1.setMessageContents("請問團可以開的成嗎?");
		beanGroupRoomMessage1.setMessageTime(java.sql.Date.valueOf("2014-12-30"));
		dao16.insert(beanGroupRoomMessage1);
		
		GroupRoom_Message beanGroupRoomMessage2 = new GroupRoom_Message();
		GroupRoom sibeanbeanGroupRoomMessage2 = dao13.findByPrimeKey(1);
		beanGroupRoomMessage2.setGroupRoom(sibeanbeanGroupRoomMessage2);
		beanGroupRoomMessage2.setMessageUsername("pewdiepie");
		beanGroupRoomMessage2.setMessageContents("應該可以");
		beanGroupRoomMessage2.setMessageTime(java.sql.Date.valueOf("2014-12-30"));
		dao16.insert(beanGroupRoomMessage2);
		
		GroupRoom_Message beanGroupRoomMessage3 = new GroupRoom_Message();
		GroupRoom sibeanbeanGroupRoomMessage3 = dao13.findByPrimeKey(1);
		beanGroupRoomMessage3.setGroupRoom(sibeanbeanGroupRoomMessage3);
		beanGroupRoomMessage3.setMessageUsername("cclearner");
		beanGroupRoomMessage3.setMessageContents("不玩龍與地下城嗎?");
		beanGroupRoomMessage3.setMessageTime(java.sql.Date.valueOf("2014-1-4"));
		dao16.insert(beanGroupRoomMessage3);
		
		GroupRoom_Message beanGroupRoomMessage4 = new GroupRoom_Message();
		GroupRoom sibeanbeanGroupRoomMessage4 = dao13.findByPrimeKey(1);
		beanGroupRoomMessage4.setGroupRoom(sibeanbeanGroupRoomMessage4);
		beanGroupRoomMessage4.setMessageUsername("steampower");
		beanGroupRoomMessage4.setMessageContents("我們開團只有2小時, 時間不夠");
		beanGroupRoomMessage4.setMessageTime(java.sql.Date.valueOf("2014-1-5"));
		dao16.insert(beanGroupRoomMessage4);

		//insert GroupChoiceGames
		GroupChoiceGames beanGroupChoiceGames1 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames1 = dao13.findByPrimeKey(1);
		beanGroupChoiceGames1.setGroupRoom(gubeanGroupChoiceGames1);
		BoardGameKind bgkbeanGroupChoiceGames1 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames1.setBoardGameKind(bgkbeanGroupChoiceGames1);
		beanGroupChoiceGames1.setBoardGameName("西部無間");
		dao17.insert(beanGroupChoiceGames1);
		
		GroupChoiceGames beanGroupChoiceGames2 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames2 = dao13.findByPrimeKey(1);
		beanGroupChoiceGames2.setGroupRoom(gubeanGroupChoiceGames2);
		BoardGameKind bgkbeanGroupChoiceGames2 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames2.setBoardGameKind(bgkbeanGroupChoiceGames2);
		beanGroupChoiceGames2.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames2);
		
		GroupChoiceGames beanGroupChoiceGames3 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames3 = dao13.findByPrimeKey(1);
		beanGroupChoiceGames3.setGroupRoom(gubeanGroupChoiceGames3);
		BoardGameKind bgkbeanGroupChoiceGames3 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames3.setBoardGameKind(bgkbeanGroupChoiceGames3);
		beanGroupChoiceGames3.setBoardGameName("富饒之城");
		dao17.insert(beanGroupChoiceGames1);
		
		GroupChoiceGames beanGroupChoiceGames4 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames4 = dao13.findByPrimeKey(2);
		beanGroupChoiceGames4.setGroupRoom(gubeanGroupChoiceGames4);
		BoardGameKind bgkbeanGroupChoiceGames4 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames4.setBoardGameKind(bgkbeanGroupChoiceGames4);
		beanGroupChoiceGames4.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames4);
		
		GroupChoiceGames beanGroupChoiceGames5 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames5 = dao13.findByPrimeKey(2);
		beanGroupChoiceGames5.setGroupRoom(gubeanGroupChoiceGames5);
		BoardGameKind bgkbeanGroupChoiceGames5 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames5.setBoardGameKind(bgkbeanGroupChoiceGames5);
		beanGroupChoiceGames5.setBoardGameName("逐夢解語（妙語說書人）");
		dao17.insert(beanGroupChoiceGames5);
		
		GroupChoiceGames beanGroupChoiceGames6 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames6 = dao13.findByPrimeKey(2);
		beanGroupChoiceGames6.setGroupRoom(gubeanGroupChoiceGames6);
		BoardGameKind bgkbeanGroupChoiceGames6 = dao10.findByPrimeKey(4);
		beanGroupChoiceGames6.setBoardGameKind(bgkbeanGroupChoiceGames6);
		beanGroupChoiceGames6.setBoardGameName("龍與地下城");
		dao17.insert(beanGroupChoiceGames6);
		
		GroupChoiceGames beanGroupChoiceGames7 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames7 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames7.setGroupRoom(gubeanGroupChoiceGames7);
		BoardGameKind bgkbeanGroupChoiceGames7 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames7.setBoardGameKind(bgkbeanGroupChoiceGames7);
		beanGroupChoiceGames7.setBoardGameName("逐夢解語（妙語說書人）");
		dao17.insert(beanGroupChoiceGames7);
		
		GroupChoiceGames beanGroupChoiceGames8 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames8 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames8.setGroupRoom(gubeanGroupChoiceGames8);
		BoardGameKind bgkbeanGroupChoiceGames8 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames8.setBoardGameKind(bgkbeanGroupChoiceGames8);
		beanGroupChoiceGames8.setBoardGameName("卡坦拓荒（卡坦島,卡丹島）");
		dao17.insert(beanGroupChoiceGames8);
		
		GroupChoiceGames beanGroupChoiceGames9 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames9 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames9.setGroupRoom(gubeanGroupChoiceGames9);
		BoardGameKind bgkbeanGroupChoiceGames9 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames9.setBoardGameKind(bgkbeanGroupChoiceGames9);
		beanGroupChoiceGames9.setBoardGameName("西部無間");
		dao17.insert(beanGroupChoiceGames9);
		
		GroupChoiceGames beanGroupChoiceGames10 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames10 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames10.setGroupRoom(gubeanGroupChoiceGames10);
		BoardGameKind bgkbeanGroupChoiceGames10 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames10.setBoardGameKind(bgkbeanGroupChoiceGames10);
		beanGroupChoiceGames10.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames10);
		
		GroupChoiceGames beanGroupChoiceGames11 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames11 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames11.setGroupRoom(gubeanGroupChoiceGames11);
		BoardGameKind bgkbeanGroupChoiceGames11 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames11.setBoardGameKind(bgkbeanGroupChoiceGames11);
		beanGroupChoiceGames11.setBoardGameName("富饒之城");
		dao17.insert(beanGroupChoiceGames11);
		
		GroupChoiceGames beanGroupChoiceGames12 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames12 = dao13.findByPrimeKey(3);
		beanGroupChoiceGames12.setGroupRoom(gubeanGroupChoiceGames12);
		BoardGameKind bgkbeanGroupChoiceGames12 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames12.setBoardGameKind(bgkbeanGroupChoiceGames12);
		beanGroupChoiceGames12.setBoardGameName("卡卡頌（卡卡城，卡卡送）");
		dao17.insert(beanGroupChoiceGames12);
		
		GroupChoiceGames beanGroupChoiceGames13 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames13 = dao13.findByPrimeKey(4);
		beanGroupChoiceGames13.setGroupRoom(gubeanGroupChoiceGames13);
		BoardGameKind bgkbeanGroupChoiceGames13 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames13.setBoardGameKind(bgkbeanGroupChoiceGames13);
		beanGroupChoiceGames13.setBoardGameName("西部無間");
		dao17.insert(beanGroupChoiceGames13);
		
		GroupChoiceGames beanGroupChoiceGames14 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames14 = dao13.findByPrimeKey(4);
		beanGroupChoiceGames14.setGroupRoom(gubeanGroupChoiceGames14);
		BoardGameKind bgkbeanGroupChoiceGames14 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames14.setBoardGameKind(bgkbeanGroupChoiceGames14);
		beanGroupChoiceGames14.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames14);
		
		GroupChoiceGames beanGroupChoiceGames15 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames15 = dao13.findByPrimeKey(4);
		beanGroupChoiceGames15.setGroupRoom(gubeanGroupChoiceGames15);
		BoardGameKind bgkbeanGroupChoiceGames15 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames15.setBoardGameKind(bgkbeanGroupChoiceGames15);
		beanGroupChoiceGames15.setBoardGameName("逐夢解語（妙語說書人）");
		dao17.insert(beanGroupChoiceGames15);
		
		GroupChoiceGames beanGroupChoiceGames16 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames16 = dao13.findByPrimeKey(4);
		beanGroupChoiceGames16.setGroupRoom(gubeanGroupChoiceGames16);
		BoardGameKind bgkbeanGroupChoiceGames16 = dao10.findByPrimeKey(4);
		beanGroupChoiceGames16.setBoardGameKind(bgkbeanGroupChoiceGames16);
		beanGroupChoiceGames16.setBoardGameName("龍與地下城");
		dao17.insert(beanGroupChoiceGames16);
		
		GroupChoiceGames beanGroupChoiceGames17 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames17 = dao13.findByPrimeKey(4);
		beanGroupChoiceGames17.setGroupRoom(gubeanGroupChoiceGames17);
		BoardGameKind bgkbeanGroupChoiceGames17 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames17.setBoardGameKind(bgkbeanGroupChoiceGames17);
		beanGroupChoiceGames17.setBoardGameName("卡坦拓荒（卡坦島,卡丹島）");
		dao17.insert(beanGroupChoiceGames17);
		
		GroupChoiceGames beanGroupChoiceGames18 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames18 = dao13.findByPrimeKey(5);
		beanGroupChoiceGames18.setGroupRoom(gubeanGroupChoiceGames18);
		BoardGameKind bgkbeanGroupChoiceGames18 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames18.setBoardGameKind(bgkbeanGroupChoiceGames18);
		beanGroupChoiceGames18.setBoardGameName("抵抗組織");
		dao17.insert(beanGroupChoiceGames18);
		
		GroupChoiceGames beanGroupChoiceGames19 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames19 = dao13.findByPrimeKey(5);
		beanGroupChoiceGames19.setGroupRoom(gubeanGroupChoiceGames19);
		BoardGameKind bgkbeanGroupChoiceGames19 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames19.setBoardGameKind(bgkbeanGroupChoiceGames19);
		beanGroupChoiceGames19.setBoardGameName("西部無間");
		dao17.insert(beanGroupChoiceGames19);
		
		GroupChoiceGames beanGroupChoiceGames20 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames20 = dao13.findByPrimeKey(5);
		beanGroupChoiceGames20.setGroupRoom(gubeanGroupChoiceGames20);
		BoardGameKind bgkbeanGroupChoiceGames20 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames20.setBoardGameKind(bgkbeanGroupChoiceGames20);
		beanGroupChoiceGames20.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames20);
		
		GroupChoiceGames beanGroupChoiceGames21 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames21 = dao13.findByPrimeKey(5);
		beanGroupChoiceGames21.setGroupRoom(gubeanGroupChoiceGames21);
		BoardGameKind bgkbeanGroupChoiceGames21 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames21.setBoardGameKind(bgkbeanGroupChoiceGames21);
		beanGroupChoiceGames21.setBoardGameName("富饒之城");
		dao17.insert(beanGroupChoiceGames21);
		
		GroupChoiceGames beanGroupChoiceGames22 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames22 = dao13.findByPrimeKey(5);
		beanGroupChoiceGames22.setGroupRoom(gubeanGroupChoiceGames22);
		BoardGameKind bgkbeanGroupChoiceGames22 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames22.setBoardGameKind(bgkbeanGroupChoiceGames22);
		beanGroupChoiceGames22.setBoardGameName("卡卡頌（卡卡城，卡卡送）");
		dao17.insert(beanGroupChoiceGames22);
		
		GroupChoiceGames beanGroupChoiceGames23 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames23 = dao13.findByPrimeKey(6);
		beanGroupChoiceGames23.setGroupRoom(gubeanGroupChoiceGames23);
		BoardGameKind bgkbeanGroupChoiceGames23 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames23.setBoardGameKind(bgkbeanGroupChoiceGames23);
		beanGroupChoiceGames23.setBoardGameName("禁忌之島");
		dao17.insert(beanGroupChoiceGames23);
		
		GroupChoiceGames beanGroupChoiceGames24 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames24 = dao13.findByPrimeKey(6);
		beanGroupChoiceGames24.setGroupRoom(gubeanGroupChoiceGames24);
		BoardGameKind bgkbeanGroupChoiceGames24 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames24.setBoardGameKind(bgkbeanGroupChoiceGames24);
		beanGroupChoiceGames24.setBoardGameName("三國殺");
		dao17.insert(beanGroupChoiceGames24);
		
		GroupChoiceGames beanGroupChoiceGames25 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames25 = dao13.findByPrimeKey(6);
		beanGroupChoiceGames25.setGroupRoom(gubeanGroupChoiceGames25);
		BoardGameKind bgkbeanGroupChoiceGames25 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames25.setBoardGameKind(bgkbeanGroupChoiceGames25);
		beanGroupChoiceGames25.setBoardGameName("逐夢解語（妙語說書人）");
		dao17.insert(beanGroupChoiceGames25);
		
		GroupChoiceGames beanGroupChoiceGames26 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames26 = dao13.findByPrimeKey(6);
		beanGroupChoiceGames26.setGroupRoom(gubeanGroupChoiceGames26);
		BoardGameKind bgkbeanGroupChoiceGames26 = dao10.findByPrimeKey(4);
		beanGroupChoiceGames26.setBoardGameKind(bgkbeanGroupChoiceGames26);
		beanGroupChoiceGames26.setBoardGameName("龍與地下城");
		dao17.insert(beanGroupChoiceGames26);
		
		GroupChoiceGames beanGroupChoiceGames27 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames27 = dao13.findByPrimeKey(7);
		beanGroupChoiceGames27.setGroupRoom(gubeanGroupChoiceGames27);
		BoardGameKind bgkbeanGroupChoiceGames27 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames27.setBoardGameKind(bgkbeanGroupChoiceGames27);
		beanGroupChoiceGames27.setBoardGameName("逐夢解語（妙語說書人）");
		dao17.insert(beanGroupChoiceGames27);
		
		GroupChoiceGames beanGroupChoiceGames28 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames28 = dao13.findByPrimeKey(7);
		beanGroupChoiceGames28.setGroupRoom(gubeanGroupChoiceGames28);
		BoardGameKind bgkbeanGroupChoiceGames28 = dao10.findByPrimeKey(2);
		beanGroupChoiceGames28.setBoardGameKind(bgkbeanGroupChoiceGames28);
		beanGroupChoiceGames28.setBoardGameName("卡坦拓荒（卡坦島,卡丹島）");
		dao17.insert(beanGroupChoiceGames28);
		
		GroupChoiceGames beanGroupChoiceGames29 = new GroupChoiceGames();
		GroupRoom gubeanGroupChoiceGames29 = dao13.findByPrimeKey(8);
		beanGroupChoiceGames29.setGroupRoom(gubeanGroupChoiceGames29);
		BoardGameKind bgkbeanGroupChoiceGames29 = dao10.findByPrimeKey(1);
		beanGroupChoiceGames29.setBoardGameKind(bgkbeanGroupChoiceGames29);
		beanGroupChoiceGames29.setBoardGameName("矮人礦坑");
		dao17.insert(beanGroupChoiceGames29);

		
	}
	
}


