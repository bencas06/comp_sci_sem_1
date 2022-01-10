// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Input a symbol for a snowflake"<<endl;
	char sym;
	cin>>sym;
	
	for(int y =0;y<10; y++){
		gotoxy(4,5+y);
		cout<< sym<<endl;
		sleep(1);
		gotoxy(4,5+y);
		cout<<' '<<endl;
		
		}
	}



