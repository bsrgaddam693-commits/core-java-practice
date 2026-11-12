import java.util.Scanner;

public class TestLSDdemo11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double total_price = 0;

		do {
			System.out.println("Enter Category like veg/Non-veg/Starters/Drinks :");
			String catg = sc.next();

			switch (catg) {

			case "veg" -> {
				String vyn = "";
				double veg_total_price = 0;

				do {
					System.out.println("Enter the Item :");
					String veg_item = sc.next();

					switch (veg_item) {

					case "pbm" -> {
						System.out.println("PBM Panner Butter Malasa -price is :250/-rs");
						double pbm_price = 250;
						veg_total_price += pbm_price;
					}
					case "dal" -> {
						System.out.println("DAL tadaka -price is :200/-rs");
						double dal_price = 250;
						veg_total_price += dal_price;
					}
					case "pvm" -> {
						System.out.println("pvm Panner Tikka  Malasa -price is :150/-rs");
						double pvm_price = 250;
						veg_total_price += pvm_price;
					}
					case "mtr" -> {
						System.out.println(" Matar Panner -price is :230/-rs");
						double mtr_price = 250;
						veg_total_price += mtr_price;
					}
					case "dum" -> {
						System.out.println("Dum veg biriyani -price is :350/-rs");
						double dum_price = 250;
						veg_total_price += dum_price;
					}
					default -> System.out.println("Enter Item not available ");
					}
					System.out.println("Do you want to continue the veg items :Click Y for Yes N for No");
					vyn = sc.next();
				} while (vyn.equalsIgnoreCase("y"));

				System.out.println("Veg Total Price is :" + veg_total_price);
				total_price += veg_total_price;
			}

			case "Non-veg" -> {
				String nvyn = "";
				double non_veg_total_price = 0;
				do {

					System.out.println("Enter the item");
					String non_veg_item = sc.next();

					switch (non_veg_item) {

					case "mdb" -> {
						System.out.println("Mutton Dum Biriyoni price is :500/-rs");
						double mdb_price = 500;
						non_veg_total_price += mdb_price;
					}
					case "cfb" -> {
						System.out.println("Chicken fry Biriyoni price is :400/-rs");
						double cfb_price = 500;
						non_veg_total_price += cfb_price;
					}
					case "pdb" -> {
						System.out.println("Prawns Dum Biriyoni price is :450/-rs");
						double pdb_price = 500;
						non_veg_total_price += pdb_price;
					}
					case "fdb" -> {
						System.out.println("Fish Dum Biriyoni price is :500/-rs");
						double fdb_price = 500;
						non_veg_total_price += fdb_price;
					}
					default -> System.out.println("Enter Item Not Available");

					}
					System.out.println("DO You Want To Continue with Non-veg items..?click Y for Yes N for No");
					nvyn = sc.next();

				} while (nvyn.equalsIgnoreCase("y"));

				System.out.println("Non-veg Total Pricde is :" + non_veg_total_price);
				total_price += non_veg_total_price;
			}

			default -> System.out.println("Enter Category is not available !!");

			}

			System.out.println("Do you want to continu for Categories click Y for Yes N for No..?");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Price:" + total_price);

	}

}
