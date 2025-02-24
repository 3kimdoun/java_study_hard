package chapter17_static.singleton.products;
/*
    싱글톤 패턴 적용해보세요
 */
public class ProductView {
     private static ProductView instance;
     private ProductView(){
         int counter = 1;
         System.out.println(counter + " 번 째 ProsuctView 객체가 생성되었습니다");
         counter++;
     }

     public static ProductView getInstnace(){
         if (instance ==null){
             instance = new ProductView();
         }
         return instance;
     }

     public void showMainView(){
         System.out.println("상품 정보를 보여주는 메인 화면");
     }

     public void showOrderVie(){
         System.out.println("주문이 들어옴");
     }

}
