package br.ifrn.ssaac.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.ifrn.ssaac.business.model.Submission;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class SubmissionDAOImp implements SubmissionDAO {
	private Connection conn;

	public SubmissionDAOImp() {
		conn = ConnectionFactory.getInstance().getConnection();
	}

	@Override
	public Submission getSubmission(long id) {
		try {
			String sql = "SELECT * FROM submission WHERE id = ?";
			PreparedStatement pstSelect = conn.prepareStatement(sql);
			pstSelect.setLong(1, id);
			ResultSet rs = pstSelect.executeQuery();

			while (rs.next()) {
				String nome = rs.getString("nome");
				String status = rs.getString("status");

				return new Submission(nome, status);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}