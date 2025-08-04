package BMS;

import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Management> account = new ArrayList<>();
    static	List<String>history=new	ArrayList<>();
    static	ArrayList<Customer>customer=new	ArrayList<>();
    static	ArrayList<Management>details=new	ArrayList<>();
   
    public static void main(String[] args) {
    	System.out.print("Enter	Admin	or	Customer:");
        String	user=sc.nextLine();
        if (user.equalsIgnoreCase("Admin")) {
            adminlogin();
        } else if (user.equalsIgnoreCase("Customer")) {
            customerlogin();
        } else {
            System.out.print("Enter Valid!!");
        }

        
        
        
    }
    public	static	void	customerlogin() {
    	 HashMap<String,String>logincustomer=new	HashMap<>();
         logincustomer.put("manish", "1234");
         logincustomer.put("surya", "234");
         logincustomer.put("siva", "345");
         System.out.print("Enter the username: ");
         String username = sc.nextLine();
         System.out.print("Enter the customdeid: ");
         String password = sc.nextLine();

         if (logincustomer.containsKey(username) && logincustomer.get(username).equals(password)) {
             System.out.println("Logged in successfully");
             customerprocess();
            
         } else {
             System.out.println("Invalid username or customerid");
;
         }
        
    }

    public static void adminlogin() {
        HashMap<String, String> login = new HashMap<>();
        login.put("goutham", "12345");
        login.put("dj", "1234");
        login.put("rg", "234");
        login.put("kb", "098");
        
      
        
        	
        

        System.out.print("Enter the username: ");
        String username = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();

        if (login.containsKey(username) && login.get(username).equals(password)) {
            System.out.println("Logged in successfully");
            adminprocess();
           
        } else {
            System.out.println("Invalid username or password");
      
        }
    }

    public static void addAccount() {
        System.out.print("Enter the new account number: ");
        int accno = sc.nextInt(); sc.nextLine();
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter account type: ");
        String actype = sc.nextLine();
        System.out.print("Enter amount to deposit: ");
        int balance = sc.nextInt();

        Management m = new Management(accno, name, actype, balance);
        account.add(m);
        details.add(m);
        System.out.println("Account created successfully");
        sc.nextLine();
    }

    public static void updateAccount() {
        System.out.print("Enter account number to update: ");
        int accno = sc.nextInt(); sc.nextLine();
        for (Management ac : account) {
            if (ac.getBankno() == accno) {
                System.out.print("Enter new name: ");
                ac.setName(sc.nextLine());
                System.out.print("Enter new balance: ");
                ac.setAcbalance(sc.nextInt());
                System.out.println("Account updated successfully");
                sc.nextLine();
                return;
            }
        }
        System.out.println("Account not found");
        sc.nextLine();
    }

    public static void searchAccount() {
        System.out.print("Enter account number to search: ");
        int accno = sc.nextInt(); sc.nextLine();
        for (Management ac : account) {
            if (ac.getBankno() == accno) {
                System.out.println("Name: " + ac.getName());
                System.out.println("Type: " + ac.getactype());
                System.out.println("Balance: " + ac.getAcbalance());
                sc.nextLine();
                return;
            }
        }
        System.out.println("No account found");
        sc.nextLine();
    }

    public static void deleteAccount() {
        System.out.print("Enter account number to delete: ");
        int accno = sc.nextInt(); sc.nextLine();
        Iterator<Management> it = account.iterator();
        while (it.hasNext()) {
            Management ac = it.next();
            if (ac.getBankno() == accno) {
                it.remove();
                System.out.println("Account deleted successfully");
                sc.nextLine();
                return;
            }
        }
        System.out.println("No account found");
        sc.nextLine();
    }

    public static void displayAccounts() {
        if (account.isEmpty()) {
            System.out.println("No accounts to display.");
        } else {
            for (Management ac : account) {
                System.out.println("Account No: " + ac.getBankno());
                System.out.println("Name: " + ac.getName());
                System.out.println("Type: " + ac.getactype());
                System.out.println("Balance: " + ac.getAcbalance());
               
            }
        }
        System.out.println("Press Enter to continue...");
        sc.nextLine();
    }

    public static	void deposit() {
        System.out.print("Enter account number: ");
        int accno = sc.nextInt();
        for (Management ac : account) {
            if (ac.getBankno() == accno) {
                System.out.print("Enter amount to deposit: ");
                int amt = sc.nextInt();
                ac.setAcbalance(ac.getAcbalance() + amt);
                System.out.println("Amount deposited successfully");
                sc.nextLine();
                String	r="";
                r+=ac.getName()+"	deposited	"+amt+"	successfully	";
                history.add(r);
               
                return;
            }
        }
        System.out.println("Account not found");
        sc.nextLine();
    }

    public static void withdraw() {
        System.out.print("Enter account number: ");
        int accno = sc.nextInt();
        for (Management ac : account) {
            if (ac.getBankno() == accno) {
                System.out.print("Enter amount to withdraw: ");
                int amt = sc.nextInt();
                if (ac.getAcbalance() >= amt) {
                    ac.setAcbalance(ac.getAcbalance() - amt);
                    System.out.println("Amount withdrawn successfully");
                } else {
                    System.out.println("Insufficient funds");
                }
                sc.nextLine();
                String	r="";
                r+=ac.getName()+"withdrawn"+amt+"successfully";
                history.add(r);
                return;
            }
        }
        System.out.println("Account not found");
        sc.nextLine();
    }
    public	static	void	transactionhistory() {
    	if(history.isEmpty()) {
    		System.out.print("......No	transaction	history	found....");
    		return;
    	}
    	for(String ac:history) {
    		System.out.print(ac);
    		sc.nextLine();
    	}
    	return;
    }
    public	static	void	adminprocess() {
    	while (true) {
            System.out.println("\nBank Management System");
            System.out.println("1. Add bank account");
            System.out.println("2. Update bank account");
            System.out.println("3. Search account holder");
            System.out.println("4. Delete the account");
            System.out.println("5. Display all account holders");
            System.out.println("6. Deposit");
            System.out.println("7. Withdraw");
            System.out.println("8. Transaction	history");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addAccount(); break;
                case 2: updateAccount(); break;
                case 3: searchAccount(); break;
                case 4: deleteAccount(); break;
                case 5: displayAccounts(); break;
                case 6: deposit(); break;
                case 7: withdraw(); break;
                case 8: transactionhistory();break;
                case	9:exit();
                default: System.out.println("Invalid choice");
            }
    }

}
    public	static	void	exit() {
    	System.out.print("Enter	Admin	or	Customer:");
        String	user=sc.nextLine();
        if (user.equalsIgnoreCase("Admin")) {
            adminlogin();
        } else if (user.equalsIgnoreCase("Customer")) {
            customerlogin();
        } else {
            System.out.print("Enter Valid!!");
        }

    }
    public	static	void	customerprocess() {
    	while (true) {
    
            System.out.println("\nBank Management System");
            System.out.println("1. Account	balance");
            System.out.println("2. Update bank account");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Transaction	history");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: accountdetails(); break;
                case 2: updateAccount(); break;
                case 3: deposit(); break;
                case 4: withdraw(); break;
                case 5: transactionhistory();break;
                case	6:System.out.println("Exiting..."); System.exit(0);
                default: System.out.println("Invalid choice");
            }
    }
    }
    public	static	void	accountdetails() {
    	System.out.print("Enter	account	no");
    	int	n=sc.nextInt();
    	for(Management	cd:details) {
    		if(cd.getBankno()==n) {
    			int	balance=cd.getAcbalance();
    			System.out.print("Your	account	balance	is"+balance);
    		}else {
    			System.out.print("Invalid");
    		}
    	}
    }
}

