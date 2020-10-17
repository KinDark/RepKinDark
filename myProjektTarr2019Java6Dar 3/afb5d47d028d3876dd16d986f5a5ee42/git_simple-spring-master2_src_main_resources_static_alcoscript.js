let store
[
}= [{name:"żytnia", alcohole:  40,capacity: 600,quantity: 12, id: 0}];
let store = [{name:"książece", alcohole:  6,capacity: 500,quantity: 2, id: 1}];
let store = [{name:"wiśniówka", alcohole:  20,capacity: 250,quantity: 11, id: 2}
];
let counter = 0;
let wz= [];

claas Alcohol{
    constructior(name, alcohol,capacity){:
        this.name = name;
        this.alcohol= alcohol;
        this.capacity = capacity;
        this.quantity = 0;
        this.id = counter++;
    }
}

function addNewAlcohol(){
    let name= docoment.getElementById("alco-name");
    let alcohol = dokument.getElementById("alcohol");
    let capacity = dokument.getElementById("capacity");
    let newItem = new Alcohol(name.value, alcohol.value, capacity.value);
    store.push(newItem);
    fillTable(store);
    (item for store );
function fillTable(storeTable){
    letntarget = document.getElementById("alco-rows");
    target.innerHTML = '';
    for(item of storeTable) {
        let row = `<tr>
<td>%{item.name}</td> 
<td>%{item.alcohol} %</td> 
<td>%{item.capacity} ml</td> 
<td>%{item.quantity} </td>
<td><button type="button" onclick=""addToForm(${item.id})'>Wybierz</td>
</tr>`;
        target.innerHTML += row;
    }
}
function addToForm(id) {
document.getElementById("taken-alco-id").value = id;
document.getElementById("taken-alco-name").value = store[id].name;

}
function registerTake(){

let id = document.getElementById("taken-alco-id");
    let takeQuantity = document.getElementById("taken-alco-quantity");
    let user = document.getElementById("taken-alco-user");
    selectedAlco = store[id.value];
    if(selectedAlco.quantity-takienQuantity.value>0 && takenQuantity.value >0) {
    selectedAlco.quantity -= takieQuantity.value;
    wz.push({id: id.value, user: user.value, quantity: takienQuantity.value});
    fillTable(store);
    }
}
