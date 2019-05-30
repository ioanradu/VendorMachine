public class Main {
    public static void main(String[] args) throws SoldOutException, NotSufficientChangeException, NotFullyPaidException {
        VendingMachineImpl vm = new VendingMachineImpl();

        vm.printStats();

        long price = vm.selectItemAndGetPrice(Item.TWIX);
        System.out.println("The price of Twix : " + price);

        vm.insertCoin(Coin.TEN);
        vm.insertCoin(Coin.TEN);
        vm.insertCoin(Coin.TEN);
        vm.insertCoin(Coin.TWENTY);

        vm.collectItemAndGetChange();
        vm.printStats();

        vm.insertCoin(Coin.FIFTY);
        price = vm.selectItemAndGetPrice(Item.MARS);
        System.out.println("The price of Mars : " + price);
        vm.collectItemAndGetChange();
        vm.printStats();

        vm.insertCoin(Coin.TWENTY);
        vm.insertCoin(Coin.TWENTY);
        vm.insertCoin(Coin.TWENTY);
        price = vm.selectItemAndGetPrice(Item.BOUNTY);
        System.out.println("The price of Bounty : " + price);
        vm.collectItemAndGetChange();
        vm.printStats();
    }
}
