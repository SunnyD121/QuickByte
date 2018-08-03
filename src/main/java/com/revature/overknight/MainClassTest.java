package com.revature.overknight;

import com.revature.overknight.services.PostService;
import com.revature.overknight.services.UserService;

public class MainClassTest {


    public static void main(String[] args){
//        UserDaoImpl dao = new UserDaoImpl();
//        UserService us = new UserService();
//
//        System.out.println(LocalDate.now().toString());
//
//       dao.insertUser(new Users("Toby", "password".getBytes(), "password".getBytes(), 3,"Toby" , "Lobster", "something@eamil.com", 1234567890L, "Here it is!"));
//       KDF kdf = new KDF();
//       byte[] pass = kdf.encryptPassword("password");
//       byte[] salt = kdf.getSalt();
//       kdf = null;
//       dao.insertUser(new Users("username", pass, salt, 2, "User", "Name", "test@email.com", 1234321234L, "Uhh..."));
    	UserService.registerNewUser("chrisp", "chrisp", 4388576018410707L);
		UserService.registerNewUser("erics", "erics", 7467547036697929L);
		UserService.registerNewUser("robertc", "robertc", 5467566704648521L);
		UserService.registerNewUser("walterx", "walterx", 4324970813603557L);
		UserService.registerNewUser("xuanzangc", "xuangzangc", 3763320728320071L);
		UserService.registerNewUser("wukongs", "wukongs", 1780805174503363L);
		UserService.registerNewUser("wunengz", "wunengz", 4388576018410707L);
		UserService.registerNewUser("wujings", "wujings", 7467547036697929L);
		UserService.registerNewUser("whitedragonhorse", "whitedragonhorse", 5467566704648521L);
		
		PostService ps = new PostService();
		ps.insertNewPost("chrisp", "Alaskan Salmon Baked With Pecan Crunch Coating", "alaskasalmonbakewithpecancrunchcoating.png", "Prep Time: 20 Minutes\r\n" + 
				"Cook Time: 10 Minutes\r\n" + 
				"Ready In: 30 Minutes\r\n" + 
				"Servings: 6\r\n" + 
				"\r\n" + 
				"Ingredients:\r\n" + 
				"3 tablespoons Dijon mustard\r\n" + 
				"3 tablespoons butter, melted\r\n" + 
				"5 teaspoons honey\r\n" + 
				"1/2 cup fresh bread crumbs\r\n" + 
				"1/2 cup finely chopped pecans\r\n" + 
				"3 teaspoons chopped fresh parsley\r\n" + 
				"6 (4 ounce) fillets salmon\r\n" + 
				"salt and pepper to taste\r\n" + 
				"6 lemon wedges\r\n" + 
				"\r\n" + 
				"Instructions:\r\n" + 
				"1. Preheat the oven to 400 degrees F (200 degrees C). In a small bowl, mix\r\n" + 
				"together the mustard, butter, and honey. In another bowl, mix together\r\n" + 
				"the bread crumbs, pecans, and parsley.\r\n" + 
				"\r\n" + 
				"2. Season each salmon fillet with salt and pepper. Place on a lightly greased\r\n" + 
				"baking sheet. Brush with mustard-honey mixture. Cover the top of each\r\n" + 
				"fillet with bread crumb mixture.\r\n" + 
				"\r\n" + 
				"3. Bake for 10 minutes per inch of thickness, measured at thickest part, or\r\n" + 
				"until salmon just flakes when tested with a fork. Serve garnished with\r\n" + 
				"lemon wedges.", "American");
		ps.insertNewPost("erics", "Armadillo Eggs", "armadilloeggs.png", "Prep Time: 30 Minutes\r\n" + 
				"Cook Time: 25 Minutes\r\n" + 
				"Ready In: 55 Minutes\r\n" + 
				"Servings: 12\r\n" + 
				"\r\n" + 
				"Ingredients:\r\n" + 
				"24 jalapeno peppers\r\n" + 
				"1 pound sausage\r\n" + 
				"2 cups all-purpose baking mix\r\n" + 
				"1 (16 ounce) package Cheddar cheese, shredded\r\n" + 
				"1 tablespoon crushed red pepper flakes\r\n" + 
				"1 tablespoon garlic salt\r\n" + 
				"1 (16 ounce) package Monterey Jack cheese, cubed\r\n" + 
				"\r\n" + 
				"DIRECTIONS:\r\n" + 
				"1. Preheat oven to 325 degrees F (165 degrees C). Lightly grease a medium\r\n" + 
				"baking sheet.\r\n" + 
				"\r\n" + 
				"2. Cut a slit in each jalapeno pepper. Remove and discard seeds and pulp.\r\n" + 
				"\r\n" + 
				"3. In a medium bowl, mix sausage, baking mix, Cheddar cheese, crushed red\r\n" + 
				"pepper, and garlic salt.\r\n" + 
				"\r\n" + 
				"4. Stuff jalapenos with the Monterey Jack cheese cubes. Shape sausage\r\n" + 
				"mixture around the jalapenos to form balls.\r\n" + 
				"\r\n" + 
				"5. Arrange jalapeno balls on the prepared baking sheet. Bake 25 minutes in\r\n" + 
				"the preheated oven, until lightly browned.", "American");
		ps.insertNewPost("robertc", "asparagus Wrapped in Crispy Proscuitto", "asparaguswrappedincrispproscuitto.png", "Prep Time: 5 Minutes\r\n" + 
				"Cook Time: 15 Minutes\r\n" + 
				"Ready In: 20 Minutes\r\n" + 
				"Servings: 16\r\n" + 
				"\r\n" + 
				"INGREDIENTS:\r\n" + 
				"1 tablespoon olive oil\r\n" + 
				"16 spears fresh asparagus, trimmed\r\n" + 
				"16 slices prosciutto\r\n" + 
				"\r\n" + 
				"DIRECTIONS:\r\n" + 
				"1. Preheat the oven to 450 degrees F (220 degrees C). Line a baking\r\n" + 
				"sheet with aluminum foil, and coat with olive oil.\r\n" + 
				"\r\n" + 
				"2. Blanch asparagus to preserve color. (Submerse in boiling water for\r\n" + 
				"2 minutes, then plunge in ice bath.)\r\n" + 
				"\r\n" + 
				"3.Wrap one slice of prosciutto around each asparagus spear, starting\r\n" + 
				"at the bottom, and spiraling up to the tip. Place the wrapped spears\r\n" + 
				"on the prepared baking sheet.\r\n" + 
				"\r\n" + 
				"4.Bake for 5 minutes in the preheated oven. Remove, and shake the\r\n" + 
				"pan back and forth to roll the spears over. Return to the oven for\r\n" + 
				"another 5 minutes, or until asparagus is tender, and prosciutto is\r\n" + 
				"crisp. Serve immediately.", "American");
		ps.insertNewPost("walterx", "Baked Asparagus with Balsamic Buttersauce", "bakedasparaguswithbalsamicbuttersauce.PNG", "Prep Time: 10 Minutes\r\n" + 
				"Cook Time: 12 Minutes\r\n" + 
				"Ready In: 25 Minutes\r\n" + 
				"Servings: 4\r\n" + 
				"\r\n" + 
				"Ingredients:\r\n" + 
				"1 bunch fresh asparagus, trimmed\r\n" + 
				"cooking spray\r\n" + 
				"salt and pepper to taste\r\n" + 
				"2 tablespoons butter\r\n" + 
				"1 tablespoon soy sauce\r\n" + 
				"2 tablespoons balsamic vinegar\r\n" + 
				"\r\n" + 
				"Instructions:\r\n" + 
				"1. Preheat oven to 400 degrees F (200 degrees C).\r\n" + 
				"2. Arrange the asparagus on a baking sheet with parchment paper.\r\n" + 
				"Coat with cooking spray, and season with salt and pepper.\r\n" + 
				"3. Bake asparagus 12 minutes in the preheated oven, or until tender.\r\n" + 
				"4. Lightly brown the butter in a saucepan over medium heat. Remove\r\n" + 
				"from heat, and stir in soy sauce and balsamic vinegar. Pour over the\r\n" + 
				"baked asparagus to serve.", "American");
		ps.insertNewPost("xuanzangc", "Beef Lasagna", "beeflasagna.png", "Prep Time: 20 Minutes\r\n" + 
				"Cook Time: 45 Minutes\r\n" + 
				"Ready In: 1 Hour 5 Minutes\r\n" + 
				"Servings: 10\r\n" + 
				"\r\n" + 
				"INGREDIENTS:\r\n" + 
				"1 pound ground beef\r\n" + 
				"1 (26 ounce) jar spaghetti sauce\r\n" + 
				"1 (15 ounce) container ricotta cheese\r\n" + 
				"2 cups shredded mozzarella cheese\r\n" + 
				"1/2 cup grated Parmesan cheese, divided\r\n" + 
				"2 eggs\r\n" + 
				"12 lasagna noodles, cooked and drained\r\n" + 
				"\r\n" + 
				"DIRECTIONS:\r\n" + 
				"1. Preheat oven to 375 degrees F. Brown ground beef in 12-\r\n" + 
				"inch skillet; drain. Stir in Pasta Sauce; heat through.\r\n" + 
				"\r\n" + 
				"2. Combine ricotta cheese, mozzarella cheese, 1/4 cup\r\n" + 
				"Parmesan cheese and eggs in large bowl.\r\n" + 
				"\r\n" + 
				"3. Evenly spread 1 cup meat sauce in 13 x 9-inch baking\r\n" + 
				"dish. Arrange 4 lasagna noodles lengthwise over sauce,\r\n" + 
				"then top with 1 cup meat sauce and 1/2 of the ricotta\r\n" + 
				"cheese mixture; repeat, ending with sauce. Cover with\r\n" + 
				"aluminum foil and bake 30 minutes. Remove foil and\r\n" + 
				"sprinkle with remaining 1/4 cup Parmesan cheese. Bake\r\n" + 
				"uncovered an additional 5 minutes. Let stand 10 minutes\r\n" + 
				"before serving.", "American");
		ps.insertNewPost("wukongs", "Brownies", "brownies.png", "Servings: 12\r\n" + 
				"\r\n" + 
				"Ingredients\r\n" + 
				"4 (1 ounce) squares unsweetened chocolate\r\n" + 
				"3/4 cup butter\r\n" + 
				"2 cups white sugar\r\n" + 
				"3 eggs\r\n" + 
				"1 teaspoon vanilla extract\r\n" + 
				"1 cup all-purpose flour\r\n" + 
				"1 cup chopped walnuts\r\n" + 
				"\r\n" + 
				"Directions\r\n" + 
				"\r\n" + 
				"1. Preheat oven to 350 degrees F (180 degrees C).\r\n" + 
				"\r\n" + 
				"2. Microwave chocolate and butter or margarine in large bowl at HIGH \r\n" + 
				"for 2 minutes or until butter or margarine is melted.\r\n" + 
				"\r\n" + 
				"3. Stir until chocolate is melted. Stir in sugar. Mix in eggs and \r\n" + 
				"vanilla. Stir in flour and nuts.\r\n" + 
				"\r\n" + 
				"4. Spread in greased 13 x 9 inch pan. Bake for 35 minutes\r\n" + 
				"(do not overbake).", "American");
		ps.insertNewPost("wunengz", "Bruchetta", "bruchetta.png", "Prep Time: 15 Minutes\r\n" + 
				"Cook Time: 5 Minutes\r\n" + 
				"Ready In: 30 Minutes\r\n" + 
				"Yield: 12 Servings\r\n" + 
				"\r\n" + 
				"Ingredients:\r\n" + 
				"6 roma tomatoes, diced\r\n" + 
				"1/2 cup sun-dried tomatoes, packed in oil\r\n" + 
				"3 cloves minced garlic\r\n" + 
				"2 tablespoons balsamic vinegar\r\n" + 
				"1/4 cup fresh basil, stems removed\r\n" + 
				"1/4 teaspoon salt\r\n" + 
				"1/4 teaspoon ground black pepper\r\n" + 
				"1 French baguette\r\n" + 
				"2 cups shredded mozzarella cheese\r\n" + 
				"\r\n" + 
				"Instructions:\r\n" + 
				"1. Preheat oven on the broiler setting.\r\n" + 
				"\r\n" + 
				"2. In a large bowl, combine the tomatoes, sun-dried tomatoes, garlic, vinegar, basil,\r\n" + 
				"salt, and pepper. Allow mixture to sit for 10 minutes.\r\n" + 
				"\r\n" + 
				"3. Cut the baguette into 3/4 �inch slices. On a baking sheet, arrange the baguette\r\n" + 
				"slices in a single layer and sprinkle with mozzarella cheese.\r\n" + 
				"\r\n" + 
				"4. Broil for 5 minutes.\r\n" + 
				"\r\n" + 
				"5. Divide the tomato mixture evenly over baguette slices. Serve.", "American");
		ps.insertNewPost("wujings", "Butter Cream Icing", "buttercreamicing.png", "Prep Time: 15 Minutes \r\n" + 
				"Ready In: 15 Minutes\r\n" + 
				"Servings: 20\r\n" + 
				"\r\n" + 
				"INGREDIENTS:\r\n" + 
				"\r\n" + 
				"1/2 cup shortening\r\n" + 
				"1/2 cup butter, softened\r\n" + 
				"1 teaspoon vanilla extract\r\n" + 
				"4 cups confectioners' sugar\r\n" + 
				"2 tablespoons milk\r\n" + 
				"\r\n" + 
				"DIRECTIONS:\r\n" + 
				"\r\n" + 
				"1. In a large bowl, cream together the butter, shortening, and vanilla.\r\n" + 
				"Blend in the sugar, one cup at a time, beating well after each addition.\r\n" + 
				"Beat in the milk, and continue mixing until light and fluffy.\r\n" + 
				"Keep icing covered until ready to decorate.", "American");
		ps.insertNewPost("whitedragonhorse", "Cheese Bake Bars", "cheesecakebars.png", "Servings:16\r\n" + 
				"\r\n" + 
				"Ingredients:\r\n" + 
				"Crust\r\n" + 
				"1/3 cup butter\r\n" + 
				"1/3 cup firmly packed brown sugar\r\n" + 
				"1 cup flour\r\n" + 
				"\r\n" + 
				"Filling\r\n" + 
				"8 oz cream cheese\r\n" + 
				"1/4 cup sugar\r\n" + 
				"2 T milk\r\n" + 
				"1 T lemon juice\r\n" + 
				"1/2 t vanilla\r\n" + 
				"1 egg\r\n" + 
				"1/2 cup jam, any flavor\r\n" + 
				"\r\n" + 
				"Directions:\r\n" + 
				"To prepare the crust: preheat the oven to 350 degrees F.\r\n" + 
				"Place the butter and brown sugar in a bowl and mix with an electric mixer on low\r\n" + 
				"speed for 1 minute, or until fluffy. Add the flour and mix for 1 minute, or until\r\n" + 
				"combined. Press the dough into the bottom of an ungreased 8-inch square pan\r\n" + 
				"and bake for 10 minutes, or until lightly browned.\r\n" + 
				"\r\n" + 
				"To prepare the filling: Place the cream cheese and sugar in a large bowl and mix\r\n" + 
				"with an electric mixer on low speed for 2 minutes or until smooth. Add the milk,\r\n" + 
				"lemon juice, vanilla, and egg, and mix for 1 minute or until thoroughly combined.\r\n" + 
				"\r\n" + 
				"Spread the mixture over the baked crust and drop tablespoons of the jam on the\r\n" + 
				"filling. Run a knife back and forth through the filling to distribute the jam, being\r\n" + 
				"careful not to cut into the crust. Bake for 25 minutes, or until lightly browned.\r\n" + 
				"Cool completely and cut into 2-inch squares.", "American");
    }


}
