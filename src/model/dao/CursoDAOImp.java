package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import model.db.Db;
import model.entities.Curso;

public class CursoDAOImp implements CursoDAO {
	
	private Connection conexao = Db.getConexao();
	
	public CursoDAOImp(Connection conexao2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void insert(Curso obj) {
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		try {
			String sql = "INSERT INTO curso (nomecurso) VALUES (?)";
			
			pst = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pst.setString(1, obj.getNomeCurso());
			int linhas = pst.executeUpdate();
			if (linhas > 0) {
				rs = pst.getGeneratedKeys();
				rs.next();
				obj.setIdcurso(rs.getInt(1));
				System.out.println(obj.toString());
				
			}else {
				System.out.println("Não foi possível cadastrar o curso!");
			}
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public void update(Curso obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Curso findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
