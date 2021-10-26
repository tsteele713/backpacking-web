package com.poorvins.models;

public class ForgotPassword {

	private String seqId;
	private String emailAddress;
	private String newPassword;
	
	public String getSeqId() {
		return seqId;
	}
	
	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public String getNewPassword() {
		return newPassword;
	}
	
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((newPassword == null) ? 0 : newPassword.hashCode());
		result = prime * result + ((seqId == null) ? 0 : seqId.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ForgotPassword other = (ForgotPassword) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (newPassword == null) {
			if (other.newPassword != null)
				return false;
		} else if (!newPassword.equals(other.newPassword))
			return false;
		if (seqId == null) {
			if (other.seqId != null)
				return false;
		} else if (!seqId.equals(other.seqId))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ForgotPassword [seqId=" + seqId + ", emailAddress=" + emailAddress + ", newPassword=" + newPassword
				+ "]";
	}
	
	
}
