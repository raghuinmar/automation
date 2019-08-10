package com.track.dae.dao;



import oracle.jdbc.driver.*;

import com.track.core.dao.AbstractDataAccessObject;
import com.track.core.util.CoreHash;
import com.track.core.util.CoreList;
import com.track.core.util.DateWrapper;
import com.track.core.util.LoggerManager;
import com.track.dae.model.Profile;
import com.track.project.model.ProjectBean;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.*;
import java.util.Date;
import java.util.Properties;


/**
 *
 * @author 
 */
public class ProfileDAO extends AbstractDataAccessObject{
    
    public Connection con;

    private boolean flag;
    /** Creates a new instance of ProfileDAO */
    public ProfileDAO() 
    {
           //getting Database Connection
           
    }
    
       
    //User Registration
   
    
    public boolean registerEmployees(Profile regbean)
    {
    	boolean flag=false;
    	String result="";
        String loginid=regbean.getLoginID();
        String password=regbean.getPassword();
        String firstname=regbean.getFirstName();
        String lastname=regbean.getLastName();
        String logintype=regbean.getLoginType();
        System.out.println("in profile bean"+logintype);
        String regdate=regbean.getRegDate();
        String secretquest=regbean.getSecretQuestionID();
        String ownsecretquest=regbean.getOwnSecretQuestion();
        String secretans=regbean.getSecretAnswer();
        String bdate=DateWrapper.parseDate(regbean.getBirthDate());
       //home
        String hno=regbean.getHno();
        String home=regbean.getHome();
        String street=regbean.getStreet();
        String city=regbean.getCity();
        String state=regbean.getState();
        String country=regbean.getCountry();
        String pin=regbean.getPin();
        String Phonetype=regbean.getHomePhoneType();
        String phone=regbean.getPhone();
        //office
        String ohno=regbean.getOhno();
        String office=regbean.getOffice();
        String ostreet=regbean.getOstreet();
        String ocity=regbean.getOcity();
        String ostate=regbean.getOstate();
        String ocountry=regbean.getOcountry();
        String opin=regbean.getOpin();
        String oPhonetype=regbean.getOfficePhoneType();
        String ophone=regbean.getOphone();
        //personal
        String phno=regbean.getChno();
        String contact=regbean.getContact();
        String pstreet=regbean.getCstreet();
        String pcity=regbean.getCcity();
        String pstate=regbean.getCstate();
        String pcountry=regbean.getCcountry();
        String ppin=regbean.getCpin();
        String pPhonetype=regbean.getPersonalPhoneType();
        String pphone=regbean.getCphone();
       System.out.println("homephoto= "+phone+" office= "+ophone+" personal = "+pphone);
        String fax=regbean.getFax();
        String email=regbean.getEmail();
        String photo=regbean.getPhoto();
        String newdate=DateWrapper.parseDate(new Date());
        try 
        {
        	System.out.println("photo="+photo);
        	File f=new File(photo);
        	FileInputStream fis=new FileInputStream(f); 
        	System.out.println("fole="+f.length());
           
            
        	con=getConnection();
          // con.setAutoCommit(false);
           CallableStatement cstmt=con.prepareCall("{call insertprocedure(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
          /*
   1 photo BLOB,
   2 fname userdetails.FIRSTNAME%type,
   3 lname userdetails.LASTNAME%type,
   4 db userdetails.DOB%type,
   5 logid userdetails.LOGINID%type,
   6 pass userdetails.PASSWORD%Type,
   7 secretquestion userdetails.FORGOTPWQUESTION%type,
   8 secretanswer userdetails.FORGOTPWANSWER%type,
   
   9 email userdetails.EMAILID%type,
   10 fax userdetails.FAXNO%type,
  */
           cstmt.setBinaryStream(1, fis,(int)f.length());
           cstmt.setString(2,firstname);
           cstmt.setString(3,lastname);
           cstmt.setString(4,bdate);
           
           cstmt.setString(5,loginid);
           cstmt.setString(6,password);
           cstmt.setString(7,logintype);
           cstmt.setString(8,secretquest);
           cstmt.setString(9,secretans);
           
           cstmt.setString(10,email);
           cstmt.setString(11,fax);
         /*
           //home
           11 addresshome addresses.ADDRESSTYPE%type,
           12 housenohome addresses.HOUSENO%type,
           13 streethome addresses.STREET%type,
           14 cityhome addresses.CITY%type,
           15 statehome addresses.STATE%type,
           16 countryhome addresses.COUNTRY%type,
           17 pincodehome addresses.PINCODE%type,
           
           
           */       
           cstmt.setString(12,home);
           cstmt.setString(13,hno);
           cstmt.setString(14,street);
           cstmt.setString(15,city);
           cstmt.setString(16,state);
           cstmt.setString(17,country);
           cstmt.setString(18,pin);
          /*
            //office
   18 addressoffice addresses.ADDRESSTYPE%type,
   19 housenooffice addresses.HOUSENO%type,
   20 streetoffice addresses.STREET%type,
   21 cityoffice addresses.CITY%type,
   22 stateoffice addresses.STATE%type,
   23 countryoffice addresses.COUNTRY%type,
   24 pincodeoffice addresses.PINCODE%type,
   
            */
  cstmt.setString(19,office);
           cstmt.setString(20,ohno);
           cstmt.setString(21,ostreet);
           cstmt.setString(22,ocity);
           cstmt.setString(23,ostate);
           cstmt.setString(24,ocountry);
           cstmt.setString(25,opin);
        /* //personal
           25 addresspersonal addresses.ADDRESSTYPE%type,
           26 housenopersonal addresses.HOUSENO%type,
           27 streetpersonal addresses.STREET%type,
           28 citypersonal  addresses.CITY%type,
           29 statepersonal addresses.STATE%type,
           30 countrypersonal addresses.COUNTRY%type,
           31 pincodepersonal addresses.PINCODE%type,
          */       
           cstmt.setString(26,contact);
           cstmt.setString(27,phno);
           cstmt.setString(28,pstreet);
           cstmt.setString(29,pcity);
           cstmt.setString(30,pstate);
           cstmt.setString(31,pcountry);
           cstmt.setString(32,ppin);
          /*
           32 phonehome phones.PHONETYPE%type,
           33 phonenumberhome phones.PHONENO%type,
           34 phoneoffice phones.PHONETYPE%type,
           35 phonenumberoffice phones.PHONENO%type,
           36 phonepersonal phones.PHONETYPE%type,
           37 phonenumberpersonal phones.PHONENO%type
            */
           cstmt.setString(33,Phonetype);
           cstmt.setString(34,phone);
           cstmt.setString(35,oPhonetype);
           cstmt.setString(36,ophone);
           cstmt.setString(37,pPhonetype);
           cstmt.setString(38,pphone);  
           
          /* CREATE OR REPLACE procedure EFFORT.insertprocedure
           (
               photo BLOB,
               fname userdetails.FIRSTNAME%type,
               lname userdetails.LASTNAME%type,
               db userdetails.DOB%type,
               logid userdetails.LOGINID%type,
               pass userdetails.PASSWORD%Type,
               logintype userdetails.LOGINTYPE%type,
               secretquestion userdetails.FORGOTPWQUESTION%type,
               secretanswer userdetails.FORGOTPWANSWER%type,
               email userdetails.EMAILID%type,
               fax userdetails.FAXNO%type,
               addresshome addresses.ADDRESSTYPE%type,
               housenohome addresses.HOUSENO%type,
               streethome addresses.STREET%type,
               cityhome addresses.CITY%type,
               statehome addresses.STATE%type,
               countryhome addresses.COUNTRY%type,
               pincodehome addresses.PINCODE%type,
               addressoffice addresses.ADDRESSTYPE%type,
               housenooffice addresses.HOUSENO%type,
               streetoffice addresses.STREET%type,
               cityoffice addresses.CITY%type,
               stateoffice addresses.STATE%type,
               countryoffice addresses.COUNTRY%type,
               pincodeoffice addresses.PINCODE%type,
               addresspersonal addresses.ADDRESSTYPE%type,
               housenopersonal addresses.HOUSENO%type,
               streetpersonal addresses.STREET%type,
               citypersonal  addresses.CITY%type,
               statepersonal addresses.STATE%type,
               countrypersonal addresses.COUNTRY%type,
               pincodepersonal addresses.PINCODE%type,
               phonehome phones.PHONETYPE%type,
               phonenumberhome phones.PHONENO%type,
               phoneoffice phones.PHONETYPE%type,
               phonenumberoffice phones.PHONENO%type,
               phonepersonal phones.PHONETYPE%type,
               phonenumberpersonal phones.PHONENO%type
           )
           as
           begin
            insert into userdetails values((select nvl(max(userid),1000)+1 from userdetails),fname,lname,db,sysdate,logid,
                        pass,logintype,secretquestion,secretanswer,photo,email,fax,'unassigned');
            insert into addresses values((select max(userid) from userdetails) ,(select nvl(max(addressid),1000)+1 from addresses),
                          addresshome,housenohome,streethome,cityhome,statehome,countryhome,pincodehome);
            if addressoffice is not null then
              insert into addresses values((select max(userid) from userdetails),(select max(addressid)+1 from addresses),
                      addressoffice,housenooffice,streetoffice,cityoffice,stateoffice,countryoffice,pincodeoffice);
            end if;
            if addresspersonal is not null then
              insert into addresses values((select max(userid) from userdetails),(select max(addressid)+1 from addresses),
                 addresspersonal,housenopersonal,streetpersonal,citypersonal,statepersonal,countrypersonal,pincodepersonal);
            end if;
            insert into phones values((select max(userid) from userdetails),phonenumberhome,phonehome);
            if phoneoffice is not null then
              insert into phones values((select max(userid) from userdetails),phonenumberoffice,phoneoffice);
            end if;
            if phonepersonal is not null then
              insert into phones values((select max(userid) from userdetails),phonenumberpersonal,phonepersonal);
            end if;
           end insertprocedure;
           /*/
           
           cstmt.registerOutParameter(39, Types.VARCHAR);
           cstmt.execute();
           result=cstmt.getString(39);
        
           
            
             if(result.equalsIgnoreCase("true"))
             {
              flag=true;
              con.commit();
             }
             else
             {
            	 flag=false;
            	 con.rollback();
            	 
             }
             con.close();
        } 
        catch(SQLException e)
    	{
    	System.out.println(e.toString());
    	if(e.toString().equalsIgnoreCase("java.sql.SQLException: [Microsoft][ODBC driver for Oracle][Oracle]ORA-12571: TNS:packet writer failure"))
    		{
    		flag=true;
    		System.out.println("n==="+flag);
    		}
    System.out.println(e);

    	}
        catch (Exception e) 
        {
            e.printStackTrace();
            flag=false;
            try 
            {
                con.rollback();
            } 
            catch (SQLException se) 
            {
                se.printStackTrace();
            }
        }
        return flag;
    }
    
    //Getting profile
    public Profile getProfile(String loginname,String path)
    {
        Profile rb=new Profile();
        try
        {
        	con=getConnection();
        	CallableStatement cs=con.prepareCall("{call showprofile(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
		    
		    /*
		1 logid userdetails.loginid%type,
		2 pass out userdetails.PASSWORD%type,
		3 fname OUT userdetails.FIRSTNAME%type,
		4 lname OUT  userdetails.LASTNAME%type,
		5 db OUT varchar2,
		 
		6 email OUT  userdetails.EMAILID%type,
		7 fax OUT userdetails.FAXNO%type,
		8 addresshome OUT addresses.ADDRESSTYPE%type,
		9 housenohome OUT addresses.HOUSENO%type,
		10 streethome OUT addresses.STREET%type,
		11 cityhome OUT addresses.CITY%type,
		12 statehome OUT addresses.STATE%type,
		13 countryhome OUT addresses.COUNTRY%type,
		14 pincodehome OUT addresses.PINCODE%type,
		15 addressoffice OUT addresses.ADDRESSTYPE%type,
		16 housenooffice OUT addresses.HOUSENO%type,
		17 streetoffice OUT addresses.STREET%type,
		18 cityoffice OUT  addresses.CITY%type,
		19 stateoffice OUT addresses.STATE%type,
		20 countryoffice OUT addresses.COUNTRY%type,
		21 pincodeoffice OUT addresses.PINCODE%type,
		22 addresspersonal OUT addresses.ADDRESSTYPE%type,
		23 housenopersonal OUT addresses.HOUSENO%type,
		24 streetpersonal OUT addresses.STREET%type,
		25 citypersonal OUT addresses.CITY%type,
		26 statepersonal OUT addresses.STATE%type,
		27 countrypersonal OUT addresses.COUNTRY%type,
		28 pincodepersonal OUT addresses.PINCODE%type,
		29 phonehome OUT phones.PHONETYPE%type,
		30 phonenohome OUT phones.PHONENO%type,
		31 phoneoffice OUT  phones.PHONETYPE%type,
		32 phonenooffice OUT phones.PHONENO%type,
		33 phonepersonal OUT phones.PHONETYPE%type,
		34 phonenopersonal OUT phones.PHONENO%type,
		35 photo OUT  userdetails.PHOTOGRAPH%type 
		     */
		    		
		    
		    cs.setString(1,loginname);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.VARCHAR);
			cs.registerOutParameter(4,Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6,Types.VARCHAR);
			cs.registerOutParameter(7,Types.VARCHAR);
			cs.registerOutParameter(8,Types.VARCHAR);
			cs.registerOutParameter(9,Types.VARCHAR);
			cs.registerOutParameter(10,Types.VARCHAR);
			cs.registerOutParameter(11,Types.VARCHAR);
			cs.registerOutParameter(12,Types.VARCHAR);
			cs.registerOutParameter(13,Types.VARCHAR);
			cs.registerOutParameter(14,Types.VARCHAR);
			cs.registerOutParameter(15,Types.VARCHAR);
			cs.registerOutParameter(16,Types.VARCHAR);
			cs.registerOutParameter(17,Types.VARCHAR);
			cs.registerOutParameter(18,Types.VARCHAR);
			cs.registerOutParameter(19,Types.VARCHAR);
			cs.registerOutParameter(20,Types.VARCHAR);
			cs.registerOutParameter(21,Types.VARCHAR);
			cs.registerOutParameter(22,Types.VARCHAR);
			cs.registerOutParameter(23,Types.VARCHAR);
			cs.registerOutParameter(24,Types.VARCHAR);
			cs.registerOutParameter(25,Types.VARCHAR);
			cs.registerOutParameter(26,Types.VARCHAR);
			cs.registerOutParameter(27,Types.VARCHAR);
			cs.registerOutParameter(28,Types.VARCHAR);
			cs.registerOutParameter(29,Types.VARCHAR);
			cs.registerOutParameter(30,Types.VARCHAR);
			cs.registerOutParameter(31,Types.VARCHAR);
			cs.registerOutParameter(32,Types.VARCHAR);
			cs.registerOutParameter(33,Types.VARCHAR);
			cs.registerOutParameter(34,Types.VARCHAR);
			cs.registerOutParameter(35,Types.BLOB);
			cs.execute();
			rb.setPassword(cs.getString(2));
			rb.setFirstname(cs.getString(3));
			rb.setLastname(cs.getString(4));
			
			rb.setBdate(cs.getString(5));
			//rb.setPhoto(cs.getString());
			rb.setEmail(cs.getString(6));
			rb.setFax(cs.getString(7));
			rb.setHome(cs.getString(8));
			rb.setHno(cs.getString(9));
			rb.setStreet(cs.getString(10));
			rb.setCity(cs.getString(11));
			rb.setState(cs.getString(12));
			//rb.setPin(cs.getString(13));
			rb.setCountry(cs.getString(13));
			rb.setPin(cs.getString(14));
			rb.setOffice(cs.getString(15));
			rb.setOhno(cs.getString(16));
			rb.setOstreet(cs.getString(17));
			rb.setOcity(cs.getString(18));
			
			rb.setOstate(cs.getString(19));
		/*
		 20 countryoffice OUT addresses.COUNTRY%type,
		21 pincodeoffice OUT addresses.PINCODE%type,
		22 addresspersonal OUT addresses.ADDRESSTYPE%type,
		23 housenopersonal OUT addresses.HOUSENO%type,
		24 streetpersonal OUT addresses.STREET%type,
		25 citypersonal OUT addresses.CITY%type,
		26 statepersonal OUT addresses.STATE%type,
		27 countrypersonal OUT addresses.COUNTRY%type,
		28 pincodepersonal OUT addresses.PINCODE%type,
		
		 
		     */
			rb.setOcountry(cs.getString(20));
			rb.setOpin(cs.getString(21));
			rb.setContact(cs.getString(22));
			rb.setChno(cs.getString(23));
			rb.setCstreet(cs.getString(24));
			rb.setCcity(cs.getString(25));
			rb.setCstate(cs.getString(26));
			//rb.setCpin(cs.getString(27));
			rb.setCcountry(cs.getString(27));
			rb.setCpin(cs.getString(28));
			/*
			 	29 phonehome OUT phones.PHONETYPE%type,
				30 phonenohome OUT phones.PHONENO%type,
				31 phoneoffice OUT  phones.PHONETYPE%type,
				32 phonenooffice OUT phones.PHONENO%type,
				33 phonepersonal OUT phones.PHONETYPE%type,
				34 phonenopersonal OUT phones.PHONENO%type, 
				35 photo OUT  userdetails.PHOTOGRAPH%type
					 */
			rb.setHomePhoneType(cs.getString(29));
			rb.setPhone(cs.getString(30));
			rb.setOfficePhoneType(cs.getString(31));
			String o=cs.getString(32);
			rb.setOphone(o);
			rb.setPersonalPhoneType(cs.getString(33));
		String s=cs.getString(34);
		rb.setCphone(s);
		System.out.println("personal phone="+s+"  officeph= "+o);
		 /*FileOutputStream fs = null;
         InputStream is = null;
         fs = new FileOutputStream("photo.jpg");
        
         is = cs.getBlob(35).getBinaryStream();
         byte[] buf = new byte[16384];
         int bytes;
         while ((bytes = is.read(buf)) != -1) {
             fs.write(buf, 0, bytes);
			
         }*/
		Blob b =cs.getBlob(35);
		byte b1[]=b.getBytes(1,(int)b.length());
		OutputStream fout=new FileOutputStream(path+"/"+loginname+"+.jpg");
		fout.write(b1);

	}
	
        catch(Exception e)
        {e.printStackTrace();
        	LoggerManager.writeLogSevere(e);
        }
        finally
        {
        	try{
        		con.close();
        	}catch(Exception e)
        	{
        		LoggerManager.writeLogSevere(e);
            }
        	
        }
        return rb;
    }     // Modify Profile
    
    
    public CoreList getemployeDetails(String username,String logintype,String path)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String userid="";
    	String userName;
    	String role;
    	userName=username;
    	role=logintype;
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select userid,firstname,lastname,to_char(dob),emailid,faxno,photograph from userdetails where logintype=? and loginid=? ");
			while(rs.next())
			{
				
				rb=new Profile();
				userid=rs.getString(1);
				//inventory.setBrandID(rs.getInt(1));
				rb.setId(userid);
				rb.setLogintype(rs.getString(2));
				rb.setFirstname(rs.getString(3));
				rb.setLastname(rs.getString(4));
				rb.setBdate(rs.getString(5));
				rb.setEmail(rs.getString(6));
				rb.setFax(rs.getString(7));
				Blob b=rs.getBlob(8);
				byte b1[]=b.getBytes(1,(int)b.length());//new byte[(int)b.length()];
				//InputStream in=photo.getBinaryStream();
				OutputStream fout=new FileOutputStream(path+"/"+ userid+".jpg");
				fout.write(b1);
			
				rb.setPhoto(userid+".jpg");
				
				count++;
				aCoreList.add(rb);
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    
    
    
    
    public CoreList getEmpDetails(String path)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select USERID,LOGINTYPE,firstname,lastname,to_char(dob),emailid,faxno,photograph from userdetails where logintype!='admin'");
			while(rs.next())
			{
				
				rb=new Profile();
				userid=rs.getString(1);
				//inventory.setBrandID(rs.getInt(1));
				rb.setId(userid);
				rb.setLogintype(rs.getString(2));
				rb.setFirstname(rs.getString(3));
				rb.setLastname(rs.getString(4));
				rb.setBdate(rs.getString(5));
				rb.setEmail(rs.getString(6));
				rb.setFax(rs.getString(7));
				Blob b=rs.getBlob(8);
				byte b1[]=b.getBytes(1,(int)b.length());//new byte[(int)b.length()];
				//InputStream in=photo.getBinaryStream();
				OutputStream fout=new FileOutputStream(path+"/"+ userid+".jpg");
				fout.write(b1);
			
				rb.setPhoto(userid+".jpg");
				
				count++;
				aCoreList.add(rb);
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    
    
    public CoreList getLogintype()
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String logintype=null;
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select distinct logintype from userdetails ");
			while(rs.next())
			{
				
				rb=new Profile();
				logintype=rs.getString(1);
				rb.setLogintype(rs.getString(1));
				count++;
				aCoreList.add(rb);
				
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    public CoreList getusername(String logintype)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String username=null;
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
		    //userid=rb.getId();
			ResultSet rs = st.executeQuery("select loginid from userdetails where logintype='"+logintype+"'");
			while(rs.next())
			{
				
				rb=new Profile();
				username=rs.getString(1);
				rb.setLoginID(rs.getString(1));
				count++;
				aCoreList.add(rb);
				
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    
    
    
    
    
    public CoreList getDevelopersDetails(String path)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select USERID,LOGINTYPE,firstname,lastname,to_char(dob),emailid,faxno,photograph from userdetails where logintype!='admin' and logintype!='teamlead' and status='unassigned'");
			while(rs.next())
			{
				
				rb=new Profile();
				userid=rs.getString(1);
				//inventory.setBrandID(rs.getInt(1));
				rb.setId(userid);
				rb.setLogintype(rs.getString(2));
				rb.setFirstname(rs.getString(3));
				rb.setLastname(rs.getString(4));
				rb.setBdate(rs.getString(5));
				rb.setEmail(rs.getString(6));
				rb.setFax(rs.getString(7));
				Blob b=rs.getBlob(8);
				byte b1[]=b.getBytes(1,(int)b.length());//new byte[(int)b.length()];
				//InputStream in=photo.getBinaryStream();
				OutputStream fout=new FileOutputStream(path+"/"+ userid+".jpg");
				fout.write(b1);
			
				rb.setPhoto(userid+".jpg");
				
				count++;
				aCoreList.add(rb);
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    
    public CoreList getDevelopersDetailsofTl(int tlid,String path)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select u.USERID,u.LOGINTYPE,u.firstname,u.lastname,to_char(u.dob),u.emailid,u.faxno,u.PHOTOGRAPH from userdetails u where u.userid in (select tl.developerid from teamasigntotls tl where tl.tleadid="+tlid+")");
			while(rs.next())
			{
				
				rb=new Profile();
				userid=rs.getString(1);
				//inventory.setBrandID(rs.getInt(1));
				rb.setId(userid);
				rb.setLogintype(rs.getString(2));
				rb.setFirstname(rs.getString(3));
				rb.setLastname(rs.getString(4));
				rb.setBdate(rs.getString(5));
				rb.setEmail(rs.getString(6));
				rb.setFax(rs.getString(7));
				Blob b=rs.getBlob(8);
				byte b1[]=b.getBytes(1,(int)b.length());//new byte[(int)b.length()];
				//InputStream in=photo.getBinaryStream();
				OutputStream fout=new FileOutputStream(path+"/"+ userid+".jpg");
				fout.write(b1);
			
				rb.setPhoto(userid+".jpg");
				
				count++;
				aCoreList.add(rb);
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    public CoreList getTeamDetailsofTl(String user,String path)
    {
    	System.out.println("user in dao is ....."+user);
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	String userid="";
    	Profile rb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select u.USERID,u.LOGINTYPE,u.firstname,u.lastname,to_char(u.dob),u.emailid,u.faxno,u.PHOTOGRAPH from userdetails u where u.userid in (select tl.developerid from teamasigntotls tl where tl.tleadid=(select userid from userdetails where loginid='"+user+"'))");
			while(rs.next())
			{
				
				rb=new Profile();
				userid=rs.getString(1);
				//inventory.setBrandID(rs.getInt(1));
				rb.setId(userid);
				rb.setLogintype(rs.getString(2));
				rb.setFirstname(rs.getString(3));
				rb.setLastname(rs.getString(4));
				rb.setBdate(rs.getString(5));
				rb.setEmail(rs.getString(6));
				rb.setFax(rs.getString(7));
				Blob b=rs.getBlob(8);
				byte b1[]=b.getBytes(1,(int)b.length());//new byte[(int)b.length()];
				//InputStream in=photo.getBinaryStream();
				OutputStream fout=new FileOutputStream(path+"/"+ userid+".jpg");
				fout.write(b1);
			
				rb.setPhoto(userid+".jpg");
				
				count++;
				aCoreList.add(rb);
			}	
    	}
    	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    	}
    	finally
    	{
    		try
    		{
    			con.close();
    		}
    		catch(SQLException se)
    		{
    			LoggerManager.writeLogWarning(se);
    		}
    	}
    	return aCoreList;
    }  
    
    public Profile getEmployeeDet(String loginname,String path)
    {
    	
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjectBean pb=null;
		aCoreList.clear();
        Profile rb=new Profile();
        try
        {
        	con=getConnection();
        	CallableStatement cs=con.prepareCall("{call viewemployeedetails(?,?,?,?,?,?,?)}");
		    
		    /*
		 create or replace procedure viewemployeedetails
 (
  ltype OUT userdetails.LOGINTYPE%type,
  fname OUT userdetails.FIRSTNAME%type,
  lname OUT  userdetails.LASTNAME%type,
  db OUT userdetails.DOB%type,
  email OUT  userdetails.EMAILID%type,
  fax OUT userdetails.FAXNO%type,
  photo OUT  userdetails.PHOTOGRAPH%type
 )
 as
 begin
 select LOGINTYPE,firstname,lastname,to_char(dob),emailid,faxno,photograph into ltype,fname,lnam
 end viewemployeedetails; 
		     */
		    		
		    
		    cs.registerOutParameter(1,Types.VARCHAR);
			cs.registerOutParameter(2,Types.VARCHAR);
			cs.registerOutParameter(3,Types.VARCHAR);
			cs.registerOutParameter(4,Types.VARCHAR);
			cs.registerOutParameter(5,Types.VARCHAR);
			cs.registerOutParameter(6,Types.VARCHAR);
			cs.registerOutParameter(7,Types.BLOB);
			cs.execute();
			rb.setLogintype(cs.getString(1));
			rb.setPassword(cs.getString(2));
			rb.setFirstname(cs.getString(3));
			rb.setLastname(cs.getString(4));
			
			rb.setBdate(cs.getString(5));
			//rb.setPhoto(cs.getString());
			rb.setEmail(cs.getString(6));
	
		 /*FileOutputStream fs = null;
         InputStream is = null;
         fs = new FileOutputStream("photo.jpg");
        
         is = cs.getBlob(35).getBinaryStream();
         byte[] buf = new byte[16384];
         int bytes;
         while ((bytes = is.read(buf)) != -1) {
             fs.write(buf, 0, bytes);
			
         }*/
		Blob b =cs.getBlob(7);
		byte b1[]=b.getBytes(1,(int)b.length());
		OutputStream fout=new FileOutputStream(path+"/"+loginname+"+.jpg");
		fout.write(b1);

	}
	
        catch(Exception e)
        {e.printStackTrace();
        	LoggerManager.writeLogSevere(e);
        }
        finally
        {
        	try{
        		con.close();
        	}catch(Exception e)
        	{
        		LoggerManager.writeLogSevere(e);
            }
        	
        }
        return rb;
    } 




public boolean modifyProfile(Profile regbean) {
		PreparedStatement ps = null;
		String loginid = regbean.getLoginID();
		System.out.println("login :" + loginid);
		String userid = regbean.getId();
		String firstname = regbean.getFirstName();
		String lastname = regbean.getLastName();
		String mail = regbean.getEmail();
		String fax = regbean.getFax();
		String hno = regbean.getHno();
		String home = regbean.getHome();
		String street = regbean.getStreet();
		String city = regbean.getCity();
		String state = regbean.getState();
		String country = regbean.getCountry();
		String pin = regbean.getPin();
		String phone = regbean.getPhone();

		try {

			con = getConnection();
			// con.setAutoCommit(false);
			CallableStatement cs = con.prepareCall("{call updateprofile(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
			cs.setString(1, firstname);
			cs.setString(2, lastname);
			cs.setString(3, userid);
			cs.setString(4, mail);
			cs.setString(5, fax);
			cs.setString(6, home);
			cs.setString(7, hno);
			cs.setString(8, street);
			cs.setString(9, city);
			cs.setString(10, state);
			cs.setString(11, country);
			cs.setString(12, pin);
			cs.setString(13, phone);
			cs.registerOutParameter(14, Types.INTEGER);
			cs.execute();
			int abc = cs.getInt(14);
			if (abc > 0) {
				flag = true;
				con.commit();
			} else {
				flag = false;
				con.rollback();
			}
			con.close();
		} catch (SQLException ex) {
			System.out.println(ex);
			flag = false;
			try {
				con.rollback();
			} catch (SQLException sex) {
				sex.printStackTrace();
			}
		} catch (Exception e) {

			flag = false;
			try {
				con.rollback();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		return flag;
	}







    
    
    
    
    
    
    
    	    
    		
   //getreport fromdate todate
    public CoreHash getReportFromTo(String sdate,String edate)
	{
		
		Properties p=getProperties();
		String pattern="";
		if(p.getProperty("dbname").equals("access"))
			pattern="#";
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		System.out.println(" aCoreHash--"+aCoreHash.isEmpty());
		int sno=1;
		Statement st;
		Profile aProfile=null;
		try {
			 con = getConnection();
			   
            	 st=con.createStatement();
            	 ResultSet rs=st.executeQuery("SELECT DISTINCT(UD.LOGINID ),UD.FIRSTNAME,UD.LASTNAME,UD.DOB,UD.DOR,UD.EMAILID FROM USERDETAILS UD,LOGINMASTER LM WHERE UD.USERID=LM.USERID AND TO_CHAR(LOGINDATE,'DD-MM-YYYY')>='"+sdate+"' AND TO_CHAR(LOGINDATE,'DD-MM-YYYY')<='"+edate+"'");
            	 while(rs.next())
                 {
              	   aProfile=new Profile();
              	  
              	   aProfile.setLoginID(rs.getString(1));
              	   aProfile.setFirstname(rs.getString(2));  
              	   aProfile.setLastName(rs.getString(3));
              	   String date=DateWrapper.parseDate(rs.getDate(4)).trim();
                	aProfile.setBirthDate(date);
                   aProfile.setRegDate(DateWrapper.parseDate(rs.getDate(5)).trim());
                   aProfile.setEmail(rs.getString(6));
                   	
               	   
              	 aCoreHash.put(new Integer(sno),aProfile);
 			    sno++;
 		  
                 }
		}
		catch(Exception e)
		{e.printStackTrace();
			LoggerManager.writeLogWarning(e);
		}
		finally
		{
		 try{
			 if(con!=null)
				 con.close();
			 
		 }
		 catch(Exception e){}
		}
		return aCoreHash;
	}
    //presentloginuser getting
    
    public CoreHash getReportPresent()
	{
		
		
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		System.out.println("aCoreHash--"+aCoreHash.isEmpty());
		int sno=1;
		CallableStatement cstmt;
		Profile aProfile=null;
		try {
			 con = getConnection();
			   
			
            	 cstmt=con.prepareCall("{call REF_CURSOR_TEST.GET_ACCOUNTS_PROCEDURE(?)}");
            	 cstmt.registerOutParameter(1,OracleTypes.CURSOR);
            	 cstmt.executeUpdate();
            	 ResultSet rs=((OracleCallableStatement)cstmt).getCursor(1);
            	  while(rs.next())
                 {
              	   aProfile=new Profile();
              	   
              	   aProfile.setLoginID(rs.getString(1));
              	   aProfile.setFirstname(rs.getString(2));  
              	   aProfile.setLastName(rs.getString(3));
              	   String date=DateWrapper.parseDate(rs.getDate(4)).trim();
                	aProfile.setBirthDate(date);
                   aProfile.setRegDate(DateWrapper.parseDate(rs.getDate(5)).trim());
                   aProfile.setEmail(rs.getString(6));
                   	
               	   
              	 aCoreHash.put(new Integer(sno),aProfile);
 			    sno++;
 		  
                 }
		}
		catch(Exception e)
		{e.printStackTrace();
			LoggerManager.writeLogWarning(e);
		}
		finally
		{
		 try{
			 if(con!=null)
				 con.close();
			 
		 }
		 catch(Exception e){}
		}
		return aCoreHash;
	}
    
    
    public boolean changeAccountStatus(String loginid,int status)
    {
        try 
        {
        	con=getConnection();
            con.setAutoCommit(false);
            PreparedStatement cstmt=con.prepareStatement("UPDATE logindetails SET loginstatus=? WHERE loginid=?");
            
            cstmt.setInt(1,status);
            cstmt.setString(2,loginid);
            int i=cstmt.executeUpdate();

            if(i==1)
            {
                flag=true;
                con.commit();
            }
            else
            {
                flag=false;
                con.rollback();
            }
            con.close();
        } 
        catch (SQLException ex) 
        {
        	LoggerManager.writeLogSevere(ex);
            flag=false;
            try 
            {
                con.rollback();
            } 
            catch (SQLException se) 
            {
            	LoggerManager.writeLogSevere(se);
            }
        }
        catch (Exception e) 
        {
        	LoggerManager.writeLogSevere(e);
            flag=false;
            try 
            {
                con.rollback();
            } 
            catch (SQLException se) 
            {
            	LoggerManager.writeLogSevere(se);
            }
        }
        return flag;
    }
}
