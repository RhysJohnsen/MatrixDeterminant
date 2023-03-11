public class DetWork{
	
	
	public static int two(int[][] input){
		int val = input[0][0] * input[1][1];
		val -= (input[0][1] * input[1][0]);
		return val;
	}
	
	public static int more(int[][] input){
		int answer = 0;
		for(int k = 0; k < input.length; k++){
			int[][] small = new int[input.length - 1][input.length - 1];
			int srow = 0;
			int scol = 0;
			for(int i = 1; i < input.length; i++){
				srow = 0;
				for(int j = 0; j < input.length; j++){
					if(j != k){
						small[scol][srow] = input[i][j];
						srow++;
					}
				}
				scol++;
			}
			if(k % 2 == 0){
				if(small.length == 2){
					answer += DetWork.two(small) * input[0][k];
				}
				else{
					answer += DetWork.more(small) * input[0][k];
				}
			}
			else{
				if(small.length == 2){
					answer -= DetWork.two(small) * input[0][k];
				}
				else{
					answer -= DetWork.more(small) * input[0][k];
				}
			}
		}
		return answer;
	}
}