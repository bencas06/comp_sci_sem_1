// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
			
		while(true){
	cout<< "Input a number"<<endl;
	int x;
	cin >> x;
	cout<<"Type another number"<<endl;
	int y;
	cin >> y;
	cout<<"Pick a symbol"<<endl;
	char i;
	char quit;
	cin >> i;
	if(i=='+'){
		cout<< (x+y);
	}
	else if(i=='-'){
		cout<< (x-y);
	}
	else if(i=='*'){
		cout<< (x*y);
	}
	else if(i=='/'){
		cout<< (x/y);
	}
	
	 cout<<"	press q to quit or any character to continue"<<endl;
	 cin >> quit;
	 if (quit=='q'){
	 	break;
	 }
	 }

}

