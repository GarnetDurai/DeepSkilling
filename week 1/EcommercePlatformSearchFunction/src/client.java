import java.util.Arrays;

public class client {
    public static void linearSearch(Product products[], int target){
        System.out.println("Linear Search");
        System.out.println();
        for(int i=0; i<products.length; i++){
            if(products[i].productId == target){
                System.out.println("Found product with Id : " + target);
                System.out.println("Product name : " + products[i].productName);
                System.out.println("Product category : " + products[i].category);
                return;
            }
        }
        System.out.println("Product with id : " + target + " not found");
    }
    public static void binarySearch(Product products[], int target){
        System.out.println("Binary Search");
        System.out.println();
        Arrays.sort(products, (a,b) -> a.productId - b.productId);
        //implementing binary search
        int i = 0;
        int j = products.length - 1;
        int mid = 0;
        while(i <= j){
            mid = i + (j-i)/2;
            if(products[mid].productId == target){
                System.out.println("Found product with Id : " + target);
                System.out.println("Product name : " + products[mid].productName);
                System.out.println("Product category : " + products[mid].category);
                return;
            }
            else if(target < products[mid].productId){
                j = mid - 1;
            }else{
                i = mid + 1;
            }
        }
        System.out.println("Product with id : " + target + " not found");
    }
    public static void main(String[]args){
        Product products[] = {
                new Product(101, "IronMan", "Toy"),
                new Product(203, "Lipstick", "MakeUp"),
                new Product(102, "Apple", "fruit"),
                new Product(473, "Coke", "SoftDrink"),
                new Product(103, "pencil", "Stationary"),
                new Product(111, "Shampoo", "haircare")
        };
        int target = 473;
        linearSearch(products, target);
        System.out.println("------------------------------------------");
        binarySearch(products, target);


    }
}
