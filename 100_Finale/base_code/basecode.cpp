// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
		
	cout<<"Input a symbol for a snowflake"<<endl;
		char sym;
		cin>>sym;
		
			gotoxy(15,5);
	cout<<"*";
	gotoxy(14,6);
	cout<<"###";
	gotoxy(13,7);
	cout<<"#####";
	gotoxy(12,8);
	cout<<"#######";
	gotoxy(11,9);
	cout<<"#########";
	gotoxy(15,10);
	cout<<"|";

	while(true){
		for(int y =0;y<7; y++){
		gotoxy(4,3+y);
		cout<< sym<<endl;
		gotoxy(9,2+y);
		cout<<sym<<endl;
		gotoxy(21,4+y);
		cout<<sym<<endl;
		gotoxy(23,1+y);
		cout<<sym<<endl;
		sleep(1);
		gotoxy(9,2+y);
		cout<<" "<<endl;
		gotoxy(4,3+y);
		cout<<" "<<endl;
		gotoxy(21,4+y);
		cout<<" "<<endl;
		gotoxy(23,1+y);
		cout<<" "<<endl;
		}
	}
}
		
		