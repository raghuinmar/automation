package com.track.project.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;



import com.track.core.dao.AbstractDataAccessObject;
import com.track.core.util.CoreHash;
import com.track.core.util.CoreList;
import com.track.core.util.LoggerManager;
import com.track.project.model.ProjModuleBean;
import com.track.project.model.ProjectBean;

public class ProjectDetailsDao extends AbstractDataAccessObject {
	public ProjectDetailsDao()
	{
		
	}
	
	public String addProjDetails(ProjectBean proj)
	{
		
		
		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false";
		String projname;
		 String projcode;
		 String projduration;
		try
		 {
			projname=proj.getProjname();
			System.out.println("proj name in dao is..."+projname);
			projcode=proj.getProjcode();
			System.out.println("projcode in dao is..."+projcode);
			projduration=proj.getProjduration();
			System.out.println("rojduration in dao is..."+projduration);
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/* create or replace procedure insertprojdtls
                    (
                      pn projdetails.projname%type,
                      pc projdetails.projcode%type,
                      pd projdetails.PROJPERIOD%type,
                      flag out varchar
                    )
                   as
                   begin
                   insert into projdetails values(
                   (select nvl(max(projid),1000)+1 from projdetails),pn,pc,pd,'unassigned');
                   flag:='true';
                   end insertprojdtls;*/
			cstmt=con.prepareCall("{call insertprojdtls(?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setString(1, projname);
			cstmt.setString(2, projcode);
			cstmt.setString(3, projduration);
			cstmt.registerOutParameter(4, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(4);
			
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
	
	
	public String addModuleDetails(ProjModuleBean proj)
	{
		
		
		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false";
		int projid;
		 String mname;
		 String projduration;
		try
		 {
			projid=proj.getProjid();
			System.out.println("projid in dao is..."+projid);
			mname=proj.getMname();
			System.out.println("mname in dao is..."+mname);
			
			
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/*create or replace procedure insertmoduledtls
                   (
                     pid projdetails.projid%type,
                     mname modules.modulename%type,
                     flag out varchar
                   )
                  as
                  begin
                  insert into modules values(pid,
                  (select nvl(max(moduleid),10)+1 from modules),mname);
                  flag:='true';
                  end insertmoduledtls;*/
			cstmt=con.prepareCall("{call insertmoduledtls(?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, projid);
			cstmt.setString(2, mname);
			
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
	
	
	
	public String addSubTaskDetails(ProjModuleBean proj)
	{
		
		
		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false";
		int projid;
		 int mid;
		 String stname;
		try
		 {
			projid=proj.getProjid();
			System.out.println("projid in dao is..."+projid);
			mid=proj.getMid();
			System.out.println("mid in dao is..."+mid);
			
			stname=proj.getSubtaskname();
			System.out.println("stname in dao is..."+stname);
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/*  create or replace procedure insertsubtaskdtls
                     (
                       pid projdetails.projid%type,
                       mid modules.moduleid%type,
                       stname SUBTASKS.TASKNAME%type,
                       flag out varchar
                     )
                    as
                    begin
                    insert into SUBTASKS values(pid,mid,
                    (select nvl(max(taskid),1)+1 from subtasks),stname,'unassigned');
                    flag:='true';
*                   end insertsubtaskdtls;*/
			cstmt=con.prepareCall("{call insertsubtaskdtls(?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, projid);
			cstmt.setInt(2, mid);
			cstmt.setString(3, stname);
			
			cstmt.registerOutParameter(4, Types.VARCHAR);
			cstmt.execute();
			flag=cstmt.getString(4);
			
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
	public String modifyProjDetails(ProjectBean proj,int projid)
	{
		
		
		CallableStatement cstmt=null;
		Connection con=null;
		String flag="false";
		String projname;
		 String projcode;
		 String projduration;
		try
		 {
			projname=proj.getProjname();
			System.out.println("proj name in dao is..."+projname);
			projcode=proj.getProjcode();
			System.out.println("projcode in dao is..."+projcode);
			projduration=proj.getProjduration();
			System.out.println("rojduration in dao is..."+projduration);
			con=getConnection();
			System.out.println("con obj in dao ......"+con);
			/*  create or replace procedure modifyprojdtls
                     (
                            pid projdetails.projid%type,
                       pn projdetails.projname%type,
                       pc projdetails.projcode%type,
                       pd projdetails.PROJPERIOD%type,
                       flag out varchar
                     )
                    as
                    begin
                    update projdetails set projname='pn',projcode='pc',PROJPERIOD='pd' where projid=pid;
                    flag:='true';
                    end modifyprojdtls;*/
			cstmt=con.prepareCall("{call modifyprojdtls(?,?,?,?,?)}");			
			System.out.println(cstmt);
			cstmt.setInt(1, projid);
			cstmt.setString(2, projname);
			cstmt.setString(3, projcode);
			cstmt.setString(4, projduration);
			
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

	
	public ProjectBean getProjDetails(int projid){
		
		CoreHash aCoreHash=new CoreHash();
		aCoreHash.clear();
		System.out.println("aCoreHash--"+aCoreHash.isEmpty());
		
		
		int sno=1;
		
		ResultSet rs=null;
		ProjectBean um=null;
		Statement st=null;
		Connection con=null;
	        try
	        {
	        	con=getConnection();     	
	        	st=con.createStatement();
	       	String sql="SELECT * FROM projdetails where projid="+projid+"";
				
				rs=st.executeQuery(sql);
				while(rs.next()){
					
				um=new ProjectBean();		
				
				int pid=rs.getInt(1);
				
				um.setProjid(pid);
				um.setProjname(rs.getString(2));
				um.setProjcode(rs.getString(3));
				um.setProjduration(rs.getString(4));
				
				
				
				 aCoreHash.put(new Integer(sno),um);
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
		return um;
	}

	
	public CoreHash listProjectCodes()
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
		int categoryid;
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from projdetails");
			while(rs.next())
			{				
				aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(3));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	public CoreHash listTeamLeads()
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
		int categoryid;
		int tlid;
		String tlname;
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select USERID,FIRSTNAME,LASTNAME from userdetails where logintype='teamlead'");
			while(rs.next())
			{		
				tlid=rs.getInt(1);
				System.out.println("tlid in dao is ...."+tlid);
				tlname=rs.getString(2)+""+rs.getString(3);
				System.out.println("tlname in dao ..."+tlname);
				aCoreHash.put(new Integer(tlid), tlname);
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	public CoreHash listProjNames()
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
		int categoryid;
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select projid,projname from projdetails where ASSIGNSTATUS='unassigned'");
			while(rs.next())
			{				
				aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	public CoreHash listProjNamesOfTl(String user)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select  p.projid,p.projname from projdetails p,userdetails u,PROJASSIGNTOTLS pr where p.projid=pr.projid and u.userid=pr.TLEADID and u.userid=(select userid from userdetails where loginid='"+user+"')  and  p.ASSIGNSTATUS='assigned'");
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	public CoreHash listProjNamesOfDev(String user)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select  p.projid,p.projname from projdetails p,userdetails u,PROJASSIGNTOTLS pr where p.projid=pr.projid and u.userid=pr.TLEADID and u.userid=(select userid from userdetails where loginid='"+user+"')  and  p.ASSIGNSTATUS='assigned'");
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	
	public CoreHash listModulesByProj(int projid)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select MODULEID,MODULENAME from modules where projid="+projid);
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	public CoreHash listSubTaskByDid(int did)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select taskid,TASKNAME from subtasks where TASKID in (select TASKID from TASKASIGNTODEV where DEVID="+did+")");
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	public CoreHash listSubTaskByModule(int mid)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select TASKID,TASKNAME from subtasks where MODULEID="+mid+ "and status='unassigned'");
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	public CoreHash listSubTaskByDev(String user)
	{
		System.out.println("user name in dao is..."+user);
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
	
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select TASKID,TASKNAME from subtasks where TASKID in (select TASKID from TASKASIGNTODEV where DEVID=(select userid from userdetails where loginid='"+user+"'))");
			while(rs.next())
			{				
				 aCoreHash.put(new Integer(rs.getInt(1)), rs.getString(2));
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	public CoreHash listDevelopersByTl(String user)
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
		int did;
	  String dname;
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select u.USERID,u.firstname,u.lastname from userdetails u where u.userid in (select tl.developerid from teamasigntotls tl where tl.tleadid=(select userid from userdetails where loginid='"+user+"'))");
			while(rs.next())
			{		
				did=rs.getInt(1);
				dname=rs.getString(2)+""+rs.getString(3);				
				 aCoreHash.put(new Integer(did), dname);
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	
	
	
	public CoreHash listDevelopers()
	{
		CoreHash aCoreHash = new CoreHash();
		aCoreHash.clear();
		Connection con=null;
		int did;
	  String dname;
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			ResultSet rs = st.executeQuery("select USERID,firstname,lastname from userdetails where logintype='developer' ");
			while(rs.next())
			{		
				did=rs.getInt(1);
				dname=rs.getString(2)+""+rs.getString(3);				
				 aCoreHash.put(new Integer(did), dname);
			}
		} 
		catch (SQLException e)
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
		return aCoreHash;
	}
	public CoreList projectDetails(int projid)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjectBean pb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select * from projdetails where projid="+projid+" ");
			while(rs.next())
			{
				pb = new ProjectBean();
				//inventory.setBrandID(rs.getInt(1));
				pb.setProjid(rs.getInt(1));
				pb.setProjname(rs.getString(2));
				pb.setProjcode(rs.getString(3));
				pb.setProjduration(rs.getString(4));
				
				count++;
				aCoreList.add(pb);
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
	
	
	public CoreList getProjectDetails()
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjectBean pb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select * from projdetails");
			while(rs.next())
			{
				pb = new ProjectBean();
				//inventory.setBrandID(rs.getInt(1));
				pb.setProjid(rs.getInt(1));
				pb.setProjname(rs.getString(2));
				pb.setProjcode(rs.getString(3));
				pb.setProjduration(rs.getString(4));
				
				count++;
				aCoreList.add(pb);
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
	
	
	
	public CoreList getModuleDetails(int projid)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjModuleBean pb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.projname,p.PROJCODE,m.modulename from projdetails p,modules m where p.projid=m.projid and p.projid="+projid+"");
			while(rs.next())
			{
				pb = new ProjModuleBean();			
				pb.setProjname(rs.getString(1));				
				pb.setProjcode(rs.getString(2));
				pb.setMname(rs.getString(3));
				
				count++;
				aCoreList.add(pb);
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
	
	
	public CoreList getSubTaskDetails(int projid)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjModuleBean pb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.PROJNAME,p.PROJCODE,m.MODULENAME,st.TASKNAME from PROJDETAILS p,MODULES m,SUBTASKS st where p.projid=m.projid and p.projid=st.projid and m.moduleid=st.moduleid and p.projid="+projid);
			while(rs.next())
			{
				pb = new ProjModuleBean();			
				pb.setProjname(rs.getString(1));				
				pb.setProjcode(rs.getString(2));
				pb.setMname(rs.getString(3));
				pb.setSubtaskname(rs.getString(4));
				
				count++;
				aCoreList.add(pb);
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
	
	
	public CoreList getSubTaskDetailsofDev(String user)
    {
    	CoreList aCoreList = new CoreList();
    	Connection con=null; 
    	ProjModuleBean pb=null;
		aCoreList.clear();
		Statement st;
		try {
			con = getConnection();
			st = con.createStatement();
			int count = 0;
			ResultSet rs = st.executeQuery("select p.projname,p.projcode,m.moduleNAME,t.TASKNAME,dt.ehrs from PROJDETAILS p,modules m,SUBTASKS t,TASKASIGNTODEV dt where p.projid=m.projid and  p.projid=t.projid and  p.projid=dt.projid and m.moduleid=t.moduleid and m.moduleid=dt.moduleid and t.taskid=dt.taskid and p.projid in (select projid  from TASKASIGNTODEV where DEVID=(select userid from userdetails where loginid='"+user+"')) and m.moduleid in (select moduleID from TASKASIGNTODEV where DEVID=(select userid from userdetails where loginid='"+user+"')) and t.taskid in (select TASKID from TASKASIGNTODEV where DEVID=(select userid from userdetails where loginid='"+user+"'))");
			while(rs.next())
			{
				pb = new ProjModuleBean();			
				pb.setProjname(rs.getString(1));				
				pb.setProjcode(rs.getString(2));
				pb.setMname(rs.getString(3));
				pb.setSubtaskname(rs.getString(4));
				pb.setEhrs(rs.getString(5));
				count++;
				aCoreList.add(pb);
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
	
	
	public boolean deleteProjDetails(String ch[])
    {
    	boolean flag = false;
    	Connection con=null;
    	try
    	{
    		
    		con=getConnection();
    		PreparedStatement pst = con.prepareStatement("delete from projdetails  where  projid=?");
    		int count=0;
    		for(int i=0;i<ch.length;i++){
    			  int c=Integer.parseInt(ch[i]);
    			  pst.setInt(1, c);
    			  int k=pst.executeUpdate();
    			  if(k>0){
    				  count++;
    			  }
    			}
    		if(count==ch.length){
    			con.commit();
    			flag=true;
    		}
}
    		
    		
    	
       	catch(SQLException se)
    	{
    		LoggerManager.writeLogWarning(se);
    		System.out.println(se);
    	}
    	catch(Exception e)
    	{
    		LoggerManager.writeLogWarning(e);
    		System.out.println(e);
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
    	System.out.println("flag=="+flag);
    	return flag;
    }
}
