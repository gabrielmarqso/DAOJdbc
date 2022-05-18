package model.dao;

import model.db.Db;

public class FactoryDAO {
	
	public static CursoDAO createCursoDAO() {
		return new CursoDAOImp(Db.getConexao());
		
	}
	
	public static AlunoDAO createAlunoDAO() {
		return new AlunoDAOImp(Db.getConexao());
	}
	
	public static DisciplinaDAO createDisciplinaDAO() {	
		return new DisciplinaDAOImp(Db.getConexao());
	}
	
}
