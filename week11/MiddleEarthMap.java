public class MiddleEarthMap {
    public void navigate(String location, boolean isSecretPassage) {
        // Corrected switch-case block formatting
        switch (location) {
            case "Mordor":
                System.out.println("Navigating to Mordor");
                if (isSecretPassage) {
                    System.out.println("Taking a secret passage");
                }
                break;
            case "Shire":
                System.out.println("Navigating to the Shire");
                break;
            case "Gondor":
                System.out.println("Navigating to Gondor");
                break;
            case "Lothlórien":
                System.out.println("Navigating to Lothlórien");
                break;
            default:
                System.out.println("Unknown location");
                break;  // Added break statement for default case
        }

        // Added space before ternary operator and improved variable name clarity
        String result = isSecretPassage ? "Using a secret passage" : "Using a normal route";
        System.out.println(result);
    }
}