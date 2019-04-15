package TakeHome;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class Test_Exam {
	
	private Inventory itemINV;
	
	private Inventory spyitemINV;
	
	private InventoryItem mockItem;
	

	@BeforeEach
	void setUp() throws Exception {
		
	itemINV = new Inventory();
	Inventory itemINV1 = new Inventory();
	spyitemINV = spy(itemINV1);
	mockItem = mock(InventoryItem.class);
		
	}

	@Test
	void test_addItem_To_Inventory() {
		
		when(mockItem.getWeight()).thenReturn(100);
		
		boolean expected_result = spyitemINV.addItemToInventory(mockItem);
		
		assertTrue(expected_result, "Item is not added");
		
		assertEquals(1, spyitemINV.items.size(), "The item is not added to inventory");
		
		
	}
	
	@Test
	void test_dropInventory()
	{
		InventoryItem item =new InventoryItem("truck",100, "Tesla modelx", 10);
		itemINV.addItemToInventory(item);
		
		assertEquals(1,itemINV.items.size(), "Inventory doesn't consists");
		
		boolean expected_result = itemINV.dropInventoryItem(item);
		
		assertTrue(expected_result,"not able to find in the inventory");
		
	}
	
	@Test
	
	void test_TOstring()
	{
		InventoryItem item1 =new InventoryItem("basketball",100,"shoes", 10);
		itemINV.addItemToInventory(item1);
		
		String expected = "Your inventory has:\n" + item1.toString();
		String actual = itemINV.toString();
		
		assertEquals(expected, actual, " in valid");
		
		
	}
	

}
