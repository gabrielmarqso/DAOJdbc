package model.dao;

import model.db.Db;

public class FactoryDAO {
	
	public static CursoDAO createCursoDAO() {
		return new CursoDAOImp(Db.getConexao());
		
	}
}
