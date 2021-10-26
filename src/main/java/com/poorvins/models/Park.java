package com.poorvins.models;

public class Park {
	
	private String seqId;
	private String parkName;
	private String parkState;
	private String parkType;
	public String getSeqId() {
		return seqId;
	}
	public void setSeqId(String seqId) {
		this.seqId = seqId;
	}
	public String getParkName() {
		return parkName;
	}
	public void setParkName(String parkName) {
		this.parkName = parkName;
	}
	public String getParkState() {
		return parkState;
	}
	public void setParkState(String parkState) {
		this.parkState = parkState;
	}
	public String getParkType() {
		return parkType;
	}
	public void setParkType(String parkType) {
		this.parkType = parkType;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((parkName == null) ? 0 : parkName.hashCode());
		result = prime * result + ((parkState == null) ? 0 : parkState.hashCode());
		result = prime * result + ((parkType == null) ? 0 : parkType.hashCode());
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
		Park other = (Park) obj;
		if (parkName == null) {
			if (other.parkName != null)
				return false;
		} else if (!parkName.equals(other.parkName))
			return false;
		if (parkState == null) {
			if (other.parkState != null)
				return false;
		} else if (!parkState.equals(other.parkState))
			return false;
		if (parkType == null) {
			if (other.parkType != null)
				return false;
		} else if (!parkType.equals(other.parkType))
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
		return "Park [seqId=" + seqId + ", parkName=" + parkName + ", parkState=" + parkState + ", parkType=" + parkType
				+ "]";
	}
	
}
