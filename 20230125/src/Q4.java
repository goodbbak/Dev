
public class Q4 {
	public static void main(String[] args) {
		String[] arr = {"010102-4","991012-1","960304-1","881012-2","040403-3"};
		int femail = 0;
		int mail = 0;
		for(int i=0;i<arr.length;i++) {
			String[] newArr = arr[i].split("-");
			for(int j=0;j<newArr.length;j++) {
				if(j%2==1) {
					if(Integer.parseInt(newArr[j])%2==0) {
						femail ++;
					}else mail ++;
				}
			}
		}
		
		System.out.println("남"+mail+"\n여"+femail);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
