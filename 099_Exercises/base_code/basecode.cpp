	// base code file
	#include "./hfiles/poole.h"

	///////////////////////////////////////////////////////////////////////

	main(){
	srand(time(NULL));
	// write code here
	int x = 15;
	while(true){
		cout << x << endl;
		if(x==5){
			break;
		}
		x=x-1;
	}
	cout << endl;
	for(int i = 15;i>= 5; i = i-1){
		cout << i << endl;
	}

}
	