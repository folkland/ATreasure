package ru.treasure.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BD {
	
	public Statement connBD () throws Exception 
	{
		Class.forName("org.sqlite.JDBC");
		Connection bd = DriverManager.getConnection("jdbc:sqlite:game.db");
		Statement st = bd.createStatement();
		return st;
	}
	
	public String firstHint (int level, int version)
	{
		String str = "select q.First_Hint from Questions q where q.ID_Level = " + level + " and q.Version = " + version;
		return str;
	}
	
	public String secondHint (int level, int version)
	{
		String str = "select q.Second_Hint from Questions q where q.ID_Level = " + level + " and q.Version = " + version;
		return str;
	}
	
	public String thirdHint (int level, int version)
	{
		String str = "select q.Third_Hint from Questions q where q.ID_Level = " + level + " and q.Version = " + version;
		return str;
	}
	
	public String trueAnswer (int level, int version)
	{
		String str = "select a.True_Answer from Answer a where a.ID_Level = " + level + " and a.Version = " + version;
		return str;
	}
	
	public String saveResult (int level_num, int version, int gold, int all_gold, int score)
	{
		String str = "insert into `SaveResult` (`ID`, `Level_Num`, `Version`, `Gold`, `All_Gold`, `Score`) values (" + level_num + "," + version + "," + gold + "," + all_gold + "," + score + ");";
		return str;
	}

}
