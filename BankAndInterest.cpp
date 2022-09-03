#include <iostream>
using namespace std;

int b1(int account_balance, float interest_rate = 1.08){
	return account_balance * interest_rate;
}

int b2(int account_balance, float interest_rate = 1.1){
	return account_balance * interest_rate;
}

int b3(int account_balance, float interest_rate = 1.12){
	return account_balance * interest_rate;
}

int main() {
	string bank_name;
  int account_balance;
  cout << "\bWelcome to Interest Finder !\n"<<endl;
  cout<<"These are the Banks that are currently registered with us : \n1. State Bank of India(SBI) \n2. HDFC Bank \n3. Axis Bank\t"<<endl;
	cout << "\nEnter your Bank Name : "<<endl; cin>>bank_name;
	cout << "Enter your Account Balance : "<<endl; cin>>account_balance;
	if(bank_name == "SBI" || "Sbi" || "sbi" || "State Bank Of India" || "state bank of india" || "STATE BANK OF INDIA"){
		string b1 = bank_name;
	}
	else if(bank_name == "HDFC" || "hdfc" || "Hdfc" || "hdfc bank"){
		string b2 = bank_name;
	}
  else if(bank_name == "Axis" || "axis" || "AXIS" || "axis bank"){
    string b3 = bank_name;
  }
  else{
    cout << "Sorry your Bank is not registered with us "<<endl;
  }  
	cout << "Your Account Balance having Rs. "<<account_balance<<" you will get an interest from your bank "<<bank_name<<" where your return after 1 year will be Rs. "<<b1(account_balance) || b2(account_balance) || b3(account_balance);

	return 0;
}