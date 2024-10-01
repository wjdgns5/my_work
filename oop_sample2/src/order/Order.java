package order;

public class Order {

	private Long memberId;
	private String itemName;
	private int imtePrice;
	private int dicountPrice;

	public Order(Long memberId, String itemName, int imtePrice, int dicountPrice) {
		this.memberId = memberId;
		this.itemName = itemName;
		this.imtePrice = imtePrice;
		this.dicountPrice = dicountPrice;
	}

	// 상품 금액에 할인된 가격 금액 출력 하는 기능
	public int calculateDiscount() {
		return imtePrice - dicountPrice;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getImtePrice() {
		return imtePrice;
	}

	public void setImtePrice(int imtePrice) {
		this.imtePrice = imtePrice;
	}

	public int getDicountPrice() {
		return dicountPrice;
	}

	public void setDicountPrice(int dicountPrice) {
		this.dicountPrice = dicountPrice;
	}

	@Override
	public String toString() {
		return "Order [memberId=" + memberId + ", itemName=" + itemName + ", imtePrice=" + imtePrice + ", dicountPrice="
				+ dicountPrice + "]";
	}
}
