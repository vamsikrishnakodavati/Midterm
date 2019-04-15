package takehome;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<BakedGoods> bakedgoods_list= new ArrayList<BakedGoods>();
		
		Cookie cookie = new Cookie(5, "cookie consists of oats,sugar,startch,carbohydraets" , "02/11/2021");
		bakedgoods_list.add(cookie);
		
		CinnamonRoll cinnamonroll = new CinnamonRoll(1, "Cinamminnon roll  consists of cinnamon,sugar,eggs,eggyolk", "05/13/2019");
		bakedgoods_list.add(cinnamonroll);
		
		Brownie brownie = new Brownie(3, "Browine Consists of choclate,sugar,sucrose,fats,edible oil ", "03/09/2019");
		bakedgoods_list.add(brownie);
		
		for(BakedGoods bg :bakedgoods_list)
		{
			System.out.printf("The Price is %d dollors \n",bg.getPrice());
			System.out.println("The Description:  " + bg.getDescription());
			System.out.println("The SellByDate:  " + bg.getSellByDate());
			
			
			
		}
		
		
		

	}

}