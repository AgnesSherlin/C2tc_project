package com.b21.order;

import org.glassfish.jaxb.runtime.v2.schemagen.xmlschema.List;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderServiceTest {
	@Autowired
OrderRepository orepo;

	@Test

	public void testCreate() {
		Order o=new Order();
		o.setId(3);
		o.setDateofpurchase("04-11-23");
		o.setTotal(5679);
		o.setCustomerid(67);
		o.setPaymentmode("Credit card");
		o.setShopid(91);
		
		orepo.save(o);
		//using assertNotNull for writing test case
		assertNotNull(orepo.findById(3).get());
	}
	private void assertNotNull(Order order) {
		// TODO Auto-generated method stub
		
	}
	@Test

	public void testReadAll()//reading all records from database
	{
		List<Order> list=orepo.findAll();
		assertThat(list).size().isGreaterThan(0);
	}
	
@Test

public void testSingleRecord()
//test for single record from database
{
	Order order=orepo.findById(3).get();
	assertEquals(91,order.getShopid());
}

@Test

public void testUpdate() {
	Order a=orepo.findById(3).get();
	a.setShopid(92);
	orepo.save(a);
	assertNotEquals(91,orepo.findById(3).get().getShopid());
}
private void assertNotEquals(int i, int shopid) {
	// TODO Auto-generated method stub
	
}
@Test

public void testDelete() {
	orepo.deleteById(3);
     ((Object) assertThat(orepo.existsById(3))).isFalse();
		
	
	}
private Object assertThat(boolean existsById) {
	// TODO Auto-generated method stub
	return null;
}

private void assertEquals(int i, int shopid) {
	// TODO Auto-generated method stub
	
}

}
