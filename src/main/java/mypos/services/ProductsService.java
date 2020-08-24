package mypos.services;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import mypos.commons.ConditionalOperator;
import mypos.model.Product;
import mypos.model.ProductType;
import mypos.model.QFamily;
import mypos.model.QProduct;
import mypos.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;
    @Autowired
    private EntityManager entityManager;

    public ProductsService( ){
    }

    public Optional<Product> getProduct(int id){
        return repository.findById(id);
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public List<Product> findAll(String name, String provider, String family, Boolean weighted, ConditionalOperator condition,
                                 BigDecimal price, List<ProductType> productTypes){
        JPAQueryFactory query = new JPAQueryFactory(entityManager);

        QProduct qProduct= QProduct.product;
        QFamily qFamily = QFamily.family;


        BooleanBuilder booleanBuilder = new BooleanBuilder();
        if(!name.isEmpty())
            booleanBuilder.and(qProduct.name.likeIgnoreCase(name));
        if(!provider.isEmpty())
            booleanBuilder.and(qProduct.provider.eq(provider));
        if(!family.isEmpty())
            booleanBuilder.and(qProduct.family.eq(qFamily));
        if(weighted)
            booleanBuilder.and(qProduct.weighted.eq(true));
        if(!condition.equals(ConditionalOperator.NONE) && price!=null ){
            switch (condition){
                case EQUAL:
                    booleanBuilder.and(qProduct.price.eq(price));
                    break;
                case GREATER_EQUAL:
                    booleanBuilder.and(qProduct.price.goe(price));
                    break;
                case SMALLER_EQUAL:
                    booleanBuilder.and(qProduct.price.loe(price));
                    break;
                default:
                    break;
            }
        }
        if(!productTypes.isEmpty())
            booleanBuilder.and(qProduct.PRODUCT_TYPE.in(productTypes));

        List<Product> list = (List<Product>) query.from(qProduct).where(booleanBuilder).fetch();
        return list;

    }


}
