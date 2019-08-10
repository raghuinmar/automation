package com.track.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


import com.track.core.dao.AbstractDataAccessObject;
import com.track.core.util.CoreHash;
import com.track.core.util.DateWrapper;
import com.track.core.util.LoggerManager;
import com.track.project.model.QueryBean;

public class QueryDAO extends AbstractDataAccessObject {

	Connection con;
	
	public void sendQuery(QueryBean cQuery)
	{
		Statement st=null;
		int tlid=0;
		try
		{
			int queryid = getSequenceID("QUERY", "queryid");
			con = getConnection();
			String name = cQuery.getLoginid();
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select TLEADID from TEAMASIGNTOTLS where DEVELOPERID=(select userid from userdetails where loginid='"+name+"')");
			if(rs.next())
			{
				tlid=rs.getInt(1);
			}
			String desc = cQuery.getDescription();
			
			String status = "Process";
		
			PreparedStatement pst = con.prepareStatement("insert into query values(?,?,?,?,?,?)");
			pst.setInt(1, queryid);
			pst.setString(2, name);
			pst.setString(3, DateWrapper.parseDate(new java.util.Date()));
			pst.setString(4, desc);
			pst.setString(5, status);
			pst.setInt(6, tlid);
			
			pst.executeUpdate();
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
				System.out.println(e);
			}
		}
	}
	
	
	public void sendQueryByTl(QueryBean cQuery)
	{
		Statement st=null;
		int adminid=0;
		try
		{
			int queryid = getSequenceID("QUERY", "queryid");
			con = getConnection();
			String name = cQuery.getLoginid();
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select userid from userdetails where loginid='admin'");
			if(rs.next())
			{
				adminid=rs.getInt(1);
			}
			String desc = cQuery.getDescription();
			
			String status = "Process";
		
			PreparedStatement pst = con.prepareStatement("insert into query values(?,?,?,?,?,?)");
			pst.setInt(1, queryid);
			pst.setString(2, name);
			pst.setString(3, DateWrapper.parseDate(new java.util.Date()));
			pst.setString(4, desc);
			pst.setString(5, status);
			pst.setInt(6, adminid);
			
			pst.executeUpdate();
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
	}
	
	public CoreHash getSolution(String loginname)
	{
		CoreHash qCoreHash = new CoreHash();
		try
		{
			
			con = getConnection();
		
			int queryid = 0;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select q.queryid,q.loginname,q.querydate,q.description,q.status,s.solveddate,s.solution " +
					                       " from query q , solution s where q.queryid=s.queryid and q.loginname = '"+loginname+"'");
			
			QueryBean query = null;
			while(rs.next())
			{
				query = new QueryBean();
				queryid = rs.getInt(1);
				query.setQueryid(queryid);
				query.setLoginid(rs.getString(2));
				query.setQueryDate(rs.getString(3));
				query.setDescription(rs.getString(4));
				query.setStatus(rs.getString(5));
				query.setSolutionDate(rs.getString(6));
				query.setSolution(rs.getString(7));
				
				qCoreHash.put(new Integer(queryid), query);
			}
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
		return qCoreHash;
	}
	
	public QueryBean getSolution(int queryid)
	{
		CoreHash qCoreHash = new CoreHash();
		QueryBean query = null;
		try
		{
			
			con = getConnection();
		
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select q.queryid,q.loginname,q.querydate,q.description,q.status,s.solveddate,s.solution " +
					                       " from query q , solution s where q.queryid=s.queryid and q.queryid = "+queryid);
			
			
			if(rs.next())
			{
				query = new QueryBean();
				queryid = rs.getInt(1);
				query.setQueryid(queryid);
				query.setLoginid(rs.getString(2));
				query.setQueryDate(rs.getString(3));
				query.setDescription(rs.getString(4));
				query.setStatus(rs.getString(5));
				query.setSolutionDate(rs.getString(6));
				query.setSolution(rs.getString(7));
				
				
			}
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
		return query;
	}
	
	
	public QueryBean getQuery(int queryid)
	{
		CoreHash qCoreHash = new CoreHash();
		QueryBean query = null;
		try
		{
			
			con = getConnection();
		
	
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select q.queryid,q.loginname,q.querydate,q.description,q.status" +
					                       " from query q where q.queryid="+queryid);
			
			
			if(rs.next())
			{
				query = new QueryBean();
				queryid = rs.getInt(1);
				query.setQueryid(queryid);
				query.setLoginid(rs.getString(2));
				query.setQueryDate(rs.getString(3));
				query.setDescription(rs.getString(4));
				query.setStatus(rs.getString(5));
			}
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
		return query;
	}
	
	
	public CoreHash getQueryStatus(String loginname)
	{
		CoreHash qCoreHash = new CoreHash();  
		try
		{
		    int queryid=0;
			con = getConnection();
		String date;
		    Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from  query where loginname='"+loginname+"'");
			QueryBean query = null;
			while(rs.next())
			{
				query = new QueryBean();
				queryid = rs.getInt(1);
				query.setQueryid(queryid);
				System.out.println("queryid in dao is...."+queryid);
				query.setLoginid(rs.getString(2));
				date=rs.getString(3);
				System.out.println("date in dao is..."+date);
				query.setQueryDate(date);
				query.setDescription(rs.getString(4));
				query.setStatus(rs.getString(5));
				
				qCoreHash.put(new Integer(queryid), query);
			}
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
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
		return qCoreHash;
	}
	
	public CoreHash getQueryStatusByTl(String user)
	{
		CoreHash qCoreHash = new CoreHash();  
		try
		{
		    int queryid=0;
			con = getConnection();
		
		    Statement st = con.createStatement();
			
			ResultSet rs = st.executeQuery("select * from  query where toid=(select userid from userdetails where loginid='"+user+"')");
			QueryBean query = null;
			while(rs.next())
			{
				query = new QueryBean();
				queryid = rs.getInt(1);
				query.setQueryid(queryid);
				query.setLoginid(rs.getString(2));
				query.setQueryDate(rs.getString(3));
				query.setDescription(rs.getString(4));
				query.setStatus(rs.getString(5));
				
				qCoreHash.put(new Integer(queryid),query);
			}
		}
		catch(Exception e)
		{e.printStackTrace();
			LoggerManager.writeLogWarning(e);
		}
		finally
		{
			try
			{
				con.close();
			}
			catch(Exception e)
			{
				LoggerManager.writeLogWarning(e);
			}
		}
		return qCoreHash;
	}
	
	public void setSolution(QueryBean aQuery)
	{
		Connection con = null;
		try
		{
			con = getConnection();
			con.setAutoCommit(false);
			int queryid = aQuery.getQueryid();
			String replydate = aQuery.getSolutionDate();
			String solution = aQuery.getSolution();
			
			PreparedStatement pst = con.prepareStatement("insert into solution values(?,?,?)");
			PreparedStatement pst1 = con.prepareStatement("update query set status=? where queryid=?");
			
			pst.setInt(1, queryid);
			pst.setString(2, replydate);
			pst.setString(3, solution);
			
			pst1.setString(1, "Solved");
			pst1.setInt(2, queryid);
			
			if(pst.executeUpdate()>0)
			{
				if(pst1.executeUpdate()>0)
					con.commit();
				else
					con.rollback();
			}
			else
				con.rollback();
		}
		catch(Exception e)
		{
			LoggerManager.writeLogWarning(e);
			System.out.println(e);
		}
	}
	
	
	public void deleteQuery(int queryid)
	{
		Connection con = null;
		try
		{
			con = getConnection();
			con.setAutoCommit(false);
			
			PreparedStatement pst = con.prepareStatement("delete from solution where queryid="+queryid);
			PreparedStatement pst1 = con.prepareStatement("delete from query where queryid="+queryid);
			
					
			if(pst.executeUpdate()>0)
			{
				if(pst1.executeUpdate()>0)
					con.commit();
				else
					con.rollback();
			}
			else
				con.rollback();
		}
		catch(Exception e)
		{e.printStackTrace();
			LoggerManager.writeLogWarning(e);
		}
	}
}
