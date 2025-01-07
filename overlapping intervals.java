 public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> list = new ArrayList<>();
        
        // Sort the intervals by their starting points
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        
        // Initialize the first interval
        int[] curr = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            // If the current interval overlaps with the next interval
            if (curr[1] >= arr[i][0]) {
                // Merge the intervals by extending the end of `curr`
                curr[1] = Math.max(curr[1], arr[i][1]);
            } else {
                // Add the current interval to the list and move to the next
                list.add(curr);
                curr = arr[i];
            }
        }
        
        // Add the last interval
        list.add(curr);
        
        return list;
    }
