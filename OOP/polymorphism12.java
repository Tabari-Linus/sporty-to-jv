public class polymorphism12 {

    public static class Asset {
        public void printType() {
            System.out.println("Asset");
        }
    }

    public static class Book extends Asset {
        // Ensure compiler validation of printType override
        @Override
        public void printType() {
            System.out.println("Book");
        }
    }

    public static class Movie extends Asset {
        //Ensure compiler validation of printType override
        @Override
        public void printType() {
            System.out.println("Movie");
        }
    }

    public static void main(String[] args) {
        // Use the proper type to define the array that contain different types of assets.
        Asset[] assets = new Asset[] {
                new Asset(),
                new Book(),
                new Movie()
        };
        for (Asset asset: assets) {
            //  Execute printType for each asset in the assets array
            asset.printType();
        }
    }
}