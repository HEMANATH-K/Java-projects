package BMS;

public class Customer {
	private	int	customerid;
	private	String	customername;
	private	int	accountno;
	private	String	accounttype;
	
	Customer(String	customername,	String	accounttype,int	accountno,	int	customerid){
		this.customername=customername;
		this.accounttype=accounttype;
		this.accountno=accountno;
		this.customerid=customerid;
		
	}public	String	getcustomername(String	customername) {
		return	customername;
		
	}
	public	String	getaccounttype(String	accounttype) {
		return	accounttype;
		
	}public	int	getaccountno(int	accountno) {
		return	accountno;
	}public	int	getcustomerid(int	customerid) {
		return	customerid;
	}
	public	void	setcustomername(String	customername) {
		this.customername=customername;
		
	}
	public	void	setacccounttype(String	accounttype) {
		this.accounttype=accounttype;
		
	}public	void	setaccountno(int	accountno) {
		this.accountno=accountno;
	}public	void	setcustomerid(int	customerid) {
		this.customerid=customerid;
	}
	
}
	
	

