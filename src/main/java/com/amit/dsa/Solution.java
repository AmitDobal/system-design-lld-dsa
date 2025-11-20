package com.amit.dsa;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        char[][] board ={{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'},{'i','f','l','v'}};
        String[] words = {"oath","pea","eat","rain"};
        Solution sol = new Solution();
        var res = sol.findWords(board, words);
        System.out.println(res);

    }
    List<String> res = new ArrayList<>();
    int rows = 0;
    int cols = 0;

    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public List<String> findWords(char[][] board, String[] words) {
        rows = board.length;
        cols = board[0].length;

        TrieNode root = new TrieNode();

        for (String word : words) {
            insert(root, word);
        }

        print(root);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char ch = board[row][col];

                if(root.children[ch - 'a'] != null){
                    backtrack(row, col, board, root);
                }
            }
        }
        return res;
    }

    private void backtrack(int row, int col, char[][] board, TrieNode root){

        if(row < 0 || row >= rows || col < 0 || col >= cols)
            return;
        char curr = board[row][col];
        if(curr == '$' || root.children[curr - 'a'] == null )
            return;
        
        if(root.children[curr - 'a'].endOfWord){
            res.add(root.children[curr - 'a'].word);
            // return;
        }

        char temp = board[row][col];
        board[row][col] = '$';

        for(int[] dir: dirs){
            int _row = row + dir[0];
            int _col = col + dir[1];
            backtrack(_row, _col, board, root.children[curr - 'a']);
        }
        board[row][col] = temp;

        
    }

    //Trie Data structure
    class TrieNode {
        boolean endOfWord;
        String word;
        TrieNode[] children;

        TrieNode(){
            this.endOfWord = false;
            this.word = null;
            this.children = new TrieNode[26];
        }

    }

    private void print(TrieNode root){
        if(root == null) return;
        System.out.println(root.word);
        for(int i = 0; i < 26; i++){
            print(root.children[i]);
        }
    }

    //Insert word in the trie
    private void insert(TrieNode root, String word){
        TrieNode crawler = root;
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            TrieNode curr = crawler.children[ch - 'a'];
            if(curr == null){
                curr =  new TrieNode();
            }
            crawler.children[ch - 'a'] = curr;
            crawler = curr;
        }
        crawler.endOfWord = true;
        crawler.word = word;
    }

}