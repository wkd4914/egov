package egovframework.com.cop.ems.service;

public class OfficeUserVO {
	
	private String oid;
	private String oname;
	private String omail;
	
	
	@Override
	public String toString() {
		return "OfficeUserVO [oid=" + oid + ", oname=" + oname + ", omail="
				+ omail + "]";
	}

	public String getOid() {
		return oid;
	}


	public void setOid(String oid) {
		this.oid = oid;
	}


	public String getOname() {
		return oname;
	}


	public void setOname(String oname) {
		this.oname = oname;
	}


	public String getOmail() {
		return omail;
	}


	public void setOmail(String omail) {
		this.omail = omail;
	}

	public OfficeUserVO(String oid, String oname, String omail) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.omail = omail;
	}
	
}

