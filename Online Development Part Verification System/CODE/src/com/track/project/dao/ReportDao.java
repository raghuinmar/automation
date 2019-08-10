package com.track.project.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.StringTokenizer;

import com.track.core.dao.AbstractDataAccessObject;
import com.track.core.util.CoreHash;
import com.track.core.util.LoggerManager;
import com.track.project.model.ReportBean;

public class ReportDao extends AbstractDataAccessObject {
	public String sendTaskStatus(ReportBean aQuery)
	{

		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false"; int taskid=0;
		String edate;  int ehrs=0; String user;
		try
		 {
			taskid=aQuery.getTaskid();
			System.out.println("taskid in dao is..."+taskid);
			edate=aQuery.getEdate();
			System.out.println("edate in dao is..."+edate);
			ehrs=aQuery.getEhrs();
			System.out.println("ehrs in dao is..."+ehrs);
			user=aQuery.getUser();
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/* create or replace procedure submitstatus
                    (
                      tid subtasks.taskid%type,
                      edate effortdtls.edate%type,
                      ehrs effortdtls.ehrs%type,
                      user userdetails.loginid%type,
                      flag out varchar
                    )
                   is
did effortdtls.devid%type;
                   begin
select userid into did from userdetails where loginid= user;
                   insert into effortdtls values(
                   tid,edate,ehrs,did,'unchecked');
                   flag:='true';
                   end submitstatus;*/
			cstmt=con.prepareCall("{call submitstatus(?,?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, taskid);
			cstmt.setString(2, edate);
			cstmt.setInt(3, ehrs);
			cstmt.setString(4, user);
			cstmt.registerOutParameter(5, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(5);
			
			System.out.println("aaaaaaaaa");
			System.out.println("---flag-----"+flag);
	         if(flag.equalsIgnoreCase("true"))
	         {	          
	          con.commit();
	         }
	         else
	         {
                con.rollback();
	         }	        
	    } 
	    catch(SQLException e)
		{
		System.out.println(e.toString());
		if(e.toString().equalsIgnoreCase("java.sql.SQLException: [Microsoft][ODBC driver for Oracle][Oracle]ORA-12571: TNS:packet writer failure"))
			{
			
			System.out.println("n==="+flag);
			}
	System.out.println(e);

		}
	    catch (Exception e) 
	    {
	        e.printStackTrace();
	       
	        try 
	        {
	            con.rollback();
	        } 
	        catch (SQLException se) 
	        {
	            se.printStackTrace();
	            LoggerManager.writeLogWarning(se);
    		
	        }
	    }
	    finally{	    	
	    	try 
	        {
	    		if(con!=null)
	            con.close();
	        } 
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	            LoggerManager.writeLogWarning(e);
    	
	        }	    	
	    }	    
	    return flag;
   }
	
	public CoreHash getReportOfDev(int taskid,String edate)
	{
		System.out.println("task id in dao is..."+taskid);
		System.out.println("edate in dao is...."+edate);
	     String edate1=edate.trim();
		CoreHash aCoreHash=new CoreHash();
		Connection con=null;
		PreparedStatement pstmt=null;
		ReportBean rb=null;
		ResultSet rs=null;
		aCoreHash.clear();
		System.out.println("aCoreHash--"+aCoreHash.isEmpty());
	
		  int sno=1;	
		
			try
	        {
	        	con=getConnection();
	        	System.out.println("conn ...."+con);	
	        pstmt=con.prepareStatement("select p.projname,p.projcode, m.MODULENAME,st.TASKNAME,e.EDATE,e.EHRS,e.status from projdetails p,modules m,subtasks st,effortdtls e where p.projid=m.projid and p.projid=st.projid and m.MODULEID=st.MODULEID and st.taskid=e.taskid and e.taskid=? and e.EDATE=?");
	        System.out.println("pstmt==="+pstmt);
	        pstmt.setInt(1, taskid);
	        pstmt.setString(2, edate1);
	        rs=pstmt.executeQuery();
	        while(rs.next())
	        {
	        	 rb=new ReportBean();
	        	 rb.setProjname(rs.getString(1));
	        	 rb.setProjcode(rs.getString(2));
	        	 rb.setModulename(rs.getString(3));
	        	 rb.setTaskname(rs.getString(4));
	        	 rb.setEdate(rs.getString(5));
	        	 rb.setEhrs(rs.getInt(6));
	        	 rb.setStatus(rs.getString(7));
	        	 aCoreHash.put(new Integer(sno),rb);
				    sno++;
			}
	        }
			
	    catch(Exception e)
		{
	    	e.printStackTrace();
			LoggerManager.writeLogWarning(e);
		}
		finally
		{
		 try{
			 if(con!=null)
				 con.close();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		}
		return aCoreHash;
		
	}
	
	
	
	public CoreHash getReportOfTl(int tlid,String edate)
	{
		String value1=edate.trim();
		String day1 = value1.substring (0,value1.indexOf ("-"));
		String month1 = value1.substring (value1.indexOf ("-")+1, value1.lastIndexOf ("-"));
		String year1 = value1.substring (value1.lastIndexOf ("-")+1, value1.length());
		if(month1.length()==1)
			month1=0+month1;
		value1=day1+"-"+month1+"-"+year1;
		/*StringTokenizer month=new StringTokenizer(value1);
		System.out.println("day----"+day1);
		  System.out.println("month---"+month1);
		    System.out.println("year-----"+year1);
		while(month.hasMoreTokens())
		{
			for(int i=0;i<2;i++)
			{
				String mon=month.nextToken("-");
				System.out.println("mon----"+mon);
				if(mon.length()==1)
				mon=0+mon;
				System.out.println(mon+"------");
			}
			System.out.println(month.nextToken("-"));
		}*/
		System.out.println("tlid id in dao is..."+tlid);
		System.out.println("edate in dao is...."+edate);
	     String edate1=edate.trim();
		CoreHash aCoreHash=new CoreHash();
		Connection con=null;
		Statement stmt=null;
		ReportBean rb=null;
		ResultSet rs=null;
		String logintime="";
		String logouttime="";
		String totaltime="";
		
		aCoreHash.clear();
		System.out.println("aCoreHash--"+aCoreHash.isEmpty());
	
		  int sno=1;	
		
			try
	        {
	        	con=getConnection();
	        	System.out.println("conn ...."+con);	
	        	stmt=con.createStatement();
	       rs= stmt.executeQuery("select u.firstname,u.lastname,p.projname,p.projcode  from projdetails p,PROJASSIGNTOTLS ps,userdetails u where p.PROJID=ps.PROJID and u.userid=ps.tleadid and u.userid="+tlid);	       
	        if(rs.next())
	        {
	        	 rb=new ReportBean();
	        	 String tlname=rs.getString(1)+""+rs.getString(2);
	        	 rb.setUser(tlname);
	        	 rb.setProjname(rs.getString(3));
	        	 rb.setProjcode(rs.getString(4));
	        	 	System.out.println("date ----------------------------"+value1);	
	           rs=stmt.executeQuery("SELECT to_char(LOGINDATE,'dd-MON hh12:mi'),to_char(LOGOUTDATE,'dd-MON hh12:mi'),floor((LOGOUTDATE-LOGINDATE)*24) || ' HOURS ' ||  mod(floor((LOGOUTDATE-LOGINDATE)*24*60),60) || ' MINUTES ' || mod(floor((LOGOUTDATE-LOGINDATE)*24*60*60),60) || ' SECS ' time_difference  FROM loginmaster where userid="+tlid+" and to_char(logindate,'dd-MM-yyyy')=to_char('"+value1+"')");
	             if(rs.next())
	              {
	            	logintime=rs.getString(1);
	            	 logouttime=rs.getString(2);
	            	totaltime=rs.getString(3);
	            	 
	            	
	              }
	             else{
	             logintime="NotAvaliable";
	             logouttime="NotAvaliable";
	             totaltime="NotAvaliable";
	             }
	             rb.setLogintime(logintime);
	             rb.setLogouttime(logouttime);
	             rb.setTotaltime(totaltime);
	             aCoreHash.put(new Integer(sno),rb);
				    sno++;	
     	
	        }
	        }
			
	    catch(Exception e)
		{
	    	e.printStackTrace();
			LoggerManager.writeLogWarning(e);
			System.out.println(e);
		}
		finally
		{
		 try{
			 if(con!=null)
				 con.close();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
		 }
		}
		return aCoreHash;
		
	}
	
	public CoreHash getReportOfDevByAdmin(int taskid,String edate)
	{
		System.out.println("task id in dao is..."+taskid);
		System.out.println("edate in dao is...."+edate);
	     String edate1=edate.trim();
		CoreHash aCoreHash=new CoreHash();
		Connection con=null;
		PreparedStatement pstmt=null;
		ReportBean rb=null;
		ResultSet rs=null;
		aCoreHash.clear();
		System.out.println("aCoreHash--"+aCoreHash.isEmpty());
	
		  int sno=1;	
		
			try
	        {
	        	con=getConnection();
	        	System.out.println("conn ...."+con);	
	        pstmt=con.prepareStatement("select p.projname,p.projcode, m.MODULENAME,st.TASKNAME,e.EDATE,e.EHRS from projdetails p,modules m,subtasks st,effortdtls e where p.projid=m.projid and p.projid=st.projid and m.MODULEID=st.MODULEID and st.taskid=e.taskid and e.taskid=? and e.EDATE=? and e.STATUS='checked'");
	        System.out.println("pstmt==="+pstmt);
	        pstmt.setInt(1, taskid);
	        pstmt.setString(2, edate1);
	        rs=pstmt.executeQuery();
	       while(rs.next())
	        {
	        	 rb=new ReportBean();
	        	 rb.setProjname(rs.getString(1));
	        	 rb.setProjcode(rs.getString(2));
	        	 rb.setModulename(rs.getString(3));
	        	 rb.setTaskname(rs.getString(4));
	        	 rb.setEdate(rs.getString(5));
	        	 rb.setEhrs(rs.getInt(6));
	        	
	        	 aCoreHash.put(new Integer(sno),rb);
				    sno++;
			}
	        }
			
	    catch(Exception e)
		{
	    	e.printStackTrace();
			LoggerManager.writeLogWarning(e);
			System.out.println(e);
		}
		finally
		{
		 try{
			 if(con!=null)
				 con.close();
			 
		 }
		 catch(Exception e)
		 {
			 e.printStackTrace();
			 System.out.println(e);
		 }
		}
		return aCoreHash;
		
	}
	public boolean submitReportToAdminByTl(int tid)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ReportBean rb=null;
		ResultSet rs=null;
		boolean flag=false;
		
		try
        {
        	con=getConnection();
        	System.out.println("conn ................"+con);	
        pstmt=con.prepareStatement("update effortdtls set status=? where taskid=?");
        System.out.println("pstmt==================="+pstmt);
        pstmt.setString(1, "checked");
        pstmt.setInt(2, tid);
        int i=pstmt.executeUpdate();
        System.out.println("i======================="+i);
        if(i>0)
        {
        	flag=true;
        	con.commit();
        }
        else 
        {
        	flag=false;
        	con.rollback();
        }
        }
		catch (Exception e) {
			LoggerManager.writeLogInfo(e);
			
		}
		return flag;
	}

}
