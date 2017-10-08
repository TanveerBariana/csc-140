public static int main(String args[]){
	int[60][60] array;
	int key;
	for(int i= 0; i < 60; i ++){
		for(int j= 0; j < 60; j ++){
			array[i][] = i+j; 
		}
	}
	for(int i= 0; i < 60; i ++){
		contains( array, i);
	}
}
boolean contains(int[i][j] array, int key){
	for(int k =0; k< array.length()/2; k++){
		int[k][] q1= new int[copyOfRange(array[k], 0, ((array.length())/2)-1)];
		int [k][] q3= new int[copyOfRange(array[k], (array.length())/2, array.length()-1];
	}
	for(int k = array.length()/2; k< array.length(); k++){
		int[k][] q2= new int[copyOfRange(array[k], 0, ((array.length())/2)-1)];
		int [k][] q3= new int[copyOfRange(array[k], array.length()/2, array.length()-1];
	}
	if (array.length() == 0){
		return; 
	} else {
		if(key == array[array.length-1][array.length-1]){
			return true;
		} else if(key < q1[q1.length()-1][q1.length()-1]){
			contains( q1, key);
		} else if (key < q2[q2.length()-1][q2.length()-1]){
			contains( q2, key);
		} else if (key < q3[q3.length()-1][q3.length()-1]){
			contains( q3, key);
		} else if (key < q4[q4.length()-1][q4.length()-1]){
			contains( q4, key);
		} else {
			return false;
		}
	}
}