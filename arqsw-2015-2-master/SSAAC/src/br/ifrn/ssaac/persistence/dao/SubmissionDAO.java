package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Submission;

public interface SubmissionDAO {
	public Submission getSubmission(long id);
}