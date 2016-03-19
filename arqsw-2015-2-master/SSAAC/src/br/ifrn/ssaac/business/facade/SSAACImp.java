package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.UserBI;

import br.ifrn.ssaac.business.model.Submission;
import br.ifrn.ssaac.business.userbi.SubmissionBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	private SubmissionBI SubmissionBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}

	public void setSubmissionBI(SubmissionBI userBI) {
		this.submissionBI = submissionBI;
	}
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}

	@Override
	public Submission getSubmissionStatus(long id) {
		return submissionBI.getSubmissionStatus(id);
	}
}