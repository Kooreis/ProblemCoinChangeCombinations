System.out.println("Enter the number of coin types: ");
        int m = scanner.nextInt();
        int[] coins = new int[m];
        System.out.println("Enter the coin values: ");
        for (int i = 0; i < m; i++) {
            coins[i] = scanner.nextInt();
        }