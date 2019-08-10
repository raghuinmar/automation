package com.track.project.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import com.track.core.dao.AbstractDataAccessObject;
import com.track.core.util.CoreList;
import com.track.core.util.LoggerManager;
import com.track.project.model.AssignBean;
import com.track.project.model.AssignTeambean;
import com.track.project.model.ProjectBean;

public class AssignProjectsDao extends AbstractDataAccessObject {
	public AssignProjectsDao()
	{
		
	}

	public String assignProjsToTls(AssignBean ab) 
	{		
		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false";  int projid; int tlid;
		String modules;
		 String sdate;
		 String edate;
		try
		 {
			projid=ab.getProjid();
			System.out.println("projid in dao is..."+projid);
			tlid=ab.getTlid();
			System.out.println("tlid in dao is..."+tlid);
			modules=ab.getModules();			
			System.out.println("modules in dao is..."+modules);
			sdate=ab.getSdate();			
			System.out.println("sdate in dao is..."+sdate);
			edate=ab.getEdate();			
			System.out.println("edate in dao is..."+edate);
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/*create or replace procedure assignprojtotls
(
 pid PROJDETAILS.projid%type,
 tlid PROJASSIGNTOTLS.TLEADID%type,
 modu PROJASSIGNTOTLS.MAXMODULES%type,
 esdate PROJASSIGNTOTLS.EXPSTRTDATE%type,
 eedate PROJASSIGNTOTLS.EXPENDDATE%type,
flag out varchar
)
as
stat varchar2(20);
begin
select status into stat from PROJASSIGNTOTLS  where TLEADID=tlid;
if stat=='unassigned' then
insert into PROJASSIGNTOTLS values(pid,tlid,modu,esdate,eedate,'asigned');
update USERDETAILS set status='asigned' where userid=tlid;
update PROJDETAILS set ASSIGNSTATUS='assigned' where projid=pid;
flag:='true';
else
flag:='false';
end if;
end assignprojtotls;

*/
			
		/*	create or replace procedure assignprojtotls
			(
			 pid PROJDETAILS.projid%type,
			 tlid PROJASSIGNTOTLS.TLEADID%type,
			 modu PROJASSIGNTOTLS.MAXMODULES%type,
			 esdate PROJASSIGNTOTLS.EXPSTRTDATE%type,
			 eedate PROJASSIGNTOTLS.EXPENDDATE%type,
			flag out varchar
			)
			as
			stat varchar2(20);
			begin
			select status into stat from userdetails  where userid=tlid;
			if stat='unassigned' then
			insert into PROJASSIGNTOTLS values(pid,tlid,modu,esdate,eedate,'asigned');
			update USERDETAILS set status='asigned' where userid=tlid;
			update PROJDETAILS set ASSIGNSTATUS='assigned' where projid=pid;
			flag:='true';
			else
			flag:='false';
			end if;
			end assignprojtotls;
			/*/
			cstmt=con.prepareCall("{call assignprojtotls(?,?,?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, projid);
			cstmt.setInt(2, tlid);
			cstmt.setString(3, modules);
			cstmt.setString(4, sdate);
			cstmt.setString(5, edate);
			cstmt.registerOutParameter(6, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(6);
			
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
	
	
	
	public String assignTaskToDevelopers(AssignBean ab) 
	{		
		CallableStatement cstmt=null;
		Statement statement=null;
		Connection con=null;
		String flag="false";  int projid; String tlname; int mid; int did; int taskid;
		String ehrs;
		try
		 {
			projid=ab.getProjid();
			System.out.println("projid in dao is..."+projid);
			tlname=ab.getTlname();
			System.out.println("tlname in dao is..."+tlname);
			mid=ab.getMid();			
			System.out.println("mid in dao is..."+mid);
			taskid=ab.getTaskid();			
			System.out.println("taskid in dao is......................."+taskid);
			did=ab.getDid();
			System.out.println("did in dao is ...."+did);
			ehrs=ab.getEhrs();			
			System.out.println("ehrs in dao is..."+ehrs);
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/*create or replace procedure assigntaskstodev
(
 pid PROJDETAILS.projid%type,
 mid MODULES.moduleid%type,
 taskid SUBTASKS.taskid%type,
 user USERDETAILS.loginid%type,
 devid taskasigntodev.devid%type,
 ehrs taskasigntodev.ehrs%type,
flag out varchar
)
is
uid userdetails.userid%type;
begin
select userid into uid from userdetails where loginid=user;
insert into taskasigntodev values(pid,mid,taskid,uid,devid,ehrs);

flag:='true';
end assigntaskstodev;

*/
			cstmt=con.prepareCall("{call assigntaskstodev(?,?,?,?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, projid);
			cstmt.setInt(2, mid);
			cstmt.setInt(3, taskid);
			cstmt.setString(4, tlname);
			cstmt.setInt(5, did);
			cstmt.setString(6, ehrs);
			
			cstmt.registerOutParameter(7, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(7);
			
			System.out.println("aaaaaaaaa");
			System.out.println("---flag-----"+flag);
	         if(flag.equalsIgnoreCase("true"))
	         {	          
	        	 statement=con.createStatement();
	        	 statement.executeUpdate("update SUBTASKS set STATUS='assigned' where TASKID="+taskid+"");
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
	
	
	
	public CoreList getProjAssignDetails()
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	AssignBean ab=null;
    	String tlname;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.projname,p.PROJCODE,u.FIRSTNAME,u.LASTNAME,pr.MAXMODULES,pr.EXPSTRTDATE,pr.EXPENDDATE from projdetails p,userdetails u,PROJASSIGNTOTLS pr where p.projid=pr.projid and u.userid=pr.TLEADID  and  p.ASSIGNSTATUS='assigned'");
			while(rs.next())
			{
				ab = new AssignBean();	
				ab.setProjname(rs.getString(1));				
				ab.setProjcode(rs.getString(2));
				tlname=rs.getString(3)+""+rs.getString(4);
				ab.setTlname(tlname);
				ab.setModules(rs.getString(5));
				ab.setSdate(rs.getString(6));
				ab.setEdate(rs.getString(7));
				count++;
				aCoreList.add(ab);
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
	
	public CoreList getProjAssignDetailsofTl(String user)
    {
		System.out.println("user in dao is ....."+user);
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	AssignBean ab=null;
    	String tlname;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.projname,p.PROJCODE,u.FIRSTNAME,u.LASTNAME,pr.MAXMODULES,pr.EXPSTRTDATE,pr.EXPENDDATE from projdetails p,userdetails u,PROJASSIGNTOTLS pr where p.projid=pr.projid and u.userid=pr.TLEADID and u.userid=(select userid from userdetails where loginid='"+user+"')  and  p.ASSIGNSTATUS='assigned'");
			while(rs.next())
			{
				ab = new AssignBean();	
				ab.setProjname(rs.getString(1));				
				ab.setProjcode(rs.getString(2));
				tlname=rs.getString(3)+""+rs.getString(4);
				ab.setTlname(tlname);
				ab.setModules(rs.getString(5));
				ab.setSdate(rs.getString(6));
				ab.setEdate(rs.getString(7));
				count++;
				aCoreList.add(ab);
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
	
	public CoreList getProjAssignDetailsofDev(String user)
    {
		System.out.println("user in dao is ....."+user);
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	AssignBean ab=null;
    	String tlname;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.projname,p.PROJCODE,u.FIRSTNAME,u.LASTNAME,pr.MAXMODULES,pr.EXPSTRTDATE,pr.EXPENDDATE from projdetails p,userdetails u,PROJASSIGNTOTLS pr where p.projid=pr.projid and u.userid=pr.TLEADID and u.userid=(select TLEADID from TEAMASIGNTOTLS where DEVELOPERID=(select userid from userdetails where loginid='"+user+"'))  and  p.ASSIGNSTATUS='assigned'");
			while(rs.next())
			{
				ab = new AssignBean();	
				ab.setProjname(rs.getString(1));				
				ab.setProjcode(rs.getString(2));
				tlname=rs.getString(3)+""+rs.getString(4);
				System.out.println("tiname............."+tlname);
				ab.setTlname(tlname);
				ab.setModules(rs.getString(5));
				ab.setSdate(rs.getString(6));
				ab.setEdate(rs.getString(7));
				count++;
				aCoreList.add(ab);
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
	
	
	
	public String assignTeamToTls(AssignTeambean atb,int tlid)
    {
    	String flag = "false";
    	Connection con=null;
    	CallableStatement cstmt=null;
    	try
    	{
    		System.out.println("in dao projid is ..."+atb.getTlid());
    		con=getConnection();
    		PreparedStatement pst = con.prepareStatement("insert into teamasigntotls values(?,?)");
    		 /*create or replace procedure assignteamtotl
    		 (    		  
    		  tlid TEAMASIGNTOTLS.TLEADID%type,
    		  devid TEAMASIGNTOTLS.DEVELOPERID%type,
       		  flag out varchar
    		 )
    		  as
    		  begin
    		  insert into TEAMASIGNTOTLS values(tlid,devid);
    		  update userdetails set status='asigned' where userid=devid;
    		 flag:='true';
    		  end assignteamtotl;*/
    		cstmt=con.prepareCall("{call assignteamtotl(?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, tlid);
			cstmt.setInt(2, atb.getDeveloperid());
			cstmt.registerOutParameter(3, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(3);
			
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
}
