package BMS;

public class Management {
		private	int	bankno;
		private	String	name;
		private	String	actype;
		private	int	acbalance;
		
		Management(int	bankno,String	name,String	actype,int	acbalance){
			this.bankno=bankno;
			this.name=name;
			this.actype=actype;
			this.acbalance=acbalance;
		}
		public	int	getBankno() {
			return	bankno;
		}public	void	setBankno(int	bankno) {
			this.bankno=bankno;
		}
		public	String	getName() {
			return	name;
		}public	void	setName(String	name) {
			this.name=name;
		}
		public	String	getactype() {
			return	actype;
		}public	void	setactype(String	actype) {
			this.actype=actype;
		}
		public	int	getAcbalance() {
			return	acbalance;
		}public	void	setAcbalance(int	bankno) {
			this.acbalance=acbalance;
		}
		
}
