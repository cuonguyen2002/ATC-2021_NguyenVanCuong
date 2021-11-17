package exercises_2;

public class BSTfunction {
    public Node myRoot;

    public BSTfunction() {
    }

    /**
     * tìm kiếm một phần tử trong cây
     */
    public Node serchBST(Node root, int value) {
        if (root == null) {
            return null;
        } else {
            if (value > root.val) {
                return root.right;
            } else if (value < root.val) {
                return root.left;
            } else {
                return root; //return chính nó
            }
        }
    }


    /**
     * Thêm một phần tử vào cây
     */
    public Node insert(Node root, int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return root;
        } else {
            Node temp = root;
            while (true) {
                if (value > temp.val) {
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    } else {
                        temp = temp.right;
                    }
                } else {
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    } else {
                        temp = temp.left;
                    }
                }
            }
            return root;
        }
    }


    /**
     * Xóa một phần tử trong cây
     */
    public Node removeBST(Node root, int value) {
        if (root == null) {
            return null;
        } else {
            //tìm node xóa
            if (value > root.val) {
                root.right = removeBST(root.right, value);
            } else if (value < root.val) {
                root.left = removeBST(root.left, value);
            } else {
            //xóa node root đã được xác định
                if (root.left == null && root.right == null) { //TH node cần xóa là node lá
                    return null;
                } else if (root.right == null && root.left != null) { //TH node cần xóa chỉ có node con trái
                    return root.left;
                } else if (root.left == null && root.right != null) { //TH node cần xóa chỉ có node con phải
                    return root.right;
                } else {  //các TH còn lại (tồn tại cả hai node con)
                    Node leftMostNode = findLeftModeNode(root.right);
                    root.val = leftMostNode.val;
                    removeBST(root.right, leftMostNode.val);
                    root.right = removeBST(root.right, leftMostNode.val);
                }
            }
            return root;
        }
    }

    /**
     * Tìm node con bên trái cùng của root
     * @param root
     * @return
     */
    private Node findLeftModeNode(Node root) {
        if (root == null) {
            return null;
        }
        Node leftMostNode = root;
        while (leftMostNode.left != null) {
            leftMostNode = leftMostNode.left;
        }
        return leftMostNode;
    }
}
