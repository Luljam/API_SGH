package br.com.hspm.sgh.controller.dto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.hspm.sgh.model.Censo;
import br.com.hspm.sgh.persistence.Conexao;

public class CensoDto {

public static List<Censo> getListaCenso() {
		
		List<Censo> listaCenso = new ArrayList<Censo>();
		PreparedStatement preparedStatement;
		
		String sqlString = "SELECT * "+
				                "FROM agh.v_ain_censo_24_horas " +
				                "WHERE prontuario is not null";
		try {

			Connection conn = new Conexao().getConnection();
			preparedStatement = conn.prepareStatement(sqlString);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				
				Censo c = new Censo();
				c.setProntuario(resultSet.getLong("prontuario"));
				c.setNome(resultSet.getString("nome"));
				c.setNascimento(resultSet.getString("nascimento"));
				c.setQuarto(resultSet.getString("quarto"));
				c.setData_internacao_data(resultSet.getString("data_internacao_data"));
				c.setData_internacao_hora(resultSet.getString("data_internacao_hora"));
				c.setEspecialidade(resultSet.getString("especialidade"));
				c.setMedico(resultSet.getString("medico"));
				c.setSexo(resultSet.getString("sexo"));
				c.setIdade(resultSet.getString("idade"));
				c.setCid(resultSet.getString("CID"));
				c.setDescricaoCid(resultSet.getString("Descrição do CID"));
				c.setTempo(resultSet.getString("tempo"));
				c.setUnidade_funcional(resultSet.getString("unidade_funcional"));
				c.setVinculo(resultSet.getString("vinculo"));
									
				listaCenso.add(c);
			}
		} catch (SQLException e) {
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage() );
		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaCenso;
	}
}
