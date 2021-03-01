package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hspm.sgh.model.Profissional;
import br.com.hspm.sgh.persistence.Conexao;

public class ProfissionalDto {

	public static List<Profissional> Profissionais() {
		List<Profissional> profissionais = new ArrayList<Profissional>();
		PreparedStatement preparedStatement;
try {
			
			String sqlString = "SELECT * FROM agh.v_mpm_serv_conselho_geral WHERE ind_situacao = 'A'";
			
			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while (resultSet.next()) {
				Profissional profissional = new Profissional();
				
				profissional.setMatricula(resultSet.getLong("matricula"));
				profissional.setVin_codigo(resultSet.getInt("vin_codigo"));
				profissional.setNome(resultSet.getString("nome"));
				profissional.setNro_reg_conselho(resultSet.getString("nro_reg_conselho"));
				profissional.setSigla(resultSet.getString("sigla"));
				profissional.setInd_situacao(resultSet.getString("ind_situacao"));
				
				profissionais.add(profissional);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return profissionais;
	}

}