class Node {
	constructor(data){
		this.data = data;
		this.parent = null;
		this.children = [];
	}

}

class Tree {
	constructor(data){
		var node = new Node(data);
		this._root = node;
	}
	traverseDF(callback){

		(function recurse(currentNode) {
			for(let i=0; i< currentNode.children.length; i++){
				recurse(currentNode.children[i]);
			}

			callback(currentNode);


		})(this._root);
	}

}