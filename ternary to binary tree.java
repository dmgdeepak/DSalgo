int eti=0;
node exp_2_tree(String s)
{
    if(eti==s.length())
        return null;
    node r=new node(s.charAt(eti));
    eti++; 
    if(eti<s.length() && s.charAt(eti)=='?')
    {
        eti++;
        r.left=exp_2_tree(s);
        eti++;
        r.right=exp_2_tree(s);
    }
        return r;
}
Node *convertExpression(string expression)
{
    static int i=0;
	// Base case
	if (i >= expression.size())
		return NULL;

	// store current character of expression_string
	// [ 'a' to 'z']
	Node *root = newNode(expression[i]);

	// Move ahead in str
	++i;

	// if current character of ternary expression is '?'
	// then we add next character as a left child of
	// current node
	if (i < expression.size() && expression.at(i)=='?')
	{   i++;
		root->left = convertExpression(expression);
	}

	// else we have to add it as a right child of
	// current node expression.at(0) == ':'
	else if (i < expression.size())
	{
	    i++;
	}
    if(root->left != NULL)
    {
		root->right = convertExpression(expression);
    }
	return root;
}