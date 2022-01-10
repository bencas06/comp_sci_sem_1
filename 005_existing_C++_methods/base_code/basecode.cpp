// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	char sym;
	cout <<"please enter a symbol"<<endl;
	cin >> sym;
	int x;
	cout << "Please enter line length"<<endl;
	cin >> x;
	char let;
	cout<<"Horizontal 'h',Vertical 'v' or diagonal 'd'"<<endl;
	cin>>let;
	if(let=='h'){
		for(int y = 0; y<x;y++){
				cout <<sym;
		}
		
	}
	else if(let=='d'){
	for(int y = 0; y<x;y++){
		gotoxy(x-y,x+y);
		cout<<sym<<endl;
	}

	}
	
		
	else{
	for(int y = 0; y<x;y++){
		cout <<sym<<endl;
	
	}
		
}
	
}
