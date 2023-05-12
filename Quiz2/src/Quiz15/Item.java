package Quiz15;

public class Item implements IBag{

	//클래스에는 크기가 100인 String[]을 선언해주세요.

	public String[] arr = new String[100];
	public int index = 0;

	public void insert(String item) {//저장 - 매개변수를 배열에 순서대로 저장
		arr[index] = item;
		index++;
	}

	public void print() {//출력 - 배열안에 개수만큼 출력
		for(int j = 0; j < index; j++) {
			System.out.print(arr[j]+" ");
		}
	}

	public int search(String item) {//검색 - 값이 있다면 index를 return, 없다면 -1을 리턴(가장먼저 검색된 item순서 반환)
		for(int j = 0; j < index; j++) {
			if(item.equals(arr[j])) {
				return j;
			}
		}

		return -1; // 없는경우

	}

	public boolean delete(String item) {//삭제 - 배열의 요소를 삭제(가장먼저 찾게된 item하나만 삭제)


		for(int j = 0; j < index; j++) {
			if(item.equals(arr[j])) {
				for(int i = j; i < index-1 ; i++) {
					arr[i] = arr[i+1];

				} 
				arr[index-1] = null;
				index --;
				return true;
			}

		}
		return false;
	}
}
