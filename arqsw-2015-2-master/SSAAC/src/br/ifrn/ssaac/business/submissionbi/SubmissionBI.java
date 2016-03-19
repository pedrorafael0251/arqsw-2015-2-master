package br.ifrn.ssaac.business.submissionbi;

import br.ifrn.ssaac.business.model.Submission;

public interface SubmissionBI {
	public Submission getSubmissionStatus(long id);
}