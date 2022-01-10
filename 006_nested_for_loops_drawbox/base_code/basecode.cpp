// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	
	// *****
	// *****
	// *****
	for(int y = 1; y<6; y++){
		for(int x = 1; x<10; x++){
		gotoxy(x,y);
		cout<< "*";
		}
	
	}
}
