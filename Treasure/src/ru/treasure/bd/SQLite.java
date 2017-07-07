package ru.treasure.bd;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLite {
	
	BD bd = new BD();
	
	public SQLite() {
		try {
			bd.connBD();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getDatas(String query) {
		ResultSet rs = null;
		try {
			rs = bd.connBD().executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (rs.next()) {
				return rs.getString(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "error";
	}
	
	public String getFirstHint (int level, int version) {
		return getDatas(bd.firstHint(level, version));
	}
	
	public String getSecondHint (int level, int version) {
		return getDatas(bd.secondHint(level, version));
	}
	
	public String getThirdHint (int level, int version) {
		return getDatas(bd.thirdHint(level, version));
	}
	
	public String getTrueAnswer (int level, int version)
	{
		return getDatas(bd.trueAnswer(level, version));
	}
	
	public String saveResult (int level_num, int version, int gold, int all_gold, int score)
	{
		return getDatas(bd.saveResult(level_num, version, gold, all_gold, score));
	}
	
	public static void main(String[] args) throws Exception {
		BD bd = new BD();
		String str = bd.trueAnswer(1, 1);    //вытаскивает правльный ответ
		String save = bd.saveResult(1, 1, 100, 100, 520); //сохраняет текущий результат
		bd.connBD().execute(save);
		
		ResultSet rs = bd.connBD().executeQuery(str);
		while (rs.next())
		{
			System.out.print (rs.getString(1));
		}
		rs.close();
	}
}
