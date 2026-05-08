class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();

        for (int size : asteroids) {

            boolean collide = false;

            while (!stack.isEmpty() &&
                    stack.peek() > 0 &&
                    size < 0) {

                // current asteroid bigger
                if (Math.abs(size) > stack.peek()) {
                    stack.pop();
                    continue;
                }

                // equal size
                else if (Math.abs(size) == stack.peek()) {
                    stack.pop();
                }

                // current asteroid destroyed
                collide = true;
                break;
            }

            // asteroid survived
            if (!collide) {
                stack.push(size);
            }
        }

        // convert stack to array
        int[] finalAsteroid = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            finalAsteroid[i] = stack.pop();
        }

        return finalAsteroid;
    }
}