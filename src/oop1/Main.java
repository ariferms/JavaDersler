package oop1;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setImageUrl("bilmemne1.jpg");
        product1.setUnitsInStock(3);


        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setDiscount(8);
        product2.setUnitPrice(6500);
        product2.setImageUrl("bilmemne2.jpg");
        product2.setUnitsInStock(4);

        Product product3 = new Product();
        product3.setName("kitchen Aid Kahve Makinesi");
        product3.setDiscount(9);
        product3.setUnitPrice(4500);
        product3.setImageUrl("bilmemne3.jpg");
        product3.setUnitsInStock(2);

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05332221100");
        individualCustomer.setCustomerNumber("112233445566");
        individualCustomer.setFirstName("Arif");
        individualCustomer.setLastName("ERMİŞ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setPhone("05664443322");
        corporateCustomer.setCustomerNumber("223344556677");
        corporateCustomer.setCompanyName("ariferms");
        corporateCustomer.setTaxNumber("000112233");

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}