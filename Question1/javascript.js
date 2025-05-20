
function conveyorBelt (item){
    let conveyorlist = ["bag","shoes"]
    conveyorlist.push(item)
    console.log(conveyorlist);
    

    if (conveyorlist.length > 0){
        dequedItem = conveyorlist.shift()

    }
    return dequedItem
    
};

console.log(conveyorBelt("scarf"));

