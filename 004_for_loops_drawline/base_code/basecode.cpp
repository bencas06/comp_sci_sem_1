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
	cout<<"Horizontal 'h' or Vertical 'v'"<<endl;
	cin>>let;
	if(let=='h'){
		for(int y = 1; y<x;y++){
			
				cout <<sym;
		
		}
	}
	else{
	for(int y = 1; y<x;y++){
		cout <<sym<<endl;

	}
	
		
	}
	
}