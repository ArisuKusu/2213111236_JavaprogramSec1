import javax.swing.JOptionPane;

public class Lab606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {25, 78, 41, 22, 36, 85, 37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array: "));
		while(checkIndex(nums,index)) {
			index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again:"));
		}

		String prevData = (prevData(nums, index) != 0) ? "Previous data, nums[" + (index - 1) + "] is " + prevData(nums, index) : "No previous data";
		String nextData = (nextData(nums, index) != 0) ? "Next data, nums[" + (index + 1) + "] is " + nextData(nums, index) : "No next data";

		JOptionPane.showMessageDialog(null,
				"Current data, nums[" + index + "] is " + currentData(nums, index) +
				"\n" + prevData +
				"\n" + nextData
				);
	}

	static boolean checkIndex(int[] nums , int index) {
		return index < 0 || index > (nums.length - 1);
	} 

	static int currentData(int[] nums , int index) {
		return nums[index];
	}

	static int prevData(int[] nums , int index) {
		return index == 0 ? 0 : nums[index - 1];
	}

	static int nextData(int[] nums , int index) {
		return index == nums.length - 1 ? 0 : nums[index + 1];
	}
}