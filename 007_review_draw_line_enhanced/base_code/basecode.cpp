// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int l;
	cout<<"Please enter a line lenght"<<endl;
	cin>>l;
	char sym;
	cout<<"Please choose a symbol"<<endl;
	cin>>sym;
	int x;
	cout<<"Enter an x coordinate"<<endl;
	cin>>x;
	int y;
	cout<<"Enter a y coordinate"<<endl;
	cin>>y;
	
	gotoxy(x,y);
	for(int y = 0; y<l;y++){
		cout <<sym;
}
}

