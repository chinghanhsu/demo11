package com.example.demo11;

public class Bank {

	// �ᤩbranch �s���w�]�ȡA�Ӥ��O�{���������w�]�� null
	private String branch = "xx����"; // ����W�� �B private(�ݩ�: �p�H)

	private String user; // �Τ�W��

	private int balance; // �s�ھl�B
	
	// �w�]�غc��k�A�榡: ��k���s���v�� ���O�W��(){}
	//                        public      Bank() {}
	// �w�]�غc��k --> �N�O�S���Ѽƪ��غc��k
	// �����O���S���إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc����k�N�O�w�]�غc��k�A��ٲ����g�]�i�H�ϥ�
	// ���O�����إ߱a���Ѽƪ��غc��k�ɡA�S���Ѽƪ��غc����k���A�O�w�]�غc��k�A�S�g�N����ϥ�
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	// �a���Ѽƪ��غc��k�A��@���e���P�� setXXX ��k�A��ڧ@�Φb���ֵ{���X�����
	public Bank(String branch, String user, int balance) {
		super();
		this.branch = branch;
		this.user = user;
		this.balance = balance;
	}


	// �إ��ݩʪ��s(get)��(set)��k (***���n!!!***)
	// �@���k:
	// �榡: ��k���s���v�� ��k���^�ǭȪ���ƫ��A ��k�W��(�ѼƸ�ƫ��A �Ѽ��ܼƦW��) {��k����@���e}
	//         public            String           getBranch() {}
	
	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user; // �۷�� bank.user = "";
		// this.user �����O Bank ��(class)
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// �s�ڤ�k
	public void saving(int amount) {
		System.out.println("�s�ګe�l�B: " + balance);
		// �P�_ amount �O�_������
		if (amount >= 0) {
			// �쥻�����B + �s�ڪ��B
			balance += amount; // balance = balance + amount;
		} else {
			System.out.println("�s�ڪ��B���ର�t��!");
		}
		System.out.println("�s�ګ�l�B: " + balance);
	}

	// ���ڤ�k
	public void withdraw(int amount) {
		// �ư��k
		// �ư����B�O�t��
		if(amount < 0) {
			System.out.println("���ڪ��B���ର�t��!");
			return;
		}
		// �ư��l�B����
		// amount: ���ڪ��B : balance: �쥻���l�B
		if(amount > balance) {
			System.out.println("�l�B����");
			return;
		}
		System.out.println("���ګe�l�B: " + this.balance);
		balance -= amount; // balance = balance - amount;
		System.out.println("���ګ�l�B: " + this.balance);
/*	
 * �򥻴�
 *    	System.out.println("���ګe�l�B: " + balance);
		// �P�_ amount �O�_������
		if (amount > balance) {
			System.out.println("�l�B����");
		} else if (amount < 0) {
			System.out.println("���ڪ��B���ର�t��!");
		} else {
			// �쥻�����B - ���ڪ��B
			balance -= amount; // balance = balance - amount;
			System.out.println("���ګ�l�B: " + balance);		
		}		
*/	
	}
	
/*	public void withdraw2(String title, String branch, String user, int balance) {		
		System.out.println(balance);
		return;
	}
*/	
	public void withdraw3(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
	}
	
	public void withdraw31(String title, String branch, String user, int balance) {
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
	}
	
	public void withdraw4(int balance, String ...params) {
		// params �O�}�C�A�]�t�F title, branch, user
		String title = params[0];
		String branch = params[1];
		String user = params[2];		
		System.out.println(branch);
		System.out.println(user);
		System.out.println(balance);
		return;
	}
	

}
