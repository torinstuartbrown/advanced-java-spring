package platform.codingnomads.co.springdata.example.dml.introducingrepositories.crudrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


    //autowire the UserRepo into the class to gain access to the CRUD methods
    @Autowired
    UserRepo userRepo;

    @Autowired
    PurchaseRepo purchaseRepo;

    @Autowired
    MountianRepo mountianRepo;

    @Override
    public void run(String... args) throws Exception {
        //create new user
        User user = User.builder().firstName("Bobby").lastName("Bobbert").age(56).build();

        //save user and assign what is returned to the user variable.
        user = userRepo.save(user);

        Purchase purchase = Purchase.builder().productName("Product1").amount(22.23).build();
        purchase = purchaseRepo.save(purchase);
        Purchase purchase2 = Purchase.builder().productName("Product2").amount(52.63).build();
        purchase = purchaseRepo.save(purchase2);
        Purchase purchase3 = Purchase.builder().productName("Product3").amount(60.88).build();
        purchase = purchaseRepo.save(purchase3);

        Optional<Purchase> p = purchaseRepo.findById(2l);
        if(p.isPresent())
            System.out.println(p.toString());

        List<Purchase> purchases = purchaseRepo.findByAmountGreaterThan(50);
        System.out.println(purchases.size());

        Mountain mountain1 = Mountain.builder().name("Ablert").elevation(14255).build();
        Mountain mountain2 = Mountain.builder().name("August").elevation(13555).build();
        Mountain mountain3 = Mountain.builder().name("Pikes Peak").elevation(14775).build();

        mountianRepo.save(mountain1);
        mountianRepo.save(mountain2);
        mountianRepo.save(mountain3);

        List<Double> mountains = mountianRepo.findElevationByNameStartingWith("A");
        for(Double m : mountains){
            System.out.println(m);
        }


        //delete the user using the id of the inserted user object
        userRepo.deleteById(user.getId());
    }
}
