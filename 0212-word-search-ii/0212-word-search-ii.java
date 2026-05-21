class Solution {
    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        String word = null;
    }

    TrieNode root = new TrieNode();
    List<String> result = new ArrayList<>();
    int rows, cols;

    public List<String> findWords(char[][] board, String[] words) {
        rows = board.length;
        cols = board[0].length;

        for (String word : words) {
            insert(word);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root);
            }
        }

        return result;
    }

    private void insert(String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (node.child[idx] == null) {
                node.child[idx] = new TrieNode();
            }

            node = node.child[idx];
        }

        node.word = word;
    }

    private void dfs(char[][] board, int i, int j, TrieNode node) {
        if (i < 0 || j < 0 || i >= rows || j >= cols) {
            return;
        }

        char ch = board[i][j];

        if (ch == '#' || node.child[ch - 'a'] == null) {
            return;
        }

        node = node.child[ch - 'a'];

        if (node.word != null) {
            result.add(node.word);
            node.word = null; 
        }

        board[i][j] = '#';

        dfs(board, i + 1, j, node);
        dfs(board, i - 1, j, node);
        dfs(board, i, j + 1, node);
        dfs(board, i, j - 1, node);

        board[i][j] = ch;
    }
}