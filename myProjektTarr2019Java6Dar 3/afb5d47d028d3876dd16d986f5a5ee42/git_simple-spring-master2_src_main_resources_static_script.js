function mul(a,b) {
    return a * b;

}
function div(a,b) {
    return a / b;
}
function mod(a,b) {
    return a % b;
}

class Car{
    let color;
    let power;
    let model;
    constructor(color, power, model) {
        this.color = color;
        this.model = model;
        this.power = power;
   }
   getColor(){
        this.gear= "v5";
        return this.color;
   }
    getPower() {
         return this.power;
    }
}
function demoCar( ) {
let fiat = new Car("red", 140, "500");
console.log(fiat);
}
let bonus1 = function(amount){
    return amount * 0.95;

}
let bonus2 = function (amount, period){
    return period >2 , amount*0.9 , amount * 0.95;
}

let calcPrice= function (price, bonus){
    return bonuse(price);
}

calcPrice(100, bonus1);
calcPrice(100, bonus2);